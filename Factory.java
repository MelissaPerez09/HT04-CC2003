import Calculadoras.*;

public class Factory {


    /**
     * @param option El tipo de estructura de datos a utilizar con la pila
     * @return La pila implementada con la estructura seleccionada
     */
    public static Calculadora getCalculadora(int option) {
        switch (option) {
            case 1:
                return  CalculadoraArrayLists.getInstance();
            case 2:
                return  CalculadoraVectores.getInstance();
            case 3:
                return  CalculadoraSingle.getInstance();
            case 4:
                return  CalculadoraDouble.getInstance();
        }
        return null;
    }
}
