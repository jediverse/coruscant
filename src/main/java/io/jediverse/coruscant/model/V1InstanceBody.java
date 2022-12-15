package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.File;
import io.micronaut.validation.Validated;
import javax.validation.Valid;

/**
 * V1InstanceBody
 */
@Validated

public class V1InstanceBody   {
  @JsonProperty("title")
  private String title = null;

  @JsonProperty("contact_username")
  private String contactUsername = null;

  @JsonProperty("contact_email")
  private String contactEmail = null;

  @JsonProperty("short_description")
  private String shortDescription = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("terms")
  private String terms = null;

  @JsonProperty("thumbnail")
  private File thumbnail = null;

  @JsonProperty("thumbnail_description")
  private String thumbnailDescription = null;

  @JsonProperty("header")
  private File header = null;

  public V1InstanceBody title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title to use for the instance.
   * @return title
  **/
  @Schema(description = "Title to use for the instance.")

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public V1InstanceBody contactUsername(String contactUsername) {
    this.contactUsername = contactUsername;
    return this;
  }

  /**
   * Username of the contact account. This must be the username of an instance admin.
   * @return contactUsername
  **/
  @Schema(description = "Username of the contact account. This must be the username of an instance admin.")

  public String getContactUsername() {
    return contactUsername;
  }

  public void setContactUsername(String contactUsername) {
    this.contactUsername = contactUsername;
  }

  public V1InstanceBody contactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
    return this;
  }

  /**
   * Email address to use as the instance contact.
   * @return contactEmail
  **/
  @Schema(description = "Email address to use as the instance contact.")

  public String getContactEmail() {
    return contactEmail;
  }

  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

  public V1InstanceBody shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

  /**
   * Short description of the instance.
   * @return shortDescription
  **/
  @Schema(description = "Short description of the instance.")

  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public V1InstanceBody description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Longer description of the instance.
   * @return description
  **/
  @Schema(description = "Longer description of the instance.")

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public V1InstanceBody terms(String terms) {
    this.terms = terms;
    return this;
  }

  /**
   * Terms and conditions of the instance.
   * @return terms
  **/
  @Schema(description = "Terms and conditions of the instance.")

  public String getTerms() {
    return terms;
  }

  public void setTerms(String terms) {
    this.terms = terms;
  }

  public V1InstanceBody thumbnail(File thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

  /**
   * Thumbnail image to use for the instance.
   * @return thumbnail
  **/
  @Schema(description = "Thumbnail image to use for the instance.")

  @Valid
  public File getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(File thumbnail) {
    this.thumbnail = thumbnail;
  }

  public V1InstanceBody thumbnailDescription(String thumbnailDescription) {
    this.thumbnailDescription = thumbnailDescription;
    return this;
  }

  /**
   * Image description of the submitted instance thumbnail.
   * @return thumbnailDescription
  **/
  @Schema(description = "Image description of the submitted instance thumbnail.")

  public String getThumbnailDescription() {
    return thumbnailDescription;
  }

  public void setThumbnailDescription(String thumbnailDescription) {
    this.thumbnailDescription = thumbnailDescription;
  }

  public V1InstanceBody header(File header) {
    this.header = header;
    return this;
  }

  /**
   * Header image to use for the instance.
   * @return header
  **/
  @Schema(description = "Header image to use for the instance.")

  @Valid
  public File getHeader() {
    return header;
  }

  public void setHeader(File header) {
    this.header = header;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1InstanceBody v1InstanceBody = (V1InstanceBody) o;
    return Objects.equals(this.title, v1InstanceBody.title) &&
        Objects.equals(this.contactUsername, v1InstanceBody.contactUsername) &&
        Objects.equals(this.contactEmail, v1InstanceBody.contactEmail) &&
        Objects.equals(this.shortDescription, v1InstanceBody.shortDescription) &&
        Objects.equals(this.description, v1InstanceBody.description) &&
        Objects.equals(this.terms, v1InstanceBody.terms) &&
        Objects.equals(this.thumbnail, v1InstanceBody.thumbnail) &&
        Objects.equals(this.thumbnailDescription, v1InstanceBody.thumbnailDescription) &&
        Objects.equals(this.header, v1InstanceBody.header);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, contactUsername, contactEmail, shortDescription, description, terms, thumbnail, thumbnailDescription, header);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1InstanceBody {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    contactUsername: ").append(toIndentedString(contactUsername)).append("\n");
    sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    thumbnailDescription: ").append(toIndentedString(thumbnailDescription)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
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
