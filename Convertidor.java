import java.util.Stack;

/**
 * Esta es la clase que convierte de infix a postfix
 * Universidad del Valle de Guatemala
 * @author Mark Albrand
 * @author Jimena Hernández
 * @author Emily Pérez
 * @version 2-mar-22
 */

public class Convertidor {

    private static int preceed(char ch){
        if(ch == '+' || ch == '-') {
            return 1;
        }
        else if(ch == '*' || ch == '/') {
            return 2; 
        }
        else if(ch == '^') {
            return 3;
        }
        else {
            return 0;
        }
    }

    static String infixToPostfix(String expresion){
        //inicia un String para guardar el resultado
        String result = new String("");
         
        //comienza un stack vacío
        Stack<Character> stack = new Stack<>();
         
        for (int i = 0; i<expresion.length(); ++i){
            char c = expresion.charAt(i);
             
            //evalua si es un numero para operarlo
            if (Character.isLetterOrDigit(c)){
                result += c + " ";
            }
            //evalua si el caracter es '(' para ponerlo en el stack
            else if (c == '('){
                stack.push(c);
            }
             
            //evalua si el caracter es ')' para ponerlo en el stack
            else if (c == ')'){
                while (!stack.isEmpty() && stack.peek() != '('){
                    result += stack.pop() + " ";
                    stack.pop();
                }
            }

            //encuentra el operador
            else {
                while (!stack.isEmpty() && preceed(c) <= preceed(stack.peek())){
                    result += stack.pop() + " ";
                }
                stack.push(c);
            }
        }
      
        //hace pop a todos los operadores que se encuentran en el stack
        while (!stack.isEmpty()){
            if(stack.peek() == '('){
                return "Invalid Expression";
            }
            result += stack.pop() + " ";
        }
        return result.trim();
    }
}
