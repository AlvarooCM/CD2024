package alvaro;

/**
 * Clase que representa un estudiante con nombre, edad y calificación.
 */
public class Estudiante {

    private static final double CALIFICACION_MINIMA = 5.0;
    private static final int DIVISOR_EDAD_ESCOLAR = 12;
    private static final int EDAD_UNIVERSITARIA = 18;

    private String nombre;
    private int edad;
    private double calificacion;

    /**
     * Constructor que inicializa el estudiante con nombre y edad.
     *
     * @param nombre Nombre del estudiante.
     * @param edad   Edad del estudiante.
     */
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = 0.0;
    }

    /**
     * Establece la calificación del estudiante.
     *
     * @param calificacion Calificación a asignar.
     */
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Devuelve el nombre del estudiante.
     *
     * @return Nombre del estudiante.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del estudiante.
     *
     * @param nombre Nombre a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la edad del estudiante.
     *
     * @return Edad del estudiante.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del estudiante.
     *
     * @param edad Edad a establecer.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Devuelve la calificación del estudiante.
     *
     * @return Calificación del estudiante.
     */
    public double getCalificacion() {
        return calificacion;
    }

    /**
     * Indica si el estudiante aprobó.
     *
     * @return true si calificación >= mínima, false de lo contrario.
     */
    public boolean aprobo() {
        return calificacion >= CALIFICACION_MINIMA;
    }

    /**
     * Devuelve una estimación de la edad escolar.
     *
     * @return Edad escolar calculada.
     */
    public int edadEscolar() {
        return edad / DIVISOR_EDAD_ESCOLAR;
    }

    /**
     * Indica si el estudiante está en edad universitaria.
     *
     * @return true si edad >= 18, false de lo contrario.
     */
    public boolean esUniversitario() {
        return edad >= EDAD_UNIVERSITARIA;
    }

    /**
     * Devuelve los datos completos del estudiante.
     *
     * @return Información formateada del estudiante.
     */
    public String imprimirInformacion() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Calificación: " + calificacion;
    }
}

