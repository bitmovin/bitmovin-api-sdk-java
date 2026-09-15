package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.PccPicture;
import com.bitmovin.api.sdk.model.PccVerdict;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PccCell
 */

public class PccCell {
  @JsonProperty("verdict")
  private PccVerdict verdict;

  @JsonProperty("label")
  private String label;

  @JsonProperty("aboutTheDevice")
  private Boolean aboutTheDevice;

  @JsonProperty("account")
  private String account;

  @JsonProperty("symbol")
  private String symbol;

  @JsonProperty("agreement")
  private String agreement;

  @JsonProperty("agreementAccount")
  private String agreementAccount;

  @JsonProperty("picture")
  private PccPicture picture;

  @JsonProperty("agreeingSessionIds")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> agreeingSessionIds = new ArrayList<String>();

  @JsonProperty("resultSessions")
  private BigDecimal resultSessions;

  @JsonProperty("recency")
  private String recency;


  /**
   * What a combination says once every session that measured it has been read. Five of the nine answer for the measurement rather than for the device; &#x60;aboutTheDevice&#x60; says which, and folding those into \&quot;not supported\&quot; is how this data gets misread. (required)
   * @return verdict
   */
  public PccVerdict getVerdict() {
    return verdict;
  }

  /**
   * What a combination says once every session that measured it has been read. Five of the nine answer for the measurement rather than for the device; &#x60;aboutTheDevice&#x60; says which, and folding those into \&quot;not supported\&quot; is how this data gets misread. (required)
   *
   * @param verdict
   *        What a combination says once every session that measured it has been read. Five of the nine answer for the measurement rather than for the device; &#x60;aboutTheDevice&#x60; says which, and folding those into \&quot;not supported\&quot; is how this data gets misread. (required)
   */
  public void setVerdict(PccVerdict verdict) {
    this.verdict = verdict;
  }


  /**
   * The reader&#39;s word for that verdict — &#x60;Supported&#x60;, &#x60;Not supported&#x60;, &#x60;Not measured&#x60;, and so on. Fewer words than there are verdicts: three of them read as &#x60;Not measured&#x60;. &#x60;legend&#x60; lists every word. (required)
   * @return label
   */
  public String getLabel() {
    return label;
  }

  /**
   * The reader&#39;s word for that verdict — &#x60;Supported&#x60;, &#x60;Not supported&#x60;, &#x60;Not measured&#x60;, and so on. Fewer words than there are verdicts: three of them read as &#x60;Not measured&#x60;. &#x60;legend&#x60; lists every word. (required)
   *
   * @param label
   *        The reader&#39;s word for that verdict — &#x60;Supported&#x60;, &#x60;Not supported&#x60;, &#x60;Not measured&#x60;, and so on. Fewer words than there are verdicts: three of them read as &#x60;Not measured&#x60;. &#x60;legend&#x60; lists every word. (required)
   */
  public void setLabel(String label) {
    this.label = label;
  }


  /**
   * False where the verdict says something about the measurement rather than the device. (required)
   * @return aboutTheDevice
   */
  public Boolean getAboutTheDevice() {
    return aboutTheDevice;
  }

  /**
   * False where the verdict says something about the measurement rather than the device. (required)
   *
   * @param aboutTheDevice
   *        False where the verdict says something about the measurement rather than the device. (required)
   */
  public void setAboutTheDevice(Boolean aboutTheDevice) {
    this.aboutTheDevice = aboutTheDevice;
  }


  /**
   * The cell&#39;s whole account in one paragraph: the verdict, what agreed, the picture, the stream. (required)
   * @return account
   */
  public String getAccount() {
    return account;
  }

  /**
   * The cell&#39;s whole account in one paragraph: the verdict, what agreed, the picture, the stream. (required)
   *
   * @param account
   *        The cell&#39;s whole account in one paragraph: the verdict, what agreed, the picture, the stream. (required)
   */
  public void setAccount(String account) {
    this.account = account;
  }


  /**
   * The grid&#39;s own mark for that verdict, which &#x60;legend&#x60; explains. (required)
   * @return symbol
   */
  public String getSymbol() {
    return symbol;
  }

  /**
   * The grid&#39;s own mark for that verdict, which &#x60;legend&#x60; explains. (required)
   *
   * @param symbol
   *        The grid&#39;s own mark for that verdict, which &#x60;legend&#x60; explains. (required)
   */
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  /**
   * &#x60;3/4&#x60; where a session disagreed with the published verdict, and absent where none did.
   * @return agreement
   */
  public String getAgreement() {
    return agreement;
  }

