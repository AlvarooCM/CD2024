package com.alvarocm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TestModulo {
    
    @Test
    public void testModulo() {

        Modulo modulo = new Modulo("01", "Programacion", "Python", 9, 240 );
        modulo.setCodigo("01");
        modulo.setNombre("Programacion");
        modulo.setDescripcion("Python");
        modulo.setSesiones(9);
        modulo.setHoras(240);

        boolean resultado = modulo.getCodigo() == "01";
        boolean resultado2 = modulo.getNombre() == "Programacion";
        boolean resultado3 = modulo.getDescripcion() == "Python";
        boolean resultado4 = modulo.getSesiones() == 9;
        boolean resultado5 = modulo.getHoras() == 240;

        assertTrue(resultado);
        assertTrue(resultado2);
        assertTrue(resultado3);
        assertTrue(resultado4);
        assertTrue(resultado5);
}

    @Test
    public void comprobarToString() {
        Modulo modulo = new Modulo("01", "Programacion", "Python", 9, 240);
        assertEquals("Modulo [codigo=01, nombre=Programacion, descripcion=Python, horas=9, sesiones=240]", 
                modulo.toString());
    }
}