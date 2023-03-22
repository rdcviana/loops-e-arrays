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
            int numero;
            System.out.print("Digite o " + (i + 1) + "° número (entre 0 e 100): ");
            numero = scan.nextInt();
            //Verifica se número digitado está no intervalo entre 0 e 100, inclusive.
            while (numero < 0 || numero > 100) {
                System.out.print("Número fora do intervalo! Digite o " + (i + 1) + "° número (entre 0 e 100): ");
                numero = scan.nextInt();
            }
            numeros[i] = numero;
        }

        //Exibição dos números e seus sucessores
        for (Integer numero : numeros) {
            System.out.println("Número: " + numero + " -> Sucessor: " + (numero + 1));
        }
        scan.close();
    }
}
