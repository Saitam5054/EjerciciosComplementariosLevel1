package EjerciciosComplementariosLevel1;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){

        int num1, num2;

        Scanner sc = new Scanner (System.in);

        System.out.print("Ingrese un número: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese otro número: ");
        num2 = sc.nextInt();
        sc.close();

        System.out.println("La suma entre " + num1 + " y " + num2 + " es: " + (num1 + num2));
        System.out.println("La resta entre " + num1 + " y " + num2 + " es: " + (num1 - num2));
        System.out.println("La multiplicación entre " + num1 + " y " + num2 + " es: " + (num1 * num2));
        System.out.println("La división entre " + num1 + " y " + num2 + " es: " + (num1 / num2));
        System.out.println("El módulo entre " + num1 + " y " + num2 + " es: " + (num1 % num2));
        
    }
}
