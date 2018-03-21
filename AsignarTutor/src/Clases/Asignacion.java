/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author rebec
 */
public class Asignacion {
    public int id_asignacion;
    public Curso curso;
    public Tutor tutor;
    public String paralelo;

    public Asignacion() {
    }

    public Asignacion(int id_asignacion, Curso curso, Tutor tutor, String paralelo) {
        this.id_asignacion = id_asignacion;
        this.curso = curso;
        this.tutor = tutor;
        this.paralelo = paralelo;
    }

    public Asignacion(Curso curso, Tutor tutor, String paralelo) {
        this.curso = curso;
        this.tutor = tutor;
        this.paralelo = paralelo;
    }

    public int getId_asignacion() {
        return id_asignacion;
    }

    public void setId_asignacion(int id_asignacion) {
        this.id_asignacion = id_asignacion;
    }
    

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    @Override
    public String toString() {
        return "Asignacion{" + "id_asignacion=" + id_asignacion + ", curso=" + curso + ", tutor=" + tutor + ", paralelo=" + paralelo + '}';
    }
    
    
}
