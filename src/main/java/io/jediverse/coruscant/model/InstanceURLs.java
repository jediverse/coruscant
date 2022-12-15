package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;

/**
 * InstanceURLs
 */
@Validated

public class InstanceURLs   {
  @JsonProperty("streaming_api")
  private String streamingApi = null;

  public InstanceURLs streamingApi(String streamingApi) {
    this.streamingApi = streamingApi;
    return this;
  }

  /**
   * Websockets address for status and notification streaming.
   * @return streamingApi
  **/
  @Schema(example = "wss://example.org", description = "Websockets address for status and notification streaming.")

  public String getStreamingApi() {
    return streamingApi;
  }

  public void setStreamingApi(String streamingApi) {
    this.streamingApi = streamingApi;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceURLs instanceURLs = (InstanceURLs) o;
    return Objects.equals(this.streamingApi, instanceURLs.streamingApi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streamingApi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceURLs {\n");
    
    sb.append("    streamingApi: ").append(toIndentedString(streamingApi)).append("\n");
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
