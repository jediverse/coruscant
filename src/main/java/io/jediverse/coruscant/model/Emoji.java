package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;

/**
 * Emoji
 */
@Validated

public class Emoji   {
  @JsonProperty("category")
  private String category = null;

  @JsonProperty("shortcode")
  private String shortcode = null;

  @JsonProperty("static_url")
  private String staticUrl = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("visible_in_picker")
  private Boolean visibleInPicker = null;

  public Emoji category(String category) {
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

  public Emoji shortcode(String shortcode) {
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

  public Emoji staticUrl(String staticUrl) {
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

  public Emoji url(String url) {
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

  public Emoji visibleInPicker(Boolean visibleInPicker) {
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
    Emoji emoji = (Emoji) o;
    return Objects.equals(this.category, emoji.category) &&
        Objects.equals(this.shortcode, emoji.shortcode) &&
        Objects.equals(this.staticUrl, emoji.staticUrl) &&
        Objects.equals(this.url, emoji.url) &&
        Objects.equals(this.visibleInPicker, emoji.visibleInPicker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, shortcode, staticUrl, url, visibleInPicker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Emoji {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    shortcode: ").append(toIndentedString(shortcode)).append("\n");
    sb.append("    staticUrl: ").append(toIndentedString(staticUrl)).append("\n");
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
