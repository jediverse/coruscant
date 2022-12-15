package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;

/**
 * UpdateSource
 */
@Validated

public class UpdateSource   {
  @JsonProperty("language")
  private String language = null;

  @JsonProperty("privacy")
  private String privacy = null;

  @JsonProperty("sensitive")
  private Boolean sensitive = null;

  @JsonProperty("status_format")
  private String statusFormat = null;

  public UpdateSource language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Default language to use for authored statuses. (ISO 6391)
   * @return language
  **/
  @Schema(description = "Default language to use for authored statuses. (ISO 6391)")

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public UpdateSource privacy(String privacy) {
    this.privacy = privacy;
    return this;
  }

  /**
   * Default post privacy for authored statuses.
   * @return privacy
  **/
  @Schema(description = "Default post privacy for authored statuses.")

  public String getPrivacy() {
    return privacy;
  }

  public void setPrivacy(String privacy) {
    this.privacy = privacy;
  }

  public UpdateSource sensitive(Boolean sensitive) {
    this.sensitive = sensitive;
    return this;
  }

  /**
   * Mark authored statuses as sensitive by default.
   * @return sensitive
  **/
  @Schema(description = "Mark authored statuses as sensitive by default.")

  public Boolean isSensitive() {
    return sensitive;
  }

  public void setSensitive(Boolean sensitive) {
    this.sensitive = sensitive;
  }

  public UpdateSource statusFormat(String statusFormat) {
    this.statusFormat = statusFormat;
    return this;
  }

  /**
   * Default format for authored statuses (plain or markdown).
   * @return statusFormat
  **/
  @Schema(description = "Default format for authored statuses (plain or markdown).")

  public String getStatusFormat() {
    return statusFormat;
  }

  public void setStatusFormat(String statusFormat) {
    this.statusFormat = statusFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSource updateSource = (UpdateSource) o;
    return Objects.equals(this.language, updateSource.language) &&
        Objects.equals(this.privacy, updateSource.privacy) &&
        Objects.equals(this.sensitive, updateSource.sensitive) &&
        Objects.equals(this.statusFormat, updateSource.statusFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, privacy, sensitive, statusFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSource {\n");
    
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
    sb.append("    sensitive: ").append(toIndentedString(sensitive)).append("\n");
    sb.append("    statusFormat: ").append(toIndentedString(statusFormat)).append("\n");
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
