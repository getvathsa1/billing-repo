package com.api.billing.model;

import java.util.Objects;
import com.api.billing.model.Payee;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PayeeList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T10:06:25.149+08:00")

public class PayeeList   {
  @JsonProperty("payees")
  private List<Payee> payees = null;

  public PayeeList payees(List<Payee> payees) {
    this.payees = payees;
    return this;
  }

  public PayeeList addPayeesItem(Payee payeesItem) {
    if (this.payees == null) {
      this.payees = new ArrayList<Payee>();
    }
    this.payees.add(payeesItem);
    return this;
  }

   /**
   * Get payees
   * @return payees
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Payee> getPayees() {
    return payees;
  }

  public void setPayees(List<Payee> payees) {
    this.payees = payees;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayeeList payeeList = (PayeeList) o;
    return Objects.equals(this.payees, payeeList.payees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayeeList {\n");
    
    sb.append("    payees: ").append(toIndentedString(payees)).append("\n");
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

