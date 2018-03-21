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
public class Curso {
    public int id_curso;
    public String nombre;
    public String codigo;
    public String descripcion;
    public Paralelo paralelo;

    public Curso() {
    }

    public Curso(int id_curso, String nombre, String codigo, String descripcion, Paralelo paralelo) {
        this.id_curso = id_curso;
        this.nombre = nombre;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.paralelo = paralelo;
    }

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Paralelo getParalelo() {
        return paralelo;
    }

    public void setParalelo(Paralelo paralelo) {
        this.paralelo = paralelo;
    }

    @Override
    public String toString() {
        return "Curso{" + "id_curso=" + id_curso + ", nombre=" + nombre + ", codigo=" + codigo + ", descripcion=" + descripcion + ", paralelo=" + paralelo + '}';
    }
    
}
