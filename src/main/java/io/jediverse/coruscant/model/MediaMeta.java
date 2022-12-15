package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;
import javax.validation.Valid;

/**
 * This can be metadata about an image, an audio file, video, etc.
 */
@Schema(description = "This can be metadata about an image, an audio file, video, etc.")
@Validated

public class MediaMeta   {
  @JsonProperty("aspect")
  private Float aspect = null;

  @JsonProperty("audio_bitrate")
  private String audioBitrate = null;

  @JsonProperty("audio_channels")
  private String audioChannels = null;

  @JsonProperty("audio_encode")
  private String audioEncode = null;

  @JsonProperty("duration")
  private Float duration = null;

  @JsonProperty("focus")
  private MediaFocus focus = null;

  @JsonProperty("fps")
  private Integer fps = null;

  @JsonProperty("height")
  private Long height = null;

  @JsonProperty("length")
  private String length = null;

  @JsonProperty("original")
  private MediaDimensions original = null;

  @JsonProperty("size")
  private String size = null;

  @JsonProperty("small")
  private MediaDimensions small = null;

  @JsonProperty("width")
  private Long width = null;

  public MediaMeta aspect(Float aspect) {
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

  public MediaMeta audioBitrate(String audioBitrate) {
    this.audioBitrate = audioBitrate;
    return this;
  }

  /**
   * Get audioBitrate
   * @return audioBitrate
  **/
  @Schema(description = "")

  public String getAudioBitrate() {
    return audioBitrate;
  }

  public void setAudioBitrate(String audioBitrate) {
    this.audioBitrate = audioBitrate;
  }

  public MediaMeta audioChannels(String audioChannels) {
    this.audioChannels = audioChannels;
    return this;
  }

  /**
   * Get audioChannels
   * @return audioChannels
  **/
  @Schema(description = "")

  public String getAudioChannels() {
    return audioChannels;
  }

  public void setAudioChannels(String audioChannels) {
    this.audioChannels = audioChannels;
  }

  public MediaMeta audioEncode(String audioEncode) {
    this.audioEncode = audioEncode;
    return this;
  }

  /**
   * Get audioEncode
   * @return audioEncode
  **/
  @Schema(description = "")

  public String getAudioEncode() {
    return audioEncode;
  }

  public void setAudioEncode(String audioEncode) {
    this.audioEncode = audioEncode;
  }

  public MediaMeta duration(Float duration) {
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

  public MediaMeta focus(MediaFocus focus) {
    this.focus = focus;
    return this;
  }

  /**
   * Get focus
   * @return focus
  **/
  @Schema(description = "")

  @Valid
  public MediaFocus getFocus() {
    return focus;
  }

  public void setFocus(MediaFocus focus) {
    this.focus = focus;
  }

  public MediaMeta fps(Integer fps) {
    this.fps = fps;
    return this;
  }

  /**
   * Framerate of the media. Only set for video and gifs.
   * @return fps
  **/
  @Schema(example = "30", description = "Framerate of the media. Only set for video and gifs.")

  public Integer getFps() {
    return fps;
  }

  public void setFps(Integer fps) {
    this.fps = fps;
  }

  public MediaMeta height(Long height) {
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

  public MediaMeta length(String length) {
    this.length = length;
    return this;
  }

  /**
   * Get length
   * @return length
  **/
  @Schema(description = "")

  public String getLength() {
    return length;
  }

  public void setLength(String length) {
    this.length = length;
  }

  public MediaMeta original(MediaDimensions original) {
    this.original = original;
    return this;
  }

  /**
   * Get original
   * @return original
  **/
  @Schema(description = "")

  @Valid
  public MediaDimensions getOriginal() {
    return original;
  }

  public void setOriginal(MediaDimensions original) {
    this.original = original;
  }

  public MediaMeta size(String size) {
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

  public MediaMeta small(MediaDimensions small) {
    this.small = small;
    return this;
  }

  /**
   * Get small
   * @return small
  **/
  @Schema(description = "")

  @Valid
  public MediaDimensions getSmall() {
    return small;
  }

  public void setSmall(MediaDimensions small) {
    this.small = small;
  }

  public MediaMeta width(Long width) {
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
    MediaMeta mediaMeta = (MediaMeta) o;
    return Objects.equals(this.aspect, mediaMeta.aspect) &&
        Objects.equals(this.audioBitrate, mediaMeta.audioBitrate) &&
        Objects.equals(this.audioChannels, mediaMeta.audioChannels) &&
        Objects.equals(this.audioEncode, mediaMeta.audioEncode) &&
        Objects.equals(this.duration, mediaMeta.duration) &&
        Objects.equals(this.focus, mediaMeta.focus) &&
        Objects.equals(this.fps, mediaMeta.fps) &&
        Objects.equals(this.height, mediaMeta.height) &&
        Objects.equals(this.length, mediaMeta.length) &&
        Objects.equals(this.original, mediaMeta.original) &&
        Objects.equals(this.size, mediaMeta.size) &&
        Objects.equals(this.small, mediaMeta.small) &&
        Objects.equals(this.width, mediaMeta.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aspect, audioBitrate, audioChannels, audioEncode, duration, focus, fps, height, length, original, size, small, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaMeta {\n");
    
    sb.append("    aspect: ").append(toIndentedString(aspect)).append("\n");
    sb.append("    audioBitrate: ").append(toIndentedString(audioBitrate)).append("\n");
    sb.append("    audioChannels: ").append(toIndentedString(audioChannels)).append("\n");
    sb.append("    audioEncode: ").append(toIndentedString(audioEncode)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    focus: ").append(toIndentedString(focus)).append("\n");
    sb.append("    fps: ").append(toIndentedString(fps)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    original: ").append(toIndentedString(original)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    small: ").append(toIndentedString(small)).append("\n");
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
