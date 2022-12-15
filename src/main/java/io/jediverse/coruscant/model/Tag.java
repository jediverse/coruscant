package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;

/**
 * Tag
 */
@Validated

public class Tag   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("url")
  private String url = null;

  public Tag name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The value of the hashtag after the # sign.
   * @return name
  **/
  @Schema(example = "helloworld", description = "The value of the hashtag after the # sign.")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Tag url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Web link to the hashtag.
   * @return url
  **/
  @Schema(example = "https://example.org/tags/helloworld", description = "Web link to the hashtag.")

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tag tag = (Tag) o;
    return Objects.equals(this.name, tag.name) &&
        Objects.equals(this.url, tag.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tag {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
