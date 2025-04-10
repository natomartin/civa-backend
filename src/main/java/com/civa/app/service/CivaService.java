package com.civa.app.service;

import com.civa.app.entity.Bus;
import com.civa.app.entity.BusDTO;
import com.civa.app.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CivaService {

    @Autowired
    private BusRepository busRepository;

    public List<BusDTO> getAllBuses() {
        return busRepository.findAll().stream().map(bus -> new BusDTO(
                bus.getId(),
                bus.getNumeroBus(),
                bus.getPlaca(),
                bus.getFechaCreacion(),
                bus.getCaracteristicas(),
                bus.getActivo(),
                bus.getMarcaBus().getMarcaBus()
        )).collect(Collectors.toList());
    }

    public BusDTO getBusById(Long id) {
        Bus bus = busRepository.findById(id).orElse(null);
        if (bus != null) {
            return new BusDTO(
                    bus.getId(),
                    bus.getNumeroBus(),
                    bus.getPlaca(),
                    bus.getFechaCreacion(),
                    bus.getCaracteristicas(),
                    bus.getActivo(),
                    bus.getMarcaBus().getMarcaBus()
            );
        }
        return null;
    }

}
