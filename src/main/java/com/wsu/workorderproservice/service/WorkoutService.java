package com.wsu.workorderproservice.service;

import com.wsu.workorderproservice.dto.WorkoutDTO;
import com.wsu.workorderproservice.exception.DatabaseErrorException;
import com.wsu.workorderproservice.exception.InvalidRequestException;
import com.wsu.workorderproservice.model.Workout;
import com.wsu.workorderproservice.repository.WorkoutRepository;

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
public class WorkoutService {

    private final WorkoutRepository workoutRepository;

    public Page<WorkoutDTO> get(String search, String sortField, String sortOrder, Integer page, Integer rpp) {
        // there will be a try-catch block in here that tries to retrieve the workout, exception thrown if
        // workout does not exist by id.
        // return statement will format the table results in a DTO.builder().
    }

    public WorkoutDTO save(WorkoutDTO workoutDTO) {
        // there will be a try-catch block that will attempt to save the workout
        // if the workout DNE by id an exception will be thrown.
        // the WorkoutDTO will be saved to the WorkoutRepository
    }

    public WorkoutDTO update(Integer id, WorkoutDTO workoutDTO) {
        // there will be a try-catch block that will attempt to update the workout
        // if the workout DNE by id an exception will be thrown.
        // the WorkoutDTO once updated will call the save method
    }

    public Workout convertToEntity(WorkoutDTO workoutDTO) {
        // this will convert the DTO to an entity model
    }

    public WorkoutDTO convertToDTO(Workout workout) {
        // this will convert the entity model to a DTO
    }

    public void delete(Integer id) {
        // there will be a try-catch block to attempt to delete the workout by id
        // if workout DNE by id then an exception will be thrown.
        // Will delete by id if exists.
    }
}
