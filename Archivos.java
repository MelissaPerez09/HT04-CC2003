                                                                                                                                    /**
* Esta es la lee archivos de texto
* @author: Mark Albrand
* @version: 18-ene-22
*/

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Archivos {
    File archivo;

    /**
     * Constructor de la clase
     * @param nombreArchivo Nombre o dirección del archivo
     * @throws IOException Si no se logra abrir correctamente el archivo
     */
    Archivos(String nombreArchivo) throws IOException{
        archivo = new File(nombreArchivo);
        archivo.createNewFile();
        
    }

    /**
     * Lee todas las lineas posibles de un archivo
     * @return Un ArrayList con todas las lineas leidas
     * @throws IOException
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
