package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;

/**
 * Application
 */
@Validated

public class Application   {
  @JsonProperty("client_id")
  private String clientId = null;

  @JsonProperty("client_secret")
  private String clientSecret = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("redirect_uri")
  private String redirectUri = null;

  @JsonProperty("vapid_key")
  private String vapidKey = null;

  @JsonProperty("website")
  private String website = null;

  public Application clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Client ID associated with this application.
   * @return clientId
  **/
  @Schema(description = "Client ID associated with this application.")

  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public Application clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * Client secret associated with this application.
   * @return clientSecret
  **/
  @Schema(description = "Client secret associated with this application.")

  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public Application id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the application.
   * @return id
  **/
  @Schema(example = "01FBVD42CQ3ZEEVMW180SBX03B", description = "The ID of the application.")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Application name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the application.
   * @return name
  **/
  @Schema(example = "Tusky", description = "The name of the application.")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Application redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  /**
   * Post-authorization redirect URI for the application (OAuth2).
   * @return redirectUri
  **/
  @Schema(example = "https://example.org/callback?some=query", description = "Post-authorization redirect URI for the application (OAuth2).")

  public String getRedirectUri() {
    return redirectUri;
  }

  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }

  public Application vapidKey(String vapidKey) {
    this.vapidKey = vapidKey;
    return this;
  }

  /**
   * Push API key for this application.
   * @return vapidKey
  **/
  @Schema(description = "Push API key for this application.")

  public String getVapidKey() {
    return vapidKey;
  }

  public void setVapidKey(String vapidKey) {
    this.vapidKey = vapidKey;
  }

  public Application website(String website) {
    this.website = website;
    return this;
  }

  /**
   * The website associated with the application (url)
   * @return website
  **/
  @Schema(example = "https://tusky.app", description = "The website associated with the application (url)")

  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Application application = (Application) o;
    return Objects.equals(this.clientId, application.clientId) &&
        Objects.equals(this.clientSecret, application.clientSecret) &&
        Objects.equals(this.id, application.id) &&
        Objects.equals(this.name, application.name) &&
        Objects.equals(this.redirectUri, application.redirectUri) &&
        Objects.equals(this.vapidKey, application.vapidKey) &&
        Objects.equals(this.website, application.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientSecret, id, name, redirectUri, vapidKey, website);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Application {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    vapidKey: ").append(toIndentedString(vapidKey)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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
