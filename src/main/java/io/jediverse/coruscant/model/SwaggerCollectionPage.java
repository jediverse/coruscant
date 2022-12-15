package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import io.micronaut.validation.Validated;
import javax.validation.Valid;

/**
 * SwaggerCollectionPage
 */
@Validated

public class SwaggerCollectionPage   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("items")
  @Valid
  private List<String> items = null;

  @JsonProperty("next")
  private String next = null;

  @JsonProperty("partOf")
  private String partOf = null;

  @JsonProperty("type")
  private String type = null;

  public SwaggerCollectionPage id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ActivityStreams ID.
   * @return id
  **/
  @Schema(example = "https://example.org/users/some_user/statuses/106717595988259568/replies?page=true", description = "ActivityStreams ID.")

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SwaggerCollectionPage items(List<String> items) {
    this.items = items;
    return this;
  }

  public SwaggerCollectionPage addItemsItem(String itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<String>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Items on this page.
   * @return items
  **/
  @Schema(example = "[\"https://example.org/users/some_other_user/statuses/086417595981111564\",\"https://another.example.com/users/another_user/statuses/01FCN8XDV3YG7B4R42QA6YQZ9R\"]", description = "Items on this page.")

  public List<String> getItems() {
    return items;
  }

  public void setItems(List<String> items) {
    this.items = items;
  }

  public SwaggerCollectionPage next(String next) {
    this.next = next;
    return this;
  }

  /**
   * Link to the next page.
   * @return next
  **/
  @Schema(example = "https://example.org/users/some_user/statuses/106717595988259568/replies?only_other_accounts=true&page=true", description = "Link to the next page.")

  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public SwaggerCollectionPage partOf(String partOf) {
    this.partOf = partOf;
    return this;
  }

  /**
   * Collection this page belongs to.
   * @return partOf
  **/
  @Schema(example = "https://example.org/users/some_user/statuses/106717595988259568/replies", description = "Collection this page belongs to.")

  public String getPartOf() {
    return partOf;
  }

  public void setPartOf(String partOf) {
    this.partOf = partOf;
  }

  public SwaggerCollectionPage type(String type) {
    this.type = type;
    return this;
  }

  /**
   * ActivityStreams type.
   * @return type
  **/
  @Schema(example = "CollectionPage", description = "ActivityStreams type.")

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
    SwaggerCollectionPage swaggerCollectionPage = (SwaggerCollectionPage) o;
    return Objects.equals(this.id, swaggerCollectionPage.id) &&
        Objects.equals(this.items, swaggerCollectionPage.items) &&
        Objects.equals(this.next, swaggerCollectionPage.next) &&
        Objects.equals(this.partOf, swaggerCollectionPage.partOf) &&
        Objects.equals(this.type, swaggerCollectionPage.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, items, next, partOf, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwaggerCollectionPage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    partOf: ").append(toIndentedString(partOf)).append("\n");
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
