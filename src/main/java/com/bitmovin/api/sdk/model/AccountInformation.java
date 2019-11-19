package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AccountApiKey;
import com.bitmovin.api.sdk.model.BitmovinResource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AccountInformation
 */

public class AccountInformation extends BitmovinResource {
  @JsonProperty("email")
  private String email;

  @JsonProperty("apiKeys")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<AccountApiKey> apiKeys = new ArrayList<AccountApiKey>();

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("phone")
  private String phone;

  @JsonProperty("company")
  private String company;

  @JsonProperty("isVerified")
  private Boolean isVerified;

  /**
   * Email address of the account. (required)
   * @return email
   */
  public String getEmail() {
    return email;
  }

  /**
   * ApiKeys associated with the account (required)
   * @return apiKeys
   */
  public List<AccountApiKey> getApiKeys() {
    return apiKeys;
  }


  /**
   * First name of the tenant.
   * @return firstName
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * First name of the tenant.
   *
   * @param firstName
   *        First name of the tenant.
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  /**
   * Last name of the tenant.
   * @return lastName
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Last name of the tenant.
   *
   * @param lastName
   *        Last name of the tenant.
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  /**
   * Phone number of the tenant.
   * @return phone
   */
  public String getPhone() {
    return phone;
  }

  /**
   * Phone number of the tenant.
   *
   * @param phone
   *        Phone number of the tenant.
   */
  public void setPhone(String phone) {
    this.phone = phone;
  }


  /**
   * Company name of the tenant.
   * @return company
   */
  public String getCompany() {
    return company;
  }

  /**
   * Company name of the tenant.
   *
   * @param company
   *        Company name of the tenant.
   */
  public void setCompany(String company) {
    this.company = company;
  }

  /**
   * Get isVerified
   * @return isVerified
   */
  public Boolean getIsVerified() {
    return isVerified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountInformation accountInformation = (AccountInformation) o;
    return Objects.equals(this.email, accountInformation.email) &&
        Objects.equals(this.apiKeys, accountInformation.apiKeys) &&
        Objects.equals(this.firstName, accountInformation.firstName) &&
        Objects.equals(this.lastName, accountInformation.lastName) &&
        Objects.equals(this.phone, accountInformation.phone) &&
        Objects.equals(this.company, accountInformation.company) &&
        Objects.equals(this.isVerified, accountInformation.isVerified) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, apiKeys, firstName, lastName, phone, company, isVerified, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountInformation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    apiKeys: ").append(toIndentedString(apiKeys)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    isVerified: ").append(toIndentedString(isVerified)).append("\n");
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

