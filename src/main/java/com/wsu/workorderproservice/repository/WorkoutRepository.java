package com.wsu.workorderproservice.repository;

import com.wsu.workorderproservice.model.Workout;

import jakarta.validation.constraints.Null;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface WorkoutRepository extends JpaRepository<Workout, Integer> {

    @Query(nativeQuery = true, value = 
        "SELECT w.workout_id AS workoutId"
            +", w.runner_id AS runnerID"
            +", w.evaluation_id AS evaluationId"
            +", w.type AS type"
        +" FROM workout w"
        +" WHERE (:search IS NULL"
            +" OR (w.workout_id LIKE %:search%"
            +" OR w.runner_id LIKE %:search%"
            +" OR w.evaluation_id LIKE %:search%"
        +"))"
    )

    Page<Object[]> findBySearch(String search, Pageable pageable);

    boolean existsById(int id);

}
