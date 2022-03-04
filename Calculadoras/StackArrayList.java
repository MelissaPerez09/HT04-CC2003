package Calculadoras;

import java.util.ArrayList;
import java.util.Vector;

public class StackArrayList<T> implements Pila<T> {
    private ArrayList<T> cache;

    /**
     * Constructor de la clase
     */
    public StackArrayList(){
        cache = new ArrayList<T>();  // Tamaño inicial: 10
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
        cache.remove(cache.size()-1);
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
     * @return Devuelve el último elemento añadido
     */
    public T peek(){
        return cache.get(cache.size() - 1);
    }

    /**
     * Regresa si el caché está vació
     * @return Si el ArrayList está vacío
     */
    public boolean isEmpty(){
        return cache.isEmpty();
    }

}
