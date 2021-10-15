package EjerciciosComplementariosLevel1;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Ingrese un número entero: ");
        int num = sc.nextInt();
        sc.close();

        for (int i=1; i <= num; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}