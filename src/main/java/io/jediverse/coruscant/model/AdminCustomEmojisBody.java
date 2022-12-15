package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.File;
import io.micronaut.validation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AdminCustomEmojisBody
 */
@Validated

public class AdminCustomEmojisBody   {
  @JsonProperty("shortcode")
  private String shortcode = null;

  @JsonProperty("image")
  private File image = null;

  @JsonProperty("category")
  private String category = null;

  public AdminCustomEmojisBody shortcode(String shortcode) {
    this.shortcode = shortcode;
    return this;
  }

  /**
   * The code to use for the emoji, which will be used by instance denizens to select it. This must be unique on the instance.
   * @return shortcode
  **/
  @Schema(required = true, description = "The code to use for the emoji, which will be used by instance denizens to select it. This must be unique on the instance.")
  @NotNull

@Pattern(regexp="\\w{2,30}")   public String getShortcode() {
    return shortcode;
  }

  public void setShortcode(String shortcode) {
    this.shortcode = shortcode;
  }

  public AdminCustomEmojisBody image(File image) {
    this.image = image;
    return this;
  }

  /**
   * A png or gif image of the emoji. Animated pngs work too! To ensure compatibility with other fedi implementations, emoji size limit is 50kb by default.
   * @return image
  **/
  @Schema(required = true, description = "A png or gif image of the emoji. Animated pngs work too! To ensure compatibility with other fedi implementations, emoji size limit is 50kb by default.")
  @NotNull

  @Valid
  public File getImage() {
    return image;
  }

  public void setImage(File image) {
    this.image = image;
  }

  public AdminCustomEmojisBody category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Category in which to place the new emoji. 64 characters or less. If left blank, emoji will be uncategorized. If a category with the given name doesn't exist yet, it will be created.
   * @return category
  **/
  @Schema(description = "Category in which to place the new emoji. 64 characters or less. If left blank, emoji will be uncategorized. If a category with the given name doesn't exist yet, it will be created.")

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
    AdminCustomEmojisBody adminCustomEmojisBody = (AdminCustomEmojisBody) o;
    return Objects.equals(this.shortcode, adminCustomEmojisBody.shortcode) &&
        Objects.equals(this.image, adminCustomEmojisBody.image) &&
        Objects.equals(this.category, adminCustomEmojisBody.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shortcode, image, category);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminCustomEmojisBody {\n");
    
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
