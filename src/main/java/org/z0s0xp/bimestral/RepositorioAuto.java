/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.z0s0xp.bimestral;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author z0s0xp
 */
@Repository
public interface RepositorioAuto extends CrudRepository<Auto,Long>{
    
}
