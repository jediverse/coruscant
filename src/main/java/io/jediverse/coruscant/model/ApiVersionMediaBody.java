package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.File;
import io.micronaut.validation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApiVersionMediaBody
 */
@Validated

public class ApiVersionMediaBody   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("focus")
  private String focus = "0,0";

  @JsonProperty("file")
  private File file = null;

  public ApiVersionMediaBody description(String description) {
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

  public ApiVersionMediaBody focus(String focus) {
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

  public ApiVersionMediaBody file(File file) {
    this.file = file;
    return this;
  }

  /**
   * The media attachment to upload.
   * @return file
  **/
  @Schema(required = true, description = "The media attachment to upload.")
  @NotNull

  @Valid
  public File getFile() {
    return file;
  }

  public void setFile(File file) {
    this.file = file;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiVersionMediaBody apiVersionMediaBody = (ApiVersionMediaBody) o;
    return Objects.equals(this.description, apiVersionMediaBody.description) &&
        Objects.equals(this.focus, apiVersionMediaBody.focus) &&
        Objects.equals(this.file, apiVersionMediaBody.file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, focus, file);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiVersionMediaBody {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    focus: ").append(toIndentedString(focus)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
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
