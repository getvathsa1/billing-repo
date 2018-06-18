package com.api.billing.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BillPayAccount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T10:06:25.149+08:00")

public class BillPayAccount   {
  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("accountSubType")
  private String accountSubType = null;

  @JsonProperty("accountType")
  private String accountType = null;

  public BillPayAccount accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Unique account identifier
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "Unique account identifier")
  @NotNull


  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public BillPayAccount accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @ApiModelProperty(value = "")


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public BillPayAccount accountSubType(String accountSubType) {
    this.accountSubType = accountSubType;
    return this;
  }

   /**
   * The account sub-type
   * @return accountSubType
  **/
  @ApiModelProperty(required = true, value = "The account sub-type")
  @NotNull


  public String getAccountSubType() {
    return accountSubType;
  }

  public void setAccountSubType(String accountSubType) {
    this.accountSubType = accountSubType;
  }

  public BillPayAccount accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * The account type
   * @return accountType
  **/
  @ApiModelProperty(required = true, value = "The account type")
  @NotNull


  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillPayAccount billPayAccount = (BillPayAccount) o;
    return Objects.equals(this.accountId, billPayAccount.accountId) &&
        Objects.equals(this.accountNumber, billPayAccount.accountNumber) &&
        Objects.equals(this.accountSubType, billPayAccount.accountSubType) &&
        Objects.equals(this.accountType, billPayAccount.accountType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountNumber, accountSubType, accountType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillPayAccount {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountSubType: ").append(toIndentedString(accountSubType)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
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

