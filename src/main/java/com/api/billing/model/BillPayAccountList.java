package com.api.billing.model;

import java.util.Objects;
import com.api.billing.model.BillPayAccount;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BillPayAccountList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-18T10:06:25.149+08:00")

public class BillPayAccountList   {
  @JsonProperty("billPayAccounts")
  private List<BillPayAccount> billPayAccounts = null;

  public BillPayAccountList billPayAccounts(List<BillPayAccount> billPayAccounts) {
    this.billPayAccounts = billPayAccounts;
    return this;
  }

  public BillPayAccountList addBillPayAccountsItem(BillPayAccount billPayAccountsItem) {
    if (this.billPayAccounts == null) {
      this.billPayAccounts = new ArrayList<BillPayAccount>();
    }
    this.billPayAccounts.add(billPayAccountsItem);
    return this;
  }

   /**
   * Get billPayAccounts
   * @return billPayAccounts
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<BillPayAccount> getBillPayAccounts() {
    return billPayAccounts;
  }

  public void setBillPayAccounts(List<BillPayAccount> billPayAccounts) {
    this.billPayAccounts = billPayAccounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillPayAccountList billPayAccountList = (BillPayAccountList) o;
    return Objects.equals(this.billPayAccounts, billPayAccountList.billPayAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billPayAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillPayAccountList {\n");
    
    sb.append("    billPayAccounts: ").append(toIndentedString(billPayAccounts)).append("\n");
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

