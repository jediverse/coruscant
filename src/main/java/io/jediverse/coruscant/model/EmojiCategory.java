package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;

/**
 * EmojiCategory
 */
@Validated

public class EmojiCategory   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  public EmojiCategory id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the custom emoji category.
   * @return id
  **/
  @Schema(description = "The ID of the custom emoji category.")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EmojiCategory name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the custom emoji category.
   * @return name
  **/
  @Schema(description = "The name of the custom emoji category.")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmojiCategory emojiCategory = (EmojiCategory) o;
    return Objects.equals(this.id, emojiCategory.id) &&
        Objects.equals(this.name, emojiCategory.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmojiCategory {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
