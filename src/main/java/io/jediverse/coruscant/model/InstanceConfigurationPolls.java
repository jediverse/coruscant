package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;

/**
 * InstanceConfigurationPolls
 */
@Validated

public class InstanceConfigurationPolls   {
  @JsonProperty("max_characters_per_option")
  private Long maxCharactersPerOption = null;

  @JsonProperty("max_expiration")
  private Long maxExpiration = null;

  @JsonProperty("max_options")
  private Long maxOptions = null;

  @JsonProperty("min_expiration")
  private Long minExpiration = null;

  public InstanceConfigurationPolls maxCharactersPerOption(Long maxCharactersPerOption) {
    this.maxCharactersPerOption = maxCharactersPerOption;
    return this;
  }

  /**
   * Number of characters allowed per option in the poll.
   * @return maxCharactersPerOption
  **/
  @Schema(example = "50", description = "Number of characters allowed per option in the poll.")

  public Long getMaxCharactersPerOption() {
    return maxCharactersPerOption;
  }

  public void setMaxCharactersPerOption(Long maxCharactersPerOption) {
    this.maxCharactersPerOption = maxCharactersPerOption;
  }

  public InstanceConfigurationPolls maxExpiration(Long maxExpiration) {
    this.maxExpiration = maxExpiration;
    return this;
  }

  /**
   * Maximum expiration time of the poll in seconds.
   * @return maxExpiration
  **/
  @Schema(example = "2629746", description = "Maximum expiration time of the poll in seconds.")

  public Long getMaxExpiration() {
    return maxExpiration;
  }

  public void setMaxExpiration(Long maxExpiration) {
    this.maxExpiration = maxExpiration;
  }

  public InstanceConfigurationPolls maxOptions(Long maxOptions) {
    this.maxOptions = maxOptions;
    return this;
  }

  /**
   * Number of options permitted in a poll on this instance.
   * @return maxOptions
  **/
  @Schema(example = "4", description = "Number of options permitted in a poll on this instance.")

  public Long getMaxOptions() {
    return maxOptions;
  }

  public void setMaxOptions(Long maxOptions) {
    this.maxOptions = maxOptions;
  }

  public InstanceConfigurationPolls minExpiration(Long minExpiration) {
    this.minExpiration = minExpiration;
    return this;
  }

  /**
   * Minimum expiration time of the poll in seconds.
   * @return minExpiration
  **/
  @Schema(example = "300", description = "Minimum expiration time of the poll in seconds.")

  public Long getMinExpiration() {
    return minExpiration;
  }

  public void setMinExpiration(Long minExpiration) {
    this.minExpiration = minExpiration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceConfigurationPolls instanceConfigurationPolls = (InstanceConfigurationPolls) o;
    return Objects.equals(this.maxCharactersPerOption, instanceConfigurationPolls.maxCharactersPerOption) &&
        Objects.equals(this.maxExpiration, instanceConfigurationPolls.maxExpiration) &&
        Objects.equals(this.maxOptions, instanceConfigurationPolls.maxOptions) &&
        Objects.equals(this.minExpiration, instanceConfigurationPolls.minExpiration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxCharactersPerOption, maxExpiration, maxOptions, minExpiration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceConfigurationPolls {\n");
    
    sb.append("    maxCharactersPerOption: ").append(toIndentedString(maxCharactersPerOption)).append("\n");
    sb.append("    maxExpiration: ").append(toIndentedString(maxExpiration)).append("\n");
    sb.append("    maxOptions: ").append(toIndentedString(maxOptions)).append("\n");
    sb.append("    minExpiration: ").append(toIndentedString(minExpiration)).append("\n");
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
