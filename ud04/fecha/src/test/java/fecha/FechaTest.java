package fecha;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FechaTest {

    @Test
    public void testValida() {
        Fecha fechaCorrecta = new Fecha(20, 6, 2008);
        Fecha mesMal1 = new Fecha(21, 0, 3000);
        Fecha mesMal2 = new Fecha(21, 13, 3000);
        Fecha diaMal1 = new Fecha(0, 11, 2000);
        Fecha diaMal2 = new Fecha(32, 11, 2000);
        Fecha diaMalNoviembre = new Fecha(31, 11, 2000);
        Fecha diaBienDiciembre = new Fecha(31, 12, 2000);
        Fecha diaMalFebrero = new Fecha(30, 2, 2008);
        Fecha diaBienFebreroBisiesto1 = new Fecha(29, 2, 2008);
        Fecha diaBienFebreroBisiesto2 = new Fecha(29, 2, 2000);
        Fecha diaMalFebreroBisiesto1 = new Fecha(29, 2, 2007);
        Fecha diaMalFebreroBisiesto2 = new Fecha(29, 2, 1900);

        assertTrue(fechaCorrecta.valida());
        assertFalse(mesMal1.valida());
        assertFalse(mesMal2.valida());
        assertFalse(diaMal1.valida());
        assertFalse(diaMal2.valida());
        assertFalse(diaMalNoviembre.valida());
        assertTrue(diaBienDiciembre.valida());
        assertFalse(diaMalFebrero.valida());
        assertTrue(diaBienFebreroBisiesto1.valida());
        assertTrue(diaBienFebreroBisiesto2.valida());
        assertFalse(diaMalFebreroBisiesto1.valida());
        assertFalse(diaMalFebreroBisiesto2.valida());
    }
}
