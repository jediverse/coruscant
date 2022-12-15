package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import io.micronaut.validation.Validated;
import javax.validation.Valid;

/**
 * Announcement
 */
@Validated

public class Announcement   {
  @JsonProperty("all_day")
  private Boolean allDay = null;

  @JsonProperty("content")
  private String content = null;

  @JsonProperty("emoji")
  @Valid
  private List<Emoji> emoji = null;

  @JsonProperty("ends_at")
  private String endsAt = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("mentions")
  @Valid
  private List<Mention> mentions = null;

  @JsonProperty("published")
  private Boolean published = null;

  @JsonProperty("published_at")
  private String publishedAt = null;

  @JsonProperty("reactions")
  @Valid
  private List<AnnouncementReaction> reactions = null;

  @JsonProperty("read")
  private Boolean read = null;

  @JsonProperty("starts_at")
  private String startsAt = null;

  @JsonProperty("statuses")
  @Valid
  private List<Status> statuses = null;

  @JsonProperty("tags")
  @Valid
  private List<Tag> tags = null;

  @JsonProperty("updated_at")
  private String updatedAt = null;

  public Announcement allDay(Boolean allDay) {
    this.allDay = allDay;
    return this;
  }

  /**
   * Announcement doesn't have begin time and end time, but begin day and end day.
   * @return allDay
  **/
  @Schema(description = "Announcement doesn't have begin time and end time, but begin day and end day.")

  public Boolean isAllDay() {
    return allDay;
  }

  public void setAllDay(Boolean allDay) {
    this.allDay = allDay;
  }

  public Announcement content(String content) {
    this.content = content;
    return this;
  }

  /**
   * The body of the announcement. Should be HTML formatted.
   * @return content
  **/
  @Schema(example = "<p>This is an announcement. No malarky.</p>", description = "The body of the announcement. Should be HTML formatted.")

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Announcement emoji(List<Emoji> emoji) {
    this.emoji = emoji;
    return this;
  }

  public Announcement addEmojiItem(Emoji emojiItem) {
    if (this.emoji == null) {
      this.emoji = new ArrayList<Emoji>();
    }
    this.emoji.add(emojiItem);
    return this;
  }

  /**
   * Emojis used in this announcement.
   * @return emoji
  **/
  @Schema(description = "Emojis used in this announcement.")
  @Valid
  public List<Emoji> getEmoji() {
    return emoji;
  }

  public void setEmoji(List<Emoji> emoji) {
    this.emoji = emoji;
  }

  public Announcement endsAt(String endsAt) {
    this.endsAt = endsAt;
    return this;
  }

  /**
   * When the announcement should stop being displayed (ISO 8601 Datetime). If the announcement has no end time, this will be omitted or empty.
   * @return endsAt
  **/
  @Schema(example = "2021-07-30T09:20:25+00:00", description = "When the announcement should stop being displayed (ISO 8601 Datetime). If the announcement has no end time, this will be omitted or empty.")

  public String getEndsAt() {
    return endsAt;
  }

  public void setEndsAt(String endsAt) {
    this.endsAt = endsAt;
  }

  public Announcement id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the announcement.
   * @return id
  **/
  @Schema(example = "01FC30T7X4TNCZK0TH90QYF3M4", description = "The ID of the announcement.")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Announcement mentions(List<Mention> mentions) {
    this.mentions = mentions;
    return this;
  }

  public Announcement addMentionsItem(Mention mentionsItem) {
    if (this.mentions == null) {
      this.mentions = new ArrayList<Mention>();
    }
    this.mentions.add(mentionsItem);
    return this;
  }

  /**
   * Mentions this announcement contains.
   * @return mentions
  **/
  @Schema(description = "Mentions this announcement contains.")
  @Valid
  public List<Mention> getMentions() {
    return mentions;
  }

  public void setMentions(List<Mention> mentions) {
    this.mentions = mentions;
  }

  public Announcement published(Boolean published) {
    this.published = published;
    return this;
  }

  /**
   * Announcement is 'published', ie., visible to users. Announcements that are not published should be shown only to admins.
   * @return published
  **/
  @Schema(description = "Announcement is 'published', ie., visible to users. Announcements that are not published should be shown only to admins.")

  public Boolean isPublished() {
    return published;
  }

