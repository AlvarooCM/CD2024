package com.alvarocm;

public class Alumno extends Persona {

    //Atributos
    String codigoXade;
    Boolean autorizaTutores;
    
    //Metodos
        
    public Alumno(String codigoXade, Boolean autorizaTutores){

        this.codigoXade = codigoXade;
        this.autorizaTutores = autorizaTutores;
    }
            
    public Alumno (){

    }

    public String getCodigoXade() {
        return codigoXade;
    }

    public void setCodigoXade(String codigoXade) {
        this.codigoXade = codigoXade;
    }

    public Boolean getAutorizaTutores() {
        return autorizaTutores;
    }

    public void setAutorizaTutores(Boolean autorizaTutores) {
        this.autorizaTutores = autorizaTutores;
    }

    @Override
    public String toString() {
        return "Alumno [codigoXade=" + codigoXade + ", autorizaTutores=" + autorizaTutores + "]";
    }
 
}
    

