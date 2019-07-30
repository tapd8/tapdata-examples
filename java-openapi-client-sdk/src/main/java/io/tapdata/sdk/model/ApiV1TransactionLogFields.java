/*
 * Tapdata OpenAPI
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: moa-v1.1.0-117-g6b02a67
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.tapdata.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ApiV1TransactionLogFields
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-29T11:08:48.431+08:00[Asia/Shanghai]")
public class ApiV1TransactionLogFields {
  public static final String SERIALIZED_NAME_ID = "_id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Boolean id;

  public static final String SERIALIZED_NAME_C_U_S_T_O_M_E_R_I_D = "CUSTOMER_ID";
  @SerializedName(SERIALIZED_NAME_C_U_S_T_O_M_E_R_I_D)
  private Boolean CUSTOMER_ID;

  public static final String SERIALIZED_NAME_B_U_Y_T_I_M_E = "BUY_TIME";
  @SerializedName(SERIALIZED_NAME_B_U_Y_T_I_M_E)
  private Boolean BUY_TIME;

  public static final String SERIALIZED_NAME_A_M_O_U_N_T = "AMOUNT";
  @SerializedName(SERIALIZED_NAME_A_M_O_U_N_T)
  private Boolean AMOUNT;

  public static final String SERIALIZED_NAME_S_H_O_P = "SHOP";
  @SerializedName(SERIALIZED_NAME_S_H_O_P)
  private Boolean SHOP;

  public ApiV1TransactionLogFields id(Boolean id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Boolean getId() {
    return id;
  }

  public void setId(Boolean id) {
    this.id = id;
  }

  public ApiV1TransactionLogFields CUSTOMER_ID(Boolean CUSTOMER_ID) {
    this.CUSTOMER_ID = CUSTOMER_ID;
    return this;
  }

   /**
   * Get CUSTOMER_ID
   * @return CUSTOMER_ID
  **/
  @ApiModelProperty(value = "")
  public Boolean getCUSTOMERID() {
    return CUSTOMER_ID;
  }

  public void setCUSTOMERID(Boolean CUSTOMER_ID) {
    this.CUSTOMER_ID = CUSTOMER_ID;
  }

  public ApiV1TransactionLogFields BUY_TIME(Boolean BUY_TIME) {
    this.BUY_TIME = BUY_TIME;
    return this;
  }

   /**
   * Get BUY_TIME
   * @return BUY_TIME
  **/
  @ApiModelProperty(value = "")
  public Boolean getBUYTIME() {
    return BUY_TIME;
  }

  public void setBUYTIME(Boolean BUY_TIME) {
    this.BUY_TIME = BUY_TIME;
  }

  public ApiV1TransactionLogFields AMOUNT(Boolean AMOUNT) {
    this.AMOUNT = AMOUNT;
    return this;
  }

   /**
   * Get AMOUNT
   * @return AMOUNT
  **/
  @ApiModelProperty(value = "")
  public Boolean getAMOUNT() {
    return AMOUNT;
  }

  public void setAMOUNT(Boolean AMOUNT) {
    this.AMOUNT = AMOUNT;
  }

  public ApiV1TransactionLogFields SHOP(Boolean SHOP) {
    this.SHOP = SHOP;
    return this;
  }

   /**
   * Get SHOP
   * @return SHOP
  **/
  @ApiModelProperty(value = "")
  public Boolean getSHOP() {
    return SHOP;
  }

  public void setSHOP(Boolean SHOP) {
    this.SHOP = SHOP;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV1TransactionLogFields apiV1TransactionLogFields = (ApiV1TransactionLogFields) o;
    return Objects.equals(this.id, apiV1TransactionLogFields.id) &&
        Objects.equals(this.CUSTOMER_ID, apiV1TransactionLogFields.CUSTOMER_ID) &&
        Objects.equals(this.BUY_TIME, apiV1TransactionLogFields.BUY_TIME) &&
        Objects.equals(this.AMOUNT, apiV1TransactionLogFields.AMOUNT) &&
        Objects.equals(this.SHOP, apiV1TransactionLogFields.SHOP);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, CUSTOMER_ID, BUY_TIME, AMOUNT, SHOP);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV1TransactionLogFields {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    CUSTOMER_ID: ").append(toIndentedString(CUSTOMER_ID)).append("\n");
    sb.append("    BUY_TIME: ").append(toIndentedString(BUY_TIME)).append("\n");
    sb.append("    AMOUNT: ").append(toIndentedString(AMOUNT)).append("\n");
    sb.append("    SHOP: ").append(toIndentedString(SHOP)).append("\n");
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
