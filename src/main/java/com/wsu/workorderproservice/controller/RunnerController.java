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
import com.wsu.workorderproservice.utilities.Constants;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class RunnerController {

    private final RunnerService runnerService;

    @GetMapping
    public ResponseEntity<ServiceResponseDTO> getRunner() {
        // this will take the params to format the page results like normal
        // it will return an HTTP status ok message and return the data for a given Runner
        // based on the provided email which will correspond to a RunnerId. 
        // This would be in the case of a user logging in to their account and pulling up all relevant data.
        // All params are REQUIRED as it is the login for a user.
        return null;
    }     
    
    @PostMapping
    public ResponseEntity<ServiceResponseDTO> createRunner() {
        // this will take in an email and create a Runner and generate an id to be used as
        // the runnerId. 
        // All params are REQUIRED because it is the creation of an account.
        return null;
    }

    @PutMapping("/{runnerId}")
    public ResponseEntity<ServiceResponseDTO> updateRunner() {
        // there will be a try-catch block here that will have conditions to handle
        // a successful update, invalid data, no matching Runner, and any random exception.
        // This would be if a user is in the settings and updating their information. Values cannot be NULL.
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ServiceResponseDTO> deleteRunner() {
        // deletes a Runner based on a given runnerId
        // exception thrown on runner DNE
        return null;
    }

    // Down here there will be handleErrorResponse methods to assist in handling the exceptions
    // within the above methods.
    // This is used for HTTP status 400 and 500 codes.
}