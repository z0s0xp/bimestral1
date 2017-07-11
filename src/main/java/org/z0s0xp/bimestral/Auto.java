/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.z0s0xp.bimestral;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author z0s0xp
 */
@Entity
@Table(name="auto")
public class Auto {
       @GeneratedValue
    @Id
    @Column(name="id_auto")
private Long id;
    @Column(name="num_placa")
private Integer placa;
    @Column(name="marca")
private String marca;
    @Column(name="tipo_auto")
private String auto; 
    Auto(Integer placa, String marca, String auto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Auto(String placa, String marca, String auto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    @Override
    public String toString() {
        return "Auto{" + "id=" + id + ", placa=" + placa + ", marca=" + marca + ", auto=" + auto + '}';
    }

    public Auto(Long id, Integer placa, String marca, String auto) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.auto = auto;
    }

    public Auto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPlaca() {
        return placa;
    }

    public void setPlaca(Integer placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    
}
