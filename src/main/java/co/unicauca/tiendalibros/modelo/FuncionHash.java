/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.tiendalibros.modelo;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class FuncionHash {
    private Libro[] libros;
    
    int cont;
    
    public FuncionHash() {
        libros = new Libro[100];
        Arrays.fill(libros, null);
    }
    
    public void claves(Lista<Libro> listalibros) throws PosicionIlegalException{
        
        for(int i = 0; i < listalibros.getTamanio(); i++){
            int clave = (int) (listalibros.getValor(i).getISBN()%100);
            while(libros[clave] != null){
                clave++;
                if(clave == 100)
                    clave=0;
            }
            libros[clave] = listalibros.getValor(i);
        }
    }
    
    public Libro funcionhash(int clave, Lista<Libro> listalibros) throws PosicionIlegalException {
        claves(listalibros);
        return libros[clave];
    }
}
