package com.bruno.apachecamelproject.config;

import com.bruno.apachecamelproject.camel.CamelContextWrapper;
import com.bruno.apachecamelproject.camel.router.StateRouter;
import com.bruno.apachecamelproject.repository.StateRepository;
import com.bruno.apachecamelproject.repository.impl.StateRepositoryImpl;
import com.bruno.apachecamelproject.service.StateService;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StateConfiguration {

    @Bean
    public CamelContextWrapper camelContextWrapper(RouteBuilder... routes) throws Exception {
        return new CamelContextWrapper(routes);
    }

//    @Bean
//    public StateService stateService(CamelContextWrapper wrapper){
//        return new StateService(wrapper);
//    }

//    @Bean
//    public StateRepository stateRepository(){
//        return new StateRepositoryImpl();
//    }

//    @Bean
//    public StateRouter stateRouter(StateRepository stateRepository){
//        return new StateRouter(stateRepository);
//    }

}
