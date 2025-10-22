package com.example.w6lab4.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;


@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Passenger {

    @NotBlank @Size(max = 40)
    private String passengerId;

    @NotBlank @Size(max = 60)
    private String name;

    @NotBlank(message = "email is required")
    @NotBlank(message = "email must be valid address")

    @NotBlank @Email
    private String email;

}
