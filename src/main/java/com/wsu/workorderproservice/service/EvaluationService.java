package com.wsu.workorderproservice.service;

import com.wsu.workorderproservice.dto.EvaluationDTO;
//import com.wsu.workorderproservice.exception.DatabaseErrorException;
//import com.wsu.workorderproservice.exception.InvalidRequestException;
import com.wsu.workorderproservice.model.Evaluation;
import com.wsu.workorderproservice.model.Runner;
import com.wsu.workorderproservice.repository.EvaluationRepository;

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
public class EvaluationService {

    private final EvaluationRepository evaluationRepository;

    public Page<EvaluationDTO> get(String search, String sortField, String sortOrder, Integer page, Integer rpp) {
        // there will be a try-catch block in here that tries to retrieve the evaluation, exception thrown if
        // evaluation does not exist by id.
        // return statement will format the table results in a DTO.builder().
        return null;
    }

    public EvaluationDTO save(EvaluationDTO evaluationDTO) {
        // there will be a try-catch block that will attempt to save the evaluation
        // if the evaluation DNE by id an exception will be thrown.
        // the EvaluationDTO will be saved to the EvaluationRepository
        return null;
    }

    public EvaluationDTO update(Integer id, EvaluationDTO evaluationDTO) {
        // there will be a try-catch block that will attempt to update the evaluation
        // if the evaluation DNE by id an exception will be thrown.
        // the EvaluationDTO once updated will call the save method
        return null;
    }

    public Evaluation convertToEntity(EvaluationDTO evaluationDTO) {
        // this will convert the DTO to an entity model
        return null;
    }

    public EvaluationDTO convertToDTO(Evaluation evaluation) {
        // this will convert the entity model to a DTO
        return null;
    }

    public void delete(Integer id) {
        // there will be a try-catch block to attempt to delete the evaluation by id
        // if evaluation DNE by id then an exception will be thrown.
        // Will delete by id if exists.
    }
}
