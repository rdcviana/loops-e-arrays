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

        while (true) {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = scan.nextDouble();

            //Verificação se nota está entre o intervalo entre 0 e 10
            if (nota < 0 || nota > 10) {
                System.out.println();
                System.out.println("Valor inválido! Programa finalizado.");
                break;
            }

            System.out.println();
            System.out.println("Nota digitada: " + nota);
            System.out.println("-----------------------------");
        }
    }
}
