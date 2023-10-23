import java.util.Scanner;

public class OutroLoop {
    public static void main(String[]args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNotas = 0;
        String condicao = "s";
        while (condicao.equals("s")) {
            System.out.println("Diga sua nota para o filme: ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;

            System.out.println("Deseja continuar avaliando? [s/n]");
            condicao = leitura.next();

            totalNotas++;
        }
        System.out.println("Média das avaliações: " + mediaAvaliacao/totalNotas);
    }
}
