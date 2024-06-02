/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.proyecto1.ExamenProyecto2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// com.proyecto1.ExamenProyecto2.VehiculoRepository

import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;

/**
 *
 * @author: Alex Fernandez
 */
@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {
}
