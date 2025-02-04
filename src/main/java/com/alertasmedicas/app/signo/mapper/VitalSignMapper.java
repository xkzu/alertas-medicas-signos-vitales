package com.alertasmedicas.app.signo.mapper;

import com.alertasmedicas.app.signo.dto.VitalSignDTO;
import com.alertasmedicas.app.signo.entity.VitalSign;

public class VitalSignMapper {

    private VitalSignMapper() {}

    public static VitalSignDTO toVitalSignDTO(VitalSign vitalSign) {
        return new VitalSignDTO(
                vitalSign.getId(),
                vitalSign.getName(),
                vitalSign.getLowerLimit(),
                vitalSign.getUpperLimit(),
                vitalSign.getLowerName(),
                vitalSign.getUpperName()
        );
    }

}
