package com.bruno.apachecamelproject.camel.processor;

import lombok.extern.slf4j.Slf4j;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

@Slf4j
public class StateProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        var key = exchange;
        if(exchange.toString().equalsIgnoreCase("states")){
            log.info("Searching all states");
        }else{
            log.info("Searching states by reagion code");
        }
    }

}
