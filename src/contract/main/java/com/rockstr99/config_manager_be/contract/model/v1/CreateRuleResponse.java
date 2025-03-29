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
 * CreateRuleResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-30T00:07:26.605778500+05:30[Asia/Calcutta]")
public class CreateRuleResponse   {

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("ruleName")
  private String ruleName;

  @JsonProperty("swagger")
  private String swagger;

  public CreateRuleResponse id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "10001", required = false)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CreateRuleResponse ruleName(String ruleName) {
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

  public CreateRuleResponse swagger(String swagger) {
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
    CreateRuleResponse createRuleResponse = (CreateRuleResponse) o;
    return Objects.equals(this.id, createRuleResponse.id) &&
        Objects.equals(this.ruleName, createRuleResponse.ruleName) &&
        Objects.equals(this.swagger, createRuleResponse.swagger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ruleName, swagger);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRuleResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

