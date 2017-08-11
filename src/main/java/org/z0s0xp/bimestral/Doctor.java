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
@Table(name="doctor")
public class Doctor {
  
    
    @Id
    Integer cedula;
     @Column(name="id_auto")
    String nombre;
    Integer edad;
    String especialidad;
}
