package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import io.micronaut.validation.Validated;
import javax.validation.Valid;

/**
 * StatusReblogged
 */
@Validated

public class StatusReblogged   {
  @JsonProperty("account")
  private Account account = null;

  @JsonProperty("application")
  private Application application = null;

  @JsonProperty("bookmarked")
  private Boolean bookmarked = null;

  @JsonProperty("card")
  private Card card = null;

  @JsonProperty("content")
  private String content = null;

  @JsonProperty("created_at")
  private String createdAt = null;

  @JsonProperty("emojis")
  @Valid
  private List<Emoji> emojis = null;

  @JsonProperty("favourited")
  private Boolean favourited = null;

  @JsonProperty("favourites_count")
  private Long favouritesCount = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("in_reply_to_account_id")
  private String inReplyToAccountId = null;

  @JsonProperty("in_reply_to_id")
  private String inReplyToId = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("media_attachments")
  @Valid
  private List<Attachment> mediaAttachments = null;

  @JsonProperty("mentions")
  @Valid
  private List<Mention> mentions = null;

  @JsonProperty("muted")
  private Boolean muted = null;

  @JsonProperty("pinned")
  private Boolean pinned = null;

  @JsonProperty("poll")
  private Poll poll = null;

  @JsonProperty("reblog")
  private StatusReblogged reblog = null;

  @JsonProperty("reblogged")
  private Boolean reblogged = null;

  @JsonProperty("reblogs_count")
  private Long reblogsCount = null;

  @JsonProperty("replies_count")
  private Long repliesCount = null;

  @JsonProperty("sensitive")
  private Boolean sensitive = null;

  @JsonProperty("spoiler_text")
  private String spoilerText = null;

  @JsonProperty("tags")
  @Valid
  private List<Tag> tags = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("uri")
  private String uri = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("visibility")
  private String visibility = null;

