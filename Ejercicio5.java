package EjerciciosComplementariosLevel1;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        int num1, num2, res = 0, mul = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese otro número: ");
        num2 = sc.nextInt();
        sc.close();

        for (int i=1; i<= num2; i++) {
            res = res + num1;
        }

        System.out.print("El resultado de la multipliación entre " + num1 + " y " + num2 + " por suma sucesiva es "); 
        for (int i=1; i<= num2 - 1; i++) {
            mul = mul + num1;
            System.out.print(num1 + " + ");
        }
        System.out.println(num1 + " = "+ res); 

    }
}
