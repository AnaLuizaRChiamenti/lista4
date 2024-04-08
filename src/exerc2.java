public class exerc2 {
//    (ExeVetor02) Preencher um vetor A de 10 elementos (índices de 0 a 9) em tempo de
//    execução com os números inteiros 10, 20, 30, 40, 50, ..., 100. Escrever o vetor A após o
//    seu total preenchimento.

    public static void main(String[] args) {
        int[] vetorA = new int[10];

        System.out.println("Vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (i + 1) * 10;
            System.out.println("Elemento " + i + ": " + vetorA[i]);
        }
    }
}
