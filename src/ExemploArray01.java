public class ExemploArray01 {

    /**
     * Programa que implementa o Exercício 4 do curso Loops e Array da DIO.
     * Este programa permite a entrada de N numeros e verifica se cada um desses N numeros são pares ou ímpares.
     * Após a verificação exibe a quantidade de pares e a quantidade de ímpares.
     * @author Rodrigo Viana
     * @version 1.0
     */
    public static void main(String[] args) {
        int[] numeros = {1, 2, 39, 4, 5, 75};
        int count = 0;

        //Exibe o vetor na ordem original
        System.out.print("Vetor original: ");
        while (count < numeros.length) {
            System.out.print(numeros[count] + " ");
            count++;
        }

        //Exibe o vetor na ordem inversa
        System.out.print("\nVetor invertido: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}
