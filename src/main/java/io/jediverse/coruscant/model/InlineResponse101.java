package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import io.micronaut.validation.Validated;
import javax.validation.Valid;

/**
 * InlineResponse101
 */
@Validated

public class InlineResponse101   {
  /**
   * The type of event being received.  `update`: a new status has been received. `notification`: a new notification has been received. `delete`: a status has been deleted. `filters_changed`: not implemented.
   */
  public enum EventEnum {
    UPDATE("update"),
    
    NOTIFICATION("notification"),
    
    DELETE("delete"),
    
    FILTERS_CHANGED("filters_changed");

    private String value;

    EventEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EventEnum fromValue(String text) {
      for (EventEnum b : EventEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("event")
  private EventEnum event = null;

  @JsonProperty("payload")
  private String payload = null;

  /**
   * Gets or Sets stream
   */
  public enum StreamEnum {
    USER("user"),
    
    PUBLIC("public"),
    
    PUBLIC_LOCAL("public:local"),
    
    HASHTAG("hashtag"),
    
    HASHTAG_LOCAL("hashtag:local"),
    
    LIST("list"),
    
    DIRECT("direct");

    private String value;

    StreamEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StreamEnum fromValue(String text) {
      for (StreamEnum b : StreamEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("stream")
  @Valid
  private List<StreamEnum> stream = null;

  public InlineResponse101 event(EventEnum event) {
    this.event = event;
    return this;
  }

  /**
   * The type of event being received.  `update`: a new status has been received. `notification`: a new notification has been received. `delete`: a status has been deleted. `filters_changed`: not implemented.
   * @return event
  **/
  @Schema(description = "The type of event being received.  `update`: a new status has been received. `notification`: a new notification has been received. `delete`: a status has been deleted. `filters_changed`: not implemented.")

  public EventEnum getEvent() {
    return event;
  }

  public void setEvent(EventEnum event) {
    this.event = event;
  }

  public InlineResponse101 payload(String payload) {
    this.payload = payload;
    return this;
  }

  /**
   * The payload of the streamed message. Different depending on the `event` type.  If present, it should be parsed as a string.  If `event` = `update`, then the payload will be a JSON string of a status. If `event` = `notification`, then the payload will be a JSON string of a notification. If `event` = `delete`, then the payload will be a status ID.
   * @return payload
  **/
  @Schema(example = "{\"id\":\"01FC3TZ5CFG6H65GCKCJRKA669\",\"created_at\":\"2021-08-02T16:25:52Z\",\"sensitive\":false,\"spoiler_text\":\"\",\"visibility\":\"public\",\"language\":\"en\",\"uri\":\"https://gts.superseriousbusiness.org/users/dumpsterqueer/statuses/01FC3TZ5CFG6H65GCKCJRKA669\",\"url\":\"https://gts.superseriousbusiness.org/@dumpsterqueer/statuses/01FC3TZ5CFG6H65GCKCJRKA669\",\"replies_count\":0,\"reblogs_count\":0,\"favourites_count\":0,\"favourited\":false,\"reblogged\":false,\"muted\":false,\"bookmarked\":fals…//gts.superseriousbusiness.org/fileserver/01JNN207W98SGG3CBJ76R5MVDN/header/original/019036W043D8FXPJKSKCX7G965.png\",\"header_static\":\"https://gts.superseriousbusiness.org/fileserver/01JNN207W98SGG3CBJ76R5MVDN/header/small/019036W043D8FXPJKSKCX7G965.png\",\"followers_count\":33,\"following_count\":28,\"statuses_count\":126,\"last_status_at\":\"2021-08-02T16:25:52Z\",\"emojis\":[],\"fields\":[]},\"media_attachments\":[],\"mentions\":[],\"tags\":[],\"emojis\":[],\"card\":null,\"poll\":null,\"text\":\"a\"}", description = "The payload of the streamed message. Different depending on the `event` type.  If present, it should be parsed as a string.  If `event` = `update`, then the payload will be a JSON string of a status. If `event` = `notification`, then the payload will be a JSON string of a notification. If `event` = `delete`, then the payload will be a status ID.")

  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }

  public InlineResponse101 stream(List<StreamEnum> stream) {
    this.stream = stream;
    return this;
  }

  public InlineResponse101 addStreamItem(StreamEnum streamItem) {
    if (this.stream == null) {
      this.stream = new ArrayList<StreamEnum>();
    }
    this.stream.add(streamItem);
    return this;
  }

  /**
   * Get stream
   * @return stream
  **/
  @Schema(description = "")

  public List<StreamEnum> getStream() {
    return stream;
  }

  public void setStream(List<StreamEnum> stream) {
    this.stream = stream;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse101 inlineResponse101 = (InlineResponse101) o;
    return Objects.equals(this.event, inlineResponse101.event) &&
        Objects.equals(this.payload, inlineResponse101.payload) &&
        Objects.equals(this.stream, inlineResponse101.stream);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, payload, stream);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse101 {\n");
    
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
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
