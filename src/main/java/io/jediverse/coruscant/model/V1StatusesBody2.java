package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import io.micronaut.validation.Validated;
import javax.validation.Valid;

/**
 * V1StatusesBody2
 */
@Validated

public class V1StatusesBody2   {
  @JsonProperty("status")
  private String status = null;

  @JsonProperty("media_ids")
  @Valid
  private List<String> mediaIds = null;

  @JsonProperty("in_reply_to_id")
  private String inReplyToId = null;

  @JsonProperty("sensitive")
  private Boolean sensitive = null;

  @JsonProperty("spoiler_text")
  private String spoilerText = null;

  @JsonProperty("visibility")
  private String visibility = null;

  @JsonProperty("scheduled_at")
  private String scheduledAt = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("format")
  private String format = null;

  public V1StatusesBody2 status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Text content of the status. If media_ids is provided, this becomes optional. Attaching a poll is optional while status is provided.
   * @return status
  **/
  @Schema(description = "Text content of the status. If media_ids is provided, this becomes optional. Attaching a poll is optional while status is provided.")

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public V1StatusesBody2 mediaIds(List<String> mediaIds) {
    this.mediaIds = mediaIds;
    return this;
  }

  public V1StatusesBody2 addMediaIdsItem(String mediaIdsItem) {
    if (this.mediaIds == null) {
      this.mediaIds = new ArrayList<String>();
    }
    this.mediaIds.add(mediaIdsItem);
    return this;
  }

  /**
   * Array of Attachment ids to be attached as media. If provided, status becomes optional, and poll cannot be used.  If the status is being submitted as a form, the key is 'media_ids[]', but if it's json or xml, the key is 'media_ids'.
   * @return mediaIds
  **/
  @Schema(description = "Array of Attachment ids to be attached as media. If provided, status becomes optional, and poll cannot be used.  If the status is being submitted as a form, the key is 'media_ids[]', but if it's json or xml, the key is 'media_ids'.")

  public List<String> getMediaIds() {
    return mediaIds;
  }

  public void setMediaIds(List<String> mediaIds) {
    this.mediaIds = mediaIds;
  }

  public V1StatusesBody2 inReplyToId(String inReplyToId) {
    this.inReplyToId = inReplyToId;
    return this;
  }

  /**
   * ID of the status being replied to, if status is a reply.
   * @return inReplyToId
  **/
  @Schema(description = "ID of the status being replied to, if status is a reply.")

  public String getInReplyToId() {
    return inReplyToId;
  }

  public void setInReplyToId(String inReplyToId) {
    this.inReplyToId = inReplyToId;
  }

  public V1StatusesBody2 sensitive(Boolean sensitive) {
    this.sensitive = sensitive;
    return this;
  }

  /**
   * Status and attached media should be marked as sensitive.
   * @return sensitive
  **/
  @Schema(description = "Status and attached media should be marked as sensitive.")

  public Boolean isSensitive() {
    return sensitive;
  }

  public void setSensitive(Boolean sensitive) {
    this.sensitive = sensitive;
  }

  public V1StatusesBody2 spoilerText(String spoilerText) {
    this.spoilerText = spoilerText;
    return this;
  }

  /**
   * Text to be shown as a warning or subject before the actual content. Statuses are generally collapsed behind this field.
   * @return spoilerText
  **/
  @Schema(description = "Text to be shown as a warning or subject before the actual content. Statuses are generally collapsed behind this field.")

  public String getSpoilerText() {
    return spoilerText;
  }

  public void setSpoilerText(String spoilerText) {
    this.spoilerText = spoilerText;
  }

  public V1StatusesBody2 visibility(String visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * Visibility of the posted status.
   * @return visibility
  **/
  @Schema(description = "Visibility of the posted status.")

  public String getVisibility() {
    return visibility;
  }

  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }

  public V1StatusesBody2 scheduledAt(String scheduledAt) {
    this.scheduledAt = scheduledAt;
    return this;
  }

  /**
   * ISO 8601 Datetime at which to schedule a status. Providing this parameter will cause ScheduledStatus to be returned instead of Status. Must be at least 5 minutes in the future.
   * @return scheduledAt
  **/
  @Schema(description = "ISO 8601 Datetime at which to schedule a status. Providing this parameter will cause ScheduledStatus to be returned instead of Status. Must be at least 5 minutes in the future.")

  public String getScheduledAt() {
    return scheduledAt;
  }

  public void setScheduledAt(String scheduledAt) {
    this.scheduledAt = scheduledAt;
  }

  public V1StatusesBody2 language(String language) {
    this.language = language;
    return this;
  }

  /**
   * ISO 639 language code for this status.
   * @return language
  **/
  @Schema(description = "ISO 639 language code for this status.")

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public V1StatusesBody2 format(String format) {
    this.format = format;
    return this;
  }

  /**
   * Format to use when parsing this status.
   * @return format
  **/
  @Schema(description = "Format to use when parsing this status.")

  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1StatusesBody2 v1StatusesBody2 = (V1StatusesBody2) o;
    return Objects.equals(this.status, v1StatusesBody2.status) &&
        Objects.equals(this.mediaIds, v1StatusesBody2.mediaIds) &&
        Objects.equals(this.inReplyToId, v1StatusesBody2.inReplyToId) &&
        Objects.equals(this.sensitive, v1StatusesBody2.sensitive) &&
        Objects.equals(this.spoilerText, v1StatusesBody2.spoilerText) &&
        Objects.equals(this.visibility, v1StatusesBody2.visibility) &&
        Objects.equals(this.scheduledAt, v1StatusesBody2.scheduledAt) &&
        Objects.equals(this.language, v1StatusesBody2.language) &&
        Objects.equals(this.format, v1StatusesBody2.format);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, mediaIds, inReplyToId, sensitive, spoilerText, visibility, scheduledAt, language, format);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1StatusesBody2 {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    mediaIds: ").append(toIndentedString(mediaIds)).append("\n");
    sb.append("    inReplyToId: ").append(toIndentedString(inReplyToId)).append("\n");
    sb.append("    sensitive: ").append(toIndentedString(sensitive)).append("\n");
    sb.append("    spoilerText: ").append(toIndentedString(spoilerText)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
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
