package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;

/**
 * AccountRelationship
 */
@Validated

public class AccountRelationship   {
  @JsonProperty("blocked_by")
  private Boolean blockedBy = null;

  @JsonProperty("blocking")
  private Boolean blocking = null;

  @JsonProperty("domain_blocking")
  private Boolean domainBlocking = null;

  @JsonProperty("endorsed")
  private Boolean endorsed = null;

  @JsonProperty("followed_by")
  private Boolean followedBy = null;

  @JsonProperty("following")
  private Boolean following = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("muting")
  private Boolean muting = null;

  @JsonProperty("muting_notifications")
  private Boolean mutingNotifications = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("notifying")
  private Boolean notifying = null;

  @JsonProperty("requested")
  private Boolean requested = null;

  @JsonProperty("showing_reblogs")
  private Boolean showingReblogs = null;

  public AccountRelationship blockedBy(Boolean blockedBy) {
    this.blockedBy = blockedBy;
    return this;
  }

  /**
   * This account is blocking you.
   * @return blockedBy
  **/
  @Schema(description = "This account is blocking you.")

  public Boolean isBlockedBy() {
    return blockedBy;
  }

  public void setBlockedBy(Boolean blockedBy) {
    this.blockedBy = blockedBy;
  }

  public AccountRelationship blocking(Boolean blocking) {
    this.blocking = blocking;
    return this;
  }

  /**
   * You are blocking this account.
   * @return blocking
  **/
  @Schema(description = "You are blocking this account.")

  public Boolean isBlocking() {
    return blocking;
  }

  public void setBlocking(Boolean blocking) {
    this.blocking = blocking;
  }

  public AccountRelationship domainBlocking(Boolean domainBlocking) {
    this.domainBlocking = domainBlocking;
    return this;
  }

  /**
   * You are blocking this account's domain.
   * @return domainBlocking
  **/
  @Schema(description = "You are blocking this account's domain.")

  public Boolean isDomainBlocking() {
    return domainBlocking;
  }

  public void setDomainBlocking(Boolean domainBlocking) {
    this.domainBlocking = domainBlocking;
  }

  public AccountRelationship endorsed(Boolean endorsed) {
    this.endorsed = endorsed;
    return this;
  }

  /**
   * You are featuring this account on your profile.
   * @return endorsed
  **/
  @Schema(description = "You are featuring this account on your profile.")

  public Boolean isEndorsed() {
    return endorsed;
  }

  public void setEndorsed(Boolean endorsed) {
    this.endorsed = endorsed;
  }

  public AccountRelationship followedBy(Boolean followedBy) {
    this.followedBy = followedBy;
    return this;
  }

  /**
   * This account follows you.
   * @return followedBy
  **/
  @Schema(description = "This account follows you.")

  public Boolean isFollowedBy() {
    return followedBy;
  }

  public void setFollowedBy(Boolean followedBy) {
    this.followedBy = followedBy;
  }

  public AccountRelationship following(Boolean following) {
    this.following = following;
    return this;
  }

  /**
   * You are following this account.
   * @return following
  **/
  @Schema(description = "You are following this account.")

  public Boolean isFollowing() {
    return following;
  }

  public void setFollowing(Boolean following) {
    this.following = following;
  }

  public AccountRelationship id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The account id.
   * @return id
  **/
  @Schema(example = "01FBW9XGEP7G6K88VY4S9MPE1R", description = "The account id.")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AccountRelationship muting(Boolean muting) {
    this.muting = muting;
    return this;
  }

  /**
   * You are muting this account.
   * @return muting
  **/
  @Schema(description = "You are muting this account.")

  public Boolean isMuting() {
    return muting;
  }

  public void setMuting(Boolean muting) {
    this.muting = muting;
  }

  public AccountRelationship mutingNotifications(Boolean mutingNotifications) {
    this.mutingNotifications = mutingNotifications;
    return this;
  }

