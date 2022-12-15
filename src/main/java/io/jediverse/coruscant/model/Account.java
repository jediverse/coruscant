package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import io.micronaut.validation.Validated;
import javax.validation.Valid;

/**
 * The modelled account can be either a remote account, or one on this instance.
 */
@Schema(description = "The modelled account can be either a remote account, or one on this instance.")
@Validated

public class Account   {
  @JsonProperty("acct")
  private String acct = null;

  @JsonProperty("avatar")
  private String avatar = null;

  @JsonProperty("avatar_static")
  private String avatarStatic = null;

  @JsonProperty("bot")
  private Boolean bot = null;

  @JsonProperty("created_at")
  private String createdAt = null;

  @JsonProperty("custom_css")
  private String customCss = null;

  @JsonProperty("discoverable")
  private Boolean discoverable = null;

  @JsonProperty("display_name")
  private String displayName = null;

  @JsonProperty("emojis")
  @Valid
  private List<Emoji> emojis = null;

  @JsonProperty("enable_rss")
  private Boolean enableRss = null;

  @JsonProperty("fields")
  @Valid
  private List<Field> fields = null;

  @JsonProperty("followers_count")
  private Long followersCount = null;

  @JsonProperty("following_count")
  private Long followingCount = null;

  @JsonProperty("header")
  private String header = null;

  @JsonProperty("header_static")
  private String headerStatic = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("last_status_at")
  private String lastStatusAt = null;

  @JsonProperty("locked")
  private Boolean locked = null;

  @JsonProperty("mute_expires_at")
  private String muteExpiresAt = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("role")
  private String role = null;

  @JsonProperty("source")
  private Source source = null;

  @JsonProperty("statuses_count")
  private Long statusesCount = null;

  @JsonProperty("suspended")
  private Boolean suspended = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("username")
  private String username = null;

