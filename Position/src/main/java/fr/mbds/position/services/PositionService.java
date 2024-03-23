package fr.mbds.position.services;

import fr.mbds.position.dtos.PositionDTO;

import java.util.List;

public interface PositionService {
    List<PositionDTO> findAll();
    PositionDTO findById(Long id);
}
