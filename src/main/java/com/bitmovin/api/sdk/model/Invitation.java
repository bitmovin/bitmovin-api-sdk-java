package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.InvitationStatus;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Invitation
 */

public class Invitation {
  @JsonProperty("id")
  private String id;

  @JsonProperty("email")
  private String email;

  @JsonProperty("status")
  private InvitationStatus status;

  @JsonProperty("company")
  private String company;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("createdAt")
  private Date createdAt;

  @JsonProperty("jobTitle")
  private String jobTitle;

  @JsonProperty("phone")
  private String phone;


  /**
   * Get id
   * @return id
   */
  public String getId() {
    return id;
  }

  /**
   * Set id
   *
   * @param id
   */
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Email address of the tenant. (required)
   * @return email
   */
  public String getEmail() {
    return email;
  }

  /**
   * Email address of the tenant. (required)
   *
   * @param email
   *        Email address of the tenant. (required)
   */
  public void setEmail(String email) {
    this.email = email;
  }


  /**
   * Get status
   * @return status
   */
  public InvitationStatus getStatus() {
    return status;
  }

  /**
   * Set status
   *
   * @param status
   */
  public void setStatus(InvitationStatus status) {
    this.status = status;
  }


  /**
   * Get company
   * @return company
   */
  public String getCompany() {
    return company;
  }

  /**
   * Set company
   *
   * @param company
   */
  public void setCompany(String company) {
    this.company = company;
  }


  /**
   * Get firstName
   * @return firstName
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Set firstName
   *
   * @param firstName
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  /**
   * Get lastName
   * @return lastName
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Set lastName
   *
   * @param lastName
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  /**
   * Creation date of the invitation in UTC format
   * @return createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Creation date of the invitation in UTC format
   *
   * @param createdAt
   *        Creation date of the invitation in UTC format
   */
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }


  /**
   * Get jobTitle
   * @return jobTitle
   */
  public String getJobTitle() {
    return jobTitle;
  }

  /**
   * Set jobTitle
   *
   * @param jobTitle
   */
  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }


  /**
   * Get phone
   * @return phone
   */
  public String getPhone() {
    return phone;
  }

  /**
   * Set phone
   *
   * @param phone
   */
  public void setPhone(String phone) {
    this.phone = phone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invitation invitation = (Invitation) o;
    return Objects.equals(this.id, invitation.id) &&
        Objects.equals(this.email, invitation.email) &&
        Objects.equals(this.status, invitation.status) &&
        Objects.equals(this.company, invitation.company) &&
        Objects.equals(this.firstName, invitation.firstName) &&
        Objects.equals(this.lastName, invitation.lastName) &&
        Objects.equals(this.createdAt, invitation.createdAt) &&
        Objects.equals(this.jobTitle, invitation.jobTitle) &&
        Objects.equals(this.phone, invitation.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, status, company, firstName, lastName, createdAt, jobTitle, phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invitation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

