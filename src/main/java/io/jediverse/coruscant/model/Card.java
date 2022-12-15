package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;

/**
 * Card
 */
@Validated

public class Card   {
  @JsonProperty("author_name")
  private String authorName = null;

  @JsonProperty("author_url")
  private String authorUrl = null;

  @JsonProperty("blurhash")
  private String blurhash = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("embed_url")
  private String embedUrl = null;

  @JsonProperty("height")
  private Long height = null;

  @JsonProperty("html")
  private String html = null;

  @JsonProperty("image")
  private String image = null;

  @JsonProperty("provider_name")
  private String providerName = null;

  @JsonProperty("provider_url")
  private String providerUrl = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("width")
  private Long width = null;

  public Card authorName(String authorName) {
    this.authorName = authorName;
    return this;
  }

  /**
   * The author of the original resource.
   * @return authorName
  **/
  @Schema(example = "weewee@buzzfeed.com", description = "The author of the original resource.")

  public String getAuthorName() {
    return authorName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

  public Card authorUrl(String authorUrl) {
    this.authorUrl = authorUrl;
    return this;
  }

  /**
   * A link to the author of the original resource.
   * @return authorUrl
  **/
  @Schema(example = "https://buzzfeed.com/authors/weewee", description = "A link to the author of the original resource.")

  public String getAuthorUrl() {
    return authorUrl;
  }

  public void setAuthorUrl(String authorUrl) {
    this.authorUrl = authorUrl;
  }

  public Card blurhash(String blurhash) {
    this.blurhash = blurhash;
    return this;
  }

  /**
   * A hash computed by the BlurHash algorithm, for generating colorful preview thumbnails when media has not been downloaded yet.
   * @return blurhash
  **/
  @Schema(description = "A hash computed by the BlurHash algorithm, for generating colorful preview thumbnails when media has not been downloaded yet.")

  public String getBlurhash() {
    return blurhash;
  }

  public void setBlurhash(String blurhash) {
    this.blurhash = blurhash;
  }

  public Card description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of preview.
   * @return description
  **/
  @Schema(example = "Is water wet? We're not sure. In this article, we ask an expert...", description = "Description of preview.")

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Card embedUrl(String embedUrl) {
    this.embedUrl = embedUrl;
    return this;
  }

  /**
   * Used for photo embeds, instead of custom html.
   * @return embedUrl
  **/
  @Schema(description = "Used for photo embeds, instead of custom html.")

  public String getEmbedUrl() {
    return embedUrl;
  }

  public void setEmbedUrl(String embedUrl) {
    this.embedUrl = embedUrl;
  }

  public Card height(Long height) {
    this.height = height;
    return this;
  }

  /**
   * Height of preview, in pixels.
   * @return height
  **/
  @Schema(description = "Height of preview, in pixels.")

  public Long getHeight() {
    return height;
  }

  public void setHeight(Long height) {
    this.height = height;
  }

  public Card html(String html) {
    this.html = html;
    return this;
  }

  /**
   * HTML to be used for generating the preview card.
   * @return html
  **/
  @Schema(description = "HTML to be used for generating the preview card.")

  public String getHtml() {
    return html;
  }

  public void setHtml(String html) {
    this.html = html;
  }

  public Card image(String image) {
    this.image = image;
    return this;
  }

  /**
   * Preview thumbnail.
   * @return image
  **/
  @Schema(example = "https://example.org/fileserver/preview/thumb.jpg", description = "Preview thumbnail.")

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public Card providerName(String providerName) {
    this.providerName = providerName;
    return this;
  }

  /**
   * The provider of the original resource.
   * @return providerName
  **/
  @Schema(example = "Buzzfeed", description = "The provider of the original resource.")

  public String getProviderName() {
    return providerName;
  }

  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }

  public Card providerUrl(String providerUrl) {
    this.providerUrl = providerUrl;
    return this;
  }

  /**
   * A link to the provider of the original resource.
   * @return providerUrl
  **/
  @Schema(example = "https://buzzfeed.com", description = "A link to the provider of the original resource.")

  public String getProviderUrl() {
    return providerUrl;
  }

  public void setProviderUrl(String providerUrl) {
    this.providerUrl = providerUrl;
  }

  public Card title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of linked resource.
   * @return title
  **/
  @Schema(example = "Buzzfeed - Is Water Wet?", description = "Title of linked resource.")

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Card type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the preview card.
   * @return type
  **/
  @Schema(example = "link", description = "The type of the preview card.")

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Card url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Location of linked resource.
   * @return url
  **/
  @Schema(example = "https://buzzfeed.com/some/fuckin/buzzfeed/article", description = "Location of linked resource.")

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Card width(Long width) {
    this.width = width;
    return this;
  }

  /**
   * Width of preview, in pixels.
   * @return width
  **/
  @Schema(description = "Width of preview, in pixels.")

  public Long getWidth() {
    return width;
  }

  public void setWidth(Long width) {
    this.width = width;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Card card = (Card) o;
    return Objects.equals(this.authorName, card.authorName) &&
        Objects.equals(this.authorUrl, card.authorUrl) &&
        Objects.equals(this.blurhash, card.blurhash) &&
        Objects.equals(this.description, card.description) &&
        Objects.equals(this.embedUrl, card.embedUrl) &&
        Objects.equals(this.height, card.height) &&
        Objects.equals(this.html, card.html) &&
        Objects.equals(this.image, card.image) &&
        Objects.equals(this.providerName, card.providerName) &&
        Objects.equals(this.providerUrl, card.providerUrl) &&
        Objects.equals(this.title, card.title) &&
        Objects.equals(this.type, card.type) &&
        Objects.equals(this.url, card.url) &&
        Objects.equals(this.width, card.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorName, authorUrl, blurhash, description, embedUrl, height, html, image, providerName, providerUrl, title, type, url, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Card {\n");
    
    sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
    sb.append("    authorUrl: ").append(toIndentedString(authorUrl)).append("\n");
    sb.append("    blurhash: ").append(toIndentedString(blurhash)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    embedUrl: ").append(toIndentedString(embedUrl)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    providerUrl: ").append(toIndentedString(providerUrl)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
