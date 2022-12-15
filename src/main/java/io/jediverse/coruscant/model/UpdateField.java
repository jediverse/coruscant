package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;

/**
 * By default, max 4 fields and 255 characters per property/value.
 */
@Schema(description = "By default, max 4 fields and 255 characters per property/value.")
@Validated

public class UpdateField   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("value")
  private String value = null;

  public UpdateField name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the field
   * @return name
  **/
  @Schema(description = "Name of the field")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateField value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Value of the field
   * @return value
  **/
  @Schema(description = "Value of the field")

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateField updateField = (UpdateField) o;
    return Objects.equals(this.name, updateField.name) &&
        Objects.equals(this.value, updateField.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateField {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
