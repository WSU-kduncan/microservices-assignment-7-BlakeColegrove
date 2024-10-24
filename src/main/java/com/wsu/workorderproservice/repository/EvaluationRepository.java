package com.wsu.workorderproservice.repository;

import com.wsu.workorderproservice.model.Evaluation;

import jakarta.validation.constraints.Null;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EvaluationRepository extends JpaRepository<Evaluation, Integer> {

    @Query(nativeQuery = true, value = "") // I really dont know how to write the query, this is something I need help with 
    Page<Object[]> findBySearch(String search, Pageable pageable);

    boolean existsById(Integer id);

}
