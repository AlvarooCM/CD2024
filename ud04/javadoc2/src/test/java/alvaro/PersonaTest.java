package alvaro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Pruebas unitarias para la clase Persona.
 */
public class PersonaTest {

    private static final int EDAD = 20;

    @Test
    public void testConstructorAndGetters() {
        Persona persona = new Persona("Alvaro", EDAD);

        assertEquals("Alvaro", persona.getNombre());
        assertEquals(EDAD, persona.getEdad());
    }

    @Test
    public void testSetters() {
        Persona persona = new Persona("Alvaro", EDAD);

        persona.setNombre("Nombre1");
        persona.setEdad(EDAD);

        assertEquals("Nombre1", persona.getNombre());
        assertEquals(EDAD, persona.getEdad());
    }

    @Test
    public void testImprimirDetalles() {
        Persona persona = new Persona("Alvaro", EDAD);

        assertEquals("Nombre: " + persona.getNombre()
                + "\nEdad: " + persona.getEdad(), persona.imprimirDetalles());
    }
}

