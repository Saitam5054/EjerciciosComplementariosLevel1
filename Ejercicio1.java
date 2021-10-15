package EjerciciosComplementariosLevel1;
import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Hola, por favor escriba su nombre: ");
        String nombre = sc.nextLine();

        System.out.println("HOLA " + nombre.toUpperCase());

        sc.close();

    }
}