package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import io.micronaut.validation.Validated;
import javax.validation.Valid;

/**
 * See https://webfinger.net/
 */
@Schema(description = "See https://webfinger.net/")
@Validated

public class WellKnownResponse   {
  @JsonProperty("aliases")
  @Valid
  private List<String> aliases = null;

  @JsonProperty("links")
  @Valid
  private List<Link> links = null;

  @JsonProperty("subject")
  private String subject = null;

  public WellKnownResponse aliases(List<String> aliases) {
    this.aliases = aliases;
    return this;
  }

  public WellKnownResponse addAliasesItem(String aliasesItem) {
    if (this.aliases == null) {
      this.aliases = new ArrayList<String>();
    }
    this.aliases.add(aliasesItem);
    return this;
  }

  /**
   * Get aliases
   * @return aliases
  **/
  @Schema(description = "")

  public List<String> getAliases() {
    return aliases;
  }

  public void setAliases(List<String> aliases) {
    this.aliases = aliases;
  }

  public WellKnownResponse links(List<Link> links) {
    this.links = links;
    return this;
  }

  public WellKnownResponse addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<Link>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
  **/
  @Schema(description = "")
  @Valid
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }

  public WellKnownResponse subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Get subject
   * @return subject
  **/
  @Schema(description = "")

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WellKnownResponse wellKnownResponse = (WellKnownResponse) o;
    return Objects.equals(this.aliases, wellKnownResponse.aliases) &&
        Objects.equals(this.links, wellKnownResponse.links) &&
        Objects.equals(this.subject, wellKnownResponse.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliases, links, subject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WellKnownResponse {\n");
    
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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
