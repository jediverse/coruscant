package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import io.micronaut.validation.Validated;
import javax.validation.Valid;

/**
 * Poll
 */
@Validated

public class Poll   {
  @JsonProperty("emojis")
  @Valid
  private List<Emoji> emojis = null;

  @JsonProperty("expired")
  private Boolean expired = null;

  @JsonProperty("expires_at")
  private String expiresAt = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("multiple")
  private Boolean multiple = null;

  @JsonProperty("options")
  @Valid
  private List<PollOptions> options = null;

  @JsonProperty("own_votes")
  @Valid
  private List<Long> ownVotes = null;

  @JsonProperty("voted")
  private Boolean voted = null;

  @JsonProperty("voters_count")
  private Long votersCount = null;

  @JsonProperty("votes_count")
  private Long votesCount = null;

  public Poll emojis(List<Emoji> emojis) {
    this.emojis = emojis;
    return this;
  }

  public Poll addEmojisItem(Emoji emojisItem) {
    if (this.emojis == null) {
      this.emojis = new ArrayList<Emoji>();
    }
    this.emojis.add(emojisItem);
    return this;
  }

  /**
   * Custom emoji to be used for rendering poll options.
   * @return emojis
  **/
  @Schema(description = "Custom emoji to be used for rendering poll options.")
  @Valid
  public List<Emoji> getEmojis() {
    return emojis;
  }

  public void setEmojis(List<Emoji> emojis) {
    this.emojis = emojis;
  }

  public Poll expired(Boolean expired) {
    this.expired = expired;
    return this;
  }

  /**
   * Is the poll currently expired?
   * @return expired
  **/
  @Schema(description = "Is the poll currently expired?")

  public Boolean isExpired() {
    return expired;
  }

  public void setExpired(Boolean expired) {
    this.expired = expired;
  }

  public Poll expiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * When the poll ends. (ISO 8601 Datetime), or null if the poll does not end
   * @return expiresAt
  **/
  @Schema(description = "When the poll ends. (ISO 8601 Datetime), or null if the poll does not end")

  public String getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }

  public Poll id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the poll in the database.
   * @return id
  **/
  @Schema(example = "01FBYKMD1KBMJ0W6JF1YZ3VY5D", description = "The ID of the poll in the database.")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Poll multiple(Boolean multiple) {
    this.multiple = multiple;
    return this;
  }

  /**
   * Does the poll allow multiple-choice answers?
   * @return multiple
  **/
  @Schema(description = "Does the poll allow multiple-choice answers?")

  public Boolean isMultiple() {
    return multiple;
  }

  public void setMultiple(Boolean multiple) {
    this.multiple = multiple;
  }

  public Poll options(List<PollOptions> options) {
    this.options = options;
    return this;
  }

  public Poll addOptionsItem(PollOptions optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<PollOptions>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * Possible answers for the poll.
   * @return options
  **/
  @Schema(description = "Possible answers for the poll.")
  @Valid
  public List<PollOptions> getOptions() {
    return options;
  }

  public void setOptions(List<PollOptions> options) {
    this.options = options;
  }

  public Poll ownVotes(List<Long> ownVotes) {
    this.ownVotes = ownVotes;
    return this;
  }

  public Poll addOwnVotesItem(Long ownVotesItem) {
    if (this.ownVotes == null) {
      this.ownVotes = new ArrayList<Long>();
    }
    this.ownVotes.add(ownVotesItem);
    return this;
  }

  /**
   * When called with a user token, which options has the authorized user chosen? Contains an array of index values for options.
   * @return ownVotes
  **/
  @Schema(description = "When called with a user token, which options has the authorized user chosen? Contains an array of index values for options.")

  public List<Long> getOwnVotes() {
    return ownVotes;
  }

  public void setOwnVotes(List<Long> ownVotes) {
    this.ownVotes = ownVotes;
  }

  public Poll voted(Boolean voted) {
    this.voted = voted;
    return this;
  }

  /**
   * When called with a user token, has the authorized user voted?
   * @return voted
  **/
  @Schema(description = "When called with a user token, has the authorized user voted?")

  public Boolean isVoted() {
    return voted;
  }

  public void setVoted(Boolean voted) {
    this.voted = voted;
  }

  public Poll votersCount(Long votersCount) {
    this.votersCount = votersCount;
    return this;
  }

  /**
   * How many unique accounts have voted on a multiple-choice poll. Null if multiple is false.
   * @return votersCount
  **/
  @Schema(description = "How many unique accounts have voted on a multiple-choice poll. Null if multiple is false.")

  public Long getVotersCount() {
    return votersCount;
  }

  public void setVotersCount(Long votersCount) {
    this.votersCount = votersCount;
  }

  public Poll votesCount(Long votesCount) {
    this.votesCount = votesCount;
    return this;
  }

  /**
   * How many votes have been received.
   * @return votesCount
  **/
  @Schema(description = "How many votes have been received.")

  public Long getVotesCount() {
    return votesCount;
  }

  public void setVotesCount(Long votesCount) {
    this.votesCount = votesCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Poll poll = (Poll) o;
    return Objects.equals(this.emojis, poll.emojis) &&
        Objects.equals(this.expired, poll.expired) &&
        Objects.equals(this.expiresAt, poll.expiresAt) &&
        Objects.equals(this.id, poll.id) &&
        Objects.equals(this.multiple, poll.multiple) &&
        Objects.equals(this.options, poll.options) &&
        Objects.equals(this.ownVotes, poll.ownVotes) &&
        Objects.equals(this.voted, poll.voted) &&
        Objects.equals(this.votersCount, poll.votersCount) &&
        Objects.equals(this.votesCount, poll.votesCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emojis, expired, expiresAt, id, multiple, options, ownVotes, voted, votersCount, votesCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Poll {\n");
    
    sb.append("    emojis: ").append(toIndentedString(emojis)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    multiple: ").append(toIndentedString(multiple)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    ownVotes: ").append(toIndentedString(ownVotes)).append("\n");
    sb.append("    voted: ").append(toIndentedString(voted)).append("\n");
    sb.append("    votersCount: ").append(toIndentedString(votersCount)).append("\n");
    sb.append("    votesCount: ").append(toIndentedString(votesCount)).append("\n");
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