  public StatusReblogged account(Account account) {
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

  public StatusReblogged application(Application application) {
    this.application = application;
    return this;
  }

  /**
   * Get application
   * @return application
  **/
  @Schema(description = "")

  @Valid
  public Application getApplication() {
    return application;
  }

  public void setApplication(Application application) {
    this.application = application;
  }

  public StatusReblogged bookmarked(Boolean bookmarked) {
    this.bookmarked = bookmarked;
    return this;
  }

  /**
   * This status has been bookmarked by the account viewing it.
   * @return bookmarked
  **/
  @Schema(description = "This status has been bookmarked by the account viewing it.")

  public Boolean isBookmarked() {
    return bookmarked;
  }

  public void setBookmarked(Boolean bookmarked) {
    this.bookmarked = bookmarked;
  }

  public StatusReblogged card(Card card) {
    this.card = card;
    return this;
  }

  /**
   * Get card
   * @return card
  **/
  @Schema(description = "")

  @Valid
  public Card getCard() {
    return card;
  }

  public void setCard(Card card) {
    this.card = card;
  }

  public StatusReblogged content(String content) {
    this.content = content;
    return this;
  }

  /**
   * The content of this status. Should be HTML, but might also be plaintext in some cases.
   * @return content
  **/
  @Schema(example = "<p>Hey this is a status!</p>", description = "The content of this status. Should be HTML, but might also be plaintext in some cases.")

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public StatusReblogged createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date when this status was created (ISO 8601 Datetime).
   * @return createdAt
  **/
  @Schema(example = "2021-07-30T09:20:25+00:00", description = "The date when this status was created (ISO 8601 Datetime).")

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public StatusReblogged emojis(List<Emoji> emojis) {
    this.emojis = emojis;
    return this;
  }

  public StatusReblogged addEmojisItem(Emoji emojisItem) {
    if (this.emojis == null) {
      this.emojis = new ArrayList<Emoji>();
    }
    this.emojis.add(emojisItem);
    return this;
  }

  /**
   * Custom emoji to be used when rendering status content.
   * @return emojis
  **/
  @Schema(description = "Custom emoji to be used when rendering status content.")
  @Valid
  public List<Emoji> getEmojis() {
    return emojis;
  }

  public void setEmojis(List<Emoji> emojis) {
    this.emojis = emojis;
  }

  public StatusReblogged favourited(Boolean favourited) {
    this.favourited = favourited;
    return this;
  }

  /**
   * This status has been favourited by the account viewing it.
   * @return favourited
  **/
  @Schema(description = "This status has been favourited by the account viewing it.")

  public Boolean isFavourited() {
    return favourited;
  }

  public void setFavourited(Boolean favourited) {
    this.favourited = favourited;
  }

  public StatusReblogged favouritesCount(Long favouritesCount) {
    this.favouritesCount = favouritesCount;
    return this;
  }

  /**
   * Number of favourites/likes this status has received, according to our instance.
   * @return favouritesCount
  **/
  @Schema(description = "Number of favourites/likes this status has received, according to our instance.")

  public Long getFavouritesCount() {
    return favouritesCount;
  }

  public void setFavouritesCount(Long favouritesCount) {
    this.favouritesCount = favouritesCount;
  }

  public StatusReblogged id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the status.
   * @return id
  **/
  @Schema(example = "01FBVD42CQ3ZEEVMW180SBX03B", description = "ID of the status.")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public StatusReblogged inReplyToAccountId(String inReplyToAccountId) {
    this.inReplyToAccountId = inReplyToAccountId;
    return this;
  }

  /**
   * ID of the account being replied to.
   * @return inReplyToAccountId
  **/
  @Schema(example = "01FBVD42CQ3ZEEVMW180SBX03B", description = "ID of the account being replied to.")

  public String getInReplyToAccountId() {
    return inReplyToAccountId;
  }

  public void setInReplyToAccountId(String inReplyToAccountId) {
    this.inReplyToAccountId = inReplyToAccountId;
  }

  public StatusReblogged inReplyToId(String inReplyToId) {
    this.inReplyToId = inReplyToId;
    return this;
  }

  /**
   * ID of the status being replied to.
   * @return inReplyToId
  **/
  @Schema(example = "01FBVD42CQ3ZEEVMW180SBX03B", description = "ID of the status being replied to.")

  public String getInReplyToId() {
    return inReplyToId;
  }

  public void setInReplyToId(String inReplyToId) {
    this.inReplyToId = inReplyToId;
  }

  public StatusReblogged language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Primary language of this status (ISO 639 Part 1 two-letter language code).
   * @return language
  **/
  @Schema(example = "en", description = "Primary language of this status (ISO 639 Part 1 two-letter language code).")

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public StatusReblogged mediaAttachments(List<Attachment> mediaAttachments) {
    this.mediaAttachments = mediaAttachments;
    return this;
  }

  public StatusReblogged addMediaAttachmentsItem(Attachment mediaAttachmentsItem) {
    if (this.mediaAttachments == null) {
      this.mediaAttachments = new ArrayList<Attachment>();
    }
    this.mediaAttachments.add(mediaAttachmentsItem);
    return this;
  }

  /**
   * Media that is attached to this status.
   * @return mediaAttachments
  **/
  @Schema(description = "Media that is attached to this status.")
  @Valid
  public List<Attachment> getMediaAttachments() {
    return mediaAttachments;
  }

  public void setMediaAttachments(List<Attachment> mediaAttachments) {
    this.mediaAttachments = mediaAttachments;
  }

  public StatusReblogged mentions(List<Mention> mentions) {
    this.mentions = mentions;
    return this;
  }

  public StatusReblogged addMentionsItem(Mention mentionsItem) {
    if (this.mentions == null) {
      this.mentions = new ArrayList<Mention>();
    }
    this.mentions.add(mentionsItem);
    return this;
  }

  /**
   * Mentions of users within the status content.
   * @return mentions
  **/
  @Schema(description = "Mentions of users within the status content.")
  @Valid
  public List<Mention> getMentions() {
    return mentions;
  }

  public void setMentions(List<Mention> mentions) {
    this.mentions = mentions;
  }

  public StatusReblogged muted(Boolean muted) {
    this.muted = muted;
    return this;
  }

  /**
   * Replies to this status have been muted by the account viewing it.
   * @return muted
  **/
  @Schema(description = "Replies to this status have been muted by the account viewing it.")

  public Boolean isMuted() {
    return muted;
  }

  public void setMuted(Boolean muted) {
    this.muted = muted;
  }

  public StatusReblogged pinned(Boolean pinned) {
    this.pinned = pinned;
    return this;
  }

  /**
   * This status has been pinned by the account viewing it (only relevant for your own statuses).
   * @return pinned
  **/
  @Schema(description = "This status has been pinned by the account viewing it (only relevant for your own statuses).")

  public Boolean isPinned() {
    return pinned;
  }

  public void setPinned(Boolean pinned) {
    this.pinned = pinned;
  }

  public StatusReblogged poll(Poll poll) {
    this.poll = poll;
    return this;
  }

  /**
   * Get poll
   * @return poll
  **/
  @Schema(description = "")

  @Valid
  public Poll getPoll() {
    return poll;
  }

  public void setPoll(Poll poll) {
    this.poll = poll;
  }

  public StatusReblogged reblog(StatusReblogged reblog) {
    this.reblog = reblog;
    return this;
  }

  /**
   * Get reblog
   * @return reblog
  **/
  @Schema(description = "")

  @Valid
  public StatusReblogged getReblog() {
    return reblog;
  }

  public void setReblog(StatusReblogged reblog) {
    this.reblog = reblog;
  }

  public StatusReblogged reblogged(Boolean reblogged) {
    this.reblogged = reblogged;
    return this;
  }

  /**
   * This status has been boosted/reblogged by the account viewing it.
   * @return reblogged
  **/
  @Schema(description = "This status has been boosted/reblogged by the account viewing it.")

  public Boolean isReblogged() {
    return reblogged;
  }

  public void setReblogged(Boolean reblogged) {
    this.reblogged = reblogged;
  }

  public StatusReblogged reblogsCount(Long reblogsCount) {
    this.reblogsCount = reblogsCount;
    return this;
  }

  /**
   * Number of times this status has been boosted/reblogged, according to our instance.
   * @return reblogsCount
  **/
  @Schema(description = "Number of times this status has been boosted/reblogged, according to our instance.")

  public Long getReblogsCount() {
    return reblogsCount;
  }

  public void setReblogsCount(Long reblogsCount) {
    this.reblogsCount = reblogsCount;
  }

  public StatusReblogged repliesCount(Long repliesCount) {
    this.repliesCount = repliesCount;
    return this;
  }

  /**
   * Number of replies to this status, according to our instance.
   * @return repliesCount
  **/
  @Schema(description = "Number of replies to this status, according to our instance.")

  public Long getRepliesCount() {
    return repliesCount;
  }

  public void setRepliesCount(Long repliesCount) {
    this.repliesCount = repliesCount;
  }

  public StatusReblogged sensitive(Boolean sensitive) {
    this.sensitive = sensitive;
    return this;
  }

  /**
   * Status contains sensitive content.
   * @return sensitive
  **/
  @Schema(example = "false", description = "Status contains sensitive content.")

  public Boolean isSensitive() {
    return sensitive;
  }

  public void setSensitive(Boolean sensitive) {
    this.sensitive = sensitive;
  }

  public StatusReblogged spoilerText(String spoilerText) {
    this.spoilerText = spoilerText;
    return this;
  }

  /**
   * Subject, summary, or content warning for the status.
   * @return spoilerText
  **/
  @Schema(example = "warning nsfw", description = "Subject, summary, or content warning for the status.")

  public String getSpoilerText() {
    return spoilerText;
  }

  public void setSpoilerText(String spoilerText) {
    this.spoilerText = spoilerText;
  }

  public StatusReblogged tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public StatusReblogged addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Hashtags used within the status content.
   * @return tags
  **/
  @Schema(description = "Hashtags used within the status content.")
  @Valid
  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  public StatusReblogged text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Plain-text source of a status. Returned instead of content when status is deleted, so the user may redraft from the source text without the client having to reverse-engineer the original text from the HTML content.
   * @return text
  **/
  @Schema(description = "Plain-text source of a status. Returned instead of content when status is deleted, so the user may redraft from the source text without the client having to reverse-engineer the original text from the HTML content.")

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public StatusReblogged uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * ActivityPub URI of the status. Equivalent to the status's activitypub ID.
   * @return uri
  **/
  @Schema(example = "https://example.org/users/some_user/statuses/01FBVD42CQ3ZEEVMW180SBX03B", description = "ActivityPub URI of the status. Equivalent to the status's activitypub ID.")

  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public StatusReblogged url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The status's publicly available web URL. This link will only work if the visibility of the status is 'public'.
   * @return url
  **/
  @Schema(example = "https://example.org/@some_user/statuses/01FBVD42CQ3ZEEVMW180SBX03B", description = "The status's publicly available web URL. This link will only work if the visibility of the status is 'public'.")

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public StatusReblogged visibility(String visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * Visibility of this status.
   * @return visibility
  **/
  @Schema(example = "unlisted", description = "Visibility of this status.")

  public String getVisibility() {
    return visibility;
  }

  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusReblogged statusReblogged = (StatusReblogged) o;
    return Objects.equals(this.account, statusReblogged.account) &&
        Objects.equals(this.application, statusReblogged.application) &&
        Objects.equals(this.bookmarked, statusReblogged.bookmarked) &&
        Objects.equals(this.card, statusReblogged.card) &&
        Objects.equals(this.content, statusReblogged.content) &&
        Objects.equals(this.createdAt, statusReblogged.createdAt) &&
        Objects.equals(this.emojis, statusReblogged.emojis) &&
        Objects.equals(this.favourited, statusReblogged.favourited) &&
        Objects.equals(this.favouritesCount, statusReblogged.favouritesCount) &&
        Objects.equals(this.id, statusReblogged.id) &&
        Objects.equals(this.inReplyToAccountId, statusReblogged.inReplyToAccountId) &&
        Objects.equals(this.inReplyToId, statusReblogged.inReplyToId) &&
        Objects.equals(this.language, statusReblogged.language) &&
        Objects.equals(this.mediaAttachments, statusReblogged.mediaAttachments) &&
        Objects.equals(this.mentions, statusReblogged.mentions) &&
        Objects.equals(this.muted, statusReblogged.muted) &&
        Objects.equals(this.pinned, statusReblogged.pinned) &&
        Objects.equals(this.poll, statusReblogged.poll) &&
        Objects.equals(this.reblog, statusReblogged.reblog) &&
        Objects.equals(this.reblogged, statusReblogged.reblogged) &&
        Objects.equals(this.reblogsCount, statusReblogged.reblogsCount) &&
        Objects.equals(this.repliesCount, statusReblogged.repliesCount) &&
        Objects.equals(this.sensitive, statusReblogged.sensitive) &&
        Objects.equals(this.spoilerText, statusReblogged.spoilerText) &&
        Objects.equals(this.tags, statusReblogged.tags) &&
        Objects.equals(this.text, statusReblogged.text) &&
        Objects.equals(this.uri, statusReblogged.uri) &&
        Objects.equals(this.url, statusReblogged.url) &&
        Objects.equals(this.visibility, statusReblogged.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, application, bookmarked, card, content, createdAt, emojis, favourited, favouritesCount, id, inReplyToAccountId, inReplyToId, language, mediaAttachments, mentions, muted, pinned, poll, reblog, reblogged, reblogsCount, repliesCount, sensitive, spoilerText, tags, text, uri, url, visibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusReblogged {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    bookmarked: ").append(toIndentedString(bookmarked)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    emojis: ").append(toIndentedString(emojis)).append("\n");
    sb.append("    favourited: ").append(toIndentedString(favourited)).append("\n");
    sb.append("    favouritesCount: ").append(toIndentedString(favouritesCount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inReplyToAccountId: ").append(toIndentedString(inReplyToAccountId)).append("\n");
    sb.append("    inReplyToId: ").append(toIndentedString(inReplyToId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    mediaAttachments: ").append(toIndentedString(mediaAttachments)).append("\n");
    sb.append("    mentions: ").append(toIndentedString(mentions)).append("\n");
    sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
    sb.append("    pinned: ").append(toIndentedString(pinned)).append("\n");
    sb.append("    poll: ").append(toIndentedString(poll)).append("\n");
    sb.append("    reblog: ").append(toIndentedString(reblog)).append("\n");
    sb.append("    reblogged: ").append(toIndentedString(reblogged)).append("\n");
    sb.append("    reblogsCount: ").append(toIndentedString(reblogsCount)).append("\n");
    sb.append("    repliesCount: ").append(toIndentedString(repliesCount)).append("\n");
    sb.append("    sensitive: ").append(toIndentedString(sensitive)).append("\n");
    sb.append("    spoilerText: ").append(toIndentedString(spoilerText)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
