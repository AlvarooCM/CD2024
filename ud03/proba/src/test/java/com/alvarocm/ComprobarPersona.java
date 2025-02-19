package com.alvarocm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ComprobarPersona {

    @Test
    public void Persona(){
        Persona fulano = new Persona();
        fulano.setNombre("Manuel");
        fulano.setApellido1("Rial");
        fulano.setApellido2("Carnota");
        fulano.setCorreo("pretzelfernandez@gmail.com");
        fulano.setDni("xxxxxxxxx");
        fulano.setFecNacimiento(null);
        fulano.setMovil(null);
        fulano.setIban(null);
        

        assertTrue(fulano.getNombre().equals("Manuel"));
        assertTrue(fulano.getApellido1().equals("Rial"));
        assertTrue(fulano.getApellido2().equals("Carnota"));
        assertTrue(fulano.getCorreo().equals("pretzelfernandez@gmail.com"));
        assertTrue(fulano.getDni().equals("xxxxxxxxx"));
        assertEquals(fulano.getMovil(),(null));
        assertEquals(fulano.getFecNacimiento(),(null));
        assertEquals(fulano.getIban(),(null));
    }
}
