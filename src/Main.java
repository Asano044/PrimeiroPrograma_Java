public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Screen Match");
        System.out.println("Filme: Bolt");
        int ano = 2023;
        System.out.println("Ano de lançamento: " + ano);
        boolean incluidoNoPlano = true;
        float notaDoFilme = 8.1f;

        // Média calculada das notas recebidas
        double media = (9.8 + 6.3 + 8.8) / 3;
        System.out.format("%.2f", media);

        String sinopse = """
                Filme Bolt:
                Filme de aventura com um cachorro, uma gata e um hamster
                """;
        System.out.println("\n" + sinopse + "Incluído no plano? " + incluidoNoPlano + "\n" + " Nota do filme: " +
                notaDoFilme);

        int classificacao = (int) media/2;
        System.out.println(classificacao);

    }
}