  public void setPublished(Boolean published) {
    this.published = published;
  }

  public Announcement publishedAt(String publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

  /**
   * When the announcement was first published (ISO 8601 Datetime).
   * @return publishedAt
  **/
  @Schema(example = "2021-07-30T09:20:25+00:00", description = "When the announcement was first published (ISO 8601 Datetime).")

  public String getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(String publishedAt) {
    this.publishedAt = publishedAt;
  }

  public Announcement reactions(List<AnnouncementReaction> reactions) {
    this.reactions = reactions;
    return this;
  }

  public Announcement addReactionsItem(AnnouncementReaction reactionsItem) {
    if (this.reactions == null) {
      this.reactions = new ArrayList<AnnouncementReaction>();
    }
    this.reactions.add(reactionsItem);
    return this;
  }

  /**
   * Reactions to this announcement.
   * @return reactions
  **/
  @Schema(description = "Reactions to this announcement.")
  @Valid
  public List<AnnouncementReaction> getReactions() {
    return reactions;
  }

  public void setReactions(List<AnnouncementReaction> reactions) {
    this.reactions = reactions;
  }

  public Announcement read(Boolean read) {
    this.read = read;
    return this;
  }

  /**
   * Requesting account has seen this announcement.
   * @return read
  **/
  @Schema(description = "Requesting account has seen this announcement.")

  public Boolean isRead() {
    return read;
  }

  public void setRead(Boolean read) {
    this.read = read;
  }

  public Announcement startsAt(String startsAt) {
    this.startsAt = startsAt;
    return this;
  }

  /**
   * When the announcement should begin to be displayed (ISO 8601 Datetime). If the announcement has no start time, this will be omitted or empty.
   * @return startsAt
  **/
  @Schema(example = "2021-07-30T09:20:25+00:00", description = "When the announcement should begin to be displayed (ISO 8601 Datetime). If the announcement has no start time, this will be omitted or empty.")

  public String getStartsAt() {
    return startsAt;
  }

  public void setStartsAt(String startsAt) {
    this.startsAt = startsAt;
  }

  public Announcement statuses(List<Status> statuses) {
    this.statuses = statuses;
    return this;
  }

  public Announcement addStatusesItem(Status statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<Status>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

  /**
   * Statuses contained in this announcement.
   * @return statuses
  **/
  @Schema(description = "Statuses contained in this announcement.")
  @Valid
  public List<Status> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<Status> statuses) {
    this.statuses = statuses;
  }

  public Announcement tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public Announcement addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags used in this announcement.
   * @return tags
  **/
  @Schema(description = "Tags used in this announcement.")
  @Valid
  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  public Announcement updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * When the announcement was last updated (ISO 8601 Datetime).
   * @return updatedAt
  **/
  @Schema(example = "2021-07-30T09:20:25+00:00", description = "When the announcement was last updated (ISO 8601 Datetime).")

  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Announcement announcement = (Announcement) o;
    return Objects.equals(this.allDay, announcement.allDay) &&
        Objects.equals(this.content, announcement.content) &&
        Objects.equals(this.emoji, announcement.emoji) &&
        Objects.equals(this.endsAt, announcement.endsAt) &&
        Objects.equals(this.id, announcement.id) &&
        Objects.equals(this.mentions, announcement.mentions) &&
        Objects.equals(this.published, announcement.published) &&
        Objects.equals(this.publishedAt, announcement.publishedAt) &&
        Objects.equals(this.reactions, announcement.reactions) &&
        Objects.equals(this.read, announcement.read) &&
        Objects.equals(this.startsAt, announcement.startsAt) &&
        Objects.equals(this.statuses, announcement.statuses) &&
        Objects.equals(this.tags, announcement.tags) &&
        Objects.equals(this.updatedAt, announcement.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allDay, content, emoji, endsAt, id, mentions, published, publishedAt, reactions, read, startsAt, statuses, tags, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Announcement {\n");
    
    sb.append("    allDay: ").append(toIndentedString(allDay)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    emoji: ").append(toIndentedString(emoji)).append("\n");
    sb.append("    endsAt: ").append(toIndentedString(endsAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mentions: ").append(toIndentedString(mentions)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    startsAt: ").append(toIndentedString(startsAt)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
