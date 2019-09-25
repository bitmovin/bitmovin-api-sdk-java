package com.bitmovin.api.sdk.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BitmovinExceptionFactory {

    public static BitmovinException buildBitmovinException(Exception exception) {
        if (exception instanceof BitmovinException) {
            return (BitmovinException) exception;
        }

        return new BitmovinException(buildErrorMessage(exception));
    }

    private static String buildErrorMessage(Exception ex) {
        String message = ex.getMessage();
        String regexMessage = "(.+)";
        String regexErrorType = "(executing|reading)";
        String regexHttpMethod = "(DELETE|GET|PATCH|POST|PUT)";
        String regexUrl = "(https?:\\/\\/([^\\s\\\\]+\\.?)+(:[0-9][0-9][0-9][0-9])?(\\/[a-zA-Z0-9]+)+(\\?[^\\s\\\\]+=[^\\s\\\\]+)?&?)";
        String regex = String.format("^%s %s %s %s", regexMessage, regexErrorType, regexHttpMethod, regexUrl);
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(message);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request failed: ");

        if (m.find()) {
            message = m.group(1);

            appendLine(stringBuilder, message);
            appendLine(stringBuilder, "request:");
            appendLine(stringBuilder, String.format("  method: %s", m.group(3)));
            appendLine(stringBuilder, String.format("  url: %s", m.group(4)));
        } else {
            appendLine(stringBuilder, message);
        }

        return stringBuilder.toString().trim();
    }

    private static void appendLine(StringBuilder errorMessage, String message) {
        errorMessage.append(message);
        errorMessage.append(System.lineSeparator());
    }
}
