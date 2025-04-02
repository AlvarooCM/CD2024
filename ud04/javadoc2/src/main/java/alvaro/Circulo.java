package alvaro;

/**
 * Clase Circulo
 * Esta clase representa un círculo con coordenadas (x, y) y un radio.
 */
public class Circulo {
    private int x;
    private int y;
    private double radio;

    /**
     * Establece el valor de las variables del objeto circulo
     * @param valorX -> Indica el valor de la coordenada x
     * @param valorY -> Indica el valor de la coordenada y
     * @param valorRadio -> Indica el valor del radio del circulo
     */
    public Circulo(int valorX, int valorY, double valorRadio) {
        establecerX(valorX);
        establecerY(valorY);
        establecerRadio(valorRadio);
    }

    /**
     * Metodo que establece el valor de x
     * 
     * @param valorX Valor de x
     */
    public void establecerX(int valorX) {
        x=valorX;
    }

    /**
     * Metodo que devuelve el valor de x
     * 
     * @return Devuelve valor x
     */
    public int obtenerX() {
        return x;
    }

    /**
     * Metodo que establece el valor de y
     * @param valorY Valor de y
     */
    public void establecerY(int valorY) {
        y=valorY;
    }

    /**
     * Metodo que devuelve el valor de y
     * 
     * @return Devuelve valor y
     */
    public int obtenerY() {
        return y;
    }

    /**
     * Metodo que establece el valor del radio
     * 
     * @param valorRadio Valor del radio
     */
    public void establecerRadio(double valorRadio) {

        radio=(valorRadio < 0.0 ? 0.0 : valorRadio);
    }

    /**
     * Metodo que devuelve el valor del radio
     * 
     * @return Valor del radio
     */
    public double obtenerRadio() {
        return radio;
    }

    /**
     * Metodo que devuelve el valor del diametro 
     * 
     * @return Valor del diametro
     */
    public double obtenerDiametro() {
        return radio * 2;
    }

    /**
     * Metodo que devuelve el valor de la circunferencia
     * 
     * @return Valor del tamaño de la circunferencia
     */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    /**
     * Metodo que devuelve el area del circulo
     * 
     * @return Valor del area
     */
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    /**
     * Método que devulve una cadena de texto con atributos de la clase circulo
     */
    @Override
    public String toString() {
        return "Centro = [" + x + "," + y + "]; Radio = " + radio;
    }
}
