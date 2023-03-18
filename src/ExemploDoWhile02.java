import java.util.Locale;
import java.util.Scanner;

/**
 * Programa que implementa o Exercício 4 do curso Loops e Array da DIO.
 * Este programa permite a entrada de N numeros e verifica se cada um desses N numeros são pares ou ímpares.
 * Após a verificação exibe a quantidade de pares e a quantidade de ímpares.
 * @author Rodrigo Viana
 * @version 1.0
 */
public class ExemploDoWhile02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        int quantVerificados;
        int quantPares = 0;
        int quantImpares = 0;
        int count = 0;

        //Variável que armazena a quantidade de números que serão verificados
        System.out.print("Quantos números serão verificados? ");
        quantVerificados = scan.nextInt();
        System.out.println();

        do {
            //Caso o valor seja 0 (zero), o programa é finalizado.
            if (quantVerificados == 0) {
                break;
            }
            System.out.print("Digite um número: ");
            int numero = scan.nextInt();
            //Verificação se um número é par ou ímpar
            if ((numero % 2) == 0)
                quantPares++;
            else
                quantImpares++;
            count++;
        } while (count < quantVerificados);
        //Saída de programa
        System.out.println();
        System.out.println("Quantidade de Pares: " + quantPares);
        System.out.println("Quantidade de Ímpares: " + quantImpares);
    }
}
