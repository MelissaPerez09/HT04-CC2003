import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Esta es la clase que ejecuta los JUnit tests.
 * Universidad del Valle de Guatemala
 * Prueba las funcionalidades de la calculadora y de la implementación de la pila
 * @author: Mark Albrand
 * @author: Jimena Hernández
 * @author: Emily Pérez
 * @version: 2-mar-22
 */

class CalculadoraTests {
    private Calculadora calculadora = new Calculadora();

    @Test
    public void testCalculadora(){
        assertEquals(15, calculadora.Evaluate("1 2 + 4 * 3 +"));
    }

    @Test
    public void testStack(){
        Stack<Integer> stacker = new Stack<Integer>();
        stacker.push(10);
        stacker.push(20);

        assertEquals(20, stacker.peek());
        stacker.pull();
        assertEquals(10, stacker.peek());

    }
}