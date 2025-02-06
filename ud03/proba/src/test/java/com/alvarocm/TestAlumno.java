package com.alvarocm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TestAlumno {

    @Test
    public void comprobarAlumno(){

        Alumno alumno = new Alumno("123456",true);
        alumno.setCodigoXade("123456");
        alumno.setAutorizaTutores(true);

        boolean resultado = alumno.getCodigoXade() == "123456";
        boolean resultado2 = alumno.getAutorizaTutores() == true;

        assertTrue(resultado);
        assertTrue(resultado2);

    }

    @Test
    public void comprobarToString() {
        Alumno alumno = new Alumno("123456", true);
        assertEquals("Alumno [codigoXade=123456, autorizaTutores=true]", 
                alumno.toString());
    
}
}
