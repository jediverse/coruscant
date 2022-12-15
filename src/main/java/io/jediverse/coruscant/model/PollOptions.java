package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;

/**
 * PollOptions
 */
@Validated

public class PollOptions   {
  @JsonProperty("title")
  private String title = null;

  @JsonProperty("votes_count")
  private Long votesCount = null;

  public PollOptions title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The text value of the poll option. String.
   * @return title
  **/
  @Schema(description = "The text value of the poll option. String.")

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PollOptions votesCount(Long votesCount) {
    this.votesCount = votesCount;
    return this;
  }

  /**
   * The number of received votes for this option. Number, or null if results are not published yet.
   * @return votesCount
  **/
  @Schema(description = "The number of received votes for this option. Number, or null if results are not published yet.")

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
    PollOptions pollOptions = (PollOptions) o;
    return Objects.equals(this.title, pollOptions.title) &&
        Objects.equals(this.votesCount, pollOptions.votesCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, votesCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PollOptions {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
