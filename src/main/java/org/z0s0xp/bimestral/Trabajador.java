/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.z0s0xp.bimestral;

/**
 *
 * @author z0s0xp
 */
public class Trabajador {
    private Long id;
    private String nombre;
    private Integer horaslaboradas;

    public Trabajador(Long id, String nombre, Integer horaslaboradas) {
        this.id = id;
        this.nombre = nombre;
        this.horaslaboradas = horaslaboradas;
    }

    public Trabajador() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getHoraslaboradas() {
        return horaslaboradas;
    }

    public void setHoraslaboradas(Integer horaslaboradas) {
        this.horaslaboradas = horaslaboradas;
    }
}
