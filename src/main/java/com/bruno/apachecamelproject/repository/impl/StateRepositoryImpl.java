package com.bruno.apachecamelproject.repository.impl;

import com.bruno.apachecamelproject.controller.dto.StateDto;
import com.bruno.apachecamelproject.repository.StateRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class StateRepositoryImpl implements StateRepository {

    // URL (1/6)
    public static final String URL_GET = "https://servicodados.ibge.gov.br/api/v1/localidades/estados";

    ObjectMapper mapper;

    @Override
    public List<StateDto> getStates() throws IOException, InterruptedException {

        List<StateDto> stateDtoList = new ArrayList<>();

        // http client (2/6)
        HttpClient client = HttpClient.newHttpClient();

        // request (3/6)
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .timeout(Duration.ofSeconds(10))
                .uri(URI.create(URL_GET))
                .build();

        // response (4/6)
        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());

        // get the response.body
        String body = response.body();

        StateDto dtoList = mapper.readValue(body, StateDto.class);

        return null;
    }

}