  /**
   * &#x60;3/4&#x60; where a session disagreed with the published verdict, and absent where none did.
   *
   * @param agreement
   *        &#x60;3/4&#x60; where a session disagreed with the published verdict, and absent where none did.
   */
  public void setAgreement(String agreement) {
    this.agreement = agreement;
  }


  /**
   * What the sessions that disagreed recorded, spelled out. Present only where &#x60;agreement&#x60; is.
   * @return agreementAccount
   */
  public String getAgreementAccount() {
    return agreementAccount;
  }

  /**
   * What the sessions that disagreed recorded, spelled out. Present only where &#x60;agreement&#x60; is.
   *
   * @param agreementAccount
   *        What the sessions that disagreed recorded, spelled out. Present only where &#x60;agreement&#x60; is.
   */
  public void setAgreementAccount(String agreementAccount) {
    this.agreementAccount = agreementAccount;
  }


  /**
   * Get picture
   * @return picture
   */
  public PccPicture getPicture() {
    return picture;
  }

  /**
   * Set picture
   *
   * @param picture
   */
  public void setPicture(PccPicture picture) {
    this.picture = picture;
  }


  public PccCell addAgreeingSessionIdsItem(String agreeingSessionIdsItem) {
    this.agreeingSessionIds.add(agreeingSessionIdsItem);
    return this;
  }

  /**
   * The sessions this verdict was taken from. Quote one to Bitmovin support and the measurement behind this cell can be looked up, for as long as the fleet still holds it. (required)
   * @return agreeingSessionIds
   */
  public List<String> getAgreeingSessionIds() {
    return agreeingSessionIds;
  }

  /**
   * The sessions this verdict was taken from. Quote one to Bitmovin support and the measurement behind this cell can be looked up, for as long as the fleet still holds it. (required)
   *
   * @param agreeingSessionIds
   *        The sessions this verdict was taken from. Quote one to Bitmovin support and the measurement behind this cell can be looked up, for as long as the fleet still holds it. (required)
   */
  public void setAgreeingSessionIds(List<String> agreeingSessionIds) {
    this.agreeingSessionIds = agreeingSessionIds;
  }


  /**
   * How many sessions recorded anything at all for this combination. (required)
   * @return resultSessions
   */
  public BigDecimal getResultSessions() {
    return resultSessions;
  }

  /**
   * How many sessions recorded anything at all for this combination. (required)
   *
   * @param resultSessions
   *        How many sessions recorded anything at all for this combination. (required)
   */
  public void setResultSessions(BigDecimal resultSessions) {
    this.resultSessions = resultSessions;
  }


  /**
   * Evidence excluded by the start date or session limit, including pools with no included sessions.
   * @return recency
   */
  public String getRecency() {
    return recency;
  }

  /**
   * Evidence excluded by the start date or session limit, including pools with no included sessions.
   *
   * @param recency
   *        Evidence excluded by the start date or session limit, including pools with no included sessions.
   */
  public void setRecency(String recency) {
    this.recency = recency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PccCell pccCell = (PccCell) o;
    return Objects.equals(this.verdict, pccCell.verdict) &&
        Objects.equals(this.label, pccCell.label) &&
        Objects.equals(this.aboutTheDevice, pccCell.aboutTheDevice) &&
        Objects.equals(this.account, pccCell.account) &&
        Objects.equals(this.symbol, pccCell.symbol) &&
        Objects.equals(this.agreement, pccCell.agreement) &&
        Objects.equals(this.agreementAccount, pccCell.agreementAccount) &&
        Objects.equals(this.picture, pccCell.picture) &&
        Objects.equals(this.agreeingSessionIds, pccCell.agreeingSessionIds) &&
        Objects.equals(this.resultSessions, pccCell.resultSessions) &&
        Objects.equals(this.recency, pccCell.recency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verdict, label, aboutTheDevice, account, symbol, agreement, agreementAccount, picture, agreeingSessionIds, resultSessions, recency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PccCell {\n");
    
    sb.append("    verdict: ").append(toIndentedString(verdict)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    aboutTheDevice: ").append(toIndentedString(aboutTheDevice)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    agreement: ").append(toIndentedString(agreement)).append("\n");
    sb.append("    agreementAccount: ").append(toIndentedString(agreementAccount)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
    sb.append("    agreeingSessionIds: ").append(toIndentedString(agreeingSessionIds)).append("\n");
    sb.append("    resultSessions: ").append(toIndentedString(resultSessions)).append("\n");
    sb.append("    recency: ").append(toIndentedString(recency)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

