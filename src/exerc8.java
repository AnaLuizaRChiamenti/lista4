import java.util.Scanner;

public class exerc8 {
//    8. (ExeVetor08) Ler um vetor M de 10 elementos e imprimi-lo (ler pelo teclado os 10
//            elementos do tipo inteiro). Troque a seguir o 1o elemento com o 6o, o 2o com o 7o, e assim
//    por diante até o 5o com 10o, e escreva o vetor M modificado.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] M = new int[10];

        System.out.println("Digite os 10 elementos do vetor M:");
        for (int i = 0; i < 10; i++) {
            M[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            int temp = M[i];
            M[i] = M[i + 5];
            M[i + 5] = temp;
        }

        System.out.println("Vetor M modificado:");
        for (int i = 0; i < 10; i++) {
            System.out.print(M[i] + " ");
        }
    }
}
