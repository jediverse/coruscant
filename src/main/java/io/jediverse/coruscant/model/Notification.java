package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;
import javax.validation.Valid;

/**
 * Notification
 */
@Validated

public class Notification   {
  @JsonProperty("account")
  private Account account = null;

  @JsonProperty("created_at")
  private String createdAt = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("status")
  private Status status = null;

  @JsonProperty("type")
  private String type = null;

  public Notification account(Account account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
  **/
  @Schema(description = "")

  @Valid
  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public Notification createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The timestamp of the notification (ISO 8601 Datetime)
   * @return createdAt
  **/
  @Schema(description = "The timestamp of the notification (ISO 8601 Datetime)")

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Notification id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the notification in the database.
   * @return id
  **/
  @Schema(description = "The id of the notification in the database.")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Notification status(Status status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @Schema(description = "")

  @Valid
  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public Notification type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of event that resulted in the notification. follow = Someone followed you follow_request = Someone requested to follow you mention = Someone mentioned you in their status reblog = Someone boosted one of your statuses favourite = Someone favourited one of your statuses poll = A poll you have voted in or created has ended status = Someone you enabled notifications for has posted a status
   * @return type
  **/
  @Schema(description = "The type of event that resulted in the notification. follow = Someone followed you follow_request = Someone requested to follow you mention = Someone mentioned you in their status reblog = Someone boosted one of your statuses favourite = Someone favourited one of your statuses poll = A poll you have voted in or created has ended status = Someone you enabled notifications for has posted a status")

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notification notification = (Notification) o;
    return Objects.equals(this.account, notification.account) &&
        Objects.equals(this.createdAt, notification.createdAt) &&
        Objects.equals(this.id, notification.id) &&
        Objects.equals(this.status, notification.status) &&
        Objects.equals(this.type, notification.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, createdAt, id, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notification {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
