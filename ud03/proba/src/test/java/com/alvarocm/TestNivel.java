package com.alvarocm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TestNivel {

    @Test
    public void comprobarNivel(){

        Nivel uno = new Nivel ("1");
        uno.setNivel("1");

        boolean resultado = uno.getNivel() == "1";
        
        assertTrue(resultado);
    }

    @Test
    public void comprobarToString() {
        Nivel uno = new Nivel("1");
        assertEquals("Nivel [nivel=1]", 
                uno.toString());
    }
    
}
