package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.PccCell;
import com.bitmovin.api.sdk.model.PccDeviceUnit;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PccDevice
 */

public class PccDevice {
  @JsonProperty("name")
  private String name;

  @JsonProperty("namePlaceholder")
  private Boolean namePlaceholder;

  @JsonProperty("qualifier")
  private String qualifier;

  @JsonProperty("deviceType")
  private String deviceType;

  @JsonProperty("sessionIds")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> sessionIds = new ArrayList<String>();

  @JsonProperty("units")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<PccDeviceUnit> units = new ArrayList<PccDeviceUnit>();

  @JsonProperty("playerVersions")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> playerVersions = new ArrayList<String>();

  @JsonProperty("cells")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<PccCell> cells = new ArrayList<PccCell>();


  /**
   * The device pool, as the reader is shown it. (required)
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * The device pool, as the reader is shown it. (required)
   *
   * @param name
   *        The device pool, as the reader is shown it. (required)
   */
  public void setName(String name) {
    this.name = name;
  }


  /**
   * True where no naming rule recognised this pool, so &#x60;name&#x60; is a stated placeholder rather than the pool&#39;s own. The units and sessions below still tell two such pools apart. (required)
   * @return namePlaceholder
   */
  public Boolean getNamePlaceholder() {
    return namePlaceholder;
  }

  /**
   * True where no naming rule recognised this pool, so &#x60;name&#x60; is a stated placeholder rather than the pool&#39;s own. The units and sessions below still tell two such pools apart. (required)
   *
   * @param namePlaceholder
   *        True where no naming rule recognised this pool, so &#x60;name&#x60; is a stated placeholder rather than the pool&#39;s own. The units and sessions below still tell two such pools apart. (required)
   */
  public void setNamePlaceholder(Boolean namePlaceholder) {
    this.namePlaceholder = namePlaceholder;
  }


  /**
   * What distinguishes this pool from another of the same name, where anything does.
   * @return qualifier
   */
  public String getQualifier() {
    return qualifier;
  }

  /**
   * What distinguishes this pool from another of the same name, where anything does.
   *
   * @param qualifier
   *        What distinguishes this pool from another of the same name, where anything does.
   */
  public void setQualifier(String qualifier) {
    this.qualifier = qualifier;
  }


  /**
   * The fleet&#39;s own classification, such as &#x60;tv&#x60;, &#x60;desktop&#x60;, &#x60;stb&#x60; or &#x60;mobile&#x60;. Never one guessed from a name, and not a closed set: the fleet may answer with a kind this list does not name.
   * @return deviceType
   */
  public String getDeviceType() {
    return deviceType;
  }

  /**
   * The fleet&#39;s own classification, such as &#x60;tv&#x60;, &#x60;desktop&#x60;, &#x60;stb&#x60; or &#x60;mobile&#x60;. Never one guessed from a name, and not a closed set: the fleet may answer with a kind this list does not name.
   *
   * @param deviceType
   *        The fleet&#39;s own classification, such as &#x60;tv&#x60;, &#x60;desktop&#x60;, &#x60;stb&#x60; or &#x60;mobile&#x60;. Never one guessed from a name, and not a closed set: the fleet may answer with a kind this list does not name.
   */
  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }


  public PccDevice addSessionIdsItem(String sessionIdsItem) {
    this.sessionIds.add(sessionIdsItem);
    return this;
  }

  /**
   * Get sessionIds
   * @return sessionIds
   */
  public List<String> getSessionIds() {
    return sessionIds;
  }

  /**
   * Set sessionIds
   *
   * @param sessionIds
   */
  public void setSessionIds(List<String> sessionIds) {
    this.sessionIds = sessionIds;
  }


  public PccDevice addUnitsItem(PccDeviceUnit unitsItem) {
    this.units.add(unitsItem);
    return this;
  }

  /**
   * Get units
   * @return units
   */
  public List<PccDeviceUnit> getUnits() {
    return units;
  }

  /**
   * Set units
   *
   * @param units
   */
  public void setUnits(List<PccDeviceUnit> units) {
    this.units = units;
  }


  public PccDevice addPlayerVersionsItem(String playerVersionsItem) {
    this.playerVersions.add(playerVersionsItem);
    return this;
  }

  /**
   * Every player version that measured this pool. More than one means the runs spanned a player release. (required)
   * @return playerVersions
   */
  public List<String> getPlayerVersions() {
    return playerVersions;
  }

  /**
   * Every player version that measured this pool. More than one means the runs spanned a player release. (required)
   *
   * @param playerVersions
   *        Every player version that measured this pool. More than one means the runs spanned a player release. (required)
   */
  public void setPlayerVersions(List<String> playerVersions) {
    this.playerVersions = playerVersions;
  }


  public PccDevice addCellsItem(PccCell cellsItem) {
    this.cells.add(cellsItem);
    return this;
  }

  /**
   * One per column, in &#x60;combinations&#x60; order. (required)
   * @return cells
   */
  public List<PccCell> getCells() {
    return cells;
  }

  /**
   * One per column, in &#x60;combinations&#x60; order. (required)
   *
   * @param cells
   *        One per column, in &#x60;combinations&#x60; order. (required)
   */
  public void setCells(List<PccCell> cells) {
    this.cells = cells;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PccDevice pccDevice = (PccDevice) o;
    return Objects.equals(this.name, pccDevice.name) &&
        Objects.equals(this.namePlaceholder, pccDevice.namePlaceholder) &&
        Objects.equals(this.qualifier, pccDevice.qualifier) &&
        Objects.equals(this.deviceType, pccDevice.deviceType) &&
        Objects.equals(this.sessionIds, pccDevice.sessionIds) &&
        Objects.equals(this.units, pccDevice.units) &&
        Objects.equals(this.playerVersions, pccDevice.playerVersions) &&
        Objects.equals(this.cells, pccDevice.cells);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, namePlaceholder, qualifier, deviceType, sessionIds, units, playerVersions, cells);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PccDevice {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namePlaceholder: ").append(toIndentedString(namePlaceholder)).append("\n");
    sb.append("    qualifier: ").append(toIndentedString(qualifier)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    sessionIds: ").append(toIndentedString(sessionIds)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    playerVersions: ").append(toIndentedString(playerVersions)).append("\n");
    sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
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

