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
public class Autor {
    private String nombre;
    private String apellido;
    private int tamanio = 0;
    
    public Autor(){
    
    }
    
    public Autor(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        tamanio++;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    
    public int getTamanio() {
        return tamanio;
    }
}