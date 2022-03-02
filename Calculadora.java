/**
 * Esta es la clase que implementa la interfaz de la calculadora Infix.
 * Analiza una línea a la vez.
 * @author: Mark Albrand
 * @author: Jimena Hernández
 * @author: Emily Pérez
 * @version: 2-mar-22
 */

public class Calculadora implements InFixCalc {

    /** 
    * Evalua una linea en formato postfix
    * @param expression Linea en formato postfix
    * @return Resultado
    */
    public int Evaluate(String expression){

        String[] lineaActual = expression.split(" ");        
        Stack<Integer> calculadora = new Stack<Integer>();

            Integer resultado = 0;
            for (int j = 0; j < lineaActual.length; j++) {
                String c = lineaActual[j];

                try {
                    int element = Integer.parseInt(c);
                    calculadora.push(element);
                } catch (Exception e) {
                    int n = calculadora.count() - 1;

                    if(n >= 1){
                        switch (c) {                        
                            case "+":
                                Integer operando1 = calculadora.pull();
                                for (int k = 0; k < n; k++) {
                                    operando1 = operando1 + calculadora.pull();
                                }
                                resultado = operando1;
                                calculadora.push(resultado);
                                break;
    
                            case "-":
                                Integer operando2 = calculadora.pull();
                                for (int k = 0; k < n; k++) {
                                    operando2 = operando2 - calculadora.pull();
                                }
                                resultado = operando2;
                                calculadora.push(resultado);
                                break;
    
                            case "*":
                                Integer operando3 = calculadora.pull();
                                for (int k = 0; k < n; k++) {
                                    operando3 = operando3 * calculadora.pull();
                                }
                                resultado = operando3;
                                calculadora.push(resultado);
                                break;
    
                            case "/":
                                Integer operando4 = calculadora.pull();
                                for (int k = 0; k < n; k++) {
                                    operando4 = operando4 / calculadora.pull();
                                }
                                resultado = operando4;
                                calculadora.push(resultado);
                                break;
                        
                            default:
                                resultado = -1;
                                break;
                        }
                    }else{
                        resultado = calculadora.pull();  // Si ya no quedan operandos
                    }

                    
                }
            }

            return resultado;
            

        }
}
