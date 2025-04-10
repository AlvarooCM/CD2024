package alvaro;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias para la clase Estudiante.
 */
public class EstudianteTest {

    private static final int EDAD = 20;
    private static final double CALIFICACION_ALTA = 7.6;
    private static final double CALIFICACION_BAJA = 3.0;
    private static final int EDAD_ESCOLAR = 5;

    @Test
    public void testConstructorAndGetters() {
        Estudiante estudiante = new Estudiante("Alvaro", EDAD);
        estudiante.setCalificacion(CALIFICACION_ALTA);

        assertEquals("Alvaro", estudiante.getNombre());
        assertEquals(EDAD, estudiante.getEdad());
        assertEquals(CALIFICACION_ALTA, estudiante.getCalificacion());
    }

    @Test
    public void testSetters() {
        Estudiante estudiante = new Estudiante("Alvaro", EDAD);

        estudiante.setNombre("Nombre1");
        estudiante.setEdad(EDAD);
        estudiante.setCalificacion(CALIFICACION_ALTA);

        assertEquals("Nombre1", estudiante.getNombre());
        assertEquals(EDAD, estudiante.getEdad());
        assertEquals(CALIFICACION_ALTA, estudiante.getCalificacion());
    }

    @Test
    public void testAprobo() {
        Estudiante estudiante = new Estudiante("Alvaro", EDAD);

        estudiante.setCalificacion(CALIFICACION_ALTA);
        assertEquals(true, estudiante.aprobo());

        estudiante.setCalificacion(CALIFICACION_BAJA);
        assertEquals(false, estudiante.aprobo());
    }

    @Test
    public void testEdadEscolar() {
        Estudiante estudiante = new Estudiante("Alvaro", EDAD);
        assertEquals(1, estudiante.edadEscolar());
    }

    @Test
    public void testEsUniversitario() {
        Estudiante estudiante = new Estudiante("Alvaro", EDAD);
        assertEquals(true, estudiante.esUniversitario());

        estudiante.setEdad(EDAD_ESCOLAR);
        assertEquals(false, estudiante.esUniversitario());
    }

    @Test
    public void testImprimirInformacion() {
        Estudiante estudiante = new Estudiante("Alvaro", EDAD);
        estudiante.setCalificacion(CALIFICACION_ALTA);
        assertEquals("Nombre: Alvaro, Edad: 20, Calificación: 7.6", estudiante.imprimirInformacion());

        estudiante.setCalificacion(CALIFICACION_BAJA);
        assertEquals("Nombre: Alvaro, Edad: 20, Calificación: 3.0", estudiante.imprimirInformacion());
    }
}
