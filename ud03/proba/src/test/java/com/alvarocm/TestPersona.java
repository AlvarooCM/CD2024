package com.alvarocm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TestPersona {

    @Test
    public void comprobarNombre(){
        
        Persona mengano = new Persona("8888888Z","Pepe","Gonzalez","Silva","tordoiamanda@gmail.com",null,null, null);
        mengano.setDni("88888888Z");
        mengano.setNombre("Pepe");
        mengano.setApellido1("Gonzalez");
        mengano.setApellido2("Silva");
        mengano.setCorreo("tordoiamanda@gmail.com");
        mengano.setMovil(null);
        mengano.setFecNacimiento(null);

        boolean resultado = mengano.getNombre() == "Pepe";

        assertTrue(resultado);

    }

    @Test
    public void comprobarToString() {
        Persona mengano = new Persona("88888888Z", "Pepe", "Gonzalez", "Silva", "tordoiamanda@gmail.com", null, null, null);
        assertEquals("Persona [dni=88888888Z, nombre=Pepe, apellido1=Gonzalez, apellido2=Silva, correo=tordoiamanda@gmail.com, movil=null, fecNacimiento=null, iban=null]", 
                mengano.toString());
}

}  
