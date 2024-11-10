package com.wsu.workorderproservice.model;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "evaluation")
public class Evaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "evaluation_id")
    private Integer evaluationId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "runner_id")
    private Integer runnerId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "workout_id")
    private Integer workoutId;

    @Column(name = "evaluation_date")
    private Date evaluationDate;

    @Column(name = "city")
    private String city;

    @Column(name = "state_code")
    private String stateCode;

    @Column(name = "start_time")
    private Time startTime;

    @Column(name = "end_time")
    private Time endTime;

    @Column(name = "time_of_day")
    private Character timeOfDay;

    @Column(name = "distance")
    private Integer distance;

    @Column(name = "average_heartrate")
    private Integer avgHeartRate;

    @Column(name = "rating")
    private Integer rating;

    @Column(name = "comments")
    private String comments;

}
