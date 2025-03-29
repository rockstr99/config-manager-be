package com.rockstr99.config_manager_be.controller;

import com.rockstr99.config_manager_be.contract.api.v1.RuleApi;
import com.rockstr99.config_manager_be.contract.model.v1.CreateRuleRequest;
import com.rockstr99.config_manager_be.contract.model.v1.CreateRuleResponse;
import com.rockstr99.config_manager_be.model.Rule;
import com.rockstr99.config_manager_be.service.RuleService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.function.Function;

public class RuleController implements RuleApi {

    @Autowired
    RuleService ruleService;

    private Function<Rule, Boolean> checkIfRuleExists =  ((Rule rule )-> {
        if(ruleService.getRule(rule.getRuleName()) == null) return false;
        return true;
    });

    @Override
    public ResponseEntity<CreateRuleResponse> rule(CreateRuleRequest createRuleRequest) {
        Rule rule = new Rule();
        try {
            BeanUtils.copyProperties(createRuleRequest, rule);
            if(checkIfRuleExists.apply(rule)){
                return new ResponseEntity<>(HttpStatus.CONFLICT);
            }
            ruleService.setRule(rule);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
