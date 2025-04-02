// Creacion de la clase objeto Estudiante

public class Estudiante {

    private String nombre;
    private int edad;
    private double calificacion;

    /**
    * Establece el valor de las variables del objeto estudiante
    * @param nombre -> Indica el nombre del objeto estudiante
    * @param edad -> Indica la edad del objeto estudiante
    */
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = 0.0;
    }

    /**
     * Establece el valor de calificacion 0.0
     * @param calificacion -> Valor de calificacion 0.0
     */

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Metodo que devuelve el nombre del estudiante
     * @return -> Nombre del estudiante
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del estudiante
     * @param nombre -> Nombre del estudiante
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que devuelve la edad del estudiante
     * @return -> Edad del estudiante
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del estudiante
     * @param edad -> Edad del estudiante
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Metodo que devuelve la calificacion del estudiante
     * @return -> Calificacion del estudiante
     */
    public double getCalificacion() {
        return calificacion;
    }

    /**
     * Establece la calificacion del estudiante
     * @param calificacion -> Calificacion del estudiante
     */
    public boolean aprobo() {
        return calificacion >= 5.0;
    }

    /**
     * Metodo que devuelve la edad escolar del estudiante
     * @return -> Edad escolar del estudiante
     */
    public int edadEscolar() {
        return edad / 12;
    }

    /**
     * Metodo que devuelve la edad universitaria del estudiante
     * @return -> Edad universitaria del estudiante
     */
    public boolean esUniversitario() {
        return edad >= 18;
    }

    /**
     * Metodo que devuelve la edad universitaria del estudiante
     * @return -> Edad universitaria del estudiante
     */
    public String imprimirInformacion() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Calificación: " + calificacion;
    }

    
}