package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;

/**
 * AdminEmoji
 */
@Validated

public class AdminEmoji   {
  @JsonProperty("category")
  private String category = null;

  @JsonProperty("content_type")
  private String contentType = null;

  @JsonProperty("disabled")
  private Boolean disabled = null;

  @JsonProperty("domain")
  private String domain = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("shortcode")
  private String shortcode = null;

  @JsonProperty("static_url")
  private String staticUrl = null;

  @JsonProperty("total_file_size")
  private Long totalFileSize = null;

  @JsonProperty("updated_at")
  private String updatedAt = null;

  @JsonProperty("uri")
  private String uri = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("visible_in_picker")
  private Boolean visibleInPicker = null;

  public AdminEmoji category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Used for sorting custom emoji in the picker.
   * @return category
  **/
  @Schema(example = "blobcats", description = "Used for sorting custom emoji in the picker.")

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public AdminEmoji contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * The MIME content type of the emoji.
   * @return contentType
  **/
  @Schema(example = "image/png", description = "The MIME content type of the emoji.")

  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public AdminEmoji disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * True if this emoji has been disabled by an admin action.
   * @return disabled
  **/
  @Schema(example = "false", description = "True if this emoji has been disabled by an admin action.")

  public Boolean isDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public AdminEmoji domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * The domain from which the emoji originated. Only defined for remote domains, otherwise key will not be set.
   * @return domain
  **/
  @Schema(example = "example.org", description = "The domain from which the emoji originated. Only defined for remote domains, otherwise key will not be set.")

  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public AdminEmoji id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the emoji.
   * @return id
  **/
  @Schema(example = "01GEM7SFDZ7GZNRXFVZ3X4E4N1", description = "The ID of the emoji.")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AdminEmoji shortcode(String shortcode) {
    this.shortcode = shortcode;
    return this;
  }

  /**
   * The name of the custom emoji.
   * @return shortcode
  **/
  @Schema(example = "blobcat_uwu", description = "The name of the custom emoji.")

  public String getShortcode() {
    return shortcode;
  }

  public void setShortcode(String shortcode) {
    this.shortcode = shortcode;
  }

  public AdminEmoji staticUrl(String staticUrl) {
    this.staticUrl = staticUrl;
    return this;
  }

  /**
   * A link to a static copy of the custom emoji.
   * @return staticUrl
  **/
  @Schema(example = "https://example.org/fileserver/emojis/blogcat_uwu.png", description = "A link to a static copy of the custom emoji.")

  public String getStaticUrl() {
    return staticUrl;
  }

  public void setStaticUrl(String staticUrl) {
    this.staticUrl = staticUrl;
  }

  public AdminEmoji totalFileSize(Long totalFileSize) {
    this.totalFileSize = totalFileSize;
    return this;
  }

  /**
   * The total file size taken up by the emoji in bytes, including static and animated versions.
   * @return totalFileSize
  **/
  @Schema(example = "69420", description = "The total file size taken up by the emoji in bytes, including static and animated versions.")

  public Long getTotalFileSize() {
    return totalFileSize;
  }

  public void setTotalFileSize(Long totalFileSize) {
    this.totalFileSize = totalFileSize;
  }

  public AdminEmoji updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Time when the emoji image was last updated.
   * @return updatedAt
  **/
  @Schema(example = "2022-10-05T09:21:26.419Z", description = "Time when the emoji image was last updated.")

  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public AdminEmoji uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * The ActivityPub URI of the emoji.
   * @return uri
  **/
  @Schema(example = "https://example.org/emojis/016T5Q3SQKBT337DAKVSKNXXW1", description = "The ActivityPub URI of the emoji.")

  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public AdminEmoji url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Web URL of the custom emoji.
   * @return url
  **/
  @Schema(example = "https://example.org/fileserver/emojis/blogcat_uwu.gif", description = "Web URL of the custom emoji.")

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public AdminEmoji visibleInPicker(Boolean visibleInPicker) {
    this.visibleInPicker = visibleInPicker;
    return this;
  }

  /**
   * Emoji is visible in the emoji picker of the instance.
   * @return visibleInPicker
  **/
  @Schema(example = "true", description = "Emoji is visible in the emoji picker of the instance.")

  public Boolean isVisibleInPicker() {
    return visibleInPicker;
  }

  public void setVisibleInPicker(Boolean visibleInPicker) {
    this.visibleInPicker = visibleInPicker;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminEmoji adminEmoji = (AdminEmoji) o;
    return Objects.equals(this.category, adminEmoji.category) &&
        Objects.equals(this.contentType, adminEmoji.contentType) &&
        Objects.equals(this.disabled, adminEmoji.disabled) &&
        Objects.equals(this.domain, adminEmoji.domain) &&
        Objects.equals(this.id, adminEmoji.id) &&
        Objects.equals(this.shortcode, adminEmoji.shortcode) &&
        Objects.equals(this.staticUrl, adminEmoji.staticUrl) &&
        Objects.equals(this.totalFileSize, adminEmoji.totalFileSize) &&
        Objects.equals(this.updatedAt, adminEmoji.updatedAt) &&
        Objects.equals(this.uri, adminEmoji.uri) &&
        Objects.equals(this.url, adminEmoji.url) &&
        Objects.equals(this.visibleInPicker, adminEmoji.visibleInPicker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, contentType, disabled, domain, id, shortcode, staticUrl, totalFileSize, updatedAt, uri, url, visibleInPicker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminEmoji {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    shortcode: ").append(toIndentedString(shortcode)).append("\n");
    sb.append("    staticUrl: ").append(toIndentedString(staticUrl)).append("\n");
    sb.append("    totalFileSize: ").append(toIndentedString(totalFileSize)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    visibleInPicker: ").append(toIndentedString(visibleInPicker)).append("\n");
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
