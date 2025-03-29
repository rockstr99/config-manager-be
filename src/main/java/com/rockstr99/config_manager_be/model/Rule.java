package com.rockstr99.config_manager_be.model;


public class Rule {
    String ruleName;
    String swagger;

    public Rule() {
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getSwagger() {
        return swagger;
    }

    public void setSwagger(String swagger) {
        this.swagger = swagger;
    }
}
