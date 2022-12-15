package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;

/**
 * IdFollowBody
 */
@Validated

public class IdFollowBody   {
  @JsonProperty("reblogs")
  private Boolean reblogs = true;

  @JsonProperty("notify")
  private Boolean notify = false;

  public IdFollowBody reblogs(Boolean reblogs) {
    this.reblogs = reblogs;
    return this;
  }

  /**
   * Show reblogs from this account.
   * @return reblogs
  **/
  @Schema(description = "Show reblogs from this account.")

  public Boolean isReblogs() {
    return reblogs;
  }

  public void setReblogs(Boolean reblogs) {
    this.reblogs = reblogs;
  }

  public IdFollowBody notify(Boolean notify) {
    this.notify = notify;
    return this;
  }

  /**
   * Notify when this account posts.
   * @return notify
  **/
  @Schema(description = "Notify when this account posts.")

  public Boolean isNotify() {
    return notify;
  }

  public void setNotify(Boolean notify) {
    this.notify = notify;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdFollowBody idFollowBody = (IdFollowBody) o;
    return Objects.equals(this.reblogs, idFollowBody.reblogs) &&
        Objects.equals(this.notify, idFollowBody.notify);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reblogs, notify);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdFollowBody {\n");
    
    sb.append("    reblogs: ").append(toIndentedString(reblogs)).append("\n");
    sb.append("    notify: ").append(toIndentedString(notify)).append("\n");
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
