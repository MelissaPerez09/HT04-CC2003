import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Esta es la clase administra la interacción con archivos de texto.
 * Abre y lee archivos con operaciones en formato infix
 * Universidad del Valle de Guatemala
 * @author: Mark Albrand
 * @author: Jimena Hernández
 * @author: Emily Pérez
 * @version: 2-mar-22
 */



public class Archivos {
    private File archivo;

    /**
     * Constructor de la clase
     * @param nombreArchivo Nombre o dirección del archivo
     * @throws IOException Si no se logra abrir correctamente el archivo, se genera una IOException
     */
    public Archivos(String nombreArchivo) throws IOException{
        archivo = new File(nombreArchivo);
        archivo.createNewFile();
        
    }

    /**
     * Lee todas las lineas posibles de un archivo
     * @return Un ArrayList con todas las lineas leidas
     * @throws IOException Si no se logra leer correctamente el archivo, se genera una IOException
     */
    public ArrayList<String> leer() throws IOException{
        ArrayList<String> cache = new ArrayList<String>();
        Scanner myReader = new Scanner(archivo);
        while (myReader.hasNextLine()) {
            String localData = myReader.nextLine();
            cache.add(localData);
        }



        myReader.close();
        return cache;
    }
}
