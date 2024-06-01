package com.proyecto1.ExamenProyecto2;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;

/**
 *
 * @author: Alex Fernandez
 */

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {
}
