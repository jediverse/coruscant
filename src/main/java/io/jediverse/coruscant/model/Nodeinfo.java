package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.micronaut.validation.Validated;
import javax.validation.Valid;

/**
 * See: https://nodeinfo.diaspora.software/schema.html
 */
@Schema(description = "See: https://nodeinfo.diaspora.software/schema.html")
@Validated

public class Nodeinfo   {
  @JsonProperty("metadata")
  @Valid
  private Map<String, Object> metadata = null;

  @JsonProperty("openRegistrations")
  private Boolean openRegistrations = null;

  @JsonProperty("protocols")
  @Valid
  private List<String> protocols = null;

  @JsonProperty("services")
  private NodeInfoServices services = null;

  @JsonProperty("software")
  private NodeInfoSoftware software = null;

  @JsonProperty("usage")
  private NodeInfoUsage usage = null;

  @JsonProperty("version")
  private String version = null;

  public Nodeinfo metadata(Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public Nodeinfo putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, Object>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

  /**
   * Free form key value pairs for software specific values. Clients should not rely on any specific key present.
   * @return metadata
  **/
  @Schema(description = "Free form key value pairs for software specific values. Clients should not rely on any specific key present.")

  public Map<String, Object> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }

  public Nodeinfo openRegistrations(Boolean openRegistrations) {
    this.openRegistrations = openRegistrations;
    return this;
  }

  /**
   * Whether this server allows open self-registration.
   * @return openRegistrations
  **/
  @Schema(example = "false", description = "Whether this server allows open self-registration.")

  public Boolean isOpenRegistrations() {
    return openRegistrations;
  }

  public void setOpenRegistrations(Boolean openRegistrations) {
    this.openRegistrations = openRegistrations;
  }

  public Nodeinfo protocols(List<String> protocols) {
    this.protocols = protocols;
    return this;
  }

  public Nodeinfo addProtocolsItem(String protocolsItem) {
    if (this.protocols == null) {
      this.protocols = new ArrayList<String>();
    }
    this.protocols.add(protocolsItem);
    return this;
  }

  /**
   * The protocols supported on this server.
   * @return protocols
  **/
  @Schema(description = "The protocols supported on this server.")

  public List<String> getProtocols() {
    return protocols;
  }

  public void setProtocols(List<String> protocols) {
    this.protocols = protocols;
  }

  public Nodeinfo services(NodeInfoServices services) {
    this.services = services;
    return this;
  }

  /**
   * Get services
   * @return services
  **/
  @Schema(description = "")

  @Valid
  public NodeInfoServices getServices() {
    return services;
  }

  public void setServices(NodeInfoServices services) {
    this.services = services;
  }

  public Nodeinfo software(NodeInfoSoftware software) {
    this.software = software;
    return this;
  }

  /**
   * Get software
   * @return software
  **/
  @Schema(description = "")

  @Valid
  public NodeInfoSoftware getSoftware() {
    return software;
  }

  public void setSoftware(NodeInfoSoftware software) {
    this.software = software;
  }

  public Nodeinfo usage(NodeInfoUsage usage) {
    this.usage = usage;
    return this;
  }

  /**
   * Get usage
   * @return usage
  **/
  @Schema(description = "")

  @Valid
  public NodeInfoUsage getUsage() {
    return usage;
  }

  public void setUsage(NodeInfoUsage usage) {
    this.usage = usage;
  }

  public Nodeinfo version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The schema version
   * @return version
  **/
  @Schema(example = "2.0", description = "The schema version")

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Nodeinfo nodeinfo = (Nodeinfo) o;
    return Objects.equals(this.metadata, nodeinfo.metadata) &&
        Objects.equals(this.openRegistrations, nodeinfo.openRegistrations) &&
        Objects.equals(this.protocols, nodeinfo.protocols) &&
        Objects.equals(this.services, nodeinfo.services) &&
        Objects.equals(this.software, nodeinfo.software) &&
        Objects.equals(this.usage, nodeinfo.usage) &&
        Objects.equals(this.version, nodeinfo.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, openRegistrations, protocols, services, software, usage, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Nodeinfo {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    openRegistrations: ").append(toIndentedString(openRegistrations)).append("\n");
    sb.append("    protocols: ").append(toIndentedString(protocols)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    software: ").append(toIndentedString(software)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
