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
public class PosicionIlegalException extends Exception {
    public PosicionIlegalException() { 
        super(" posicion ilegal en la lista "); 
    }
}
