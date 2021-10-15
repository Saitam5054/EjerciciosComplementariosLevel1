package EjerciciosComplementariosLevel1;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args){

        String nomyapp, edad, dir, ciu;

        Scanner sc = new Scanner (System.in);

        System.out.print("Ingrese se nombre y apellido: ");
        nomyapp = sc.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = sc.nextLine();
        System.out.print("Ingrese su dirección: ");
        dir = sc.nextLine();
        System.out.print("Ingrese su ciudad: ");
        ciu = sc.nextLine();
        sc.close();

        System.out.print(ciu + " - " + dir + " - " + edad + " - " + nomyapp);

    }
    
}
