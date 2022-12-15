package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.File;
import io.micronaut.validation.Validated;
import javax.validation.Valid;

/**
 * AccountsUpdateCredentialsBody
 */
@Validated

public class AccountsUpdateCredentialsBody   {
  @JsonProperty("discoverable")
  private Boolean discoverable = null;

  @JsonProperty("bot")
  private Boolean bot = null;

  @JsonProperty("display_name")
  private String displayName = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("avatar")
  private File avatar = null;

  @JsonProperty("header")
  private File header = null;

  @JsonProperty("locked")
  private Boolean locked = null;

  @JsonProperty("source[privacy]")
  private String sourcePrivacy = null;

  @JsonProperty("source[sensitive]")
  private Boolean sourceSensitive = null;

  @JsonProperty("source[language]")
  private String sourceLanguage = null;

  @JsonProperty("source[status_format]")
  private String sourceStatusFormat = null;

  @JsonProperty("custom_css")
  private String customCss = null;

  @JsonProperty("enable_rss")
  private Boolean enableRss = null;

  public AccountsUpdateCredentialsBody discoverable(Boolean discoverable) {
    this.discoverable = discoverable;
    return this;
  }

  /**
   * Account should be made discoverable and shown in the profile directory (if enabled).
   * @return discoverable
  **/
  @Schema(description = "Account should be made discoverable and shown in the profile directory (if enabled).")

  public Boolean isDiscoverable() {
    return discoverable;
  }

  public void setDiscoverable(Boolean discoverable) {
    this.discoverable = discoverable;
  }

  public AccountsUpdateCredentialsBody bot(Boolean bot) {
    this.bot = bot;
    return this;
  }

  /**
   * Account is flagged as a bot.
   * @return bot
  **/
  @Schema(description = "Account is flagged as a bot.")

  public Boolean isBot() {
    return bot;
  }

  public void setBot(Boolean bot) {
    this.bot = bot;
  }

