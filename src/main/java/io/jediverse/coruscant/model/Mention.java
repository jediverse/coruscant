package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;

/**
 * Mention
 */
@Validated

public class Mention   {
  @JsonProperty("acct")
  private String acct = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("username")
  private String username = null;

  public Mention acct(String acct) {
    this.acct = acct;
    return this;
  }

  /**
   * The account URI as discovered via webfinger. Equal to username for local users, or username@domain for remote users.
   * @return acct
  **/
  @Schema(example = "some_user@example.org", description = "The account URI as discovered via webfinger. Equal to username for local users, or username@domain for remote users.")

  public String getAcct() {
    return acct;
  }

  public void setAcct(String acct) {
    this.acct = acct;
  }

  public Mention id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the mentioned account.
   * @return id
  **/
  @Schema(example = "01FBYJHQWQZAVWFRK9PDYTKGMB", description = "The ID of the mentioned account.")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Mention url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The web URL of the mentioned account's profile.
   * @return url
  **/
  @Schema(example = "https://example.org/@some_user", description = "The web URL of the mentioned account's profile.")

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Mention username(String username) {
    this.username = username;
    return this;
  }

  /**
   * The username of the mentioned account.
   * @return username
  **/
  @Schema(example = "some_user", description = "The username of the mentioned account.")

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mention mention = (Mention) o;
    return Objects.equals(this.acct, mention.acct) &&
        Objects.equals(this.id, mention.id) &&
        Objects.equals(this.url, mention.url) &&
        Objects.equals(this.username, mention.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acct, id, url, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mention {\n");
    
    sb.append("    acct: ").append(toIndentedString(acct)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
