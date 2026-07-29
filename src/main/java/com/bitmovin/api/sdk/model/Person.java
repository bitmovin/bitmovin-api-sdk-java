package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.Department;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Person
 */

public class Person {
  @JsonProperty("name")
  private String name;

  @JsonProperty("role")
  private String role;

  @JsonProperty("department")
  private Department department;


  /**
   * Get name
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * Set name
   *
   * @param name
   */
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Get role
   * @return role
   */
  public String getRole() {
    return role;
  }

  /**
   * Set role
   *
   * @param role
   */
  public void setRole(String role) {
    this.role = role;
  }


  /**
   * The detected department of a person
   * @return department
   */
  public Department getDepartment() {
    return department;
  }

  /**
   * The detected department of a person
   *
   * @param department
   *        The detected department of a person
   */
  public void setDepartment(Department department) {
    this.department = department;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(this.name, person.name) &&
        Objects.equals(this.role, person.role) &&
        Objects.equals(this.department, person.department);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, role, department);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Person {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
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

