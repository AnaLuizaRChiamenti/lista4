import java.util.Scanner;

public class exerc10 {
//    10. (ExeVetor10) Escreva um programa que leia diversos números inteiros fornecidos pelo
//    usuário e distribua esses valores entre dois vetores: o vetor dos ímpares e o vetor dos
//    pares. Cada um terá tamanho de 10 elementos. O término do algoritmo se dará quando o
//    usuário digitar zero ou um dos vetores tiver sido totalmente preenchido. Mostre o
//    conteúdo dos dois vetores no final.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] pares = new int[10];
        int[] impares = new int[10];
        int numPares = 0;
        int numImpares = 0;

        int num;
        do {
            System.out.println("Digite um número inteiro (ou 0 para sair): ");
            num = scanner.nextInt();
            if (num != 0) {
                if (num % 2 == 0 && numPares < 10) {
                    pares[numPares++] = num;
                } else if (numImpares < 10) {
                    impares[numImpares++] = num;
                }
            }
        } while (num != 0 && numPares < 10 && numImpares < 10);

        System.out.println("Conteúdo do vetor de pares:");
        for (int i = 0; i < numPares; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.println("\nConteúdo do vetor de ímpares:");
        for (int i = 0; i < numImpares; i++) {
            System.out.print(impares[i] + " ");
        }
    }
}
