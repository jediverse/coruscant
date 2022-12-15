package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;
import javax.validation.Valid;

/**
 * NodeInfoUsage
 */
@Validated

public class NodeInfoUsage   {
  @JsonProperty("users")
  private NodeInfoUsers users = null;

  public NodeInfoUsage users(NodeInfoUsers users) {
    this.users = users;
    return this;
  }

  /**
   * Get users
   * @return users
  **/
  @Schema(description = "")

  @Valid
  public NodeInfoUsers getUsers() {
    return users;
  }

  public void setUsers(NodeInfoUsers users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeInfoUsage nodeInfoUsage = (NodeInfoUsage) o;
    return Objects.equals(this.users, nodeInfoUsage.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeInfoUsage {\n");
    
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
