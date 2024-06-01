/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.proyecto1.ExamenProyecto2;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// import java.util.Date;
// import java.sql.Date;
import java.util.Date;

/**
 *
 * @author: Alex Fernandez
 */
@Entity

public class Vehiculo {
    @Id
    @Generatedvalue(strategy = GenerationType.AUTO)
    private Long id_vehiculo;
    private String tipo;
    private String marca;
    private int potencia;
    private Date fechaCompra;


    // Getters and Setters
    public Long getId_vehiculo() {
        return id_vehiculo;
    }
    public void setId_vehiculo(Long id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    //
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    //
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    //
    public Date getFechaCompra() {
        return fechaCompra;
    }
    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }








}


// Getters and Setters
/*
public Long getId_vehiculo() {
    return id_vehiculo;
}

public void setId_vehiculo(Long id_vehiculo) {
    this.getId_vehiculo = id_vehiculo;
}
*/

/*
id_vehiculo INT NOT NULL AUTO_INCREMENT,
tipo VARCHAR(45),
marca VARCHAR(45) NOT NULL,
potencia INT NOT NULL,
fechaCompra DATETIME DEFAULT NOW(),
-- potencia INT NOT NULL UNIQUE,

PRIMARY KEY (id_vehiculo)
);
 */
