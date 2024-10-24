package com.wsu.workorderproservice.controller;

import org.hibernate.query.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wsu.workorderproservice.dto.ServiceResponseDTO;
import com.wsu.workorderproservice.service.EvaluationService;
import com.wsu.workorderproservice.service.RunnerService;
import com.wsu.workorderproservice.service.WorkoutService;
import com.wsu.workorderproservice.utilities.Constants;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class WorkoutController {

    private final WorkoutService workoutService;

    @GetMapping
    public ResponseEntity<ServiceResponseDTO> getWorkout() {
        // this will take the params to format the page results like normal
        // it will return an HTTP status ok message and return the data for a given workout
        // based on the provided runnerId. 
        // This would be in the case that a runner is looking up all their workouts.
        // An optional param could be an evaluationId or details within an evaluation to pull up a specific or 
        // filtered to a specific type of workout
    }     
    
    @PostMapping
    public ResponseEntity<ServiceResponseDTO> createWorkout() {
        // creates a workout and generates a workoutId to correspond
        // All params are REQUIRED because it is the creation of a workout.
    }

    @PutMapping("/{runnerId}")
    public ResponseEntity<ServiceResponseDTO> updateWorkout() {
        // there will be a try-catch block here that will have conditions to handle
        // a successful update, invalid data, no matching workout, and any random exception.
        // This would if a user is adjusting the specifics of an existing saved workout. Values cannot be NULL.
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ServiceResponseDTO> deleteWorkout() {
        // deletes a workout based on a given workoutId
        // exception thrown on workout DNE
    }

    // Down here there will be handleErrorResponse methods to assist in handling the exceptions
    // within the above methods.
    // This is used for HTTP status 400 and 500 codes.
}