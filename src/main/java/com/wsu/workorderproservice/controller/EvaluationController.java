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
import com.wsu.workorderproservice.utilities.Constants;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class EvaluationController {

    private final EvaluationService evaluationService;

    @GetMapping
    public ResponseEntity<ServiceResponseDTO> getEvaluations() {
        // this will take the params to format the page results like normal
        // it will return an HTTP status ok message and return all evaluations for a given
        // Runner based on the Runners ID/email (deciding about using email based on in class discussion)
        return null;
    }     
    
    @PostMapping
    public ResponseEntity<ServiceResponseDTO> createEvaluation() {
        // this will take in an @PathVariable (probably the Runners ID) and create
        // an evaluation or the Runner and matched workout
        return null;
    }

    @PutMapping("/{runnerId}")
    public ResponseEntity<ServiceResponseDTO> updateEvaluation() {
        // there will be a try-catch block here that will have conditions to handle
        // a successful update, invalid data, no matching evaluation, and any random exception.
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ServiceResponseDTO> deleteEvaluation() {
        // deletes an evaluation based on a given evaluationId
        // exception thrown on evaluation DNE
        return null;
    }

    // Down here there will be handleErrorResponse methods to assist in handling the exceptions
    // within the above methods.
    // This is used for HTTP status 400 and 500 codes.
}