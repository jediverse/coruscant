package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import io.micronaut.validation.Validated;
import javax.validation.Valid;

/**
 * InstanceConfigurationMediaAttachments
 */
@Validated

public class InstanceConfigurationMediaAttachments   {
  @JsonProperty("image_matrix_limit")
  private Long imageMatrixLimit = null;

  @JsonProperty("image_size_limit")
  private Long imageSizeLimit = null;

  @JsonProperty("supported_mime_types")
  @Valid
  private List<String> supportedMimeTypes = null;

  @JsonProperty("video_frame_rate_limit")
  private Long videoFrameRateLimit = null;

  @JsonProperty("video_matrix_limit")
  private Long videoMatrixLimit = null;

  @JsonProperty("video_size_limit")
  private Long videoSizeLimit = null;

  public InstanceConfigurationMediaAttachments imageMatrixLimit(Long imageMatrixLimit) {
    this.imageMatrixLimit = imageMatrixLimit;
    return this;
  }

  /**
   * Max allowed image size in pixels as height*width.  GtS doesn't set a limit on this, but for compatibility we give Mastodon's 4096x4096px value here.
   * @return imageMatrixLimit
  **/
  @Schema(example = "16777216", description = "Max allowed image size in pixels as height*width.  GtS doesn't set a limit on this, but for compatibility we give Mastodon's 4096x4096px value here.")

  public Long getImageMatrixLimit() {
    return imageMatrixLimit;
  }

  public void setImageMatrixLimit(Long imageMatrixLimit) {
    this.imageMatrixLimit = imageMatrixLimit;
  }

  public InstanceConfigurationMediaAttachments imageSizeLimit(Long imageSizeLimit) {
    this.imageSizeLimit = imageSizeLimit;
    return this;
  }

  /**
   * Max allowed image size in bytes
   * @return imageSizeLimit
  **/
  @Schema(example = "2097152", description = "Max allowed image size in bytes")

  public Long getImageSizeLimit() {
    return imageSizeLimit;
  }

  public void setImageSizeLimit(Long imageSizeLimit) {
    this.imageSizeLimit = imageSizeLimit;
  }

  public InstanceConfigurationMediaAttachments supportedMimeTypes(List<String> supportedMimeTypes) {
    this.supportedMimeTypes = supportedMimeTypes;
    return this;
  }

  public InstanceConfigurationMediaAttachments addSupportedMimeTypesItem(String supportedMimeTypesItem) {
    if (this.supportedMimeTypes == null) {
      this.supportedMimeTypes = new ArrayList<String>();
    }
    this.supportedMimeTypes.add(supportedMimeTypesItem);
    return this;
  }

  /**
   * List of mime types that it's possible to upload to this instance.
   * @return supportedMimeTypes
  **/
  @Schema(example = "[\"image/jpeg\",\"image/gif\"]", description = "List of mime types that it's possible to upload to this instance.")

  public List<String> getSupportedMimeTypes() {
    return supportedMimeTypes;
  }

  public void setSupportedMimeTypes(List<String> supportedMimeTypes) {
    this.supportedMimeTypes = supportedMimeTypes;
  }

  public InstanceConfigurationMediaAttachments videoFrameRateLimit(Long videoFrameRateLimit) {
    this.videoFrameRateLimit = videoFrameRateLimit;
    return this;
  }

  /**
   * Max allowed video frame rate.
   * @return videoFrameRateLimit
  **/
  @Schema(example = "60", description = "Max allowed video frame rate.")

  public Long getVideoFrameRateLimit() {
    return videoFrameRateLimit;
  }

  public void setVideoFrameRateLimit(Long videoFrameRateLimit) {
    this.videoFrameRateLimit = videoFrameRateLimit;
  }

  public InstanceConfigurationMediaAttachments videoMatrixLimit(Long videoMatrixLimit) {
    this.videoMatrixLimit = videoMatrixLimit;
    return this;
  }

  /**
   * Max allowed video size in pixels as height*width.  GtS doesn't set a limit on this, but for compatibility we give Mastodon's 4096x4096px value here.
   * @return videoMatrixLimit
  **/
  @Schema(example = "16777216", description = "Max allowed video size in pixels as height*width.  GtS doesn't set a limit on this, but for compatibility we give Mastodon's 4096x4096px value here.")

  public Long getVideoMatrixLimit() {
    return videoMatrixLimit;
  }

  public void setVideoMatrixLimit(Long videoMatrixLimit) {
    this.videoMatrixLimit = videoMatrixLimit;
  }

  public InstanceConfigurationMediaAttachments videoSizeLimit(Long videoSizeLimit) {
    this.videoSizeLimit = videoSizeLimit;
    return this;
  }

  /**
   * Max allowed video size in bytes
   * @return videoSizeLimit
  **/
  @Schema(example = "10485760", description = "Max allowed video size in bytes")

  public Long getVideoSizeLimit() {
    return videoSizeLimit;
  }

  public void setVideoSizeLimit(Long videoSizeLimit) {
    this.videoSizeLimit = videoSizeLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceConfigurationMediaAttachments instanceConfigurationMediaAttachments = (InstanceConfigurationMediaAttachments) o;
    return Objects.equals(this.imageMatrixLimit, instanceConfigurationMediaAttachments.imageMatrixLimit) &&
        Objects.equals(this.imageSizeLimit, instanceConfigurationMediaAttachments.imageSizeLimit) &&
        Objects.equals(this.supportedMimeTypes, instanceConfigurationMediaAttachments.supportedMimeTypes) &&
        Objects.equals(this.videoFrameRateLimit, instanceConfigurationMediaAttachments.videoFrameRateLimit) &&
        Objects.equals(this.videoMatrixLimit, instanceConfigurationMediaAttachments.videoMatrixLimit) &&
        Objects.equals(this.videoSizeLimit, instanceConfigurationMediaAttachments.videoSizeLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageMatrixLimit, imageSizeLimit, supportedMimeTypes, videoFrameRateLimit, videoMatrixLimit, videoSizeLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceConfigurationMediaAttachments {\n");
    
    sb.append("    imageMatrixLimit: ").append(toIndentedString(imageMatrixLimit)).append("\n");
    sb.append("    imageSizeLimit: ").append(toIndentedString(imageSizeLimit)).append("\n");
    sb.append("    supportedMimeTypes: ").append(toIndentedString(supportedMimeTypes)).append("\n");
    sb.append("    videoFrameRateLimit: ").append(toIndentedString(videoFrameRateLimit)).append("\n");
    sb.append("    videoMatrixLimit: ").append(toIndentedString(videoMatrixLimit)).append("\n");
    sb.append("    videoSizeLimit: ").append(toIndentedString(videoSizeLimit)).append("\n");
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
