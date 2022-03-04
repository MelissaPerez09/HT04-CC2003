package Calculadoras;

/**
 * Esta es la interfaz para una ADT de una pila.
 * Puede crearse a base de cualquier tipo primitivo de datos.
 * Universidad del Valle de Guatemala
 * @author Mark Albrand
 * @author Jimena Hernández
 * @author Emily Pérez
 * @version 2-mar-22
 */

public interface Pila<T> {
    /**
     * Operación push de una pila
     * @param value Valor a ingresar
     */
    public void push(T value);

    /**
     * Operación pull de una pila
     * @return El elemento deseado
     */
    public T pull();

    /**
     * Operación peek para una pila
     * @param index Posicion deseada
     * @return Elemento deseado
     */
    public T peek();

    /**
     * Regresa la cantidad de elementos en el cache
     * @return Tamaño del vector
     */
    public int count();

    /**
     * Regresa si el vector está vacio
     * @return Booleano de si esta 
     */
    public boolean isEmpty();
}
