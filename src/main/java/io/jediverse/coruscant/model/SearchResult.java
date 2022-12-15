package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import io.micronaut.validation.Validated;
import javax.validation.Valid;

/**
 * SearchResult
 */
@Validated

public class SearchResult   {
  @JsonProperty("accounts")
  @Valid
  private List<Account> accounts = null;

  @JsonProperty("hashtags")
  @Valid
  private List<Tag> hashtags = null;

  @JsonProperty("statuses")
  @Valid
  private List<Status> statuses = null;

  public SearchResult accounts(List<Account> accounts) {
    this.accounts = accounts;
    return this;
  }

  public SearchResult addAccountsItem(Account accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<Account>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

  /**
   * Get accounts
   * @return accounts
  **/
  @Schema(description = "")
  @Valid
  public List<Account> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<Account> accounts) {
    this.accounts = accounts;
  }

  public SearchResult hashtags(List<Tag> hashtags) {
    this.hashtags = hashtags;
    return this;
  }

  public SearchResult addHashtagsItem(Tag hashtagsItem) {
    if (this.hashtags == null) {
      this.hashtags = new ArrayList<Tag>();
    }
    this.hashtags.add(hashtagsItem);
    return this;
  }

  /**
   * Get hashtags
   * @return hashtags
  **/
  @Schema(description = "")
  @Valid
  public List<Tag> getHashtags() {
    return hashtags;
  }

  public void setHashtags(List<Tag> hashtags) {
    this.hashtags = hashtags;
  }

  public SearchResult statuses(List<Status> statuses) {
    this.statuses = statuses;
    return this;
  }

  public SearchResult addStatusesItem(Status statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<Status>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

  /**
   * Get statuses
   * @return statuses
  **/
  @Schema(description = "")
  @Valid
  public List<Status> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<Status> statuses) {
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
    SearchResult searchResult = (SearchResult) o;
    return Objects.equals(this.accounts, searchResult.accounts) &&
        Objects.equals(this.hashtags, searchResult.hashtags) &&
        Objects.equals(this.statuses, searchResult.statuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, hashtags, statuses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResult {\n");
    
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    hashtags: ").append(toIndentedString(hashtags)).append("\n");
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
