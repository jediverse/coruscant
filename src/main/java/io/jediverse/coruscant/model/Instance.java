package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.micronaut.validation.Validated;
import javax.validation.Valid;

/**
 * Instance
 */
@Validated

public class Instance   {
  @JsonProperty("account_domain")
  private String accountDomain = null;

  @JsonProperty("approval_required")
  private Boolean approvalRequired = null;

  @JsonProperty("configuration")
  private InstanceConfiguration _configuration = null;

  @JsonProperty("contact_account")
  private Account contactAccount = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("invites_enabled")
  private Boolean invitesEnabled = null;

  @JsonProperty("languages")
  @Valid
  private List<String> languages = null;

  @JsonProperty("max_toot_chars")
  private Integer maxTootChars = null;

  @JsonProperty("registrations")
  private Boolean registrations = null;

  @JsonProperty("short_description")
  private String shortDescription = null;

  @JsonProperty("stats")
  @Valid
  private Map<String, Long> stats = null;

  @JsonProperty("thumbnail")
  private String thumbnail = null;

  @JsonProperty("thumbnail_description")
  private String thumbnailDescription = null;

  @JsonProperty("thumbnail_type")
  private String thumbnailType = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("uri")
  private String uri = null;

  @JsonProperty("urls")
  private InstanceURLs urls = null;

  @JsonProperty("version")
  private String version = null;

  public Instance accountDomain(String accountDomain) {
    this.accountDomain = accountDomain;
    return this;
  }

  /**
   * The domain of accounts on this instance. This will not necessarily be the same as simply the Host part of the URI.
   * @return accountDomain
  **/
  @Schema(example = "example.org", description = "The domain of accounts on this instance. This will not necessarily be the same as simply the Host part of the URI.")

  public String getAccountDomain() {
    return accountDomain;
  }

  public void setAccountDomain(String accountDomain) {
    this.accountDomain = accountDomain;
  }

  public Instance approvalRequired(Boolean approvalRequired) {
    this.approvalRequired = approvalRequired;
    return this;
  }

  /**
   * New account registrations require admin approval.
   * @return approvalRequired
  **/
  @Schema(description = "New account registrations require admin approval.")

  public Boolean isApprovalRequired() {
    return approvalRequired;
  }

  public void setApprovalRequired(Boolean approvalRequired) {
    this.approvalRequired = approvalRequired;
  }

  public Instance _configuration(InstanceConfiguration _configuration) {
    this._configuration = _configuration;
    return this;
  }

  /**
   * Get _configuration
   * @return _configuration
  **/
  @Schema(description = "")

  @Valid
  public InstanceConfiguration getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(InstanceConfiguration _configuration) {
    this._configuration = _configuration;
  }

  public Instance contactAccount(Account contactAccount) {
    this.contactAccount = contactAccount;
    return this;
  }

  /**
   * Get contactAccount
   * @return contactAccount
  **/
  @Schema(description = "")

  @Valid
  public Account getContactAccount() {
    return contactAccount;
  }

  public void setContactAccount(Account contactAccount) {
    this.contactAccount = contactAccount;
  }

  public Instance description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the instance.  Should be HTML formatted, but might be plaintext.  This should be displayed on the 'about' page for an instance.
   * @return description
  **/
  @Schema(description = "Description of the instance.  Should be HTML formatted, but might be plaintext.  This should be displayed on the 'about' page for an instance.")

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Instance email(String email) {
    this.email = email;
    return this;
  }

  /**
   * An email address that may be used for inquiries.
   * @return email
  **/
  @Schema(example = "admin@example.org", description = "An email address that may be used for inquiries.")

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Instance invitesEnabled(Boolean invitesEnabled) {
    this.invitesEnabled = invitesEnabled;
    return this;
  }

  /**
   * Invites are enabled on this instance.
   * @return invitesEnabled
  **/
  @Schema(description = "Invites are enabled on this instance.")

  public Boolean isInvitesEnabled() {
    return invitesEnabled;
  }

  public void setInvitesEnabled(Boolean invitesEnabled) {
    this.invitesEnabled = invitesEnabled;
  }

  public Instance languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public Instance addLanguagesItem(String languagesItem) {
    if (this.languages == null) {
      this.languages = new ArrayList<String>();
    }
    this.languages.add(languagesItem);
    return this;
  }

  /**
   * Primary language of the instance.
   * @return languages
  **/
  @Schema(example = "en", description = "Primary language of the instance.")

  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public Instance maxTootChars(Integer maxTootChars) {
    this.maxTootChars = maxTootChars;
    return this;
  }

  /**
   * Maximum allowed length of a post on this instance, in characters.  This is provided for compatibility with Tusky and other apps.
   * @return maxTootChars
  **/
  @Schema(example = "5000", description = "Maximum allowed length of a post on this instance, in characters.  This is provided for compatibility with Tusky and other apps.")

  public Integer getMaxTootChars() {
    return maxTootChars;
  }

  public void setMaxTootChars(Integer maxTootChars) {
    this.maxTootChars = maxTootChars;
  }

  public Instance registrations(Boolean registrations) {
    this.registrations = registrations;
    return this;
  }

  /**
   * New account registrations are enabled on this instance.
   * @return registrations
  **/
  @Schema(description = "New account registrations are enabled on this instance.")

  public Boolean isRegistrations() {
    return registrations;
  }

