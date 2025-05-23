package estudiante;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EstudianteTest {
    
    @Test
    public void testConstructorAndGetters(){

        Estudiante estudiante = new Estudiante("Alvaro", 20);

        assertEquals("Alvaro", estudiante.getNombre());
        assertEquals(20, estudiante.getEdad());
        assertEquals(0.0, estudiante.getCalificacion());
    }

    
    @Test
    public void testSetters(){

        Estudiante estudiante = new Estudiante("Alvaro", 20);

        estudiante.setNombre("Nombre1");
        estudiante.setEdad(20);
        estudiante.setCalificacion(7.6);

        assertEquals("Nombre1", estudiante.getNombre());
        assertEquals(20, estudiante.getEdad());
        assertEquals(7.6, estudiante.getCalificacion());
    }


    @Test
    public void testAprobo(){

        Estudiante estudiante = new Estudiante("Alvaro", 20);

        estudiante.setCalificacion(7.6);
        assertEquals(true, estudiante.aprobo());

        estudiante.setCalificacion(4.9);
        assertEquals(false, estudiante.aprobo());
    }


    @Test
    public void testEdadEscolar(){

        Estudiante estudiante = new Estudiante("Alvaro", 20);

        assertEquals(1, estudiante.edadEscolar());
    }


    @Test
    public void testEsUniversitario(){

        Estudiante estudiante = new Estudiante("Alvaro", 20);

        assertEquals(true, estudiante.esUniversitario());

        estudiante.setEdad(5);
        assertEquals(false, estudiante.esUniversitario());
    }


    @Test
    public void testImprimirInformacion(){

        Estudiante estudiante = new Estudiante("Marcos", 20);

        estudiante.setCalificacion(7.6);

        assertEquals("Nombre: "+estudiante.getNombre()+
                    "\nEdad: "+estudiante.getEdad()+
                    "\nCalificación: "+estudiante.getCalificacion(), estudiante.imprimirInformacion());

    }
}