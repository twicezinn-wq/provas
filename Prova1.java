import java.util.Scanner;

public class Prova1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[8]; 
        double[] mediasBimestrais = new double[4];
        double[] mediasSemestrais = new double[2];

        System.out.println("Digite as 8 notas do aluno (uma por vez):");

        for (int i = 0; i < 8; i++) {
            System.out.print((i + 1) + "ª nota: ");
            notas[i] = sc.nextDouble();
        }

        for (int i = 0; i < 4; i++) {
            mediasBimestrais[i] = (notas[i * 2] + notas[i * 2 + 1]) / 2;
        }

        mediasSemestrais[0] = (mediasBimestrais[0] + mediasBimestrais[1]) / 2;
        mediasSemestrais[1] = (mediasBimestrais[2] + mediasBimestrais[3]) / 2;

        double mediaFinal = (mediasSemestrais[0] + mediasSemestrais[1]) / 2;

        System.out.println("\nResultados do Aluno:");
        System.out.println("Práticas");

        for (int i = 0; i < 4; i++) {
            System.out.println((i * 2 + 1) + "º Bimestre: " + notas[i * 2]);
            System.out.println((i * 2 + 2) + "º Bimestre: " + notas[i * 2 + 1]);
            if (i % 2 == 1) { 
                System.out.println((i / 2 + 1) + "º Semestre: " + mediasSemestrais[i / 2]);
                System.out.println("----------------------");
            }
        }

        System.out.println("Média Final: " + mediaFinal);

        sc.close();
    }
}
