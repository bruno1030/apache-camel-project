package com.bruno.apachecamelproject.controller;

import com.bruno.apachecamelproject.service.StateService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("state")
@AllArgsConstructor
public class StateController {

    private StateService service;

    @GetMapping("/{key}")
    public Map<String, String> getAll(@PathVariable String key){
        return service.getAll(key);
    }

}
