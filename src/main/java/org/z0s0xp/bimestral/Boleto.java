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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author z0s0xp
 */
@Entity
@Table(name="boleto")
public class Boleto {
    @Id
    @GeneratedValue
    @Column(name="id_boleto")
    private Long id;
    
    @ManyToOne    //es cuando se ocupa las Fk
        private SalaCine sala;
   @JoinColumn(name="id_sala")

   
   @Column (name="costo_boleto")
   private Float costo;

    public Boleto(SalaCine sala, Float costo) {
        this.sala = sala;
        this.costo = costo;
    }

    public Boleto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SalaCine getSala() {
        return sala;
    }

    public void setSala(SalaCine sala) {
        this.sala = sala;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }
  
    
}