  public Account acct(String acct) {
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

  public Account avatar(String avatar) {
    this.avatar = avatar;
    return this;
  }

  /**
   * Web location of the account's avatar.
   * @return avatar
  **/
  @Schema(example = "https://example.org/media/some_user/avatar/original/avatar.jpeg", description = "Web location of the account's avatar.")

  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public Account avatarStatic(String avatarStatic) {
    this.avatarStatic = avatarStatic;
    return this;
  }

  /**
   * Web location of a static version of the account's avatar. Only relevant when the account's main avatar is a video or a gif.
   * @return avatarStatic
  **/
  @Schema(example = "https://example.org/media/some_user/avatar/static/avatar.png", description = "Web location of a static version of the account's avatar. Only relevant when the account's main avatar is a video or a gif.")

  public String getAvatarStatic() {
    return avatarStatic;
  }

  public void setAvatarStatic(String avatarStatic) {
    this.avatarStatic = avatarStatic;
  }

  public Account bot(Boolean bot) {
    this.bot = bot;
    return this;
  }

  /**
   * Account identifies as a bot.
   * @return bot
  **/
  @Schema(description = "Account identifies as a bot.")

  public Boolean isBot() {
    return bot;
  }

  public void setBot(Boolean bot) {
    this.bot = bot;
  }

  public Account createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * When the account was created (ISO 8601 Datetime).
   * @return createdAt
  **/
  @Schema(example = "2021-07-30T09:20:25+00:00", description = "When the account was created (ISO 8601 Datetime).")

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Account customCss(String customCss) {
    this.customCss = customCss;
    return this;
  }

  /**
   * CustomCSS to include when rendering this account's profile or statuses.
   * @return customCss
  **/
  @Schema(description = "CustomCSS to include when rendering this account's profile or statuses.")

  public String getCustomCss() {
    return customCss;
  }

  public void setCustomCss(String customCss) {
    this.customCss = customCss;
  }

  public Account discoverable(Boolean discoverable) {
    this.discoverable = discoverable;
    return this;
  }

  /**
   * Account has opted into discovery features.
   * @return discoverable
  **/
  @Schema(description = "Account has opted into discovery features.")

  public Boolean isDiscoverable() {
    return discoverable;
  }

  public void setDiscoverable(Boolean discoverable) {
    this.discoverable = discoverable;
  }

  public Account displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The account's display name.
   * @return displayName
  **/
  @Schema(example = "big jeff (he/him)", description = "The account's display name.")

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Account emojis(List<Emoji> emojis) {
    this.emojis = emojis;
    return this;
  }

  public Account addEmojisItem(Emoji emojisItem) {
    if (this.emojis == null) {
      this.emojis = new ArrayList<Emoji>();
    }
    this.emojis.add(emojisItem);
    return this;
  }

  /**
   * Array of custom emojis used in this account's note or display name.
   * @return emojis
  **/
  @Schema(description = "Array of custom emojis used in this account's note or display name.")
  @Valid
  public List<Emoji> getEmojis() {
    return emojis;
  }

  public void setEmojis(List<Emoji> emojis) {
    this.emojis = emojis;
  }

  public Account enableRss(Boolean enableRss) {
    this.enableRss = enableRss;
    return this;
  }

  /**
   * Account has enabled RSS feed.
   * @return enableRss
  **/
  @Schema(description = "Account has enabled RSS feed.")

  public Boolean isEnableRss() {
    return enableRss;
  }

  public void setEnableRss(Boolean enableRss) {
    this.enableRss = enableRss;
  }

  public Account fields(List<Field> fields) {
    this.fields = fields;
    return this;
  }

  public Account addFieldsItem(Field fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<Field>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * Additional metadata attached to this account's profile.
   * @return fields
  **/
  @Schema(description = "Additional metadata attached to this account's profile.")
  @Valid
  public List<Field> getFields() {
    return fields;
  }

  public void setFields(List<Field> fields) {
    this.fields = fields;
  }

  public Account followersCount(Long followersCount) {
    this.followersCount = followersCount;
    return this;
  }

  /**
   * Number of accounts following this account, according to our instance.
   * @return followersCount
  **/
  @Schema(description = "Number of accounts following this account, according to our instance.")

  public Long getFollowersCount() {
    return followersCount;
  }

  public void setFollowersCount(Long followersCount) {
    this.followersCount = followersCount;
  }

  public Account followingCount(Long followingCount) {
    this.followingCount = followingCount;
    return this;
  }

  /**
   * Number of account's followed by this account, according to our instance.
   * @return followingCount
  **/
  @Schema(description = "Number of account's followed by this account, according to our instance.")

  public Long getFollowingCount() {
    return followingCount;
  }

  public void setFollowingCount(Long followingCount) {
    this.followingCount = followingCount;
  }

  public Account header(String header) {
    this.header = header;
    return this;
  }

  /**
   * Web location of the account's header image.
   * @return header
  **/
  @Schema(example = "https://example.org/media/some_user/header/original/header.jpeg", description = "Web location of the account's header image.")

  public String getHeader() {
    return header;
  }

  public void setHeader(String header) {
    this.header = header;
  }

  public Account headerStatic(String headerStatic) {
    this.headerStatic = headerStatic;
    return this;
  }

  /**
   * Web location of a static version of the account's header. Only relevant when the account's main header is a video or a gif.
   * @return headerStatic
  **/
  @Schema(example = "https://example.org/media/some_user/header/static/header.png", description = "Web location of a static version of the account's header. Only relevant when the account's main header is a video or a gif.")

  public String getHeaderStatic() {
    return headerStatic;
  }

  public void setHeaderStatic(String headerStatic) {
    this.headerStatic = headerStatic;
  }

  public Account id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The account id.
   * @return id
  **/
  @Schema(example = "01FBVD42CQ3ZEEVMW180SBX03B", description = "The account id.")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Account lastStatusAt(String lastStatusAt) {
    this.lastStatusAt = lastStatusAt;
    return this;
  }

  /**
   * When the account's most recent status was posted (ISO 8601 Datetime).
   * @return lastStatusAt
  **/
  @Schema(example = "2021-07-30T09:20:25+00:00", description = "When the account's most recent status was posted (ISO 8601 Datetime).")

  public String getLastStatusAt() {
    return lastStatusAt;
  }

  public void setLastStatusAt(String lastStatusAt) {
    this.lastStatusAt = lastStatusAt;
  }

  public Account locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

  /**
   * Account manually approves follow requests.
   * @return locked
  **/
  @Schema(description = "Account manually approves follow requests.")

  public Boolean isLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public Account muteExpiresAt(String muteExpiresAt) {
    this.muteExpiresAt = muteExpiresAt;
    return this;
  }

  /**
   * If this account has been muted, when will the mute expire (ISO 8601 Datetime).
   * @return muteExpiresAt
  **/
  @Schema(example = "2021-07-30T09:20:25+00:00", description = "If this account has been muted, when will the mute expire (ISO 8601 Datetime).")

  public String getMuteExpiresAt() {
    return muteExpiresAt;
  }

  public void setMuteExpiresAt(String muteExpiresAt) {
    this.muteExpiresAt = muteExpiresAt;
  }

  public Account note(String note) {
    this.note = note;
    return this;
  }

  /**
   * Bio/description of this account.
   * @return note
  **/
  @Schema(description = "Bio/description of this account.")

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Account role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Role of the account on this instance. Omitted for remote accounts.
   * @return role
  **/
  @Schema(example = "user", description = "Role of the account on this instance. Omitted for remote accounts.")

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public Account source(Source source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  **/
  @Schema(description = "")

  @Valid
  public Source getSource() {
    return source;
  }

  public void setSource(Source source) {
    this.source = source;
  }

  public Account statusesCount(Long statusesCount) {
    this.statusesCount = statusesCount;
    return this;
  }

  /**
   * Number of statuses posted by this account, according to our instance.
   * @return statusesCount
  **/
  @Schema(description = "Number of statuses posted by this account, according to our instance.")

  public Long getStatusesCount() {
    return statusesCount;
  }

  public void setStatusesCount(Long statusesCount) {
    this.statusesCount = statusesCount;
  }

  public Account suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

  /**
   * Account has been suspended by our instance.
   * @return suspended
  **/
  @Schema(description = "Account has been suspended by our instance.")

  public Boolean isSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  public Account url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Web location of the account's profile page.
   * @return url
  **/
  @Schema(example = "https://example.org/@some_user", description = "Web location of the account's profile page.")

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Account username(String username) {
    this.username = username;
    return this;
  }

  /**
   * The username of the account, not including domain.
   * @return username
  **/
  @Schema(example = "some_user", description = "The username of the account, not including domain.")

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
    Account account = (Account) o;
    return Objects.equals(this.acct, account.acct) &&
        Objects.equals(this.avatar, account.avatar) &&
        Objects.equals(this.avatarStatic, account.avatarStatic) &&
        Objects.equals(this.bot, account.bot) &&
        Objects.equals(this.createdAt, account.createdAt) &&
        Objects.equals(this.customCss, account.customCss) &&
        Objects.equals(this.discoverable, account.discoverable) &&
        Objects.equals(this.displayName, account.displayName) &&
        Objects.equals(this.emojis, account.emojis) &&
        Objects.equals(this.enableRss, account.enableRss) &&
        Objects.equals(this.fields, account.fields) &&
        Objects.equals(this.followersCount, account.followersCount) &&
        Objects.equals(this.followingCount, account.followingCount) &&
        Objects.equals(this.header, account.header) &&
        Objects.equals(this.headerStatic, account.headerStatic) &&
        Objects.equals(this.id, account.id) &&
        Objects.equals(this.lastStatusAt, account.lastStatusAt) &&
        Objects.equals(this.locked, account.locked) &&
        Objects.equals(this.muteExpiresAt, account.muteExpiresAt) &&
        Objects.equals(this.note, account.note) &&
        Objects.equals(this.role, account.role) &&
        Objects.equals(this.source, account.source) &&
        Objects.equals(this.statusesCount, account.statusesCount) &&
        Objects.equals(this.suspended, account.suspended) &&
        Objects.equals(this.url, account.url) &&
        Objects.equals(this.username, account.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acct, avatar, avatarStatic, bot, createdAt, customCss, discoverable, displayName, emojis, enableRss, fields, followersCount, followingCount, header, headerStatic, id, lastStatusAt, locked, muteExpiresAt, note, role, source, statusesCount, suspended, url, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    acct: ").append(toIndentedString(acct)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    avatarStatic: ").append(toIndentedString(avatarStatic)).append("\n");
    sb.append("    bot: ").append(toIndentedString(bot)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    customCss: ").append(toIndentedString(customCss)).append("\n");
    sb.append("    discoverable: ").append(toIndentedString(discoverable)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    emojis: ").append(toIndentedString(emojis)).append("\n");
    sb.append("    enableRss: ").append(toIndentedString(enableRss)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    followersCount: ").append(toIndentedString(followersCount)).append("\n");
    sb.append("    followingCount: ").append(toIndentedString(followingCount)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    headerStatic: ").append(toIndentedString(headerStatic)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastStatusAt: ").append(toIndentedString(lastStatusAt)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    muteExpiresAt: ").append(toIndentedString(muteExpiresAt)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    statusesCount: ").append(toIndentedString(statusesCount)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
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
