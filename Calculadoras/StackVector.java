package Calculadoras;

/**
 * Esta es la clase implementa la interfaz de la pila, con vectores.
 * Universidad del Valle de Guatemala
 * @author Mark Albrand
 * @author Jimena Hernández
 * @author Emily Pérez
 * @version 2-mar-22
 */

import java.util.Vector;

public class StackVector<T> implements Pila<T> {
    private Vector<T> cache;

    /**
     * Constructor de la clase
     */
    public StackVector(){
        cache = new Vector<T>();  // Tamaño inicial: 10        
    }

    /**
     * Ingresa un elemento a la pila
     */
    @Override
    public void push(T value){
        cache.add(value);
    }

    /**
     * Retira el primer elemento del Vector
     * @return El elemento retirado
     */
    @Override
    public T pull(){
        T element = cache.get(cache.size()-1);
        cache.removeElementAt(cache.size()-1);
        return element;
    }

    /**
     * Regresa el tamaño del cache vector
     * @return Tamaño
     */
    public int count(){
        return cache.size();
    }

    /**
     * Regresa el último elemento añadido a la pila
     * @return
     */
    public T peek(){
        return cache.get(cache.size() - 1);
    }

    /**
     * Regresa si el cache está vació
     * @return
     */
    public boolean isEmpty(){
        return cache.isEmpty();
    }


    
}
