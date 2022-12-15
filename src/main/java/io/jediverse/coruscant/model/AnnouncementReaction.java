package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;

/**
 * AnnouncementReaction
 */
@Validated

public class AnnouncementReaction   {
  @JsonProperty("count")
  private Long count = null;

  @JsonProperty("me")
  private Boolean me = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("static_url")
  private String staticUrl = null;

  @JsonProperty("url")
  private String url = null;

  public AnnouncementReaction count(Long count) {
    this.count = count;
    return this;
  }

  /**
   * The total number of users who have added this reaction.
   * @return count
  **/
  @Schema(example = "5", description = "The total number of users who have added this reaction.")

  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public AnnouncementReaction me(Boolean me) {
    this.me = me;
    return this;
  }

  /**
   * This reaction belongs to the account viewing it.
   * @return me
  **/
  @Schema(description = "This reaction belongs to the account viewing it.")

  public Boolean isMe() {
    return me;
  }

  public void setMe(Boolean me) {
    this.me = me;
  }

  public AnnouncementReaction name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The emoji used for the reaction. Either a unicode emoji, or a custom emoji's shortcode.
   * @return name
  **/
  @Schema(example = "blobcat_uwu", description = "The emoji used for the reaction. Either a unicode emoji, or a custom emoji's shortcode.")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AnnouncementReaction staticUrl(String staticUrl) {
    this.staticUrl = staticUrl;
    return this;
  }

  /**
   * Web link to a non-animated image of the custom emoji. Empty for unicode emojis.
   * @return staticUrl
  **/
  @Schema(example = "https://example.org/custom_emojis/statuc/blobcat_uwu.png", description = "Web link to a non-animated image of the custom emoji. Empty for unicode emojis.")

  public String getStaticUrl() {
    return staticUrl;
  }

  public void setStaticUrl(String staticUrl) {
    this.staticUrl = staticUrl;
  }

  public AnnouncementReaction url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Web link to the image of the custom emoji. Empty for unicode emojis.
   * @return url
  **/
  @Schema(example = "https://example.org/custom_emojis/original/blobcat_uwu.png", description = "Web link to the image of the custom emoji. Empty for unicode emojis.")

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
    AnnouncementReaction announcementReaction = (AnnouncementReaction) o;
    return Objects.equals(this.count, announcementReaction.count) &&
        Objects.equals(this.me, announcementReaction.me) &&
        Objects.equals(this.name, announcementReaction.name) &&
        Objects.equals(this.staticUrl, announcementReaction.staticUrl) &&
        Objects.equals(this.url, announcementReaction.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, me, name, staticUrl, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnouncementReaction {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    me: ").append(toIndentedString(me)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    staticUrl: ").append(toIndentedString(staticUrl)).append("\n");
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
