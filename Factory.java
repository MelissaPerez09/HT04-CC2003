import Calculadoras.*;

public class Factory {


    /**
     * @param option El tipo de estructura de datos a utilizar con la Calculadora
     * @return La calculadora elegida.
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
