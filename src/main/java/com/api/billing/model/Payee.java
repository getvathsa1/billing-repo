package com.api.billing.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Payee
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T10:06:25.149+08:00")

public class Payee   {
  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("displayPayeeAccountNumber")
  private String displayPayeeAccountNumber = null;

  @JsonProperty("earliestPaymentDate")
  private String earliestPaymentDate = null;

  @JsonProperty("latestPaymentDate")
  private String latestPaymentDate = null;

  @JsonProperty("nonElectronicPayment")
  private Boolean nonElectronicPayment = null;

  @JsonProperty("payeeId")
  private String payeeId = null;

  public Payee displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name of the payee account
   * @return displayName
  **/
  @ApiModelProperty(required = true, value = "Display name of the payee account")
  @NotNull


  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Payee displayPayeeAccountNumber(String displayPayeeAccountNumber) {
    this.displayPayeeAccountNumber = displayPayeeAccountNumber;
    return this;
  }

   /**
   * Account number of the payee displayed in UI. Masked in the form of (x plus last 4 digits),
   * @return displayPayeeAccountNumber
  **/
  @ApiModelProperty(value = "Account number of the payee displayed in UI. Masked in the form of (x plus last 4 digits),")


  public String getDisplayPayeeAccountNumber() {
    return displayPayeeAccountNumber;
  }

  public void setDisplayPayeeAccountNumber(String displayPayeeAccountNumber) {
    this.displayPayeeAccountNumber = displayPayeeAccountNumber;
  }

  public Payee earliestPaymentDate(String earliestPaymentDate) {
    this.earliestPaymentDate = earliestPaymentDate;
    return this;
  }

   /**
   * Earliest Payment date for the payee
   * @return earliestPaymentDate
  **/
  @ApiModelProperty(required = true, value = "Earliest Payment date for the payee")
  @NotNull


  public String getEarliestPaymentDate() {
    return earliestPaymentDate;
  }

  public void setEarliestPaymentDate(String earliestPaymentDate) {
    this.earliestPaymentDate = earliestPaymentDate;
  }

  public Payee latestPaymentDate(String latestPaymentDate) {
    this.latestPaymentDate = latestPaymentDate;
    return this;
  }

   /**
   * Get latestPaymentDate
   * @return latestPaymentDate
  **/
  @ApiModelProperty(value = "")


  public String getLatestPaymentDate() {
    return latestPaymentDate;
  }

  public void setLatestPaymentDate(String latestPaymentDate) {
    this.latestPaymentDate = latestPaymentDate;
  }

  public Payee nonElectronicPayment(Boolean nonElectronicPayment) {
    this.nonElectronicPayment = nonElectronicPayment;
    return this;
  }

   /**
   * Get nonElectronicPayment
   * @return nonElectronicPayment
  **/
  @ApiModelProperty(value = "")


  public Boolean getNonElectronicPayment() {
    return nonElectronicPayment;
  }

  public void setNonElectronicPayment(Boolean nonElectronicPayment) {
    this.nonElectronicPayment = nonElectronicPayment;
  }

  public Payee payeeId(String payeeId) {
    this.payeeId = payeeId;
    return this;
  }

   /**
   * Id of the payee account
   * @return payeeId
  **/
  @ApiModelProperty(required = true, value = "Id of the payee account")
  @NotNull


  public String getPayeeId() {
    return payeeId;
  }

  public void setPayeeId(String payeeId) {
    this.payeeId = payeeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payee payee = (Payee) o;
    return Objects.equals(this.displayName, payee.displayName) &&
        Objects.equals(this.displayPayeeAccountNumber, payee.displayPayeeAccountNumber) &&
        Objects.equals(this.earliestPaymentDate, payee.earliestPaymentDate) &&
        Objects.equals(this.latestPaymentDate, payee.latestPaymentDate) &&
        Objects.equals(this.nonElectronicPayment, payee.nonElectronicPayment) &&
        Objects.equals(this.payeeId, payee.payeeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, displayPayeeAccountNumber, earliestPaymentDate, latestPaymentDate, nonElectronicPayment, payeeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payee {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    displayPayeeAccountNumber: ").append(toIndentedString(displayPayeeAccountNumber)).append("\n");
    sb.append("    earliestPaymentDate: ").append(toIndentedString(earliestPaymentDate)).append("\n");
    sb.append("    latestPaymentDate: ").append(toIndentedString(latestPaymentDate)).append("\n");
    sb.append("    nonElectronicPayment: ").append(toIndentedString(nonElectronicPayment)).append("\n");
    sb.append("    payeeId: ").append(toIndentedString(payeeId)).append("\n");
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

