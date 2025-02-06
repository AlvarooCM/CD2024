package com.alvarocm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TestProfesor {

    @Test
    public void testProfesor() {

        Profesor profe;
        profe = new Profesor("Infantil","Educacion",false, java.sql.Date.valueOf("2004-01-19"));
        profe.setEspecialidad("Infantil");
        profe.setCuerpo("Educacion");
        profe.setSustituto(false);
        profe.setFecOposicion(java.sql.Date.valueOf("2004-01-19"));
        
        boolean resultado = profe.getEspecialidad() == "Infantil";

        assertTrue(resultado);

    }

    @Test
    public void comprobarToString() {
        Profesor profe = new Profesor("Infantil", "Educacion", false, java.sql.Date.valueOf("2004-01-19"));
        assertEquals("Profesor [especialidad=Infantil, cuerpo=Educacion, sustituto=false, fecOposicion=2004-01-19]", 
                profe.toString());
    }
}