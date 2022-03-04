import Calculadoras.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Esta es la clase que ejecuta los JUnit tests.
 * Universidad del Valle de Guatemala
 * Prueba las funcionalidades de la calculadora y de la implementación de la pila
 * @author Mark Albrand
 * @author Jimena Hernández
 * @author Emily Pérez
 * @version 2-mar-22
 */

class CalculadoraTests {
    private CalculadoraVectores calculadoraVectores = CalculadoraVectores.getInstance();
    private CalculadoraArrayLists calculadoraArrayLists = CalculadoraArrayLists.getInstance();
    private CalculadoraDouble calculadoraDouble = CalculadoraDouble.getInstance();
    private CalculadoraSingle calculadoraSingle = CalculadoraSingle.getInstance();

    @Test
    public void testCalculadora(){
        String linea = Convertidor.infixToPostfix("1+2*9");
        assertEquals(18, calculadoraVectores.Evaluate(linea));
        assertEquals(18, calculadoraArrayLists.Evaluate(linea));
        assertEquals(18, calculadoraDouble.Evaluate(linea));
        assertEquals(18, calculadoraSingle.Evaluate(linea));
    }

    @Test
    public void testStack(){
        StackVector<Integer> stacker = new StackVector<Integer>();
        stacker.push(10);
        stacker.push(20);

        assertEquals(20, stacker.peek());
        stacker.pull();
        assertEquals(10, stacker.peek());
    }

    @Test
    public void testConvertidor(){
        assertEquals("1 2 9 * +", Convertidor.infixToPostfix("1+2*9"));
    }
}