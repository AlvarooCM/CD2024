package com.alvarocm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TestCentro {
    
    @Test
    public void comprobarCentro(){

        Centro centro = new Centro(1, "Ies San Clemente", "Santiago", "Rua de San Clemente", "5", 15705 );
        centro.setCodigo(1);
        centro.setNombre("Ies San Clemente");
        centro.setLocalidad("Santiago");
        centro.setCalle("Rua de San Clemente");
        centro.setNumero("5");
        centro.setCodigoPostal(15705);

        boolean resultado = centro.getCodigo() == 1;
        boolean resultado2 = centro.getNombre() == "Ies San Clemente";
        boolean resultado3 = centro.getLocalidad() == "Santiago";
        boolean resultado4 = centro.getCalle() == "Rua de San Clemente";
        boolean resultado5 = centro.getNumero() == "5";
        boolean resultado6 = centro.getCodigoPostal() == 15705;

        assertTrue(resultado);
        assertTrue(resultado2);
        assertTrue(resultado3);
        assertTrue(resultado4);
        assertTrue(resultado5);
        assertTrue(resultado6);
        
    }

    @Test
    public void comprobarToString() {
        Centro centro = new Centro(1, "Ies San Clemente", "Santiago", "Rua de San Clemente", "5", 15705);
        assertEquals("Centro [codigo=1, nombre=Ies San Clemente, localidad=Santiago, calle=Rua de San Clemente, numero=5, codigoPostal=15705]", 
                centro.toString());
}
}
