package com.backend.region.domain;

import lombok.Data;

import java.io.Serializable;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Data
public class RegionDto implements Serializable {
    @Size(max = 100, message = "El nombre excede la capacidad")
    @NotBlank(message = "El campo nombre no puede estar vacio")
    @NotNull(message = "El campo nombre no puede ser nulo")
    private String name;

    @Min(value = 1)
    private Long countryId;
}
