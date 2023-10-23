import java.util.Scanner;

public class LeituraDados {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = input.nextLine();
        System.out.println("Informe o ano de lançamento: ");
        int anoLancamento = input.nextInt();
        System.out.println("Informe sua avaliação a respeito do filme: ");
        double avaliacao = input.nextDouble();

        System.out.println(filme);
        System.out.println(anoLancamento);
        System.out.println(avaliacao);

        input.close();
    }
}
