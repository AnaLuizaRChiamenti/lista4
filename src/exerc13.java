import java.util.ArrayList;
import java.util.Scanner;

public class exerc13 {
//    13. (ExeVetor13) Faça um programa que leia dois vetores (A e B) de 30 posições e crie um
//    terceiro (C) com a intersecção dos dois primeiros, isto é, coloque em C apenas os
//    elementos que coexistem em A e B. Mostre C.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[30];
        System.out.println("Digite os 30 elementos do vetor A:");
        for (int i = 0; i < 30; i++) {
            A[i] = scanner.nextInt();
        }

        int[] B = new int[30];
        System.out.println("Digite os 30 elementos do vetor B:");
        for (int i = 0; i < 30; i++) {
            B[i] = scanner.nextInt();
        }

        ArrayList<Integer> C = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 30; j++) {
                if (A[i] == B[j]) {
                    C.add(A[i]);
                    break;
                }
            }
        }
        
        System.out.println("Elementos da interseção (vetor C):");
        for (int num : C) {
            System.out.print(num + " ");
        }
    }
}
