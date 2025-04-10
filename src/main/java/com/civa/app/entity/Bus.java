package com.civa.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer numeroBus;
    private String placa;
    private LocalDate fechaCreacion;
    private String caracteristicas;
    private Boolean activo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_marca")  // Verifica que este nombre sea exactamente el de la columna en la base de datos
    private MarcaBus marcaBus;

    public Bus() {
    }

    public Bus(Integer numeroBus, String placa, LocalDate fechaCreacion,
               String caracteristicas, MarcaBus idMarca, Boolean activo) {
        this.numeroBus = numeroBus;
        this.placa = placa;
        this.fechaCreacion = fechaCreacion;
        this.caracteristicas = caracteristicas;
        this.marcaBus = idMarca;
        this.activo = activo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumeroBus() {
        return numeroBus;
    }

    public void setNumeroBus(Integer numeroBus) {
        this.numeroBus = numeroBus;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public MarcaBus getMarcaBus() {
        return marcaBus;
    }

    public void setMarcaBus(MarcaBus marcaBus) {
        this.marcaBus = marcaBus;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
}
