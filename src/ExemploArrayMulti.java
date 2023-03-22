import java.util.Random;
/**
 * Programa que implementa o Exercício 7 do curso Loops e Array da DIO.
 * Este programa cria uma matriz 4x4 de números aleatórios e os exibe.
 * @author Rodrigo Viana
 * @version 1.0
 */
public class ExemploArrayMulti {
    public static void main(String[] args) {

        Random numeroRandomico = new Random();

        //Definição da matriz: caso queira mudar o tamanho da matriz, basta alterar os valores abaixo
        int[][] numeros = new int[4][4];

        //Geração dos números aleatórios
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = numeroRandomico.nextInt(9);
            }
        }

        //Exibição dos números aleatórios
        for (int[] linha : numeros) {
            for (int elementoColuna : linha) {
                System.out.print(elementoColuna + " ");
            }
            System.out.println();
        }
    }
}
