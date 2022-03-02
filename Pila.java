/**
* Esta interfaz es para una ADT de pila
* @author: Mark Albrand
* @version: 18-ene-22
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
