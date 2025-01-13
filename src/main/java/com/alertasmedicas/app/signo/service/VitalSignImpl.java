package com.alertasmedicas.app.signo.service;

import com.alertasmedicas.app.signo.dto.VitalSignDTO;
import com.alertasmedicas.app.signo.entity.VitalSign;
import com.alertasmedicas.app.signo.mapper.VitalSignMapper;
import com.alertasmedicas.app.signo.repository.VitalSignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VitalSignImpl implements VitalSignService {

    private final VitalSignRepository repository;

    @Autowired
    public VitalSignImpl(VitalSignRepository repository) {
        this.repository = repository;
    }

    @Override
    public VitalSignDTO getSignAsDTO(long id) {
        VitalSign sign = repository.findById(id).orElse(new VitalSign());
        return VitalSignMapper.toVitalSignDTO(sign);
    }

    @Override
    public List<VitalSignDTO> getVitalSignsAsDTO() {
        return getVitalSigns()
                .stream()
                .map(VitalSignMapper::toVitalSignDTO)
                .toList();
    }

    private List<VitalSign> getVitalSigns() {
        return (List<VitalSign>) repository.findAll();
    }
}
