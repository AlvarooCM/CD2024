package com.alvarocm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TestMatricula {

    @Test
    public void comprobarMatricula(){

        Matricula matricula = new Matricula ("Alvaro", "Bases de datos", 4, "1ºDAW");
        matricula.setNombre("Alvaro");
        matricula.setModulo("Bases de datos");
        matricula.setNota(4);
        matricula.setCurso("1ºDAW");

        boolean resultado = matricula.getNombre() == "Alvaro";
        boolean resultado2 = matricula.getModulo() == "Bases de datos";
        boolean resultado3 = matricula.getNota() == 4;
        boolean resultado4 = matricula.getCurso() == "1ºDAW";

        assertTrue(resultado);
        assertTrue(resultado2);
        assertTrue(resultado3);
        assertTrue(resultado4);

    }

    @Test
    public void comprobarToString() {
        Matricula matricula = new Matricula("Alvaro", "Bases de datos", 4, "1ºDAW");
        assertEquals("Matricula [nombre=Alvaro, modulo=Bases de datos, nota=4, curso=1ºDAW]", 
                matricula.toString());
    }
    
}
