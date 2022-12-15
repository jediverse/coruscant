package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;

/**
 * NodeInfoSoftware
 */
@Validated

public class NodeInfoSoftware   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("version")
  private String version = null;

  public NodeInfoSoftware name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @Schema(example = "coruscant", description = "")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NodeInfoSoftware version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  **/
  @Schema(example = "0.1.2 1234567", description = "")

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeInfoSoftware nodeInfoSoftware = (NodeInfoSoftware) o;
    return Objects.equals(this.name, nodeInfoSoftware.name) &&
        Objects.equals(this.version, nodeInfoSoftware.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeInfoSoftware {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
