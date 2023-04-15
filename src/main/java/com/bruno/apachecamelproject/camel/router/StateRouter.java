package com.bruno.apachecamelproject.camel.router;

import com.bruno.apachecamelproject.camel.processor.StateProcessor;
import com.bruno.apachecamelproject.repository.StateRepository;
import lombok.AllArgsConstructor;
import org.apache.camel.builder.RouteBuilder;

@AllArgsConstructor
public class StateRouter extends RouteBuilder {

    public static final String ROUTE_GET_STATES = "direct:getStates";

    StateRepository stateRepository;

    @Override
    public void configure() throws Exception {
        from(ROUTE_GET_STATES)
                .routeId(ROUTE_GET_STATES)
                .process(new StateProcessor())
                .choice()
                .when(exchange -> exchange.toString().equalsIgnoreCase("states"))
                    .bean(stateRepository, "getAllStates")
                .endChoice()
                .otherwise()
                    .bean(stateRepository, "getStatesByRegionCode")
                .end();

    }

}
