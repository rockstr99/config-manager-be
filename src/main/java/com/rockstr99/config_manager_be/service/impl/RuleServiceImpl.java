package com.rockstr99.config_manager_be.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rockstr99.config_manager_be.model.Rule;
import com.rockstr99.config_manager_be.service.RedisService;
import com.rockstr99.config_manager_be.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class RuleServiceImpl implements RuleService {

    @Autowired
    RedisService redisService;

    private static final ObjectMapper mapper = new ObjectMapper();

    @Override
    public Optional<Rule> getRule(String ruleName) {
        return Optional.ofNullable(redisService.get(ruleName, Rule.class));
    }

    @Override
    public void setRule(Rule rule) throws Exception {
         try{
             redisService.set(rule.getRuleName(), rule );
         } catch (Exception e) {
             throw new Exception(":::UNABLE TO SAVE VALUE IN REDIS:::");
         }
    }
}
