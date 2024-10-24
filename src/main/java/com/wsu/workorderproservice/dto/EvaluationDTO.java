package com.wsu.workorderproservice.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EvaluationDTO {

    private Integer evaluationId;
    private Integer runnerId;
    private Integer workoutId;
    private Date evaluationDate;
    @NotBlank(message = "city must not be blank")
    @Size(max = 25)
    private String city;
    @NotBlank(message = "state must not be blank")
    @Size(max = 2)
    private String stateCode;
    private Time startTime;
    private Time endTime;
    private Character timeOfDay;
    @NotNull(message = "distance must not be blank")
    private Integer distance;
    private Integer avgHeartRate;
    @NotNull(message = "rating must not be blank")
    @Size(max = 10)
    private Integer rating;
    @Size(max = 2000)
    private String comments;
}
