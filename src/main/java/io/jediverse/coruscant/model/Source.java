package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import io.micronaut.validation.Validated;
import javax.validation.Valid;

/**
 * Returned as an additional entity when verifying and updated credentials, as an attribute of Account.
 */
@Schema(description = "Returned as an additional entity when verifying and updated credentials, as an attribute of Account.")
@Validated

public class Source   {
  @JsonProperty("fields")
  @Valid
  private List<Field> fields = null;

  @JsonProperty("follow_requests_count")
  private Long followRequestsCount = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("privacy")
  private String privacy = null;

  @JsonProperty("sensitive")
  private Boolean sensitive = null;

  @JsonProperty("status_format")
  private String statusFormat = null;

  public Source fields(List<Field> fields) {
    this.fields = fields;
    return this;
  }

  public Source addFieldsItem(Field fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<Field>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * Metadata about the account.
   * @return fields
  **/
  @Schema(description = "Metadata about the account.")
  @Valid
  public List<Field> getFields() {
    return fields;
  }

  public void setFields(List<Field> fields) {
    this.fields = fields;
  }

  public Source followRequestsCount(Long followRequestsCount) {
    this.followRequestsCount = followRequestsCount;
    return this;
  }

  /**
   * The number of pending follow requests.
   * @return followRequestsCount
  **/
  @Schema(description = "The number of pending follow requests.")

  public Long getFollowRequestsCount() {
    return followRequestsCount;
  }

  public void setFollowRequestsCount(Long followRequestsCount) {
    this.followRequestsCount = followRequestsCount;
  }

  public Source language(String language) {
    this.language = language;
    return this;
  }

  /**
   * The default posting language for new statuses.
   * @return language
  **/
  @Schema(description = "The default posting language for new statuses.")

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public Source note(String note) {
    this.note = note;
    return this;
  }

  /**
   * Profile bio.
   * @return note
  **/
  @Schema(description = "Profile bio.")

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Source privacy(String privacy) {
    this.privacy = privacy;
    return this;
  }

  /**
   * The default post privacy to be used for new statuses. public = Public post unlisted = Unlisted post private = Followers-only post direct = Direct post
   * @return privacy
  **/
  @Schema(description = "The default post privacy to be used for new statuses. public = Public post unlisted = Unlisted post private = Followers-only post direct = Direct post")

  public String getPrivacy() {
    return privacy;
  }

  public void setPrivacy(String privacy) {
    this.privacy = privacy;
  }

  public Source sensitive(Boolean sensitive) {
    this.sensitive = sensitive;
    return this;
  }

  /**
   * Whether new statuses should be marked sensitive by default.
   * @return sensitive
  **/
  @Schema(description = "Whether new statuses should be marked sensitive by default.")

  public Boolean isSensitive() {
    return sensitive;
  }

  public void setSensitive(Boolean sensitive) {
    this.sensitive = sensitive;
  }

  public Source statusFormat(String statusFormat) {
    this.statusFormat = statusFormat;
    return this;
  }

  /**
   * The default posting format for new statuses.
   * @return statusFormat
  **/
  @Schema(description = "The default posting format for new statuses.")

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
    Source source = (Source) o;
    return Objects.equals(this.fields, source.fields) &&
        Objects.equals(this.followRequestsCount, source.followRequestsCount) &&
        Objects.equals(this.language, source.language) &&
        Objects.equals(this.note, source.note) &&
        Objects.equals(this.privacy, source.privacy) &&
        Objects.equals(this.sensitive, source.sensitive) &&
        Objects.equals(this.statusFormat, source.statusFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, followRequestsCount, language, note, privacy, sensitive, statusFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Source {\n");
    
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    followRequestsCount: ").append(toIndentedString(followRequestsCount)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
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
