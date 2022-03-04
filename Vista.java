import java.util.Scanner;
import java.util.InputMismatchException;

public class Vista {
    Scanner scan = new Scanner(System.in);


    public void mensaje(String mensaje){
        System.out.println(mensaje);
    }

    public int menu(){
        int opcion;
        mensaje("\n" +"¿Qué calculadora desea usar?");
        System.out.println("1. Arralist");
        System.out.println("2. Vector");
        System.out.println("3. Double Linkedlist");
        System.out.println("4. Single Linkedlist");
        System.out.println("5. Salir");

        System.out.print("Seleccion: ");
        try {
            opcion = scan.nextInt();

        } catch (InputMismatchException e) {
            mensaje("Porfavor, ingrese una opción válida");
            Scanner scan = new Scanner(System.in);
            opcion = scan.nextInt();

        }

        scan.nextLine();
        return opcion;
    }
}
