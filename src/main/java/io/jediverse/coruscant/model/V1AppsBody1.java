package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;

import javax.validation.constraints.*;

/**
 * V1AppsBody1
 */
@Validated

public class V1AppsBody1   {
  @JsonProperty("client_name")
  private String clientName = null;

  @JsonProperty("redirect_uris")
  private String redirectUris = null;

  @JsonProperty("scopes")
  private String scopes = null;

  @JsonProperty("website")
  private String website = null;

  public V1AppsBody1 clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

  /**
   * The name of the application.
   * @return clientName
  **/
  @Schema(required = true, description = "The name of the application.")
  @NotNull

  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public V1AppsBody1 redirectUris(String redirectUris) {
    this.redirectUris = redirectUris;
    return this;
  }

  /**
   * Where the user should be redirected after authorization.  To display the authorization code to the user instead of redirecting to a web page, use `urn:ietf:wg:oauth:2.0:oob` in this parameter.
   * @return redirectUris
  **/
  @Schema(required = true, description = "Where the user should be redirected after authorization.  To display the authorization code to the user instead of redirecting to a web page, use `urn:ietf:wg:oauth:2.0:oob` in this parameter.")
  @NotNull

  public String getRedirectUris() {
    return redirectUris;
  }

  public void setRedirectUris(String redirectUris) {
    this.redirectUris = redirectUris;
  }

  public V1AppsBody1 scopes(String scopes) {
    this.scopes = scopes;
    return this;
  }

  /**
   * Space separated list of scopes.  If no scopes are provided, defaults to `read`.
   * @return scopes
  **/
  @Schema(description = "Space separated list of scopes.  If no scopes are provided, defaults to `read`.")

  public String getScopes() {
    return scopes;
  }

  public void setScopes(String scopes) {
    this.scopes = scopes;
  }

  public V1AppsBody1 website(String website) {
    this.website = website;
    return this;
  }

  /**
   * A URL to the web page of the app (optional).
   * @return website
  **/
  @Schema(description = "A URL to the web page of the app (optional).")

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
    V1AppsBody1 v1AppsBody1 = (V1AppsBody1) o;
    return Objects.equals(this.clientName, v1AppsBody1.clientName) &&
        Objects.equals(this.redirectUris, v1AppsBody1.redirectUris) &&
        Objects.equals(this.scopes, v1AppsBody1.scopes) &&
        Objects.equals(this.website, v1AppsBody1.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientName, redirectUris, scopes, website);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AppsBody1 {\n");
    
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
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
