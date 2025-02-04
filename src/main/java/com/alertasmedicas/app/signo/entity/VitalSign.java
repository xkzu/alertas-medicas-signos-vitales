package com.alertasmedicas.app.signo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "signo_vital", schema = "admin")

@NoArgsConstructor
@AllArgsConstructor
public class VitalSign {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String name;

    @Column(name = "limite_bajo", nullable = false)
    private Double lowerLimit;

    @Column(name = "limite_alto", nullable = false)
    private Double upperLimit;

    @Column(name = "nombre_bajo", nullable = false)
    private String lowerName;

    @Column(name = "nombre_alto", nullable = false)
    private String upperName;
}
