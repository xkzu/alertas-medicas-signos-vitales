package com.alertasmedicas.app.signo.service;

import com.alertasmedicas.app.signo.dto.VitalSignDTO;

import java.util.List;

public interface VitalSignService {
    VitalSignDTO getSignAsDTO(long id);

    List<VitalSignDTO> getVitalSignsAsDTO();
}
