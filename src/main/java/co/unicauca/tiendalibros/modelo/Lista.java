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
public class Lista<T> {

    /**
     * * Primer elemento de la lista
     */
    private Nodo<T> cabeza;
    /**
     * * Total de elementos de la lista
     */
    private int tamanio;

    /**
     * * Constructor por defecto
     */
    public Lista() {
        cabeza = null;
        tamanio = 0;
    }

    /**
     * * Devuelve el tamanio de la lista
     *
     *
     * @return tamanio
     */
    public int getTamanio() {
        return tamanio;
    }

    /**
     * * Consulta si la lista esta vacia
     *
     *
     * @return true cuando esta vacia , false cuando no
     */
    public boolean esVacia() {
        if (cabeza == null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * * Agrega un nuevo nodo al final de la lista
     *
     *
     * @param valor valor a agregar
     */
    public void agregar(T valor) {
        Nodo<T> nuevo = new Nodo<T>();
        nuevo.setValor(valor);
        if (esVacia()) {
            nuevo.setAnterior(null);
            cabeza = nuevo;
        } else {
            // agregar al final de la lista 
            Nodo<T> aux = cabeza;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setAnterior(aux);
        }
        tamanio++;
    }

    /**
     * inserta un nuevo nodo en la lista
     *
     *
     * @param valor valor a agregar
     *
     * @param pos posicion anterior de donde se insertara el nodo
     *
     * @throws PosicionIlegalException excepcion en caso que la posicion no
     * exista
     */
    public void insertarSiguiente(T valor, int pos) throws PosicionIlegalException {
        if (pos >= 0 && pos <= tamanio) {
            Nodo<T> nuevo = new Nodo<T>();
            nuevo.setValor(valor);
            // el nodo a insertar esta al comienzo de la lista 
            if (pos == 0) {
                nuevo.setSiguiente(cabeza);
                cabeza = nuevo;
                nuevo.setAnterior(null);

            } else {
                // El nodo a insertar va al final de la lista 
                if (pos == tamanio) {
                    Nodo<T> aux = cabeza;
                    while (aux.getSiguiente() != null) {
                        aux = aux.getSiguiente();
                    }
                    aux.setSiguiente(nuevo);
                    nuevo.setAnterior(aux);
                } else {
                    Nodo<T> aux = cabeza;
                    for (int i = 0; i <= pos - 1; i++) {
                        aux = aux.getSiguiente();
                    }
                    Nodo<T> siguiente = aux.getSiguiente();
                    aux.setSiguiente(nuevo);
                    nuevo.setSiguiente(siguiente);
                    nuevo.setAnterior(aux);
                }
            }
            tamanio++;
        } else {
            throw new PosicionIlegalException();
        }
    }

    /**
     * inserta un nuevo nodo en la lista
     *
     *
     * @param valor valor a agregar
     *
     * @param pos posicion donde se insertara el nodo
     *
     * @throws PosicionIlegalException excepcion en caso que la posicion no
     * exista
     */
    public void insertar(T valor, int pos) throws PosicionIlegalException {
        if (pos >= 0 && pos <= tamanio) {
            Nodo<T> nuevo = new Nodo<T>();
            nuevo.setValor(valor);
            // el nodo a insertar esta al comienzo de la lista 
            if (pos == 0) {
                nuevo.setSiguiente(cabeza);
                cabeza = nuevo;
                nuevo.setAnterior(null);

            } else {
                // El nodo a insertar va al final de la lista 
                if (pos == tamanio) {
                    Nodo<T> aux = cabeza;
                    while (aux.getSiguiente() != null) {
                        aux = aux.getSiguiente();
                    }
                    aux.setSiguiente(nuevo);
                    nuevo.setAnterior(aux);
                } else {
                    Nodo<T> aux = cabeza;
                    for (int i = 0; i <= pos - 2; i++) {
                        aux = aux.getSiguiente();
                    }
                    Nodo<T> siguiente = aux.getSiguiente();
                    aux.setSiguiente(nuevo);
                    nuevo.setSiguiente(siguiente);
                    nuevo.setAnterior(aux);
                }
            }
            tamanio++;
        } else {
            throw new PosicionIlegalException();
        }
    }

    /*
    * recorrer lista desde cabeza y luego desde final
     */
    public void RecorrerListaCabeza() throws PosicionIlegalException {
        for (int i = 0; i < tamanio; i++) {
            System.out.println("Lista en la posicion " + i + " tiene como contenido: " + getValor(i));
        }
    }

    public void RecorrerListaFinal() throws PosicionIlegalException {
        for (int i = tamanio; tamanio >= 0; i--) {
            System.out.println("Lista en la posicion " + i + " tiene como contenido: " + getValor(i));
        }
    }

    /**
     * Devuelve el valor de una determinada posicion
     *
     *
     * @param pos posicion
     *
     * @return el valor de tipo T
     *
     * @throws PosicionIlegalException
     */
    public T getValor(int pos) throws PosicionIlegalException {
        if (pos >= 0 && pos < tamanio) {
            T valor = null;
            if (pos == 0) {
                valor = cabeza.getValor();
                return valor;
            } else {
                Nodo<T> aux = cabeza;
                for (int i = 0; i <= pos - 1; i++) {
                    aux = aux.getSiguiente();
                }
                valor = aux.getValor();
            }
            return valor;
        } else {
            throw new PosicionIlegalException();
        }
    }

    /**
     * Elimina un nodo despues de determinada posicion
     *
     *
     * @param pos posicion
     *
     * @throws PosicionIlegalException
     */
    public void removerSiguiente(int pos) throws PosicionIlegalException {
        if (pos >= 0 && pos < tamanio) {
            Nodo<T> aux = cabeza;
            if (pos == 0) {
                // El nodo a eliminar esta en la primera posicion 
                Nodo<T> prox = aux.getSiguiente();
                aux.setSiguiente(prox.getSiguiente());
                aux.setAnterior(cabeza);
                tamanio--;
            } else {
                for (int i = 0; i <= pos - 1; i++) {
                    aux = aux.getSiguiente();
                }
                Nodo<T> prox = aux.getSiguiente();
                aux.setAnterior(aux);
                aux.setSiguiente(prox.getSiguiente());
                tamanio--;
            }
        } else {
            throw new PosicionIlegalException();
        }
    }

    /**
     * Elimina un nodo en una determinada posicion
     *
     *
     * @param pos posicion
     *
     * @throws PosicionIlegalException
     */
    public void remover(int pos) throws PosicionIlegalException {
        if (pos >= 0 && pos < tamanio) {
            if (pos == 0) {
                // El nodo a eliminar esta en la primera posicion 
                cabeza = cabeza.getSiguiente();
                cabeza.setAnterior(null);
                tamanio--;
            } else {
                Nodo<T> aux = cabeza;
                for (int i = 0; i <= pos - 2; i++) {
                    aux = aux.getSiguiente();
                }
                Nodo<T> prox = aux.getSiguiente();
                aux.setAnterior(aux);
                aux.setSiguiente(prox.getSiguiente());
                tamanio--;
            }
        } else {
            throw new PosicionIlegalException();
        }
    }

    /**
     * Clear elimina todos los nodos de la lista
     */
    public void limpiar() {
        cabeza = null;
        tamanio = 0;
    }
}
