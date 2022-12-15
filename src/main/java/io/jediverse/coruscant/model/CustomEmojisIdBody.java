package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.File;
import io.micronaut.validation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CustomEmojisIdBody
 */
@Validated

public class CustomEmojisIdBody   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("shortcode")
  private String shortcode = null;

  @JsonProperty("image")
  private File image = null;

  @JsonProperty("category")
  private String category = null;

  public CustomEmojisIdBody type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of action to be taken. One of: (`disable`, `copy`, `modify`). For REMOTE emojis, `copy` or `disable` are supported. For LOCAL emojis, only `modify` is supported.
   * @return type
  **/
  @Schema(required = true, description = "Type of action to be taken. One of: (`disable`, `copy`, `modify`). For REMOTE emojis, `copy` or `disable` are supported. For LOCAL emojis, only `modify` is supported.")
  @NotNull

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CustomEmojisIdBody shortcode(String shortcode) {
    this.shortcode = shortcode;
    return this;
  }

  /**
   * The code to use for the emoji, which will be used by instance denizens to select it. This must be unique on the instance. Works for the `copy` action type only.
   * @return shortcode
  **/
  @Schema(description = "The code to use for the emoji, which will be used by instance denizens to select it. This must be unique on the instance. Works for the `copy` action type only.")

@Pattern(regexp="\\w{2,30}")   public String getShortcode() {
    return shortcode;
  }

  public void setShortcode(String shortcode) {
    this.shortcode = shortcode;
  }

  public CustomEmojisIdBody image(File image) {
    this.image = image;
    return this;
  }

  /**
   * A new png or gif image to use for the emoji. Animated pngs work too! To ensure compatibility with other fedi implementations, emoji size limit is 50kb by default. Works for LOCAL emojis only.
   * @return image
  **/
  @Schema(description = "A new png or gif image to use for the emoji. Animated pngs work too! To ensure compatibility with other fedi implementations, emoji size limit is 50kb by default. Works for LOCAL emojis only.")

  @Valid
  public File getImage() {
    return image;
  }

  public void setImage(File image) {
    this.image = image;
  }

  public CustomEmojisIdBody category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Category in which to place the emoji. 64 characters or less. If a category with the given name doesn't exist yet, it will be created.
   * @return category
  **/
  @Schema(description = "Category in which to place the emoji. 64 characters or less. If a category with the given name doesn't exist yet, it will be created.")

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomEmojisIdBody customEmojisIdBody = (CustomEmojisIdBody) o;
    return Objects.equals(this.type, customEmojisIdBody.type) &&
        Objects.equals(this.shortcode, customEmojisIdBody.shortcode) &&
        Objects.equals(this.image, customEmojisIdBody.image) &&
        Objects.equals(this.category, customEmojisIdBody.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, shortcode, image, category);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomEmojisIdBody {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    shortcode: ").append(toIndentedString(shortcode)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
