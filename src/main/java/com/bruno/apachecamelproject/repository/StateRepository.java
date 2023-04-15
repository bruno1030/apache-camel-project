package com.bruno.apachecamelproject.repository;

import com.bruno.apachecamelproject.controller.dto.StateDto;

import java.io.IOException;
import java.util.List;

public interface StateRepository {

    List<StateDto> getAllStates() throws IOException, InterruptedException;

    List<StateDto> getStatesByRegionCode(String key) throws IOException, InterruptedException;

}
