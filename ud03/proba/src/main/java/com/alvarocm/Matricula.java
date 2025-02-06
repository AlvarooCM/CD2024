package com.alvarocm;

public class Matricula extends Modulo {
    
    private String alumno;
    private String modulo;
    private Integer nota;
    private String curso;
   
    public Matricula(String alumno, String modulo, Integer nota, String curso) {
        this.alumno = alumno;
        this.modulo = modulo;
        this.nota = nota;
        this.curso = curso;
    }

    public Matricula(){
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Matricula [alumno=" + alumno + ", modulo=" + modulo + ", nota=" + nota + ", curso=" + curso + "]";
    }

}
