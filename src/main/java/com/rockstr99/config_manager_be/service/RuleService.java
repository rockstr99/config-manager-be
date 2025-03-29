package com.rockstr99.config_manager_be.service;

import com.rockstr99.config_manager_be.model.Rule;

import java.util.Optional;

public interface RuleService {
    public Optional<Rule> getRule(String ruleName);

    public void setRule(Rule rule) throws Exception;
}
