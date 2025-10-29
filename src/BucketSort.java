public class BucketSort {
    public static int trocas;
    public static int iteracoes;

    public static void sort(int tamanho, int[] vetor) {
        trocas = 0;
        iteracoes = 0;

        int max = vetor[0];
        int min = vetor[0];

        for (int i = 1; i < tamanho; i++) {
            iteracoes++;
            if (vetor[i] > max) max = vetor[i];
            if (vetor[i] < min) min = vetor[i];
        }

        int range = max - min + 1;
        int[] count = new int[range];

        for (int i = 0; i < tamanho; i++) {
            iteracoes++;
            count[vetor[i] - min]++;
        }

        int index = 0;
        for (int i = 0; i < range; i++) {
            while (count[i] > 0) {
                vetor[index++] = i + min;
                count[i]--;
                trocas++;
            }
        }
    }
}
