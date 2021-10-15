package EjerciciosComplementariosLevel1;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);
        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();
        sc.close();

        int mul = 1;

        for (int i = 1; i <= num; i++){
            mul = mul * i;
        }
        System.out.println("El factorial de " + num + " es " + mul);
    }
}