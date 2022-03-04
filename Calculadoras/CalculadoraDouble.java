package Calculadoras;

public class CalculadoraDouble extends Calculadora implements InFixCalc{
    private static CalculadoraDouble instance;

    public static CalculadoraDouble getInstance(){
        if(instance == null){
            instance = new CalculadoraDouble();
            return instance;
        } else{
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
        DoubleLinkedList<Integer> calculadora = new DoubleLinkedList<>();

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
                }else{
                    resultado = calculadora.DeleteAtStart();  // Si ya no quedan operandos
                }


            }
        }

        return resultado;

    }
}
