package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;

import javax.validation.constraints.*;

/**
 * IdActionBody
 */
@Validated

public class IdActionBody   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("text")
  private String text = null;

  public IdActionBody type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of action to be taken (`disable`, `silence`, or `suspend`).
   * @return type
  **/
  @Schema(required = true, description = "Type of action to be taken (`disable`, `silence`, or `suspend`).")
  @NotNull

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IdActionBody text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Optional text describing why this action was taken.
   * @return text
  **/
  @Schema(description = "Optional text describing why this action was taken.")

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdActionBody idActionBody = (IdActionBody) o;
    return Objects.equals(this.type, idActionBody.type) &&
        Objects.equals(this.text, idActionBody.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdActionBody {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
