package org.z0s0xp.bimestral;

import java.util.ArrayList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BimestralApplicationTests {

    @Autowired
    RepositorioDireccion repoDireccion;
    @Autowired
    RepositorioAuto repoaAuto;
    
	//@Test
	public void contextLoads() {
	}
        // @Test
         public void ProbarSuma ()throws Exception{
             int suma=2+2;
             assertEquals(4, suma);
         }
       //  @Test
         public void probarInsertDireccion()throws Exception{
         Direccion dir=    repoDireccion.save(new Direccion(777, "calle 13", 55130L, "Ecatepec"));  //lo saca de crued repository
             assertEquals(new Long(1),dir.getId());


         }
      //   @Test
         public void probarBuscarPorId ()throws Exception{
    Direccion dir=repoDireccion.findOne(1L);
             assertEquals("Ecatepec", dir.getMunicipio());
    
    
}
        // @Test
         public void buscarTodos()throws Exception{
             
      ArrayList<Direccion> dir=     (ArrayList<Direccion> )repoDireccion.findAll();
             assertEquals(2, dir.size());
         }
  @Test
         public void actualizar()throws Exception{
        Direccion dir=
               repoDireccion.save(new Direccion (2L,12,"Calle del infierno",7777l,"Ecatepc"));
                assertEquals("Ecatepec", dir.getMunicipio());
     
         }
         @Test
         public void borrar()throws Exception{
             
             repoDireccion.delete(1L);
             assertEquals(null, repoDireccion.findOne(1L));
             
             
         }

}
