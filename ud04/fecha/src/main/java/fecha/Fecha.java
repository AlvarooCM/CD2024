package fecha;

public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public boolean valida() {
        if (!diaEnRango() || !mesEnRango())
            return false;

        int diasMes = obtenerDiasDelMes();

        return dia <= diasMes;
    }

    private boolean diaEnRango() {
        return dia >= 1 && dia <= 31;
    }

    private boolean mesEnRango() {
        return mes >= 1 && mes <= 12;
    }

    private int obtenerDiasDelMes() {
        int diasMes = 0;
        switch (mes) {
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:
                diasMes = 31;
                break;

            case 4: case 6: case 9: case 11:
                diasMes = 30;
                break;

            case 2:
                if (esBisiesto()) {
                    diasMes = 29;
                } else {
                    diasMes = 28;
                }
                break;
        }
        return diasMes;
    }

    private boolean esBisiesto() {
        return (anio % 400 == 0) || ((anio % 4 == 0) && (anio % 100 != 0));
    }
}
