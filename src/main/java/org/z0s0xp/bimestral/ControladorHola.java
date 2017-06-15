/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.z0s0xp.bimestral;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author z0s0xp
 */
@RestController
@CrossOrigin
public class ControladorHola {
    @RequestMapping(value="/hola/{mensaje}",method=RequestMethod.GET, headers={"Accept=text/html"})//metodo get no secita seguridad los navegadores lo aceptan por defecto
    public String saludar(@PathVariable String mensaje){ //GET ES SOLO DE LECTURA   //{mensaje} variable de ruta
       String algo="Bienvenido"+mensaje;
        return  algo;
        
    }
@RequestMapping(value="/usuario",method=RequestMethod.GET,headers={"Aceppt=aplicatiom/json"}) //Formato que intercambia servidor cliente 
public Usuario obtener(){
Usuario u=new Usuario("Jose","Espinoza",21);
return u;
}
}