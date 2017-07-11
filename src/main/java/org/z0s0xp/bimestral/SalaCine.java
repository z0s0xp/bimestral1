/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.z0s0xp.bimestral;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author z0s0xp
 */
@Entity
@Table(name="SalaCine")
public class SalaCine {
    @Id
    @Column(name="id_sala")
private Long id;
    @Column(name="titulo_pelicula")
    private String titulo;
    @Column(name="Clasificacion")
    private String clasificacion;
    
    @Column(name="numero_asiento")
private Integer asiento;    

    @Override
    public String toString() {
        return "SalaCine{" + "id=" + id + ", titulo=" + titulo + ", clasificacion=" + clasificacion + ", asiento=" + asiento + '}';
    }

    public SalaCine(Long id, String titulo, String clasificacion, Integer asiento) {
        this.id = id;
        this.titulo = titulo;
        this.clasificacion = clasificacion;
        this.asiento = asiento;
    }

    public SalaCine() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Integer getAsiento() {
        return asiento;
    }

    public void setAsiento(Integer asiento) {
        this.asiento = asiento;
    }

  

}
