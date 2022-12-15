package io.jediverse.coruscant.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import io.micronaut.validation.Validated;

import javax.validation.constraints.*;

/**
 * UserPasswordChangeBody2
 */
@Validated

public class UserPasswordChangeBody2   {
  @JsonProperty("old_password")
  private String oldPassword = null;

  @JsonProperty("new_password")
  private String newPassword = null;

  public UserPasswordChangeBody2 oldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
    return this;
  }

  /**
   * User's previous password.
   * @return oldPassword
  **/
  @Schema(required = true, description = "User's previous password.")
  @NotNull

  public String getOldPassword() {
    return oldPassword;
  }

  public void setOldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
  }

  public UserPasswordChangeBody2 newPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

  /**
   * Desired new password. If the password does not have high enough entropy, it will be rejected. See https://github.com/wagslane/go-password-validator
   * @return newPassword
  **/
  @Schema(required = true, description = "Desired new password. If the password does not have high enough entropy, it will be rejected. See https://github.com/wagslane/go-password-validator")
  @NotNull

  public String getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPasswordChangeBody2 userPasswordChangeBody2 = (UserPasswordChangeBody2) o;
    return Objects.equals(this.oldPassword, userPasswordChangeBody2.oldPassword) &&
        Objects.equals(this.newPassword, userPasswordChangeBody2.newPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oldPassword, newPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPasswordChangeBody2 {\n");
    
    sb.append("    oldPassword: ").append(toIndentedString(oldPassword)).append("\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
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
