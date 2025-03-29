package com.rockstr99.config_manager_be.contract.model.v1;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateRuleRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-30T00:07:26.605778500+05:30[Asia/Calcutta]")
public class CreateRuleRequest   {

  @JsonProperty("ruleName")
  private String ruleName;

  @JsonProperty("swagger")
  private String swagger;

  public CreateRuleRequest ruleName(String ruleName) {
    this.ruleName = ruleName;
    return this;
  }

  /**
   * Get ruleName
   * @return ruleName
  */
  
  @Schema(name = "ruleName", example = "generateJSON", required = false)
  public String getRuleName() {
    return ruleName;
  }

  public void setRuleName(String ruleName) {
    this.ruleName = ruleName;
  }

  public CreateRuleRequest swagger(String swagger) {
    this.swagger = swagger;
    return this;
  }

  /**
   * Get swagger
   * @return swagger
  */
  
  @Schema(name = "swagger", example = "swagger example", required = false)
  public String getSwagger() {
    return swagger;
  }

  public void setSwagger(String swagger) {
    this.swagger = swagger;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRuleRequest createRuleRequest = (CreateRuleRequest) o;
    return Objects.equals(this.ruleName, createRuleRequest.ruleName) &&
        Objects.equals(this.swagger, createRuleRequest.swagger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleName, swagger);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRuleRequest {\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    swagger: ").append(toIndentedString(swagger)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

