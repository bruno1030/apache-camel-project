package com.bruno.apachecamelproject.repository;

import com.bruno.apachecamelproject.controller.dto.StateDto;

import java.io.IOException;
import java.util.List;

public interface StateRepository {

    List<StateDto> getStates() throws IOException, InterruptedException;

}
