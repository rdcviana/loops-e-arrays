import java.util.Locale;
import java.util.Scanner;

/**
 * Programa que implementa o Exercício 5 do curso Loops e Array da DIO.
 * Este programa permite a entrada de um número e em seguida calcula e exibe sua tabuada.
 * @author Rodrigo Viana
 * @version 1.0
 */
public class ExemploFor01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scan.nextInt();

        //Laço responsável pelo cálculo e exibição na tela da tabuada
        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i < 11; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }

        scan.close();
    }
}
