package com.alertasmedicas.app.signo.dto;

public record VitalSignDTO(
        Long id,
        String name,
        Double lowerLimit,
        Double upperLimit,
        String lowerName,
        String upperName
) {}
