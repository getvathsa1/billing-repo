package com.api.billing.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SessionResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T10:06:25.149+08:00")

public class SessionResponse   {
  @JsonProperty("access_token")
  private String accessToken = null;

  @JsonProperty("expires_in")
  private Integer expiresIn = null;

  @JsonProperty("refresh_token")
  private String refreshToken = null;

  @JsonProperty("token_type")
  private String tokenType = null;

  public SessionResponse accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Get accessToken
   * @return accessToken
  **/
  @ApiModelProperty(value = "")


  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public SessionResponse expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * Get expiresIn
   * @return expiresIn
  **/
  @ApiModelProperty(value = "")


  public Integer getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  public SessionResponse refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * Get refreshToken
   * @return refreshToken
  **/
  @ApiModelProperty(value = "")


  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public SessionResponse tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

   /**
   * Get tokenType
   * @return tokenType
  **/
  @ApiModelProperty(value = "")


  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionResponse sessionResponse = (SessionResponse) o;
    return Objects.equals(this.accessToken, sessionResponse.accessToken) &&
        Objects.equals(this.expiresIn, sessionResponse.expiresIn) &&
        Objects.equals(this.refreshToken, sessionResponse.refreshToken) &&
        Objects.equals(this.tokenType, sessionResponse.tokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, expiresIn, refreshToken, tokenType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionResponse {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
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

