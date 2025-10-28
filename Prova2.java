  import java.util.Scanner;
public class Prova2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char continuar;

        System.out.println("=====================================");
        System.out.println("        CONVERSOR DE TEMPERATURAS     ");
        System.out.println("=====================================");
        System.out.println("Este programa converte °C em °F e K e classifica o clima.\n");

        do {
            // Entrada da temperatura em Celsius
            System.out.print("Digite a temperatura em Celsius (°C): ");
            double celsius = entrada.nextDouble();

            // Conversões
            double fahrenheit = (celsius * 9 / 5) + 32;
            double kelvin = celsius + 273.15;

            // Classificação de temperatura
            String classificacao;
            if (celsius < 0) {
                classificacao = "❄️ Muito fria";
            } else if (celsius >= 0 && celsius < 15) {
                classificacao = "🥶 Fria";
            } else if (celsius >= 15 && celsius < 25) {
                classificacao = "🙂 Agradável";
            } else if (celsius >= 25 && celsius < 35) {
                classificacao = "🔥 Quente";
            } else {
                classificacao = "🌋 Extremamente quente";
            }

            // Exibição dos resultados
            System.out.println("\n--- RESULTADOS ---");
            System.out.printf("Temperatura em Celsius: %.2f °C%n", celsius);
            System.out.printf("Temperatura em Fahrenheit: %.2f °F%n", fahrenheit);
            System.out.printf("Temperatura em Kelvin: %.2f K%n", kelvin);
            System.out.println("Classificação: " + classificacao);

            // Pergunta se o usuário quer repetir
            System.out.print("\nDeseja converter outra temperatura? (S/N): ");
            continuar = entrada.next().toUpperCase().charAt(0);
            System.out.println();

        } while (continuar == 'S');

        System.out.println("Programa finalizado. Obrigado por utilizar!");
        System.out.println("=====================================");

        entrada.close();
    }
}

