package alvaro;

/**
 * Clase que representa un círculo con coordenadas (x, y) y un radio.
 */
public class Circulo {

    private static final double RADIO_DEFECTO = 0.0;

    private int x;
    private int y;
    private double radio;

    /**
     * Constructor del círculo.
     *
     * @param valorX Coordenada X.
     * @param valorY Coordenada Y.
     * @param valorRadio Radio del círculo.
     */
    public Circulo(int valorX, int valorY, double valorRadio) {
        establecerX(valorX);
        establecerY(valorY);
        establecerRadio(valorRadio);
    }

    /**
     * Establece la coordenada X.
     *
     * @param valorX Coordenada X.
     */
    public void establecerX(int valorX) {
        x = valorX;
    }

    /**
     * Devuelve la coordenada X.
     *
     * @return Coordenada X.
     */
    public int obtenerX() {
        return x;
    }

    /**
     * Establece la coordenada Y.
     *
     * @param valorY Coordenada Y.
     */
    public void establecerY(int valorY) {
        y = valorY;
    }

    /**
     * Devuelve la coordenada Y.
     *
     * @return Coordenada Y.
     */
    public int obtenerY() {
        return y;
    }

    /**
     * Establece el radio.
     *
     * @param valorRadio Radio del círculo.
     */
    public void establecerRadio(double valorRadio) {
        radio = valorRadio < 0.0 ? RADIO_DEFECTO : valorRadio;
    }

    /**
     * Devuelve el radio.
     *
     * @return Radio del círculo.
     */
    public double obtenerRadio() {
        return radio;
    }

    /**
     * Devuelve el diámetro.
     *
     * @return Diámetro del círculo.
     */
    public double obtenerDiametro() {
        return radio * 2;
    }

    /**
     * Devuelve la circunferencia.
     *
     * @return Circunferencia del círculo.
     */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    /**
     * Devuelve el área del círculo.
     *
     * @return Área del círculo.
     */
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    /**
     * Devuelve una cadena representando al círculo.
     *
     * @return Representación del círculo.
     */
    @Override
    public String toString() {
        return "Centro = [" + x + "," + y + "]; Radio = " + radio;
    }
}

