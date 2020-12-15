package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PaginationResponse
 */

public class PaginationResponse<T> {
  @JsonProperty("totalCount")
  private Long totalCount;

  @JsonProperty("offset")
  private Integer offset;

  @JsonProperty("limit")
  private Integer limit;

  @JsonProperty("previous")
  private String previous;

  @JsonProperty("next")
  private String next;

  @JsonProperty("items")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<T> items = new ArrayList<T>();

  /**
   * Get totalCount
   * @return totalCount
   */
  public Long getTotalCount() {
    return totalCount;
  }

  /**
   * Get offset
   * @return offset
   */
  public Integer getOffset() {
    return offset;
  }

  /**
   * Get limit
   * @return limit
   */
  public Integer getLimit() {
    return limit;
  }

  /**
   * Get previous
   * @return previous
   */
  public String getPrevious() {
    return previous;
  }

  /**
   * Get next
   * @return next
   */
  public String getNext() {
    return next;
  }

  /**
   * Get items
   * @return items
   */
  public List<T> getItems() {
    return items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginationResponse paginationResponse = (PaginationResponse) o;
    return Objects.equals(this.totalCount, paginationResponse.totalCount) &&
        Objects.equals(this.offset, paginationResponse.offset) &&
        Objects.equals(this.limit, paginationResponse.limit) &&
        Objects.equals(this.previous, paginationResponse.previous) &&
        Objects.equals(this.next, paginationResponse.next) &&
        Objects.equals(this.items, paginationResponse.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, offset, limit, previous, next, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginationResponse {\n");
    
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

