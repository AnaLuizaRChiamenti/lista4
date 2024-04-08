public class exerc3 {
//    (ExeVetor03) Preencher um vetor B de 10 elementos em tempo de execução com o
//    número 10 se o índice do elemento for ímpar, e com o número 20 se for par. Escrever o
//    vetor B após o seu total preenchimento.

    public static void main(String[] args) {
        int[] vetorB = new int[10];

        System.out.println("Vetor B:");
        for(int i = 0; i < vetorB.length; i++ ){
            if (i % 2 == 0) {
                vetorB[i] = 20;
            } else {
                vetorB[i] = 10;
            }
            System.out.println("Elemento " + i + ": " + vetorB[i]);

        }
    }
}
