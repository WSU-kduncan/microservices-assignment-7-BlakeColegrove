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
public class RunnerDTO {

    private Integer runnerId;
    @NotBlank(message = "firstName must not be blank")
    @Size(max = 50)
    private String firstName;
    @NotBlank(message = "lastName must not be blank")
    @Size(max = 50)
    private String lastName;
    @Size(max = 10)
    private String gender;
    @NotNull(message = "height must not be blank")
    @Size(max = 10)
    private Integer height;
    @NotBlank(message = "age must not be blank")
    @Size(max = 3)
    private Integer age;
    @NotNull(message = "weight must not be blank")
    @Size(max = 5)
    private Integer weight;
}
