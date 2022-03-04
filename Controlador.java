/**
 * Esta es la clase principal del programa.
 * Contiene al método main
 * Universidad del Valle de Guatemala
 * @author: Mark Albrand
 * @author: Jimena Hernández
 * @author: Emily Pérez
 * @version: 2-mar-22
 */

import Calculadoras.CalculadoraDouble;
import Calculadoras.CalculadoraVectores;
import Calculadoras.DoubleLinkedList;

import java.util.ArrayList;

public class Controlador{
    private static Archivos archivo = null;
    private static String nombreArchivo = "ejemplo.txt";  // NOMBRE DEL ARCHIVO CON LOS OPERANDOS
    private static CalculadoraVectores calculadoraVectores = CalculadoraVectores.getInstance();
    private static CalculadoraDouble calculadoraDouble = CalculadoraDouble.getInstance();
    /**
     * Función main del programa
     * @param args argumentos de la línea de comando
     */
    public static void main(String[] args) {
    int opcion;
        
        ArrayList<String> lineas = null;
        
        try {
            archivo = new Archivos(nombreArchivo);
            lineas = archivo.leer();
        } catch (Exception e) {
            print("No se pudo abrir el archivo");
        }

        for (int i = 0; i < lineas.size(); i++) {
            String lineaActual = lineas.get(i);
            Integer resultado = calculadoraVectores.Evaluate(lineaActual);
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