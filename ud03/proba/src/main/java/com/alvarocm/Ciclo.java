package com.alvarocm;

public class Ciclo {
    private String codigo;
    private String nombre;
    private int nivel;
    private String centro;

    public Ciclo(String codigo, String nombre, int nivel, String centro) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nivel = nivel;
        this.centro = centro;
    }

    public Ciclo(){

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    @Override
    public String toString() {
        return "Ciclo [codigo=" + codigo + ", nombre=" + nombre + ", nivel=" + nivel + ", centro=" + centro + "]";
    }

}