  public AccountsUpdateCredentialsBody displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name to use for the account.
   * @return displayName
  **/
  @Schema(description = "The display name to use for the account.")

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public AccountsUpdateCredentialsBody note(String note) {
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

  public AccountsUpdateCredentialsBody avatar(File avatar) {
    this.avatar = avatar;
    return this;
  }

  /**
   * Avatar of the user.
   * @return avatar
  **/
  @Schema(description = "Avatar of the user.")

  @Valid
  public File getAvatar() {
    return avatar;
  }

  public void setAvatar(File avatar) {
    this.avatar = avatar;
  }

  public AccountsUpdateCredentialsBody header(File header) {
    this.header = header;
    return this;
  }

  /**
   * Header of the user.
   * @return header
  **/
  @Schema(description = "Header of the user.")

  @Valid
  public File getHeader() {
    return header;
  }

  public void setHeader(File header) {
    this.header = header;
  }

  public AccountsUpdateCredentialsBody locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

  /**
   * Require manual approval of follow requests.
   * @return locked
  **/
  @Schema(description = "Require manual approval of follow requests.")

  public Boolean isLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public AccountsUpdateCredentialsBody sourcePrivacy(String sourcePrivacy) {
    this.sourcePrivacy = sourcePrivacy;
    return this;
  }

  /**
   * Default post privacy for authored statuses.
   * @return sourcePrivacy
  **/
  @Schema(description = "Default post privacy for authored statuses.")

  public String getSourcePrivacy() {
    return sourcePrivacy;
  }

  public void setSourcePrivacy(String sourcePrivacy) {
    this.sourcePrivacy = sourcePrivacy;
  }

  public AccountsUpdateCredentialsBody sourceSensitive(Boolean sourceSensitive) {
    this.sourceSensitive = sourceSensitive;
    return this;
  }

  /**
   * Mark authored statuses as sensitive by default.
   * @return sourceSensitive
  **/
  @Schema(description = "Mark authored statuses as sensitive by default.")

  public Boolean isSourceSensitive() {
    return sourceSensitive;
  }

  public void setSourceSensitive(Boolean sourceSensitive) {
    this.sourceSensitive = sourceSensitive;
  }

  public AccountsUpdateCredentialsBody sourceLanguage(String sourceLanguage) {
    this.sourceLanguage = sourceLanguage;
    return this;
  }

  /**
   * Default language to use for authored statuses (ISO 6391).
   * @return sourceLanguage
  **/
  @Schema(description = "Default language to use for authored statuses (ISO 6391).")

  public String getSourceLanguage() {
    return sourceLanguage;
  }

  public void setSourceLanguage(String sourceLanguage) {
    this.sourceLanguage = sourceLanguage;
  }

  public AccountsUpdateCredentialsBody sourceStatusFormat(String sourceStatusFormat) {
    this.sourceStatusFormat = sourceStatusFormat;
    return this;
  }

  /**
   * Default format to use for authored statuses (plain or markdown).
   * @return sourceStatusFormat
  **/
  @Schema(description = "Default format to use for authored statuses (plain or markdown).")

  public String getSourceStatusFormat() {
    return sourceStatusFormat;
  }

  public void setSourceStatusFormat(String sourceStatusFormat) {
    this.sourceStatusFormat = sourceStatusFormat;
  }

  public AccountsUpdateCredentialsBody customCss(String customCss) {
    this.customCss = customCss;
    return this;
  }

  /**
   * Custom CSS to use when rendering this account's profile or statuses. String must be no more than 5,000 characters (~5kb).
   * @return customCss
  **/
  @Schema(description = "Custom CSS to use when rendering this account's profile or statuses. String must be no more than 5,000 characters (~5kb).")

  public String getCustomCss() {
    return customCss;
  }

  public void setCustomCss(String customCss) {
    this.customCss = customCss;
  }

  public AccountsUpdateCredentialsBody enableRss(Boolean enableRss) {
    this.enableRss = enableRss;
    return this;
  }

  /**
   * Enable RSS feed for this account's Public posts at `/[username]/feed.rss`
   * @return enableRss
  **/
  @Schema(description = "Enable RSS feed for this account's Public posts at `/[username]/feed.rss`")

  public Boolean isEnableRss() {
    return enableRss;
  }

  public void setEnableRss(Boolean enableRss) {
    this.enableRss = enableRss;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountsUpdateCredentialsBody accountsUpdateCredentialsBody = (AccountsUpdateCredentialsBody) o;
    return Objects.equals(this.discoverable, accountsUpdateCredentialsBody.discoverable) &&
        Objects.equals(this.bot, accountsUpdateCredentialsBody.bot) &&
        Objects.equals(this.displayName, accountsUpdateCredentialsBody.displayName) &&
        Objects.equals(this.note, accountsUpdateCredentialsBody.note) &&
        Objects.equals(this.avatar, accountsUpdateCredentialsBody.avatar) &&
        Objects.equals(this.header, accountsUpdateCredentialsBody.header) &&
        Objects.equals(this.locked, accountsUpdateCredentialsBody.locked) &&
        Objects.equals(this.sourcePrivacy, accountsUpdateCredentialsBody.sourcePrivacy) &&
        Objects.equals(this.sourceSensitive, accountsUpdateCredentialsBody.sourceSensitive) &&
        Objects.equals(this.sourceLanguage, accountsUpdateCredentialsBody.sourceLanguage) &&
        Objects.equals(this.sourceStatusFormat, accountsUpdateCredentialsBody.sourceStatusFormat) &&
        Objects.equals(this.customCss, accountsUpdateCredentialsBody.customCss) &&
        Objects.equals(this.enableRss, accountsUpdateCredentialsBody.enableRss);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discoverable, bot, displayName, note, avatar, header, locked, sourcePrivacy, sourceSensitive, sourceLanguage, sourceStatusFormat, customCss, enableRss);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountsUpdateCredentialsBody {\n");
    
    sb.append("    discoverable: ").append(toIndentedString(discoverable)).append("\n");
    sb.append("    bot: ").append(toIndentedString(bot)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    sourcePrivacy: ").append(toIndentedString(sourcePrivacy)).append("\n");
    sb.append("    sourceSensitive: ").append(toIndentedString(sourceSensitive)).append("\n");
    sb.append("    sourceLanguage: ").append(toIndentedString(sourceLanguage)).append("\n");
    sb.append("    sourceStatusFormat: ").append(toIndentedString(sourceStatusFormat)).append("\n");
    sb.append("    customCss: ").append(toIndentedString(customCss)).append("\n");
    sb.append("    enableRss: ").append(toIndentedString(enableRss)).append("\n");
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
