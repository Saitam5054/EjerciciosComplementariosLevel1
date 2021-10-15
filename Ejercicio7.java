package EjerciciosComplementariosLevel1;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args){

        String pal, may = "";

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra en minúscula: ");
        pal = sc.nextLine();
        sc.close();

        for (int i=0; i<pal.length(); i++){
            if((pal.charAt(i))>=97 && (pal.charAt(i))<=122){
                char var= (char) ((pal.charAt(i))-32);
                may = may + var;
            } else if ((pal.charAt(i))==' '){
                may = may + " ";
            }
        }
        System.out.println(may);
    }
}