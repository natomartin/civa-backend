package com.civa.app.entity;

import java.time.LocalDate;

public class BusDTO {
    private Long id;
    private Integer numeroBus;
    private String placa;
    private LocalDate fechaCreacion;
    private String caracteristicas;
    private Boolean activo;
    private String marca;

    public BusDTO() {
    }

    public BusDTO(Long id, Integer numeroBus, String placa,
                  LocalDate fechaCreacion, String caracteristicas, Boolean activo,
                  String marca) {
        this.id = id;
        this.numeroBus = numeroBus;
        this.placa = placa;
        this.fechaCreacion = fechaCreacion;
        this.caracteristicas = caracteristicas;
        this.activo = activo;
        this.marca = marca;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
}
