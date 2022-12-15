package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import io.micronaut.validation.Validated;
import javax.validation.Valid;

/**
 * StatusContext
 */
@Validated

public class StatusContext   {
  @JsonProperty("ancestors")
  @Valid
  private List<Status> ancestors = null;

  @JsonProperty("descendants")
  @Valid
  private List<Status> descendants = null;

  public StatusContext ancestors(List<Status> ancestors) {
    this.ancestors = ancestors;
    return this;
  }

  public StatusContext addAncestorsItem(Status ancestorsItem) {
    if (this.ancestors == null) {
      this.ancestors = new ArrayList<Status>();
    }
    this.ancestors.add(ancestorsItem);
    return this;
  }

  /**
   * Parents in the thread.
   * @return ancestors
  **/
  @Schema(description = "Parents in the thread.")
  @Valid
  public List<Status> getAncestors() {
    return ancestors;
  }

  public void setAncestors(List<Status> ancestors) {
    this.ancestors = ancestors;
  }

  public StatusContext descendants(List<Status> descendants) {
    this.descendants = descendants;
    return this;
  }

  public StatusContext addDescendantsItem(Status descendantsItem) {
    if (this.descendants == null) {
      this.descendants = new ArrayList<Status>();
    }
    this.descendants.add(descendantsItem);
    return this;
  }

  /**
   * Children in the thread.
   * @return descendants
  **/
  @Schema(description = "Children in the thread.")
  @Valid
  public List<Status> getDescendants() {
    return descendants;
  }

  public void setDescendants(List<Status> descendants) {
    this.descendants = descendants;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusContext statusContext = (StatusContext) o;
    return Objects.equals(this.ancestors, statusContext.ancestors) &&
        Objects.equals(this.descendants, statusContext.descendants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ancestors, descendants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusContext {\n");
    
    sb.append("    ancestors: ").append(toIndentedString(ancestors)).append("\n");
    sb.append("    descendants: ").append(toIndentedString(descendants)).append("\n");
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
