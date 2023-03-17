import java.util.Locale;
import java.util.Scanner;

/**
 * Programa que implementa o Exercício 1 do curso Loops e Array da DIO
 *
 * @author rdcviana
 * @version 1.0
 */
public class ExemploWhile {
    public static void main(String[] args) {

        //Definição do objeto scanner
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        //Definição dos atributos
        String nome;
        int idade;

        while (true) {
            //Aqui solicitaremos o nome do aluno e em seguida fazer a verificação no while
            System.out.print("Digite o nome do aluno: ");
            nome = sc.nextLine();
            if (nome.equals("0"))
                break;
            System.out.print("Digite a idade do(a) aluno(a) " + nome + ": ");
            idade = sc.nextInt();
            System.out.println();

            //Mostra os dados digitados
            System.out.println("Nome do aluno: " + nome);
            System.out.println("Idade do(a) aluno(a): " + idade);
            System.out.println();

            sc.nextLine();
        }
        //Mensagem informando a finalização do programa
        System.out.println();
        System.out.println("Programa finalizado!");

        sc.close();
    }
}
