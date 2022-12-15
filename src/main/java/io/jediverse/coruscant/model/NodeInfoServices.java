package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import io.micronaut.validation.Validated;
import javax.validation.Valid;

/**
 * NodeInfoServices
 */
@Validated

public class NodeInfoServices   {
  @JsonProperty("inbound")
  @Valid
  private List<String> inbound = null;

  @JsonProperty("outbound")
  @Valid
  private List<String> outbound = null;

  public NodeInfoServices inbound(List<String> inbound) {
    this.inbound = inbound;
    return this;
  }

  public NodeInfoServices addInboundItem(String inboundItem) {
    if (this.inbound == null) {
      this.inbound = new ArrayList<String>();
    }
    this.inbound.add(inboundItem);
    return this;
  }

  /**
   * Get inbound
   * @return inbound
  **/
  @Schema(description = "")

  public List<String> getInbound() {
    return inbound;
  }

  public void setInbound(List<String> inbound) {
    this.inbound = inbound;
  }

  public NodeInfoServices outbound(List<String> outbound) {
    this.outbound = outbound;
    return this;
  }

  public NodeInfoServices addOutboundItem(String outboundItem) {
    if (this.outbound == null) {
      this.outbound = new ArrayList<String>();
    }
    this.outbound.add(outboundItem);
    return this;
  }

  /**
   * Get outbound
   * @return outbound
  **/
  @Schema(description = "")

  public List<String> getOutbound() {
    return outbound;
  }

  public void setOutbound(List<String> outbound) {
    this.outbound = outbound;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeInfoServices nodeInfoServices = (NodeInfoServices) o;
    return Objects.equals(this.inbound, nodeInfoServices.inbound) &&
        Objects.equals(this.outbound, nodeInfoServices.outbound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inbound, outbound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeInfoServices {\n");
    
    sb.append("    inbound: ").append(toIndentedString(inbound)).append("\n");
    sb.append("    outbound: ").append(toIndentedString(outbound)).append("\n");
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
