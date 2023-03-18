import java.util.Locale;
import java.util.Scanner;

/**
 * Programa que implementa o Exercício 2 do curso Loops e Array da DIO
 *
 * @author rdcviana
 * @version 1.0
 */
public class ExemploWhile02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        double nota;

        System.out.print("Digite uma nota entre 0 e 10: ");
        nota = scan.nextDouble();

        while (nota < 0 || nota > 10) {
            System.out.print("Valor inválido! Digite novamente: ");
            nota = scan.nextDouble();
        }

        System.out.println();
        System.out.println("Nota digitada: " + nota);
        System.out.println("Programa finalizado.");
        System.out.println("-----------------------------");
    }
}
