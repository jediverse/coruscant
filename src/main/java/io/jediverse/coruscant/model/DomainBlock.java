package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;

/**
 * DomainBlock represents a block on one domain
 */
@Schema(description = "DomainBlock represents a block on one domain")
@Validated

public class DomainBlock   {
  @JsonProperty("created_at")
  private String createdAt = null;

  @JsonProperty("created_by")
  private String createdBy = null;

  @JsonProperty("domain")
  private String domain = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("obfuscate")
  private Boolean obfuscate = null;

  @JsonProperty("private_comment")
  private String privateComment = null;

  @JsonProperty("public_comment")
  private String publicComment = null;

  @JsonProperty("silenced_at")
  private String silencedAt = null;

  @JsonProperty("subscription_id")
  private String subscriptionId = null;

  @JsonProperty("suspended_at")
  private String suspendedAt = null;

  public DomainBlock createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Time at which this block was created (ISO 8601 Datetime).
   * @return createdAt
  **/
  @Schema(example = "2021-07-30T09:20:25+00:00", description = "Time at which this block was created (ISO 8601 Datetime).")

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public DomainBlock createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * ID of the account that created this domain block.
   * @return createdBy
  **/
  @Schema(example = "01FBW2758ZB6PBR200YPDDJK4C", description = "ID of the account that created this domain block.")

  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public DomainBlock domain(String domain) {
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

  public DomainBlock id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the domain block.
   * @return id
  **/
  @Schema(example = "01FBW21XJA09XYX51KV5JVBW0F", readOnly = true, description = "The ID of the domain block.")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DomainBlock obfuscate(Boolean obfuscate) {
    this.obfuscate = obfuscate;
    return this;
  }

  /**
   * Obfuscate the domain name when serving this domain block publicly. A useful anti-harassment tool.
   * @return obfuscate
  **/
  @Schema(example = "false", description = "Obfuscate the domain name when serving this domain block publicly. A useful anti-harassment tool.")

  public Boolean isObfuscate() {
    return obfuscate;
  }

  public void setObfuscate(Boolean obfuscate) {
    this.obfuscate = obfuscate;
  }

  public DomainBlock privateComment(String privateComment) {
    this.privateComment = privateComment;
    return this;
  }

  /**
   * Private comment for this block, visible to our instance admins only.
   * @return privateComment
  **/
  @Schema(example = "they are poopoo", description = "Private comment for this block, visible to our instance admins only.")

  public String getPrivateComment() {
    return privateComment;
  }

  public void setPrivateComment(String privateComment) {
    this.privateComment = privateComment;
  }

  public DomainBlock publicComment(String publicComment) {
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

  public DomainBlock silencedAt(String silencedAt) {
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

  public DomainBlock subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  /**
   * The ID of the subscription that created/caused this domain block.
   * @return subscriptionId
  **/
  @Schema(example = "01FBW25TF5J67JW3HFHZCSD23K", description = "The ID of the subscription that created/caused this domain block.")

  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public DomainBlock suspendedAt(String suspendedAt) {
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
    DomainBlock domainBlock = (DomainBlock) o;
    return Objects.equals(this.createdAt, domainBlock.createdAt) &&
        Objects.equals(this.createdBy, domainBlock.createdBy) &&
        Objects.equals(this.domain, domainBlock.domain) &&
        Objects.equals(this.id, domainBlock.id) &&
        Objects.equals(this.obfuscate, domainBlock.obfuscate) &&
        Objects.equals(this.privateComment, domainBlock.privateComment) &&
        Objects.equals(this.publicComment, domainBlock.publicComment) &&
        Objects.equals(this.silencedAt, domainBlock.silencedAt) &&
        Objects.equals(this.subscriptionId, domainBlock.subscriptionId) &&
        Objects.equals(this.suspendedAt, domainBlock.suspendedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, createdBy, domain, id, obfuscate, privateComment, publicComment, silencedAt, subscriptionId, suspendedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainBlock {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    obfuscate: ").append(toIndentedString(obfuscate)).append("\n");
    sb.append("    privateComment: ").append(toIndentedString(privateComment)).append("\n");
    sb.append("    publicComment: ").append(toIndentedString(publicComment)).append("\n");
    sb.append("    silencedAt: ").append(toIndentedString(silencedAt)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
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
