package EjerciciosComplementariosLevel1;
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args){

    String txt, car;
    int can;

    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese una frase o texto: ");
    txt = sc.nextLine();
    System.out.print("Ingrese un caracter para saber cuantas veces aparece: ");
    car = sc.nextLine();
    sc.close();

    can = txt.split(car,-1).length-1;

    System.out.print("La letra '" + car + "' aparece " + can + " veces");

    }
}
