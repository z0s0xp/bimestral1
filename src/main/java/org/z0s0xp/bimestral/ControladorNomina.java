/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.z0s0xp.bimestral;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author z0s0xp
 */
@RestController
public class ControladorNomina {
    @Autowired ServicioNomina servicios;
    //ponemos el metodo get
    @RequestMapping(value="/nomina",method=RequestMethod.GET ,headers = {"Accept=Text/html"})
    public String obtenerNomina(){
        return  servicios.servicioPagarNomina().pagarNomina();
    }
    
}
