package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;

/**
 * DomainBlockCreateRequest
 */
@Validated

public class DomainBlockCreateRequest   {
  @JsonProperty("domain")
  private String domain = null;

  @JsonProperty("domains")
  private Object domains = null;

  @JsonProperty("obfuscate")
  private Boolean obfuscate = null;

  @JsonProperty("private_comment")
  private String privateComment = null;

  @JsonProperty("public_comment")
  private String publicComment = null;

  public DomainBlockCreateRequest domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * hostname/domain to block
   * @return domain
  **/
  @Schema(description = "hostname/domain to block")

  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public DomainBlockCreateRequest domains(Object domains) {
    this.domains = domains;
    return this;
  }

  /**
   * A list of domains to block. Only used if import=true is specified.
   * @return domains
  **/
  @Schema(description = "A list of domains to block. Only used if import=true is specified.")

  public Object getDomains() {
    return domains;
  }

  public void setDomains(Object domains) {
    this.domains = domains;
  }

  public DomainBlockCreateRequest obfuscate(Boolean obfuscate) {
    this.obfuscate = obfuscate;
    return this;
  }

  /**
   * whether the domain should be obfuscated when being displayed publicly
   * @return obfuscate
  **/
  @Schema(description = "whether the domain should be obfuscated when being displayed publicly")

  public Boolean isObfuscate() {
    return obfuscate;
  }

  public void setObfuscate(Boolean obfuscate) {
    this.obfuscate = obfuscate;
  }

  public DomainBlockCreateRequest privateComment(String privateComment) {
    this.privateComment = privateComment;
    return this;
  }

  /**
   * private comment for other admins on why the domain was blocked
   * @return privateComment
  **/
  @Schema(description = "private comment for other admins on why the domain was blocked")

  public String getPrivateComment() {
    return privateComment;
  }

  public void setPrivateComment(String privateComment) {
    this.privateComment = privateComment;
  }

  public DomainBlockCreateRequest publicComment(String publicComment) {
    this.publicComment = publicComment;
    return this;
  }

  /**
   * public comment on the reason for the domain block
   * @return publicComment
  **/
  @Schema(description = "public comment on the reason for the domain block")

  public String getPublicComment() {
    return publicComment;
  }

  public void setPublicComment(String publicComment) {
    this.publicComment = publicComment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainBlockCreateRequest domainBlockCreateRequest = (DomainBlockCreateRequest) o;
    return Objects.equals(this.domain, domainBlockCreateRequest.domain) &&
        Objects.equals(this.domains, domainBlockCreateRequest.domains) &&
        Objects.equals(this.obfuscate, domainBlockCreateRequest.obfuscate) &&
        Objects.equals(this.privateComment, domainBlockCreateRequest.privateComment) &&
        Objects.equals(this.publicComment, domainBlockCreateRequest.publicComment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, domains, obfuscate, privateComment, publicComment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainBlockCreateRequest {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    obfuscate: ").append(toIndentedString(obfuscate)).append("\n");
    sb.append("    privateComment: ").append(toIndentedString(privateComment)).append("\n");
    sb.append("    publicComment: ").append(toIndentedString(publicComment)).append("\n");
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
