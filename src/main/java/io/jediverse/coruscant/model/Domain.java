package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;

/**
 * Domain represents a remote domain
 */
@Schema(description = "Domain represents a remote domain")
@Validated

public class Domain   {
  @JsonProperty("domain")
  private String domain = null;

  @JsonProperty("public_comment")
  private String publicComment = null;

  @JsonProperty("silenced_at")
  private String silencedAt = null;

  @JsonProperty("suspended_at")
  private String suspendedAt = null;

  public Domain domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * The hostname of the domain.
   * @return domain
  **/
  @Schema(example = "example.org", description = "The hostname of the domain.")

  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public Domain publicComment(String publicComment) {
    this.publicComment = publicComment;
    return this;
  }

  /**
   * If the domain is blocked, what's the publicly-stated reason for the block.
   * @return publicComment
  **/
  @Schema(example = "they smell", description = "If the domain is blocked, what's the publicly-stated reason for the block.")

  public String getPublicComment() {
    return publicComment;
  }

  public void setPublicComment(String publicComment) {
    this.publicComment = publicComment;
  }

  public Domain silencedAt(String silencedAt) {
    this.silencedAt = silencedAt;
    return this;
  }

  /**
   * Time at which this domain was silenced. Key will not be present on open domains.
   * @return silencedAt
  **/
  @Schema(example = "2021-07-30T09:20:25+00:00", description = "Time at which this domain was silenced. Key will not be present on open domains.")

  public String getSilencedAt() {
    return silencedAt;
  }

  public void setSilencedAt(String silencedAt) {
    this.silencedAt = silencedAt;
  }

  public Domain suspendedAt(String suspendedAt) {
    this.suspendedAt = suspendedAt;
    return this;
  }

  /**
   * Time at which this domain was suspended. Key will not be present on open domains.
   * @return suspendedAt
  **/
  @Schema(example = "2021-07-30T09:20:25+00:00", description = "Time at which this domain was suspended. Key will not be present on open domains.")

  public String getSuspendedAt() {
    return suspendedAt;
  }

  public void setSuspendedAt(String suspendedAt) {
    this.suspendedAt = suspendedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Domain domain = (Domain) o;
    return Objects.equals(this.domain, domain.domain) &&
        Objects.equals(this.publicComment, domain.publicComment) &&
        Objects.equals(this.silencedAt, domain.silencedAt) &&
        Objects.equals(this.suspendedAt, domain.suspendedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, publicComment, silencedAt, suspendedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Domain {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    publicComment: ").append(toIndentedString(publicComment)).append("\n");
    sb.append("    silencedAt: ").append(toIndentedString(silencedAt)).append("\n");
    sb.append("    suspendedAt: ").append(toIndentedString(suspendedAt)).append("\n");
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
