package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.File;
import io.micronaut.validation.Validated;
import javax.validation.Valid;

/**
 * AdminDomainBlocksBody
 */
@Validated

public class AdminDomainBlocksBody   {
  @JsonProperty("domains")
  private File domains = null;

  @JsonProperty("domain")
  private String domain = null;

  @JsonProperty("obfuscate")
  private Boolean obfuscate = null;

  @JsonProperty("public_comment")
  private String publicComment = null;

  @JsonProperty("private_comment")
  private String privateComment = null;

  public AdminDomainBlocksBody domains(File domains) {
    this.domains = domains;
    return this;
  }

  /**
   * JSON-formatted list of domain blocks to import. This is only used if `import` is set to `true`.
   * @return domains
  **/
  @Schema(description = "JSON-formatted list of domain blocks to import. This is only used if `import` is set to `true`.")

  @Valid
  public File getDomains() {
    return domains;
  }

  public void setDomains(File domains) {
    this.domains = domains;
  }

  public AdminDomainBlocksBody domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Single domain to block. Used only if `import` is not `true`.
   * @return domain
  **/
  @Schema(description = "Single domain to block. Used only if `import` is not `true`.")

  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public AdminDomainBlocksBody obfuscate(Boolean obfuscate) {
    this.obfuscate = obfuscate;
    return this;
  }

  /**
   * Obfuscate the name of the domain when serving it publicly. Eg., `example.org` becomes something like `ex***e.org`. Used only if `import` is not `true`.
   * @return obfuscate
  **/
  @Schema(description = "Obfuscate the name of the domain when serving it publicly. Eg., `example.org` becomes something like `ex***e.org`. Used only if `import` is not `true`.")

  public Boolean isObfuscate() {
    return obfuscate;
  }

  public void setObfuscate(Boolean obfuscate) {
    this.obfuscate = obfuscate;
  }

  public AdminDomainBlocksBody publicComment(String publicComment) {
    this.publicComment = publicComment;
    return this;
  }

  /**
   * Public comment about this domain block. This will be displayed alongside the domain block if you choose to share blocks. Used only if `import` is not `true`.
   * @return publicComment
  **/
  @Schema(description = "Public comment about this domain block. This will be displayed alongside the domain block if you choose to share blocks. Used only if `import` is not `true`.")

  public String getPublicComment() {
    return publicComment;
  }

  public void setPublicComment(String publicComment) {
    this.publicComment = publicComment;
  }

  public AdminDomainBlocksBody privateComment(String privateComment) {
    this.privateComment = privateComment;
    return this;
  }

  /**
   * Private comment about this domain block. Will only be shown to other admins, so this is a useful way of internally keeping track of why a certain domain ended up blocked. Used only if `import` is not `true`.
   * @return privateComment
  **/
  @Schema(description = "Private comment about this domain block. Will only be shown to other admins, so this is a useful way of internally keeping track of why a certain domain ended up blocked. Used only if `import` is not `true`.")

  public String getPrivateComment() {
    return privateComment;
  }

  public void setPrivateComment(String privateComment) {
    this.privateComment = privateComment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminDomainBlocksBody adminDomainBlocksBody = (AdminDomainBlocksBody) o;
    return Objects.equals(this.domains, adminDomainBlocksBody.domains) &&
        Objects.equals(this.domain, adminDomainBlocksBody.domain) &&
        Objects.equals(this.obfuscate, adminDomainBlocksBody.obfuscate) &&
        Objects.equals(this.publicComment, adminDomainBlocksBody.publicComment) &&
        Objects.equals(this.privateComment, adminDomainBlocksBody.privateComment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domains, domain, obfuscate, publicComment, privateComment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminDomainBlocksBody {\n");
    
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    obfuscate: ").append(toIndentedString(obfuscate)).append("\n");
    sb.append("    publicComment: ").append(toIndentedString(publicComment)).append("\n");
    sb.append("    privateComment: ").append(toIndentedString(privateComment)).append("\n");
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
