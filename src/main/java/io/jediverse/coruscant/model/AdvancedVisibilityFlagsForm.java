package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;

/**
 * AdvancedVisibilityFlagsForm allows a few more advanced flags to be set on new statuses, in addition to the standard mastodon-compatible ones.
 */
@Schema(description = "AdvancedVisibilityFlagsForm allows a few more advanced flags to be set on new statuses, in addition to the standard mastodon-compatible ones.")
@Validated

public class AdvancedVisibilityFlagsForm   {
  @JsonProperty("boostable")
  private Boolean boostable = null;

  @JsonProperty("federated")
  private Boolean federated = null;

  @JsonProperty("likeable")
  private Boolean likeable = null;

  @JsonProperty("replyable")
  private Boolean replyable = null;

  public AdvancedVisibilityFlagsForm boostable(Boolean boostable) {
    this.boostable = boostable;
    return this;
  }

  /**
   * This status can be boosted/reblogged.
   * @return boostable
  **/
  @Schema(description = "This status can be boosted/reblogged.")

  public Boolean isBoostable() {
    return boostable;
  }

  public void setBoostable(Boolean boostable) {
    this.boostable = boostable;
  }

  public AdvancedVisibilityFlagsForm federated(Boolean federated) {
    this.federated = federated;
    return this;
  }

  /**
   * This status will be federated beyond the local timeline(s).
   * @return federated
  **/
  @Schema(description = "This status will be federated beyond the local timeline(s).")

  public Boolean isFederated() {
    return federated;
  }

  public void setFederated(Boolean federated) {
    this.federated = federated;
  }

  public AdvancedVisibilityFlagsForm likeable(Boolean likeable) {
    this.likeable = likeable;
    return this;
  }

  /**
   * This status can be liked/faved.
   * @return likeable
  **/
  @Schema(description = "This status can be liked/faved.")

  public Boolean isLikeable() {
    return likeable;
  }

  public void setLikeable(Boolean likeable) {
    this.likeable = likeable;
  }

  public AdvancedVisibilityFlagsForm replyable(Boolean replyable) {
    this.replyable = replyable;
    return this;
  }

  /**
   * This status can be replied to.
   * @return replyable
  **/
  @Schema(description = "This status can be replied to.")

  public Boolean isReplyable() {
    return replyable;
  }

  public void setReplyable(Boolean replyable) {
    this.replyable = replyable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvancedVisibilityFlagsForm advancedVisibilityFlagsForm = (AdvancedVisibilityFlagsForm) o;
    return Objects.equals(this.boostable, advancedVisibilityFlagsForm.boostable) &&
        Objects.equals(this.federated, advancedVisibilityFlagsForm.federated) &&
        Objects.equals(this.likeable, advancedVisibilityFlagsForm.likeable) &&
        Objects.equals(this.replyable, advancedVisibilityFlagsForm.replyable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boostable, federated, likeable, replyable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancedVisibilityFlagsForm {\n");
    
    sb.append("    boostable: ").append(toIndentedString(boostable)).append("\n");
    sb.append("    federated: ").append(toIndentedString(federated)).append("\n");
    sb.append("    likeable: ").append(toIndentedString(likeable)).append("\n");
    sb.append("    replyable: ").append(toIndentedString(replyable)).append("\n");
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
