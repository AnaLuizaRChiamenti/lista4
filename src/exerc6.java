import java.util.Scanner;

public class exerc6 {
//    6. (ExeVetor06) Escreva um programa que leia um vetor de 30 posições de números inteiros
//            (inicializado em tempo de compilação) e mostre somente os positivos com suas
//    respectivas posições.

    public static void main(String[] args) {
        int[] vetor = new int[30];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 30 números inteiros:");
        for (int i = 0; i < 30; ++i) {
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Números positivos e suas posições:");
        for (int i = 0; i < 30; ++i) {
            if (vetor[i] > 0) {
                System.out.println("Posição " + i + ": " + vetor[i]);
            }
        }
    }
}
