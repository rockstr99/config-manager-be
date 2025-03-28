package com.rockstr99.config_manager_be.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisService {

    @Autowired
    RedisTemplate redisTemplate;

    private final ObjectMapper objectMapper = new ObjectMapper();

    public <T> T get(String key, Class<T> entity) {
        try {
            Object obj = redisTemplate.opsForValue().get(key);
            return objectMapper.readValue(obj.toString(), entity);
        } catch (JsonProcessingException e) {
            return null;
        }
    }

    public void set(String key, Object obj) {
        try {
            redisTemplate.opsForValue().set(key, objectMapper.writeValueAsString(obj));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
