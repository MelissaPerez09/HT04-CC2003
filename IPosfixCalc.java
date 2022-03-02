/**
* Interfaz para calculadora postfix
* @author: Mark Albrand
* @version: 18-ene-22
*/

public interface IPosfixCalc {

    /**
     * Evalua una linea con formato postfix
     * @param expression String con la linea en formato postfix
     * @return Resultado de la operación
     */
    public int Evaluate(String expression);
}
