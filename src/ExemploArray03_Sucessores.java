import java.util.Locale;
import java.util.Scanner;
/**
 * Programa que implementa o Exercício 6 do curso Loops e Array da DIO.
 * Este programa permite a entrada de N numeros e mostra o próprio número e seu sucessor
 * @author Rodrigo Viana
 * @version 1.0
 */
public class ExemploArray03_Sucessores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        Integer[] numeros = new Integer[5];

        //Captura dos números
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            numeros[i] = scan.nextInt();
        }

        //Exibição dos números e seus sucessores
        for (Integer numero : numeros) {
            System.out.println("Número: " + numero + " -> Sucessor: " + (numero + 1));
        }
        scan.close();
    }
}
