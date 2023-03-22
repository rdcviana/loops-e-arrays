import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ExemploArray02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;
        int count = 0;

        do {
            System.out.print("Letra: ");
            String letra = scan.next();
            //Verificação se caractere digitado não é uma vogal, caso não seja, insere objeto no array.
            if (!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))) {
                consoantes[quantidadeConsoantes] = letra;
                quantidadeConsoantes++;
            }
            count++;
        } while (count < consoantes.length);

        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
        System.out.print("Consoantes digitadas: ");

        //Exibição das consoantes digitadas com o laço forEach
        for (String consoante : consoantes) {
            //Verifica se objeto não é nulo
            if (consoante != null)
                System.out.print(consoante + " ");
        }
        scan.close();
    }
}