  public void setRegistrations(Boolean registrations) {
    this.registrations = registrations;
  }

  public Instance shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

  /**
   * A shorter description of the instance.  Should be HTML formatted, but might be plaintext.  This should be displayed on the instance splash/landing page.
   * @return shortDescription
  **/
  @Schema(description = "A shorter description of the instance.  Should be HTML formatted, but might be plaintext.  This should be displayed on the instance splash/landing page.")

  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public Instance stats(Map<String, Long> stats) {
    this.stats = stats;
    return this;
  }

  public Instance putStatsItem(String key, Long statsItem) {
    if (this.stats == null) {
      this.stats = new HashMap<String, Long>();
    }
    this.stats.put(key, statsItem);
    return this;
  }

  /**
   * Statistics about the instance: number of posts, accounts, etc.
   * @return stats
  **/
  @Schema(description = "Statistics about the instance: number of posts, accounts, etc.")

  public Map<String, Long> getStats() {
    return stats;
  }

  public void setStats(Map<String, Long> stats) {
    this.stats = stats;
  }

  public Instance thumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

  /**
   * URL of the instance avatar/banner image.
   * @return thumbnail
  **/
  @Schema(example = "https://example.org/files/instance/thumbnail.jpeg", description = "URL of the instance avatar/banner image.")

  public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  public Instance thumbnailDescription(String thumbnailDescription) {
    this.thumbnailDescription = thumbnailDescription;
    return this;
  }

  /**
   * Description of the instance thumbnail.
   * @return thumbnailDescription
  **/
  @Schema(example = "picture of a cute lil' friendly sloth", description = "Description of the instance thumbnail.")

  public String getThumbnailDescription() {
    return thumbnailDescription;
  }

  public void setThumbnailDescription(String thumbnailDescription) {
    this.thumbnailDescription = thumbnailDescription;
  }

  public Instance thumbnailType(String thumbnailType) {
    this.thumbnailType = thumbnailType;
    return this;
  }

  /**
   * MIME type of the instance thumbnail.
   * @return thumbnailType
  **/
  @Schema(example = "image/png", description = "MIME type of the instance thumbnail.")

  public String getThumbnailType() {
    return thumbnailType;
  }

  public void setThumbnailType(String thumbnailType) {
    this.thumbnailType = thumbnailType;
  }

  public Instance title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the instance.
   * @return title
  **/
  @Schema(example = "Coruscant Example Instance", description = "The title of the instance.")

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Instance uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * The URI of the instance.
   * @return uri
  **/
  @Schema(example = "https://gts.example.org", description = "The URI of the instance.")

  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public Instance urls(InstanceURLs urls) {
    this.urls = urls;
    return this;
  }

  /**
   * Get urls
   * @return urls
  **/
  @Schema(description = "")

  @Valid
  public InstanceURLs getUrls() {
    return urls;
  }

  public void setUrls(InstanceURLs urls) {
    this.urls = urls;
  }

  public Instance version(String version) {
    this.version = version;
    return this;
  }

  @Schema(example = "0.1.1 cb85f65", description = "The version installed on the instance.  This will contain at least a semantic version number.  It may also contain, after a space, the short git commit ID of the running software.")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Instance instance = (Instance) o;
    return Objects.equals(this.accountDomain, instance.accountDomain) &&
        Objects.equals(this.approvalRequired, instance.approvalRequired) &&
        Objects.equals(this._configuration, instance._configuration) &&
        Objects.equals(this.contactAccount, instance.contactAccount) &&
        Objects.equals(this.description, instance.description) &&
        Objects.equals(this.email, instance.email) &&
        Objects.equals(this.invitesEnabled, instance.invitesEnabled) &&
        Objects.equals(this.languages, instance.languages) &&
        Objects.equals(this.maxTootChars, instance.maxTootChars) &&
        Objects.equals(this.registrations, instance.registrations) &&
        Objects.equals(this.shortDescription, instance.shortDescription) &&
        Objects.equals(this.stats, instance.stats) &&
        Objects.equals(this.thumbnail, instance.thumbnail) &&
        Objects.equals(this.thumbnailDescription, instance.thumbnailDescription) &&
        Objects.equals(this.thumbnailType, instance.thumbnailType) &&
        Objects.equals(this.title, instance.title) &&
        Objects.equals(this.uri, instance.uri) &&
        Objects.equals(this.urls, instance.urls) &&
        Objects.equals(this.version, instance.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountDomain, approvalRequired, _configuration, contactAccount, description, email, invitesEnabled, languages, maxTootChars, registrations, shortDescription, stats, thumbnail, thumbnailDescription, thumbnailType, title, uri, urls, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Instance {\n");
    
    sb.append("    accountDomain: ").append(toIndentedString(accountDomain)).append("\n");
    sb.append("    approvalRequired: ").append(toIndentedString(approvalRequired)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    contactAccount: ").append(toIndentedString(contactAccount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    invitesEnabled: ").append(toIndentedString(invitesEnabled)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    maxTootChars: ").append(toIndentedString(maxTootChars)).append("\n");
    sb.append("    registrations: ").append(toIndentedString(registrations)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    thumbnailDescription: ").append(toIndentedString(thumbnailDescription)).append("\n");
    sb.append("    thumbnailType: ").append(toIndentedString(thumbnailType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
