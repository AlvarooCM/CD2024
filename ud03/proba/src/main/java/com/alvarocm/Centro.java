package com.alvarocm;

public class Centro {

    //Atributos
    int codigo;
    String nombre;
    String localidad;
    String calle;
    String numero;
    int codigoPostal;
    
    //Metodos
        
    public Centro(int codigo, String nombre, String localidad, String calle, String numero, int codigoPostal) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.localidad = localidad;
        this.calle = calle;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
    }

    public Centro (){

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Centro [codigo=" + codigo + ", nombre=" + nombre + ", localidad=" + localidad + ", calle=" + calle
                + ", numero=" + numero + ", codigoPostal=" + codigoPostal + "]";
    }

    public String getDireccion(){
        return localidad + " "+
                calle + " " +
                numero + " " +
                codigoPostal;
    }
    
}
