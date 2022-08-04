/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.tiendalibros.modelo;

import co.unicauca.tiendalibros.presentacion.GUITiendaLibros;
import java.awt.Component;
import java.awt.Frame;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Usuario
 */
public class CatalogoTest {
    
    public CatalogoTest() {
    }
    
    //incializamos catalogo y libro para hacer las pruebas
    
    private Lista<Libro> inicializarLibroParaTest() throws PosicionIlegalException{
        Lista<Libro> catalogo = new Lista<>();
        Lista<Autor> autores = new Lista<>();
        Libro libro = new Libro();
        Autor autor = new Autor();
        libro.setISBN(12345);
        libro.setTitulo("Prueba1");
        libro.setEdicion("primera");
        libro.setIdioma("Español");
        libro.setAnio("2001");
        libro.setEditorial("Unicauca");
        libro.setResumen("aqui va el resumen.");
        libro.setCategoria("otra");
        libro.setCaratuladellibro("caratula no contiene imagen para la prueba.");
        autor.setNombre("Juan");
        autor.setApellido("Medicis");
        autores.agregar(autor);
        autor.setNombre("Pepe");
        autor.setApellido("Perez");
        autores.agregar(autor);
        catalogo.insertar(libro, 0);
        autores.remover(1);
        autores.remover(0);
        libro.setISBN(6789);
        libro.setTitulo("Prueba2");
        libro.setEdicion("segunda");
        libro.setIdioma("Ingles");
        libro.setAnio("2003");
        libro.setEditorial("Unicauca");
        libro.setResumen("aqui va el resumen.");
        libro.setCategoria("otra");
        libro.setCaratuladellibro("caratula no contiene imagen para la prueba.");
        autor.setNombre("Juan");
        autor.setApellido("Medicis");
        autores.agregar(autor);
        autor.setNombre("Pepe");
        autor.setApellido("Perez");
        autores.agregar(autor);
        catalogo.insertar(libro, 0);
        return catalogo;
    }

    /**
     * Test of agregarLibro method, of class Catalogo.
     * @throws java.lang.Exception
     */
    @Test
    public void testAgregarLibro() throws Exception {
        Lista<Libro> catalogo = inicializarLibroParaTest();
        Libro libro = inicializarLibroParaTest().getValor(0);
        System.out.println("agregarLibro");
        Component rootPane = null;
        Catalogo.agregarLibro(catalogo, rootPane);
        assertEquals(libro, catalogo.getValor(0));
    }

    /**
     * Test of removerLibro method, of class Catalogo.
     * @throws java.lang.Exception
     */
    @Test
    public void testRemoverLibro() throws Exception {
        Lista<Libro> catalogo = inicializarLibroParaTest();
        System.out.println("removerLibro");
        String isbn = "12345";
        Component rootPane = null;
        Catalogo.removerLibro(isbn, catalogo, rootPane);
        isbn = "6789";
        Catalogo.removerLibro(isbn, catalogo, rootPane);
    }

    /**
     * Test of leerAlmacen method, of class Catalogo.
     * @throws java.lang.Exception
     */
    @Test
    public void testLeerAlmacen() throws Exception {
        System.out.println("leerAlmacen");
        Lista<Libro> catalogo = null;
        Component rootpane = null;
        Catalogo.leerAlmacen(catalogo, rootpane);
        if(catalogo.getTamanio() != 0){
        System.out.println("se leyó correctamente.");
        }
    }
}
