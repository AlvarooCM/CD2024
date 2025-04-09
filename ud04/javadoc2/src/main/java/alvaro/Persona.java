package alvaro;

/**
 * Clase que representa una Persona con nombre y edad.
 */
public class Persona {

    private String nombre;
    private int edad;

    /**
     * Constructor de Persona.
     *
     * @param nombre Nombre de la persona.
     * @param edad Edad de la persona.
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Devuelve el nombre de la persona.
     *
     * @return Nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     *
     * @param nombre Nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la edad de la persona.
     *
     * @return Edad.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad de la persona.
     *
     * @param edad Edad.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Imprime los detalles de la persona.
     *
     * @return Detalles formateados.
     */
    public String imprimirDetalles() {
        return "Nombre: " + getNombre() + "\nEdad: " + getEdad();
    }
}

