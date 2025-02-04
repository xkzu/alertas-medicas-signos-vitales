package com.alertasmedicas.app.signo.repository;

import com.alertasmedicas.app.signo.entity.VitalSign;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VitalSignRepository extends CrudRepository<VitalSign, Long> {
}
