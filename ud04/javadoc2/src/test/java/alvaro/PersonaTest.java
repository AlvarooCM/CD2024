package alvaro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PersonaTest {
    
    @Test
    public void testConstrucorAndGetters(){

        Persona persona = new Persona("Alvaro", 20);

        assertEquals("Alvaro", persona.getNombre());
        assertEquals(20, persona.getEdad());
    }

    @Test
    public void testSetters(){

        Persona persona = new Persona("Alvaro", 20);

        persona.setNombre("Nombre1");
        persona.setEdad(20);

        assertEquals("Nombre1", persona.getNombre());
        assertEquals(20, persona.getEdad());
    }

    @Test
    public void testImprimirDetalles(){

        Persona persona = new Persona("Alvaro", 20);

        assertEquals("Nombre: "+persona.getNombre()+
                    "\nEdad: "+persona.getEdad(), persona.imprimirDetalles());
    }
}