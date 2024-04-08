import java.util.Arrays;
import java.util.Scanner;

public class exerc11 {
//    11. (ExeVetor11) Escreva um programa que leia um vetor de 20 posições e mostre-o ordenado
//    em ordem crescente.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[20];

        System.out.println("Digite os 20 elementos do vetor:");
        for (int i = 0; i < 20; i++) {
            vetor[i] = scanner.nextInt();
        }

        Arrays.sort(vetor);

        System.out.println("Vetor ordenado em ordem crescente:");
        for (int i = 0; i < 20; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
