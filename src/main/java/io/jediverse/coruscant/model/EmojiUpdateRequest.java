package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;

/**
 * EmojiUpdateRequest
 */
@Validated

public class EmojiUpdateRequest   {
  @JsonProperty("CategoryName")
  private String categoryName = null;

  @JsonProperty("Image")
  private Object image = null;

  @JsonProperty("Shortcode")
  private String shortcode = null;

  @JsonProperty("type")
  private String type = null;

  public EmojiUpdateRequest categoryName(String categoryName) {
    this.categoryName = categoryName;
    return this;
  }

  /**
   * Category in which to place the emoji.
   * @return categoryName
  **/
  @Schema(description = "Category in which to place the emoji.")

  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public EmojiUpdateRequest image(Object image) {
    this.image = image;
    return this;
  }

  /**
   * Image file to use for the emoji. Must be png or gif and no larger than 50kb.
   * @return image
  **/
  @Schema(description = "Image file to use for the emoji. Must be png or gif and no larger than 50kb.")

  public Object getImage() {
    return image;
  }

  public void setImage(Object image) {
    this.image = image;
  }

  public EmojiUpdateRequest shortcode(String shortcode) {
    this.shortcode = shortcode;
    return this;
  }

  /**
   * Desired shortcode for the emoji, without surrounding colons. This must be unique for the domain.
   * @return shortcode
  **/
  @Schema(example = "blobcat_uwu", description = "Desired shortcode for the emoji, without surrounding colons. This must be unique for the domain.")

  public String getShortcode() {
    return shortcode;
  }

  public void setShortcode(String shortcode) {
    this.shortcode = shortcode;
  }

  public EmojiUpdateRequest type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @Schema(description = "")

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmojiUpdateRequest emojiUpdateRequest = (EmojiUpdateRequest) o;
    return Objects.equals(this.categoryName, emojiUpdateRequest.categoryName) &&
        Objects.equals(this.image, emojiUpdateRequest.image) &&
        Objects.equals(this.shortcode, emojiUpdateRequest.shortcode) &&
        Objects.equals(this.type, emojiUpdateRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryName, image, shortcode, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmojiUpdateRequest {\n");
    
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    shortcode: ").append(toIndentedString(shortcode)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
