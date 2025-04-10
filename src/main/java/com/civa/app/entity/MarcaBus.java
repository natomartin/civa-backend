package com.civa.app.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class MarcaBus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_marca;

    private String marcaBus;

    @OneToMany(mappedBy = "marcaBus")
    private Set<Bus> buses;

    public MarcaBus() {
    }

    public MarcaBus(String marcaBus, Set<Bus> buses) {
        this.marcaBus = marcaBus;
        this.buses = buses;
    }

    public String getMarcaBus() {
        return marcaBus;
    }

    public void setMarcaBus(String marcaBus) {
        this.marcaBus = marcaBus;
    }

    public Long getId_marca() {
        return id_marca;
    }

    public void setId_marca(Long id_marca) {
        this.id_marca = id_marca;
    }

    public Set<Bus> getBuses() {
        return buses;
    }

    public void setBuses(Set<Bus> buses) {
        this.buses = buses;
    }
}
