package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;
import javax.validation.Valid;

/**
 * Attachment
 */
@Validated

public class Attachment   {
  @JsonProperty("blurhash")
  private String blurhash = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("meta")
  private MediaMeta meta = null;

  @JsonProperty("preview_remote_url")
  private String previewRemoteUrl = null;

  @JsonProperty("preview_url")
  private String previewUrl = null;

  @JsonProperty("remote_url")
  private String remoteUrl = null;

  @JsonProperty("text_url")
  private String textUrl = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("url")
  private String url = null;

  public Attachment blurhash(String blurhash) {
    this.blurhash = blurhash;
    return this;
  }

  /**
   * A hash computed by the BlurHash algorithm, for generating colorful preview thumbnails when media has not been downloaded yet. See https://github.com/woltapp/blurhash
   * @return blurhash
  **/
  @Schema(description = "A hash computed by the BlurHash algorithm, for generating colorful preview thumbnails when media has not been downloaded yet. See https://github.com/woltapp/blurhash")

  public String getBlurhash() {
    return blurhash;
  }

  public void setBlurhash(String blurhash) {
    this.blurhash = blurhash;
  }

  public Attachment description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Alt text that describes what is in the media attachment.
   * @return description
  **/
  @Schema(example = "This is a picture of a kitten.", description = "Alt text that describes what is in the media attachment.")

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Attachment id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the attachment.
   * @return id
  **/
  @Schema(example = "01FC31DZT1AYWDZ8XTCRWRBYRK", description = "The ID of the attachment.")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Attachment meta(MediaMeta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
  **/
  @Schema(description = "")

  @Valid
  public MediaMeta getMeta() {
    return meta;
  }

  public void setMeta(MediaMeta meta) {
    this.meta = meta;
  }

  public Attachment previewRemoteUrl(String previewRemoteUrl) {
    this.previewRemoteUrl = previewRemoteUrl;
    return this;
  }

  /**
   * The location of a scaled-down preview of the attachment on the remote server. Only defined for instances other than our own.
   * @return previewRemoteUrl
  **/
  @Schema(example = "https://some-other-server.org/attachments/small/ahhhhh.jpeg", description = "The location of a scaled-down preview of the attachment on the remote server. Only defined for instances other than our own.")

  public String getPreviewRemoteUrl() {
    return previewRemoteUrl;
  }

  public void setPreviewRemoteUrl(String previewRemoteUrl) {
    this.previewRemoteUrl = previewRemoteUrl;
  }

  public Attachment previewUrl(String previewUrl) {
    this.previewUrl = previewUrl;
    return this;
  }

  /**
   * The location of a scaled-down preview of the attachment.
   * @return previewUrl
  **/
  @Schema(example = "https://example.org/fileserver/some_id/attachments/some_id/small/attachment.jpeg", description = "The location of a scaled-down preview of the attachment.")

  public String getPreviewUrl() {
    return previewUrl;
  }

  public void setPreviewUrl(String previewUrl) {
    this.previewUrl = previewUrl;
  }

  public Attachment remoteUrl(String remoteUrl) {
    this.remoteUrl = remoteUrl;
    return this;
  }

  /**
   * The location of the full-size original attachment on the remote server. Only defined for instances other than our own.
   * @return remoteUrl
  **/
  @Schema(example = "https://some-other-server.org/attachments/original/ahhhhh.jpeg", description = "The location of the full-size original attachment on the remote server. Only defined for instances other than our own.")

  public String getRemoteUrl() {
    return remoteUrl;
  }

  public void setRemoteUrl(String remoteUrl) {
    this.remoteUrl = remoteUrl;
  }

  public Attachment textUrl(String textUrl) {
    this.textUrl = textUrl;
    return this;
  }

  /**
   * A shorter URL for the attachment. In our case, we just give the URL again since we don't create smaller URLs.
   * @return textUrl
  **/
  @Schema(description = "A shorter URL for the attachment. In our case, we just give the URL again since we don't create smaller URLs.")

  public String getTextUrl() {
    return textUrl;
  }

  public void setTextUrl(String textUrl) {
    this.textUrl = textUrl;
  }

  public Attachment type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the attachment.
   * @return type
  **/
  @Schema(example = "image", description = "The type of the attachment.")

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Attachment url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The location of the original full-size attachment.
   * @return url
  **/
  @Schema(example = "https://example.org/fileserver/some_id/attachments/some_id/original/attachment.jpeg", description = "The location of the original full-size attachment.")

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attachment attachment = (Attachment) o;
    return Objects.equals(this.blurhash, attachment.blurhash) &&
        Objects.equals(this.description, attachment.description) &&
        Objects.equals(this.id, attachment.id) &&
        Objects.equals(this.meta, attachment.meta) &&
        Objects.equals(this.previewRemoteUrl, attachment.previewRemoteUrl) &&
        Objects.equals(this.previewUrl, attachment.previewUrl) &&
        Objects.equals(this.remoteUrl, attachment.remoteUrl) &&
        Objects.equals(this.textUrl, attachment.textUrl) &&
        Objects.equals(this.type, attachment.type) &&
        Objects.equals(this.url, attachment.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blurhash, description, id, meta, previewRemoteUrl, previewUrl, remoteUrl, textUrl, type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    
    sb.append("    blurhash: ").append(toIndentedString(blurhash)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    previewRemoteUrl: ").append(toIndentedString(previewRemoteUrl)).append("\n");
    sb.append("    previewUrl: ").append(toIndentedString(previewUrl)).append("\n");
    sb.append("    remoteUrl: ").append(toIndentedString(remoteUrl)).append("\n");
    sb.append("    textUrl: ").append(toIndentedString(textUrl)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
