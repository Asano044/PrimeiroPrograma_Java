package Exercicios;

public class ConversaoTemperatura {
    public static void main(String[]args) {
        int tempCelsius = 100;
        double tempFahrenheit = (tempCelsius * 1.8) + 32;
        int exibirTemperaturaConvertida = (int) tempFahrenheit;

        System.out.println("A temperatura convertida é: " + exibirTemperaturaConvertida);
    }
}