  /**
   * You are muting notifications from this account.
   * @return mutingNotifications
  **/
  @Schema(description = "You are muting notifications from this account.")

  public Boolean isMutingNotifications() {
    return mutingNotifications;
  }

  public void setMutingNotifications(Boolean mutingNotifications) {
    this.mutingNotifications = mutingNotifications;
  }

  public AccountRelationship note(String note) {
    this.note = note;
    return this;
  }

  /**
   * Your note on this account.
   * @return note
  **/
  @Schema(description = "Your note on this account.")

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public AccountRelationship notifying(Boolean notifying) {
    this.notifying = notifying;
    return this;
  }

  /**
   * You are seeing notifications when this account posts.
   * @return notifying
  **/
  @Schema(description = "You are seeing notifications when this account posts.")

  public Boolean isNotifying() {
    return notifying;
  }

  public void setNotifying(Boolean notifying) {
    this.notifying = notifying;
  }

  public AccountRelationship requested(Boolean requested) {
    this.requested = requested;
    return this;
  }

  /**
   * You have requested to follow this account, and the request is pending.
   * @return requested
  **/
  @Schema(description = "You have requested to follow this account, and the request is pending.")

  public Boolean isRequested() {
    return requested;
  }

  public void setRequested(Boolean requested) {
    this.requested = requested;
  }

  public AccountRelationship showingReblogs(Boolean showingReblogs) {
    this.showingReblogs = showingReblogs;
    return this;
  }

  /**
   * You are seeing reblogs/boosts from this account in your home timeline.
   * @return showingReblogs
  **/
  @Schema(description = "You are seeing reblogs/boosts from this account in your home timeline.")

  public Boolean isShowingReblogs() {
    return showingReblogs;
  }

  public void setShowingReblogs(Boolean showingReblogs) {
    this.showingReblogs = showingReblogs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountRelationship accountRelationship = (AccountRelationship) o;
    return Objects.equals(this.blockedBy, accountRelationship.blockedBy) &&
        Objects.equals(this.blocking, accountRelationship.blocking) &&
        Objects.equals(this.domainBlocking, accountRelationship.domainBlocking) &&
        Objects.equals(this.endorsed, accountRelationship.endorsed) &&
        Objects.equals(this.followedBy, accountRelationship.followedBy) &&
        Objects.equals(this.following, accountRelationship.following) &&
        Objects.equals(this.id, accountRelationship.id) &&
        Objects.equals(this.muting, accountRelationship.muting) &&
        Objects.equals(this.mutingNotifications, accountRelationship.mutingNotifications) &&
        Objects.equals(this.note, accountRelationship.note) &&
        Objects.equals(this.notifying, accountRelationship.notifying) &&
        Objects.equals(this.requested, accountRelationship.requested) &&
        Objects.equals(this.showingReblogs, accountRelationship.showingReblogs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockedBy, blocking, domainBlocking, endorsed, followedBy, following, id, muting, mutingNotifications, note, notifying, requested, showingReblogs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountRelationship {\n");
    
    sb.append("    blockedBy: ").append(toIndentedString(blockedBy)).append("\n");
    sb.append("    blocking: ").append(toIndentedString(blocking)).append("\n");
    sb.append("    domainBlocking: ").append(toIndentedString(domainBlocking)).append("\n");
    sb.append("    endorsed: ").append(toIndentedString(endorsed)).append("\n");
    sb.append("    followedBy: ").append(toIndentedString(followedBy)).append("\n");
    sb.append("    following: ").append(toIndentedString(following)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    muting: ").append(toIndentedString(muting)).append("\n");
    sb.append("    mutingNotifications: ").append(toIndentedString(mutingNotifications)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    notifying: ").append(toIndentedString(notifying)).append("\n");
    sb.append("    requested: ").append(toIndentedString(requested)).append("\n");
    sb.append("    showingReblogs: ").append(toIndentedString(showingReblogs)).append("\n");
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
