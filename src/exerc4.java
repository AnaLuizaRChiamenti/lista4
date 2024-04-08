import java.util.Scanner;

public class exerc4 {
//    4. (ExeVetor04) Escreva um programa que leia e mostre um vetor de 20 elementos inteiros
//    (inicializado em tempo de compilação). A seguir, conte e diga quantos valores pares existem no vetor.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] x = new int[20];

        System.out.println("Insira 20 números inteiros: ");
        for (int i = 0; i < 20; i++) {
            x[i] = scanner.nextInt();
        }

        int countEven = 0;

        for (int i = 0; i < 20; i++) {
            if (x[i] % 2 == 0) {
                countEven++;
            }
        }

        System.out.println("Os valores pares são: " + countEven);
    }
}
