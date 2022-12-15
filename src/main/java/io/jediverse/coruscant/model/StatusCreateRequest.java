package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import io.micronaut.validation.Validated;
import javax.validation.Valid;

/**
 * StatusCreateRequest
 */
@Validated

public class StatusCreateRequest   {
  @JsonProperty("format")
  private String format = null;

  @JsonProperty("in_reply_to_id")
  private String inReplyToId = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("media_ids")
  @Valid
  private List<String> mediaIds = null;

  @JsonProperty("scheduled_at")
  private String scheduledAt = null;

  @JsonProperty("sensitive")
  private Boolean sensitive = null;

  @JsonProperty("spoiler_text")
  private String spoilerText = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("visibility")
  private String visibility = null;

  public StatusCreateRequest format(String format) {
    this.format = format;
    return this;
  }

  /**
   * Format to use when parsing this status. in: formData
   * @return format
  **/
  @Schema(description = "Format to use when parsing this status. in: formData")

  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public StatusCreateRequest inReplyToId(String inReplyToId) {
    this.inReplyToId = inReplyToId;
    return this;
  }

  /**
   * ID of the status being replied to, if status is a reply. in: formData
   * @return inReplyToId
  **/
  @Schema(description = "ID of the status being replied to, if status is a reply. in: formData")

  public String getInReplyToId() {
    return inReplyToId;
  }

  public void setInReplyToId(String inReplyToId) {
    this.inReplyToId = inReplyToId;
  }

  public StatusCreateRequest language(String language) {
    this.language = language;
    return this;
  }

  /**
   * ISO 639 language code for this status. in: formData
   * @return language
  **/
  @Schema(description = "ISO 639 language code for this status. in: formData")

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public StatusCreateRequest mediaIds(List<String> mediaIds) {
    this.mediaIds = mediaIds;
    return this;
  }

  public StatusCreateRequest addMediaIdsItem(String mediaIdsItem) {
    if (this.mediaIds == null) {
      this.mediaIds = new ArrayList<String>();
    }
    this.mediaIds.add(mediaIdsItem);
    return this;
  }

  /**
   * Array of Attachment ids to be attached as media. If provided, status becomes optional, and poll cannot be used.  If the status is being submitted as a form, the key is 'media_ids[]', but if it's json or xml, the key is 'media_ids'.  in: formData
   * @return mediaIds
  **/
  @Schema(description = "Array of Attachment ids to be attached as media. If provided, status becomes optional, and poll cannot be used.  If the status is being submitted as a form, the key is 'media_ids[]', but if it's json or xml, the key is 'media_ids'.  in: formData")

  public List<String> getMediaIds() {
    return mediaIds;
  }

  public void setMediaIds(List<String> mediaIds) {
    this.mediaIds = mediaIds;
  }

  public StatusCreateRequest scheduledAt(String scheduledAt) {
    this.scheduledAt = scheduledAt;
    return this;
  }

  /**
   * ISO 8601 Datetime at which to schedule a status. Providing this parameter will cause ScheduledStatus to be returned instead of Status. Must be at least 5 minutes in the future. in: formData
   * @return scheduledAt
  **/
  @Schema(description = "ISO 8601 Datetime at which to schedule a status. Providing this parameter will cause ScheduledStatus to be returned instead of Status. Must be at least 5 minutes in the future. in: formData")

  public String getScheduledAt() {
    return scheduledAt;
  }

  public void setScheduledAt(String scheduledAt) {
    this.scheduledAt = scheduledAt;
  }

  public StatusCreateRequest sensitive(Boolean sensitive) {
    this.sensitive = sensitive;
    return this;
  }

  /**
   * Status and attached media should be marked as sensitive. in: formData
   * @return sensitive
  **/
  @Schema(description = "Status and attached media should be marked as sensitive. in: formData")

  public Boolean isSensitive() {
    return sensitive;
  }

  public void setSensitive(Boolean sensitive) {
    this.sensitive = sensitive;
  }

  public StatusCreateRequest spoilerText(String spoilerText) {
    this.spoilerText = spoilerText;
    return this;
  }

  /**
   * Text to be shown as a warning or subject before the actual content. Statuses are generally collapsed behind this field. in: formData
   * @return spoilerText
  **/
  @Schema(description = "Text to be shown as a warning or subject before the actual content. Statuses are generally collapsed behind this field. in: formData")

  public String getSpoilerText() {
    return spoilerText;
  }

  public void setSpoilerText(String spoilerText) {
    this.spoilerText = spoilerText;
  }

  public StatusCreateRequest status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Text content of the status. If media_ids is provided, this becomes optional. Attaching a poll is optional while status is provided. in: formData
   * @return status
  **/
  @Schema(description = "Text content of the status. If media_ids is provided, this becomes optional. Attaching a poll is optional while status is provided. in: formData")

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public StatusCreateRequest visibility(String visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * Visibility of the posted status. in: formData
   * @return visibility
  **/
  @Schema(description = "Visibility of the posted status. in: formData")

  public String getVisibility() {
    return visibility;
  }

  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusCreateRequest statusCreateRequest = (StatusCreateRequest) o;
    return Objects.equals(this.format, statusCreateRequest.format) &&
        Objects.equals(this.inReplyToId, statusCreateRequest.inReplyToId) &&
        Objects.equals(this.language, statusCreateRequest.language) &&
        Objects.equals(this.mediaIds, statusCreateRequest.mediaIds) &&
        Objects.equals(this.scheduledAt, statusCreateRequest.scheduledAt) &&
        Objects.equals(this.sensitive, statusCreateRequest.sensitive) &&
        Objects.equals(this.spoilerText, statusCreateRequest.spoilerText) &&
        Objects.equals(this.status, statusCreateRequest.status) &&
        Objects.equals(this.visibility, statusCreateRequest.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, inReplyToId, language, mediaIds, scheduledAt, sensitive, spoilerText, status, visibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusCreateRequest {\n");
    
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    inReplyToId: ").append(toIndentedString(inReplyToId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    mediaIds: ").append(toIndentedString(mediaIds)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    sensitive: ").append(toIndentedString(sensitive)).append("\n");
    sb.append("    spoilerText: ").append(toIndentedString(spoilerText)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
