package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;

/**
 * InstanceConfigurationAccounts
 */
@Validated

public class InstanceConfigurationAccounts   {
  @JsonProperty("allow_custom_css")
  private Boolean allowCustomCss = null;

  public InstanceConfigurationAccounts allowCustomCss(Boolean allowCustomCss) {
    this.allowCustomCss = allowCustomCss;
    return this;
  }

  /**
   * Whether or not accounts on this instance are allowed to upload custom CSS for profiles and statuses.
   * @return allowCustomCss
  **/
  @Schema(example = "false", description = "Whether or not accounts on this instance are allowed to upload custom CSS for profiles and statuses.")

  public Boolean isAllowCustomCss() {
    return allowCustomCss;
  }

  public void setAllowCustomCss(Boolean allowCustomCss) {
    this.allowCustomCss = allowCustomCss;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceConfigurationAccounts instanceConfigurationAccounts = (InstanceConfigurationAccounts) o;
    return Objects.equals(this.allowCustomCss, instanceConfigurationAccounts.allowCustomCss);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowCustomCss);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceConfigurationAccounts {\n");
    
    sb.append("    allowCustomCss: ").append(toIndentedString(allowCustomCss)).append("\n");
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
