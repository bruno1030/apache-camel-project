package com.bruno.apachecamelproject.service;

import com.bruno.apachecamelproject.camel.CamelContextWrapper;
import com.bruno.apachecamelproject.camel.router.StateRouter;
import com.bruno.apachecamelproject.controller.dto.StateDto;
import org.apache.camel.ProducerTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StateService {

    private final ProducerTemplate template;

    public StateService(CamelContextWrapper wrapper){
        this.template = wrapper.createProducerTemplate();
    }

    public Map<String, String> getAll(String key){
        List<StateDto> dtoList = (List<StateDto>) template.requestBody(StateRouter.ROUTE_GET_STATES, key);
        return null;
    }

}
