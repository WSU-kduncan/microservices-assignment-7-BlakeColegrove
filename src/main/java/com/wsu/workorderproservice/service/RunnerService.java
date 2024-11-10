package com.wsu.workorderproservice.service;

import com.wsu.workorderproservice.dto.RunnerDTO;
//import com.wsu.workorderproservice.exception.DatabaseErrorException;
//import com.wsu.workorderproservice.exception.InvalidRequestException;
import com.wsu.workorderproservice.model.Runner;
import com.wsu.workorderproservice.repository.RunnerRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Date;

import static com.wsu.workorderproservice.utilities.CommonUtils.sort;

@Service
@Slf4j
@RequiredArgsConstructor
public class RunnerService {

    private final RunnerRepository runnerRepository;

    public Page<RunnerDTO> get(String search, String sortField, String sortOrder, Integer page, Integer rpp) {
        // there will be a try-catch block in here that tries to retrieve the Runner, exception thrown if
        // runner does not exist by id.
        // return statement will format the table results in a DTO.builder().
        return null;
    }

    public RunnerDTO save(RunnerDTO runnerDTO) {
        // there will be a try-catch block that will attempt to save the runner
        // if the runner DNE by id an exception will be thrown.
        // the RunnerDTO will be saved to the RunnerRepository
        return null;
    }

    public RunnerDTO update(Integer id, RunnerDTO runnerDTO) {
        // there will be a try-catch block that will attempt to update the runner
        // if the runner DNE by id an exception will be thrown.
        // the RunnerDTO once updated will call the save method
        return null;
    }

    public Runner convertToEntity(RunnerDTO runnerDTO) {
        // this will convert the DTO to an entity model
        return null;
    }

    public RunnerDTO convertToDTO(Runner runner) {
        // this will convert the entity model to a DTO
        return null;
    }

    public void delete(Integer id) {
        // there will be a try-catch block to attempt to delete the runner by id
        // if runner DNE by id then an exception will be thrown.
        // Will delete by id if exists.
    }
}
