package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;
import javax.validation.Valid;

/**
 * SwaggerCollection
 */
@Validated

public class SwaggerCollection   {
  @JsonProperty("@context")
  private String _atContext = null;

  @JsonProperty("first")
  private SwaggerCollectionPage first = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("last")
  private SwaggerCollectionPage last = null;

  @JsonProperty("type")
  private String type = null;

  public SwaggerCollection _atContext(String _atContext) {
    this._atContext = _atContext;
    return this;
  }

  /**
   * ActivityStreams context.
   * @return _atContext
  **/
  @Schema(example = "https://www.w3.org/ns/activitystreams", description = "ActivityStreams context.")

  public String getAtContext() {
    return _atContext;
  }

  public void setAtContext(String _atContext) {
    this._atContext = _atContext;
  }

  public SwaggerCollection first(SwaggerCollectionPage first) {
    this.first = first;
    return this;
  }

  /**
   * Get first
   * @return first
  **/
  @Schema(description = "")

  @Valid
  public SwaggerCollectionPage getFirst() {
    return first;
  }

  public void setFirst(SwaggerCollectionPage first) {
    this.first = first;
  }

  public SwaggerCollection id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ActivityStreams ID.
   * @return id
  **/
  @Schema(example = "https://example.org/users/some_user/statuses/106717595988259568/replies", description = "ActivityStreams ID.")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SwaggerCollection last(SwaggerCollectionPage last) {
    this.last = last;
    return this;
  }

  /**
   * Get last
   * @return last
  **/
  @Schema(description = "")

  @Valid
  public SwaggerCollectionPage getLast() {
    return last;
  }

  public void setLast(SwaggerCollectionPage last) {
    this.last = last;
  }

  public SwaggerCollection type(String type) {
    this.type = type;
    return this;
  }

  /**
   * ActivityStreams type.
   * @return type
  **/
  @Schema(example = "Collection", description = "ActivityStreams type.")

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
    SwaggerCollection swaggerCollection = (SwaggerCollection) o;
    return Objects.equals(this._atContext, swaggerCollection._atContext) &&
        Objects.equals(this.first, swaggerCollection.first) &&
        Objects.equals(this.id, swaggerCollection.id) &&
        Objects.equals(this.last, swaggerCollection.last) &&
        Objects.equals(this.type, swaggerCollection.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atContext, first, id, last, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwaggerCollection {\n");
    
    sb.append("    _atContext: ").append(toIndentedString(_atContext)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
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
