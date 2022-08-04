/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.tiendalibros.modelo;

import java.io.*;
import java.awt.Component;
import java.awt.HeadlessException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Catalogo {

    private static Lista<Libro> libros;

    public Catalogo() {
        libros = new Lista<>();
    }

    private static final String ObtenerUbicacion = "C:\\Users\\Usuario\\Documents\\NetBeansProjects\\TiendaLibros1\\src\\main\\java\\co\\unicauca\\tiendalibros\\datos\\Almacen.txt";

    public static void agregarLibro(Lista<Libro> Datos, Component rootPane) throws PosicionIlegalException {
        try {
            FileWriter archivo = new FileWriter(ObtenerUbicacion, true);
            archivo.write("ISBN=" + Datos.getValor(0).getISBN() + "\n");
            archivo.write("Titulo=" + Datos.getValor(0).getTitulo() + "\n");
            archivo.write("Edicion=" + Datos.getValor(0).getEdicion() + "\n");
            archivo.write("Idioma=" + Datos.getValor(0).getIdioma() + "\n");
            archivo.write("Anio=" + Datos.getValor(0).getAnio() + "\n");
            archivo.write("Editorial=" + Datos.getValor(0).getEditorial() + "\n");
            archivo.write("Imagen=" + Datos.getValor(0).getCaratuladellibro() + "\n");
            archivo.write("Resumen=" + Datos.getValor(0).getResumen() + "\n");
            archivo.write("Categoria=" + Datos.getValor(0).getCategoria() + "\n");
            archivo.write("NumeroAutores=" + Datos.getValor(0).getListaAutores().getTamanio() + "\n");
            for (int i = 0; Datos.getValor(0).getListaAutores().getTamanio() > i; i++) {
                archivo.write("Nombre=" + Datos.getValor(0).getListaAutores().getValor(i).getNombre() + "\n");
                archivo.write("Apellido=" + Datos.getValor(0).getListaAutores().getValor(i).getApellido() + "\n");
            }
            archivo.close();
            if(rootPane != null)
                JOptionPane.showMessageDialog(rootPane, "REGISTRO EXITOSO");
        } catch (PosicionIlegalException | HeadlessException | IOException e) {
            if(rootPane != null)
                JOptionPane.showMessageDialog(rootPane, "REGISTRO INCORRECTO:" + e.getMessage());
        }
    }

    public static void guardarLibros(Lista<Libro> Datos) throws PosicionIlegalException, IOException {
        FileWriter archivo = new FileWriter(ObtenerUbicacion);
        for (int i = 0; i < Datos.getTamanio(); i++) {
            archivo.write("ISBN=" + Datos.getValor(i).getISBN() + "\n");
            archivo.write("Titulo=" + Datos.getValor(i).getTitulo() + "\n");
            archivo.write("Edicion=" + Datos.getValor(i).getEdicion() + "\n");
            archivo.write("Idioma=" + Datos.getValor(i).getIdioma() + "\n");
            archivo.write("Anio=" + Datos.getValor(i).getAnio() + "\n");
            archivo.write("Editorial=" + Datos.getValor(i).getEditorial() + "\n");
            archivo.write("Imagen=" + Datos.getValor(i).getCaratuladellibro() + "\n");
            archivo.write("Resumen=" + Datos.getValor(i).getResumen() + "\n");
            archivo.write("Categoria=" + Datos.getValor(i).getCategoria() + "\n");
            archivo.write("NumeroAutores=" + Datos.getValor(i).getListaAutores().getTamanio() + "\n");
            for (int j = 0; Datos.getValor(i).getListaAutores().getTamanio() > j; j++) {
                archivo.write("Nombre=" + Datos.getValor(i).getListaAutores().getValor(j).getNombre() + "\n");
                archivo.write("Apellido=" + Datos.getValor(i).getListaAutores().getValor(j).getApellido() + "\n");
            }
        }
        archivo.close();
    }

    public static void removerLibro(String isbn, Lista<Libro> catalogo, Component rootPane) throws PosicionIlegalException, IOException {
        int aux = 0;
        for (int i = 0; i < catalogo.getTamanio(); i++) {
            if (catalogo.getValor(i).getISBN() == Long.parseLong(isbn)) {
                catalogo.remover(i);
                guardarLibros(catalogo);
                aux = 1;
                if(rootPane != null)
                    JOptionPane.showMessageDialog(rootPane, "El libro se ha eliminado con exito.");
            }
        }
        if (aux != 1) {
            if(rootPane != null)
                JOptionPane.showMessageDialog(rootPane, "El isbn ingresado no se ha encontrado.");
        }
    }

    public static void leerAlmacen(Lista<Libro> catalogo, Component rootpane) throws FileNotFoundException {
        File archivo = new File(ObtenerUbicacion);
        Scanner s;
        // Leemos el contenido del fichero
        s = new Scanner(archivo);
        try {
            // Leemos linea a linea el fichero
            while (s.hasNextLine()) {
                Libro libro = new Libro();
                Lista<Autor> autores = new Lista<>();
                String linea = s.nextLine();        // Guardamos la linea en un String
                String[] parts = linea.split("=");
                if ("ISBN".equals(parts[0])) {
                    libro.setISBN(Long.parseLong(parts[1]));
                    linea = s.nextLine();
                    parts = linea.split("=");
                    libro.setTitulo(parts[1]);
                    linea = s.nextLine();
                    parts = linea.split("=");
                    libro.setEdicion(parts[1]);
                    linea = s.nextLine();
                    parts = linea.split("=");
                    libro.setIdioma(parts[1]);
                    linea = s.nextLine();
                    parts = linea.split("=");
                    libro.setAnio(parts[1]);
                    linea = s.nextLine();
                    parts = linea.split("=");
                    libro.setEditorial(parts[1]);
                    linea = s.nextLine();
                    parts = linea.split("=");
                    libro.setCaratuladellibro(parts[1]);
                    linea = s.nextLine();
                    parts = linea.split("=");
                    libro.setResumen(parts[1]);
                    linea = s.nextLine();
                    parts = linea.split("=");
                    libro.setCategoria(parts[1]);
                    linea = s.nextLine();
                    parts = linea.split("=");
                    int tamanio = Integer.parseInt(parts[1]);
                    for (int i = 0; i < tamanio; i++) {
                        linea = s.nextLine();
                        parts = linea.split("=");
                        String aux = parts[1];
                        linea = s.nextLine();
                        parts = linea.split("=");
                        Autor autor = new Autor(aux, parts[1]);
                        autores.agregar(autor);
                    }
                    libro.setListaAutores(autores);
                }
                catalogo.insertar(libro, 0);
            }
        } catch (Exception ex) {
            if(rootpane != null)
                JOptionPane.showMessageDialog(rootpane, "Mensaje: " + ex.getMessage());
        } finally {
            // Cerramos el fichero tanto si la lectura ha sido correcta o no
            try {
                if (s != null) {
                    s.close();
                }
            } catch (Exception ex2) {
                if(rootpane != null)
                    JOptionPane.showMessageDialog(rootpane, "Mensaje 2: " + ex2.getMessage());
            }
        }
    }

    public static Libro buscarISBN(long isbn, Lista<Libro> catalogo, Component rootPane) throws PosicionIlegalException{
        Libro libro = new Libro();
        boolean encontrado = false;
        int i = 0;
        while ( (i < catalogo.getTamanio()) && !encontrado ){
            if (catalogo.getValor(i).getISBN() == isbn)
                encontrado = true;
            else
                i++;
        }
        if (!encontrado)
            JOptionPane.showMessageDialog(rootPane, "No hay ningún isbn "+isbn+" en el registro.");
        return catalogo.getValor(i);
    }
    public static void buscarISBNrapido(){
        
    }
    
    /**
     *
     * @return
     */
    public static Lista<Libro> getLibros() {
        return libros;
    }

    public void setLibros(Lista<Libro> Libros) {
        this.libros = Libros;
    }
}
