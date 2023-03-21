import java.util.Locale;
import java.util.Scanner;

/**
 * Programa que implementa o Exercício 4 do curso Loops e Array da DIO.
 * Este programa permite a entrada de um número e em seguida calcula e exibe seu fatorial.
 * Após a verificação exibe a quantidade de pares e a quantidade de ímpares.
 * @author Rodrigo Viana
 * @version 1.0
 */
public class ExemploFor02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scan.nextInt();
        int fatorial = 1;

        //Cálculo do fatorial
        for (int i = 1; i <= numero; i++) {
            System.out.println(numero + "! = " + fatorial + " * " + i + " = " + fatorial * i);
            fatorial = fatorial * i;
        }

        System.out.println("Fatorial de " + numero + ": " + fatorial);
        scan.close();
    }
}
