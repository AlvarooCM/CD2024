package alvaro;

/**
 * Creacion de la clase objeto Persona
 */
public class Persona {

    /**
     * Atributos de la clase Persona
     */
    private String nombre;
    private int edad;

  
    /**
     * Establece el valor de las variables del objeto persona
     * @param nombre  Indica el nombre del objeto persona
     * @param edad  Indica la edad del objeto persona
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    
    /**
     * Metodo que devuelve el nombre de la persona
     * @return  Nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona
     * @param nombre  Nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que devuelve la edad de la persona
     * 
     * @return Edad de la persona
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad de la persona
     * @param edad Edad de la persona
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Metodo que imprime los detalles de la persona
     * @return Detalles de la persona
     */
    public String imprimirDetalles() {
        return "Nombre: " + this.getNombre() + "\nEdad: " + this.getEdad();
    }
}