package Calculadoras;

/**
 * Esta es la clase que implementa la interfaz de la calculadora Infix con Listas simples encadenadas.
 * Analiza una línea a la vez.
 * Universidad del Valle de Guatemala
 * @author Mark Albrand
 * @author Jimena Hernández
 * @author Emily Pérez
 * @version 2-mar-22
 */

public class CalculadoraSingle extends Calculadora implements InFixCalc{
    private static CalculadoraSingle instance;

    /**
     * Regresa la instancia para aplicar singleton
     * @return Instancia deseada
     */
    public static CalculadoraSingle getInstance(){
        if(instance == null){
            instance = new CalculadoraSingle();
            return instance;
        } 
        else{
            return instance;
        }
    }

    /**
     * Evaluate una linea en formato infix
     * @param expression Linea en formato postfix
     * @return Resultado
     */
    @Override
    public int Evaluate(String expression) {
        String[] lineaActual = expression.split(" ");
        SingleLinkedList<Integer> calculadora = new SingleLinkedList<>();

        Integer resultado = 0;
        for (int j = 0; j < lineaActual.length; j++) {
            String c = lineaActual[j];

            try {
                int element = Integer.parseInt(c);
                calculadora.InsertAtStart(element);
            } catch (Exception e) {
                int n = calculadora.Count() - 1;

                if(n >= 1){
                    switch (c) {
                        case "+":
                            Integer operando1 = calculadora.DeleteAtStart();
                            for (int k = 0; k < n; k++) {
                                operando1 = operando1 + calculadora.DeleteAtStart();
                            }
                            resultado = operando1;
                            calculadora.InsertAtStart(resultado);
                            break;

                        case "-":
                            Integer operando2 = calculadora.DeleteAtStart();
                            for (int k = 0; k < n; k++) {
                                operando2 = operando2 - calculadora.DeleteAtStart();
                            }
                            resultado = operando2;
                            calculadora.InsertAtStart(resultado);
                            break;

                        case "*":
                            Integer operando3 = calculadora.DeleteAtStart();
                            for (int k = 0; k < n; k++) {
                                operando3 = operando3 * calculadora.DeleteAtStart();
                            }
                            resultado = operando3;
                            calculadora.InsertAtStart(resultado);
                            break;

                        case "/":
                            Integer operando4 = calculadora.DeleteAtStart();
                            for (int k = 0; k < n; k++) {
                                operando4 = operando4 / calculadora.DeleteAtStart();
                            }
                            resultado = operando4;
                            calculadora.InsertAtStart(resultado);
                            break;

                        default:
                            resultado = -1;
                            break;
                    }
                }
                else{
                    resultado = calculadora.DeleteAtStart();  // Si ya no quedan operandos
                }
            }
        }
        return resultado;
    }
}
