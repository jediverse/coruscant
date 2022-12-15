package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;

/**
 * OauthToken
 */
@Validated

public class OauthToken   {
  @JsonProperty("access_token")
  private String accessToken = null;

  @JsonProperty("created_at")
  private Long createdAt = null;

  @JsonProperty("scope")
  private String scope = null;

  @JsonProperty("token_type")
  private String tokenType = null;

  public OauthToken accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * Access token used for authorization.
   * @return accessToken
  **/
  @Schema(description = "Access token used for authorization.")

  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public OauthToken createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * When the OAuth token was generated (UNIX timestamp seconds).
   * @return createdAt
  **/
  @Schema(example = "1627644520", description = "When the OAuth token was generated (UNIX timestamp seconds).")

  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public OauthToken scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * OAuth scopes granted by this token, space-separated.
   * @return scope
  **/
  @Schema(example = "read write admin", description = "OAuth scopes granted by this token, space-separated.")

  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public OauthToken tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  /**
   * OAuth token type. Will always be 'Bearer'.
   * @return tokenType
  **/
  @Schema(example = "bearer", description = "OAuth token type. Will always be 'Bearer'.")

  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OauthToken oauthToken = (OauthToken) o;
    return Objects.equals(this.accessToken, oauthToken.accessToken) &&
        Objects.equals(this.createdAt, oauthToken.createdAt) &&
        Objects.equals(this.scope, oauthToken.scope) &&
        Objects.equals(this.tokenType, oauthToken.tokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, createdAt, scope, tokenType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthToken {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
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
