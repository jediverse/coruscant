package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;

/**
 * InstanceConfigurationStatuses
 */
@Validated

public class InstanceConfigurationStatuses   {
  @JsonProperty("characters_reserved_per_url")
  private Long charactersReservedPerUrl = null;

  @JsonProperty("max_characters")
  private Long maxCharacters = null;

  @JsonProperty("max_media_attachments")
  private Long maxMediaAttachments = null;

  public InstanceConfigurationStatuses charactersReservedPerUrl(Long charactersReservedPerUrl) {
    this.charactersReservedPerUrl = charactersReservedPerUrl;
    return this;
  }

  /**
   * Amount of characters clients should assume a url takes up.
   * @return charactersReservedPerUrl
  **/
  @Schema(example = "25", description = "Amount of characters clients should assume a url takes up.")

  public Long getCharactersReservedPerUrl() {
    return charactersReservedPerUrl;
  }

  public void setCharactersReservedPerUrl(Long charactersReservedPerUrl) {
    this.charactersReservedPerUrl = charactersReservedPerUrl;
  }

  public InstanceConfigurationStatuses maxCharacters(Long maxCharacters) {
    this.maxCharacters = maxCharacters;
    return this;
  }

  /**
   * Maximum allowed length of a post on this instance, in characters.
   * @return maxCharacters
  **/
  @Schema(example = "5000", description = "Maximum allowed length of a post on this instance, in characters.")

  public Long getMaxCharacters() {
    return maxCharacters;
  }

  public void setMaxCharacters(Long maxCharacters) {
    this.maxCharacters = maxCharacters;
  }

  public InstanceConfigurationStatuses maxMediaAttachments(Long maxMediaAttachments) {
    this.maxMediaAttachments = maxMediaAttachments;
    return this;
  }

  /**
   * Max number of attachments allowed on a status.
   * @return maxMediaAttachments
  **/
  @Schema(example = "4", description = "Max number of attachments allowed on a status.")

  public Long getMaxMediaAttachments() {
    return maxMediaAttachments;
  }

  public void setMaxMediaAttachments(Long maxMediaAttachments) {
    this.maxMediaAttachments = maxMediaAttachments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceConfigurationStatuses instanceConfigurationStatuses = (InstanceConfigurationStatuses) o;
    return Objects.equals(this.charactersReservedPerUrl, instanceConfigurationStatuses.charactersReservedPerUrl) &&
        Objects.equals(this.maxCharacters, instanceConfigurationStatuses.maxCharacters) &&
        Objects.equals(this.maxMediaAttachments, instanceConfigurationStatuses.maxMediaAttachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(charactersReservedPerUrl, maxCharacters, maxMediaAttachments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceConfigurationStatuses {\n");
    
    sb.append("    charactersReservedPerUrl: ").append(toIndentedString(charactersReservedPerUrl)).append("\n");
    sb.append("    maxCharacters: ").append(toIndentedString(maxCharacters)).append("\n");
    sb.append("    maxMediaAttachments: ").append(toIndentedString(maxMediaAttachments)).append("\n");
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
