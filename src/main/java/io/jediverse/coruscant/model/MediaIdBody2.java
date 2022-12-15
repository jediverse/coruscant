package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;

/**
 * MediaIdBody2
 */
@Validated

public class MediaIdBody2   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("focus")
  private String focus = "0,0";

  public MediaIdBody2 description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Image or media description to use as alt-text on the attachment. This is very useful for users of screenreaders! May or may not be required, depending on your instance settings.
   * @return description
  **/
  @Schema(description = "Image or media description to use as alt-text on the attachment. This is very useful for users of screenreaders! May or may not be required, depending on your instance settings.")

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MediaIdBody2 focus(String focus) {
    this.focus = focus;
    return this;
  }

  /**
   * Focus of the media file. If present, it should be in the form of two comma-separated floats between -1 and 1. For example: `-0.5,0.25`.
   * @return focus
  **/
  @Schema(description = "Focus of the media file. If present, it should be in the form of two comma-separated floats between -1 and 1. For example: `-0.5,0.25`.")

  public String getFocus() {
    return focus;
  }

  public void setFocus(String focus) {
    this.focus = focus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaIdBody2 mediaIdBody2 = (MediaIdBody2) o;
    return Objects.equals(this.description, mediaIdBody2.description) &&
        Objects.equals(this.focus, mediaIdBody2.focus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, focus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaIdBody2 {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    focus: ").append(toIndentedString(focus)).append("\n");
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
