import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tests extends Calculadora {
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