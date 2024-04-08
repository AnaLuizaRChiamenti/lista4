public class exerc1 {
//    (ExeVetor01) Preencher um vetor X de 10 elementos (índices de 0 a 9) em tempo de
//    execução com o valor inteiro 30. Escrever o vetor X após seu total preenchimento.

    public static void main(String[] args) {

        int[] x = new int[10];

        for (int i = 0; i < x.length; i++) {
            x[i] = 30;
        }

        for (int i=0; i<x.length; i++) {
            System.out.println(x[i]);
        }
    }
}
