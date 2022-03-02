/**
 * Esta es la clase principal del programa.
 * Contiene al método main
 * @author: Mark Albrand
 * @author: Jimena Hernández
 * @author: Emily Pérez
 * @version: 2-mar-22
 */

import java.util.ArrayList;

public class Controlador{
    private static Archivos archivo = null;
    private static String nombreArchivo = "ejemplo.txt";  // NOMBRE DEL ARCHIVO CON LOS OPERANDOS
    private static Calculadora calculadora = new Calculadora();

    /**
     * Función main del programa
     * @param args argumentos de la línea de comando
     */
    public static void main(String[] args) {
        
        ArrayList<String> lineas = null;
        
        try {
            archivo = new Archivos(nombreArchivo);
            lineas = archivo.leer();
        } catch (Exception e) {
            print("No se pudo abrir el archivo");
        }

        for (int i = 0; i < lineas.size(); i++) {
            String lineaActual = lineas.get(i);
            Integer resultado = calculadora.Evaluate(lineaActual);
            if (resultado != -1) {
                print("Resultado " + (i+1) + ": " + resultado.toString());
            }else{
                print("No se reconoció la operación");
            }
        }

    

        

        
        

    }

    /**
     * Macro para imprimir mensajes a la pantalla
     * @param mensaje Mensaje a imprimir
     */
    private static void print(String mensaje){
        System.out.println(mensaje);
    }
}