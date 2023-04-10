package com.bruno.apachecamelproject.service;

import org.apache.camel.ProducerTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class StateService {

    private final ProducerTemplate template;

    public StateService(ProducerTemplate template){
        this.template = template;
    }

    public Map<String, String> getAll(String chave){
        return null;
    }

}
