/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.z0s0xp.bimestral;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author z0s0xp
 */

@RestController
public class ControladorAuto {
@Autowired RepositorioAuto repoa;


/**
 * 
 * @param placa Este parametro es el numero de la calle y es de  Integer
 * @param marca  El nombre de la calle es de tipo String
 * @param auto   El condigo postal es de tipo Long 
 * @return   El Tipo de tetorno es el objeto Direccion que se guarda en incluye
 */
    

@RequestMapping(value="/auto/{placa}/{marca}/{auto}",
    method=RequestMethod.GET, headers={"Accept=application/json"})
public Auto guardar(@PathVariable Integer placa,@PathVariable String marca
        ,@PathVariable String auto){
    
    
    return repoa.save(new Auto(placa,marca,auto));
}
 

    
}
