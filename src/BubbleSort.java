public class BubbleSort {
    public static int trocas;
    public static int iteracoes;

    public static void sort(int tamanho, int[] vetor) {
        trocas = 0;
        iteracoes = 0;
        int temp;

        for (int i = 0; i < tamanho; i++) {
            boolean trocou = false;
            for (int j = 1; j < tamanho - i; j++) {
                iteracoes++;
                if (vetor[j - 1] > vetor[j]) {
                    temp = vetor[j - 1];
                    vetor[j - 1] = vetor[j];
                    vetor[j] = temp;
                    trocou = true;
                    trocas++;
                }
            }
            if (!trocou) break;
        }
    }
}
