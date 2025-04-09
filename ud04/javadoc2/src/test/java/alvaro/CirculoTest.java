package alvaro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Pruebas unitarias para la clase Circulo.
 */
public class CirculoTest {

    private static final int X = 1;
    private static final int Y = 2;
    private static final double RADIO = 3.0;
    private static final int NUEVO_X = 10;
    private static final int NUEVO_Y = 20;
    private static final double NUEVO_RADIO = 30.0;
    private static final double RADIO_INVALIDO = -1.0;
    private static final double RADIO_CERO = 0.0;

    @Test
    public void testConstructorAndGetters() {
        Circulo circulo = new Circulo(X, Y, RADIO);

        assertEquals(X, circulo.obtenerX());
        assertEquals(Y, circulo.obtenerY());
        assertEquals(RADIO, circulo.obtenerRadio());
    }

    @Test
    public void testSetters() {
        Circulo circulo = new Circulo(X, Y, RADIO);

        circulo.establecerX(NUEVO_X);
        circulo.establecerY(NUEVO_Y);
        circulo.establecerRadio(NUEVO_RADIO);

        assertEquals(NUEVO_X, circulo.obtenerX());
        assertEquals(NUEVO_Y, circulo.obtenerY());
        assertEquals(NUEVO_RADIO, circulo.obtenerRadio());

        circulo.establecerRadio(RADIO_INVALIDO);
        assertEquals(RADIO_CERO, circulo.obtenerRadio());
    }

    @Test
    public void testObtenerDiametro() {
        Circulo circulo = new Circulo(X, Y, RADIO);
        assertEquals(RADIO * 2, circulo.obtenerDiametro());
    }

    @Test
    public void testObtenerCircunferencia() {
        Circulo circulo = new Circulo(X, Y, RADIO);
        assertEquals(Math.PI * RADIO * 2, circulo.obtenerCircunferencia());
    }

    @Test
    public void testObtenerArea() {
        Circulo circulo = new Circulo(X, Y, RADIO);
        assertEquals(Math.PI * RADIO * RADIO, circulo.obtenerArea());
    }

    @Test
    public void testToString() {
        Circulo circulo = new Circulo(X, Y, RADIO);
        String esperado = "Centro = [" + X + "," + Y + "]; Radio = " + RADIO;
        assertEquals(esperado, circulo.toString());
    }
}

