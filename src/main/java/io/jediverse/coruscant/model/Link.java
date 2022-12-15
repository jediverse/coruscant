package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;

/**
 * See https://webfinger.net/
 */
@Schema(description = "See https://webfinger.net/")
@Validated

public class Link   {
  @JsonProperty("href")
  private String href = null;

  @JsonProperty("rel")
  private String rel = null;

  @JsonProperty("template")
  private String template = null;

  @JsonProperty("type")
  private String type = null;

  public Link href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Get href
   * @return href
  **/
  @Schema(description = "")

  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Link rel(String rel) {
    this.rel = rel;
    return this;
  }

  /**
   * Get rel
   * @return rel
  **/
  @Schema(description = "")

  public String getRel() {
    return rel;
  }

  public void setRel(String rel) {
    this.rel = rel;
  }

  public Link template(String template) {
    this.template = template;
    return this;
  }

  /**
   * Get template
   * @return template
  **/
  @Schema(description = "")

  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public Link type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @Schema(description = "")

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Link link = (Link) o;
    return Objects.equals(this.href, link.href) &&
        Objects.equals(this.rel, link.rel) &&
        Objects.equals(this.template, link.template) &&
        Objects.equals(this.type, link.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, rel, template, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Link {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
