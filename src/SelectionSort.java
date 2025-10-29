public class SelectionSort {
    public static int trocas;
    public static int iteracoes;

    public static void sort(int tamanho, int[] vetor) {
        trocas = 0;
        iteracoes = 0;

        for (int i = 0; i < tamanho - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < tamanho; j++) {
                iteracoes++;
                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = vetor[i];
                vetor[i] = vetor[minIndex];
                vetor[minIndex] = temp;
                trocas++;
            }
        }
    }
}
