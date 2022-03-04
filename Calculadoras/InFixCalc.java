package Calculadoras;

/**
 * Esta es la interfaz para una calculadora infix
 * Universidad del Valle de Guatemala
 * @author Mark Albrand
 * @author Jimena Hernández
 * @author Emily Pérez
 * @version 2-mar-22
 */

public interface InFixCalc {

    /**
     * Evalua una linea con formato postfix
     * @param expression String con la linea en formato postfix
     * @return Resultado de la operación
     */
    public int Evaluate(String expression);
}
