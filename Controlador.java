/**
 * Esta es la clase principal del programa.
 * Contiene al metodo main
 * Universidad del Valle de Guatemala
 * @author: Mark Albrand
 * @author: Jimena Hernandez
 * @author: Emily Perez
 * @version: 2-mar-22
 */

import Calculadoras.*;

import java.util.ArrayList;

public class Controlador{
    private static Archivos archivo = null;
    private static String nombreArchivo = "ejemplo.txt";  // NOMBRE DEL ARCHIVO CON LOS OPERANDOS
    private static Convertidor convertidor = new Convertidor();
    private static Vista vista = new Vista();

    /**
     * Funcion main del programa
     * @param args argumentos de la linea de comando
     */
    public static void main(String[] args) {
        //System.out.println(Convertidor.infixToPostfix ("((3+4)*2)/7"));
        ArrayList<String> lineas = null;

        try {
            archivo = new Archivos(nombreArchivo);
            lineas = archivo.leer();
            vista.mensaje("Su archivo se ha abierto correctamente...");
        } catch (Exception e) {
            vista.mensaje("No se pudo abrir el archivo");
        }

        for (int i = 0; i < lineas.size(); i++) {
            String lineaActual = lineas.get(i);
            String lineaPostFix = Convertidor.infixToPostfix(lineaActual);
            lineas.set(i, lineaPostFix);
        }
        
        int opcion;
        opcion = vista.menu(); //se llama la opcion
        while(opcion != 5){
            switch(opcion) {
                case 1: // case arraylist
                    CalculadoraArrayLists calculadoraArrays = (CalculadoraArrayLists)(Factory.getCalculadora(opcion));
                    for (int i = 0; i < lineas.size(); i++) {
                        String lineaActual = lineas.get(i);
                        Integer resultado = calculadoraArrays.Evaluate(lineaActual);
                        if (resultado != -1) {
                            vista.mensaje("Resultado " + (i+1) + ": " + resultado.toString());
                        }else{
                            vista.mensaje("No se reconoció la operación");
                        }
                    }
                    break;
                case 2: // case vector
                    CalculadoraVectores calculadoraVectores = (CalculadoraVectores)(Factory.getCalculadora(opcion));
                    for (int i = 0; i < lineas.size(); i++) {
                        String lineaActual = lineas.get(i);
                        Integer resultado = calculadoraVectores.Evaluate(lineaActual);
                        if (resultado != -1) {
                            vista.mensaje("Resultado " + (i+1) + ": " + resultado.toString());
                        }else{
                            vista.mensaje("No se reconocio la operacion");
                        }
                    }

                    break;
                case 3: // case single Linkedlist
                    CalculadoraSingle calculadoraSingle = (CalculadoraSingle) (Factory.getCalculadora(opcion));
                    for (int i = 0; i < lineas.size(); i++) {
                        String lineaActual = lineas.get(i);
                        Integer resultado = calculadoraSingle.Evaluate(lineaActual);
                        if (resultado != -1) {
                            vista.mensaje("Resultado " + (i+1) + ": " + resultado.toString());
                        }else{
                            vista.mensaje("No se reconocio la operacion");
                        }
                    }
                    break;
                case 4: // case double Linkedlist
                    CalculadoraDouble calculadoraDouble = (CalculadoraDouble) (Factory.getCalculadora(opcion));
                    for (int i = 0; i < lineas.size(); i++) {
                        String lineaActual = lineas.get(i);
                        Integer resultado = calculadoraDouble.Evaluate(lineaActual);
                        if (resultado != -1) {
                            vista.mensaje("Resultado " + (i+1) + ": " + resultado.toString());
                        }else{
                            vista.mensaje("No se reconocio la operacion");
                        }
                    }

                    break;
                case 5:
                    //salir
                    vista.mensaje("saliendo...");
                    System.exit(0);
                    break;

                //Se le avisa al usuario que no esta ingresando una opcion correcta
                default: vista.mensaje("-Opcion invalida, porfavor ingrese una opcion valida-");   break;

            }
            opcion = vista.menu();
        }

        

    }

}