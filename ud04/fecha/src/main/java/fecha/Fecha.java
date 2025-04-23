package fecha;

/**
 * Clase que representa una fecha y permite validar si es correcta.
 */
public class Fecha {

    /** Constante para el mes de enero. */
    public static final int ENERO = 1;
    /** Constante para el mes de febrero. */
    public static final int FEBRERO = 2;
    /** Constante para el mes de marzo. */
    public static final int MARZO = 3;
    /** Constante para el mes de abril. */
    public static final int ABRIL = 4;
    /** Constante para el mes de mayo. */
    public static final int MAYO = 5;
    /** Constante para el mes de junio. */
    public static final int JUNIO = 6;
    /** Constante para el mes de julio. */
    public static final int JULIO = 7;
    /** Constante para el mes de agosto. */
    public static final int AGOSTO = 8;
    /** Constante para el mes de septiembre. */
    public static final int SEPTIEMBRE = 9;
    /** Constante para el mes de octubre. */
    public static final int OCTUBRE = 10;
    /** Constante para el mes de noviembre. */
    public static final int NOVIEMBRE = 11;
    /** Constante para el mes de diciembre. */
    public static final int DICIEMBRE = 12;

    /** Día mínimo válido. */
    public static final int DIA_MINIMO = 1;
    /** Día máximo válido. */
    public static final int DIA_MAXIMO = 31;
    /** Mes mínimo válido. */
    public static final int MES_MINIMO = 1;
    /** Mes máximo válido. */
    public static final int MES_MAXIMO = 12;

    /** Cantidad de días en los meses de 31 días. */
    public static final int DIAS_MES_COMPLETO = 31;
    /** Cantidad de días en los meses de 30 días. */
    public static final int DIAS_MES_CORTO = 30;
    /** Cantidad de días en febrero si no es bisiesto. */
    public static final int DIAS_FEBRERO_COMUN = 28;
    /** Cantidad de días en febrero si es bisiesto. */
    public static final int DIAS_FEBRERO_BISIESTO = 29;

    /** Divisibilidad para años bisiestos: múltiplo de 4. */
    public static final int DIVISIBLE_POR_4 = 4;
    /** Divisibilidad para años bisiestos: múltiplo de 100. */
    public static final int DIVISIBLE_POR_100 = 100;
    /** Divisibilidad para años bisiestos: múltiplo de 400. */
    public static final int DIVISIBLE_POR_400 = 400;

    /** Día de la fecha. */
    private int dia;
    /** Mes de la fecha. */
    private int mes;
    /** Año de la fecha. */
    private int anio;

    /**
     * Constructor de la clase Fecha.
     *
     * @param pDia  el día
     * @param pMes  el mes
     * @param pAnio el año
     */
    public Fecha(final int pDia, final int pMes, final int pAnio) {
        this.dia = pDia;
        this.mes = pMes;
        this.anio = pAnio;
    }

    /**
     * Valida si la fecha es válida.
     *
     * @return true si la fecha es válida, false en caso contrario.
     */
    public boolean valida() {
        if (!diaEnRango() || !mesEnRango()) {
            return false;
        }

        int diasMes = obtenerDiasDelMes();
        return dia <= diasMes;
    }

    /**
     * Verifica si el día está dentro del rango válido.
     *
     * @return true si está en el rango [1, 31]
     */
    private boolean diaEnRango() {
        return dia >= DIA_MINIMO && dia <= DIA_MAXIMO;
    }

    /**
     * Verifica si el mes está dentro del rango válido.
     *
     * @return true si está en el rango [1, 12]
     */
    private boolean mesEnRango() {
        return mes >= MES_MINIMO && mes <= MES_MAXIMO;
    }

    /**
     * Obtiene la cantidad de días válidos del mes actual.
     *
     * @return la cantidad de días que tiene el mes
     */
    private int obtenerDiasDelMes() {
        int diasMes = 0;

        switch (mes) {
            case ENERO:
            case MARZO:
            case MAYO:
            case JULIO:
            case AGOSTO:
            case OCTUBRE:
            case DICIEMBRE:
                diasMes = DIAS_MES_COMPLETO;
                break;
            case ABRIL:
            case JUNIO:
            case SEPTIEMBRE:
            case NOVIEMBRE:
                diasMes = DIAS_MES_CORTO;
                break;
            case FEBRERO:
                if (esBisiesto()) {
                    diasMes = DIAS_FEBRERO_BISIESTO;
                } else {
                    diasMes = DIAS_FEBRERO_COMUN;
                }
                break;
            default:
                diasMes = 0;
                break;
        }

        return diasMes;
    }

    /**
     * Determina si el año actual es bisiesto.
     *
     * @return true si es bisiesto, false en caso contrario.
     */
    private boolean esBisiesto() {
        return (anio % DIVISIBLE_POR_400 == 0)
                || ((anio % DIVISIBLE_POR_4 == 0)
                && (anio % DIVISIBLE_POR_100 != 0));
    }
}
