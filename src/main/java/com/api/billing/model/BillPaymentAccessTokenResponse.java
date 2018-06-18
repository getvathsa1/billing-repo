package com.api.billing.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Bill Payment access token response resource.
 */
@ApiModel(description = "Bill Payment access token response resource.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T10:06:25.149+08:00")

public class BillPaymentAccessTokenResponse   {
  @JsonProperty("accessToken")
  private String accessToken = null;

  public BillPaymentAccessTokenResponse accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Token for accessing external bill payment system.
   * @return accessToken
  **/
  @ApiModelProperty(required = true, value = "Token for accessing external bill payment system.")
  @NotNull


  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillPaymentAccessTokenResponse billPaymentAccessTokenResponse = (BillPaymentAccessTokenResponse) o;
    return Objects.equals(this.accessToken, billPaymentAccessTokenResponse.accessToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillPaymentAccessTokenResponse {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
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

