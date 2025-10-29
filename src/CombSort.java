public class CombSort {
    public static int trocas;
    public static int iteracoes;

    public static void sort(int tamanho, int[] vetor) {
        trocas = 0;
        iteracoes = 0;

        int gap = tamanho;
        boolean trocou = true;
        int temp;

        while (gap > 1 || trocou) {
            gap = (gap * 10) / 13;
            if (gap < 1) gap = 1;

            trocou = false;

            for (int i = 0; i + gap < tamanho; i++) {
                iteracoes++;
                if (vetor[i] > vetor[i + gap]) {
                    temp = vetor[i];
                    vetor[i] = vetor[i + gap];
                    vetor[i + gap] = temp;
                    trocou = true;
                    trocas++;
                }
            }
        }
    }
}
