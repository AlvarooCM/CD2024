package com.alvarocm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TestCiclo {

    @Test
    public void comprobarCiclo(){

        Ciclo ciclo = new Ciclo ("1ºDAW", "Desarrollo de aplicaciones web", 1, "Ies San Clemente");
        ciclo.setCodigo("1ºDAW");
        ciclo.setNombre("Desarrollo de aplicaciones web");
        ciclo.setNivel(1);
        ciclo.setCentro("Ies San Clemente");

        boolean resultado = ciclo.getCodigo() == "1ºDAW";
        boolean resultado2 = ciclo.getNombre() == "Desarrollo de aplicaciones web";
        boolean resultado3 = ciclo.getNivel() == 1;
        boolean resultado4 = ciclo.getCentro() == "Ies San Clemente";

        assertTrue(resultado);
        assertTrue(resultado2);
        assertTrue(resultado3);
        assertTrue(resultado4);
    }

    @Test
    public void comprobarToString() {
        Ciclo ciclo = new Ciclo("1ºDAW", "Desarrollo de aplicaciones web", 1, "Ies San Clemente");
        assertEquals("Ciclo [codigo=1ºDAW, nombre=Desarrollo de aplicaciones web, nivel=1, centro=Ies San Clemente]", 
                ciclo.toString());
    }
    
}
