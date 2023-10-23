package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(100);

        for (int contador = 1; contador <= 5; contador++) {
            System.out.println("Informe um valor entre 0 e 100: ");
            int valor = entrada.nextInt();

            if(valor < numero) {
                System.out.println("Este valor é menor que o escolhido");
            } else if (valor > numero) {
                System.out.println("Este valor é maior que o escolhido");
            } else {
                System.out.println("Parabéns, você acertou em " + contador + " tentativas!");
                break;
            }

            if (contador == 5) {
                System.out.println("Que pena! O número gerado foi: " + numero);
            }
        }
        entrada.close();
    }
}
