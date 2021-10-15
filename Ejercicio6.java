package EjerciciosComplementariosLevel1;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){

        int num1, num2, res;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese el exponente: ");
        num2 = sc.nextInt();
        sc.close();

        res = num1;
        
        for (int i=1; i < num2; i++){
            res = res * num1;
        }

        System.out.println("La potencia de " + num1 + " elevado a la " + num2 + " es igual a " + res);
    }
    
}
