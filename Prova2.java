import java.util.Scanner;

public class Prova2 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao conversor de temperaturas!");
        System.out.print("Digite a temperatura em Celsius (°C): ");

        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;

        System.out.println("\n RESULTADOS DA CONVERSÃO");
        System.out.println(" Temperatura em Celsius: " + celsius + " °C");
        System.out.println(" Temperatura em Fahrenheit: " + fahrenheit + " °F");
        System.out.println(" Temperatura em Kelvin: " + kelvin + " K");
        scanner.close();
    }
}
