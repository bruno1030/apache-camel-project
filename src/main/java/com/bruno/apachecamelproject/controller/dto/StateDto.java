package com.bruno.apachecamelproject.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StateDto {

    @JsonProperty("nome")
    private String name;

    @JsonProperty("sigla")
    private String acronym;

    @JsonProperty("regiao")
    private RegionDto Region;

}
