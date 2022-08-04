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
public class Nodo<T> {

    private T valor;
    private int prioridad;
    Nodo<T> siguiente;
    Nodo<T> anterior;

    public Nodo() {
        valor = null;
        siguiente = null;
        anterior = null;
    }

    public T getValor() {
        return valor;
    }
    
    public int getPrioridad() {
        return prioridad;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
    
    public void setPrioridad(int prioridad){
        this.prioridad = prioridad;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
    
    public Nodo<T> getAnterior() {
        return anterior;
    }    
    
    public void setAnterior(Nodo<T> anterior) {
        this.anterior = anterior;
    }

}
