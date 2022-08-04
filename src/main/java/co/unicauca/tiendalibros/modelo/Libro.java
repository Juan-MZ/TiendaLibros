/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.tiendalibros.modelo;

/**
 *
 * @author Usuario
 */
public class Libro {

    private long ISBN;
    private String titulo;
    private String edicion;
    private String idioma;
    private String anio;
    private String editorial;
    private String categoria;
    private String caratuladellibro;
    private String resumen;
    private Lista<Autor> ListaAutores;

    public Libro() {

    }

    public Libro(long ISBN, String titulo, String edicion, String idioma, String anio, String editorial, String categoria, String caratuladellibro, String resumen) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.edicion = edicion;
        this.idioma = idioma;
        this.anio = anio;
        this.editorial = editorial;
        this.categoria = categoria;
        this.caratuladellibro = caratuladellibro;
        this.resumen = resumen;
    }

    public long getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEdicion() {
        return edicion;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getCaratuladellibro() {
        return caratuladellibro;
    }

    public String getResumen() {
        return resumen;
    }

    public Lista<Autor> getListaAutores() {
        return ListaAutores;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setCaratuladellibro(String caratuladellibro) {
        this.caratuladellibro = caratuladellibro;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public void setListaAutores(Lista<Autor> ListaAutores) {
        this.ListaAutores = ListaAutores;
    }
}
