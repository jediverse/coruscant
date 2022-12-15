package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;

/**
 * Field
 */
@Validated

public class Field   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("verified_at")
  private String verifiedAt = null;

  public Field name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The key/name of this field.
   * @return name
  **/
  @Schema(example = "pronouns", description = "The key/name of this field.")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Field value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The value of this field.
   * @return value
  **/
  @Schema(example = "they/them", description = "The value of this field.")

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Field verifiedAt(String verifiedAt) {
    this.verifiedAt = verifiedAt;
    return this;
  }

  /**
   * If this field has been verified, when did this occur? (ISO 8601 Datetime).
   * @return verifiedAt
  **/
  @Schema(example = "2021-07-30T09:20:25+00:00", description = "If this field has been verified, when did this occur? (ISO 8601 Datetime).")

  public String getVerifiedAt() {
    return verifiedAt;
  }

  public void setVerifiedAt(String verifiedAt) {
    this.verifiedAt = verifiedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Field field = (Field) o;
    return Objects.equals(this.name, field.name) &&
        Objects.equals(this.value, field.value) &&
        Objects.equals(this.verifiedAt, field.verifiedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, verifiedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Field {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    verifiedAt: ").append(toIndentedString(verifiedAt)).append("\n");
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
