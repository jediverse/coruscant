package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;

/**
 * InstanceConfigurationEmojis
 */
@Validated

public class InstanceConfigurationEmojis   {
  @JsonProperty("emoji_size_limit")
  private Long emojiSizeLimit = null;

  public InstanceConfigurationEmojis emojiSizeLimit(Long emojiSizeLimit) {
    this.emojiSizeLimit = emojiSizeLimit;
    return this;
  }

  /**
   * Max allowed emoji image size in bytes.
   * @return emojiSizeLimit
  **/
  @Schema(example = "51200", description = "Max allowed emoji image size in bytes.")

  public Long getEmojiSizeLimit() {
    return emojiSizeLimit;
  }

  public void setEmojiSizeLimit(Long emojiSizeLimit) {
    this.emojiSizeLimit = emojiSizeLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceConfigurationEmojis instanceConfigurationEmojis = (InstanceConfigurationEmojis) o;
    return Objects.equals(this.emojiSizeLimit, instanceConfigurationEmojis.emojiSizeLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emojiSizeLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceConfigurationEmojis {\n");
    
    sb.append("    emojiSizeLimit: ").append(toIndentedString(emojiSizeLimit)).append("\n");
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
