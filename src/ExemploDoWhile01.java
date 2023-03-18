import java.util.Locale;
import java.util.Scanner;

/**
 * Programa que implementa o Exercício 3 do curso Loops e Array da DIO
 * @author Rodrigo Viana
 * @version 1.0
 */
public class ExemploDoWhile01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        double soma = 0;
        double media;
        int contador = 0;
        int maior = 0;

        do {
            System.out.print("Digite um número: ");
            int numero = scan.nextInt();
            //Verficação do maior número
            if (numero > maior)
                maior = numero;
            soma += numero;
            contador++;
        } while (contador < 5);

        media = soma / 5;

        System.out.println();
        System.out.println("A média dos número é " + media);
        System.out.println("O maior número digitado é: " + maior);
    }
}
