package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;
import javax.validation.Valid;

/**
 * InstanceConfiguration
 */
@Validated

public class InstanceConfiguration   {
  @JsonProperty("accounts")
  private InstanceConfigurationAccounts accounts = null;

  @JsonProperty("emojis")
  private InstanceConfigurationEmojis emojis = null;

  @JsonProperty("media_attachments")
  private InstanceConfigurationMediaAttachments mediaAttachments = null;

  @JsonProperty("polls")
  private InstanceConfigurationPolls polls = null;

  @JsonProperty("statuses")
  private InstanceConfigurationStatuses statuses = null;

  public InstanceConfiguration accounts(InstanceConfigurationAccounts accounts) {
    this.accounts = accounts;
    return this;
  }

  /**
   * Get accounts
   * @return accounts
  **/
  @Schema(description = "")

  @Valid
  public InstanceConfigurationAccounts getAccounts() {
    return accounts;
  }

  public void setAccounts(InstanceConfigurationAccounts accounts) {
    this.accounts = accounts;
  }

  public InstanceConfiguration emojis(InstanceConfigurationEmojis emojis) {
    this.emojis = emojis;
    return this;
  }

  /**
   * Get emojis
   * @return emojis
  **/
  @Schema(description = "")

  @Valid
  public InstanceConfigurationEmojis getEmojis() {
    return emojis;
  }

  public void setEmojis(InstanceConfigurationEmojis emojis) {
    this.emojis = emojis;
  }

  public InstanceConfiguration mediaAttachments(InstanceConfigurationMediaAttachments mediaAttachments) {
    this.mediaAttachments = mediaAttachments;
    return this;
  }

  /**
   * Get mediaAttachments
   * @return mediaAttachments
  **/
  @Schema(description = "")

  @Valid
  public InstanceConfigurationMediaAttachments getMediaAttachments() {
    return mediaAttachments;
  }

  public void setMediaAttachments(InstanceConfigurationMediaAttachments mediaAttachments) {
    this.mediaAttachments = mediaAttachments;
  }

  public InstanceConfiguration polls(InstanceConfigurationPolls polls) {
    this.polls = polls;
    return this;
  }

  /**
   * Get polls
   * @return polls
  **/
  @Schema(description = "")

  @Valid
  public InstanceConfigurationPolls getPolls() {
    return polls;
  }

  public void setPolls(InstanceConfigurationPolls polls) {
    this.polls = polls;
  }

  public InstanceConfiguration statuses(InstanceConfigurationStatuses statuses) {
    this.statuses = statuses;
    return this;
  }

  /**
   * Get statuses
   * @return statuses
  **/
  @Schema(description = "")

  @Valid
  public InstanceConfigurationStatuses getStatuses() {
    return statuses;
  }

  public void setStatuses(InstanceConfigurationStatuses statuses) {
    this.statuses = statuses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceConfiguration instanceConfiguration = (InstanceConfiguration) o;
    return Objects.equals(this.accounts, instanceConfiguration.accounts) &&
        Objects.equals(this.emojis, instanceConfiguration.emojis) &&
        Objects.equals(this.mediaAttachments, instanceConfiguration.mediaAttachments) &&
        Objects.equals(this.polls, instanceConfiguration.polls) &&
        Objects.equals(this.statuses, instanceConfiguration.statuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, emojis, mediaAttachments, polls, statuses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceConfiguration {\n");
    
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    emojis: ").append(toIndentedString(emojis)).append("\n");
    sb.append("    mediaAttachments: ").append(toIndentedString(mediaAttachments)).append("\n");
    sb.append("    polls: ").append(toIndentedString(polls)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
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
