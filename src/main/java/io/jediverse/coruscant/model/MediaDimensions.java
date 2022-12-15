package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;

/**
 * MediaDimensions
 */
@Validated

public class MediaDimensions   {
  @JsonProperty("aspect")
  private Float aspect = null;

  @JsonProperty("bitrate")
  private Long bitrate = null;

  @JsonProperty("duration")
  private Float duration = null;

  @JsonProperty("frame_rate")
  private String frameRate = null;

  @JsonProperty("height")
  private Long height = null;

  @JsonProperty("size")
  private String size = null;

  @JsonProperty("width")
  private Long width = null;

  public MediaDimensions aspect(Float aspect) {
    this.aspect = aspect;
    return this;
  }

  /**
   * Aspect ratio of the media. Equal to width / height.
   * @return aspect
  **/
  @Schema(example = "1.7777778", description = "Aspect ratio of the media. Equal to width / height.")

  public Float getAspect() {
    return aspect;
  }

  public void setAspect(Float aspect) {
    this.aspect = aspect;
  }

  public MediaDimensions bitrate(Long bitrate) {
    this.bitrate = bitrate;
    return this;
  }

  /**
   * Bitrate of the media in bits per second.
   * @return bitrate
  **/
  @Schema(example = "1000000", description = "Bitrate of the media in bits per second.")

  public Long getBitrate() {
    return bitrate;
  }

  public void setBitrate(Long bitrate) {
    this.bitrate = bitrate;
  }

  public MediaDimensions duration(Float duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Duration of the media in seconds. Only set for video and audio.
   * @return duration
  **/
  @Schema(example = "5.43", description = "Duration of the media in seconds. Only set for video and audio.")

  public Float getDuration() {
    return duration;
  }

  public void setDuration(Float duration) {
    this.duration = duration;
  }

  public MediaDimensions frameRate(String frameRate) {
    this.frameRate = frameRate;
    return this;
  }

  /**
   * Framerate of the media. Only set for video and gifs.
   * @return frameRate
  **/
  @Schema(example = "30", description = "Framerate of the media. Only set for video and gifs.")

  public String getFrameRate() {
    return frameRate;
  }

  public void setFrameRate(String frameRate) {
    this.frameRate = frameRate;
  }

  public MediaDimensions height(Long height) {
    this.height = height;
    return this;
  }

  /**
   * Height of the media in pixels. Not set for audio.
   * @return height
  **/
  @Schema(example = "1080", description = "Height of the media in pixels. Not set for audio.")

  public Long getHeight() {
    return height;
  }

  public void setHeight(Long height) {
    this.height = height;
  }

  public MediaDimensions size(String size) {
    this.size = size;
    return this;
  }

  /**
   * Size of the media, in the format `[width]x[height]`. Not set for audio.
   * @return size
  **/
  @Schema(example = "1920x1080", description = "Size of the media, in the format `[width]x[height]`. Not set for audio.")

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public MediaDimensions width(Long width) {
    this.width = width;
    return this;
  }

  /**
   * Width of the media in pixels. Not set for audio.
   * @return width
  **/
  @Schema(example = "1920", description = "Width of the media in pixels. Not set for audio.")

  public Long getWidth() {
    return width;
  }

  public void setWidth(Long width) {
    this.width = width;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaDimensions mediaDimensions = (MediaDimensions) o;
    return Objects.equals(this.aspect, mediaDimensions.aspect) &&
        Objects.equals(this.bitrate, mediaDimensions.bitrate) &&
        Objects.equals(this.duration, mediaDimensions.duration) &&
        Objects.equals(this.frameRate, mediaDimensions.frameRate) &&
        Objects.equals(this.height, mediaDimensions.height) &&
        Objects.equals(this.size, mediaDimensions.size) &&
        Objects.equals(this.width, mediaDimensions.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aspect, bitrate, duration, frameRate, height, size, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaDimensions {\n");
    
    sb.append("    aspect: ").append(toIndentedString(aspect)).append("\n");
    sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    frameRate: ").append(toIndentedString(frameRate)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
