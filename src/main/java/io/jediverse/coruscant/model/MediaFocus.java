package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;

/**
 * MediaFocus
 */
@Validated

public class MediaFocus   {
  @JsonProperty("x")
  private Float x = null;

  @JsonProperty("y")
  private Float y = null;

  public MediaFocus x(Float x) {
    this.x = x;
    return this;
  }

  /**
   * x position of the focus should be between -1 and 1
   * @return x
  **/
  @Schema(description = "x position of the focus should be between -1 and 1")

  public Float getX() {
    return x;
  }

  public void setX(Float x) {
    this.x = x;
  }

  public MediaFocus y(Float y) {
    this.y = y;
    return this;
  }

  /**
   * y position of the focus should be between -1 and 1
   * @return y
  **/
  @Schema(description = "y position of the focus should be between -1 and 1")

  public Float getY() {
    return y;
  }

  public void setY(Float y) {
    this.y = y;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaFocus mediaFocus = (MediaFocus) o;
    return Objects.equals(this.x, mediaFocus.x) &&
        Objects.equals(this.y, mediaFocus.y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaFocus {\n");
    
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
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
