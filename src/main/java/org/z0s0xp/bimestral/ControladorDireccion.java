/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.z0s0xp.bimestral;

import java.util.ArrayList;
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
public class ControladorDireccion {
    @Autowired RepositorioDireccion repo;

/**
 * 
 * @param numero Este parametro es el numero de la calle y es de  Integer
 * @param calle  El nombre de la calle es de tipo String
 * @param cp   El condigo postal es de tipo Long 
 * @param municipio El municipio es de tipo String
 * @return   El Tipo de tetorno es el objeto Direccion que se guarda en incluye
 */
    
@RequestMapping(value="/direccion/{numero}/{calle}/{cp}/{municipio}",
        method=RequestMethod.POST, headers={"Accept=application/json"})

public Direccion guardar(@PathVariable Integer numero,@PathVariable String calle
        ,@PathVariable Long cp , @PathVariable String municipio){
    
    
    return repo.save(new Direccion(numero,calle,cp,municipio));
}
 //update
@RequestMapping(value="/direccion/{id}/{numero}/{calle}/{cp}/{municipio}",
        method=RequestMethod.PUT, headers={"Accept=application/json"})

public Direccion guardar(@PathVariable Long id,@PathVariable Integer numero,@PathVariable String calle
        ,@PathVariable Long cp , @PathVariable String municipio){
    
    System.out.println("SE HIZO LA ACTUALIZACION");
    return repo.save(new Direccion(id,numero,calle,cp,municipio));
}
    //DElete

@RequestMapping(value="/direccion/{id}",
        method=RequestMethod.DELETE, headers={"Accept=application/json"})

public Estatus guardar(@PathVariable Long id){
    
    
     repo.delete(new Direccion(id));
     Estatus estatus=new Estatus();
     estatus.setSuccess(true);
     
   return estatus;
}
//Buscar por id
@RequestMapping(value="/direccion/{id}", method=RequestMethod.GET,
         headers = {"Accept=application/json"})
public Direccion buscarPorId(@PathVariable Long id){
    return repo.findOne(id);
}
//Buscar todos

@RequestMapping(value="/direccion", method=RequestMethod.GET,
         headers = {"Accept=application/json"})
public ArrayList<Direccion> buscarTodo(){
    
    return (ArrayList<Direccion>) repo.findAll();
}




}
