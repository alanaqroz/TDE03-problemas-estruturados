public class CocktailSort {
    public static int trocas;
    public static int iteracoes;

    public static void sort(int tamanho, int[] vetor) {
        trocas = 0;
        iteracoes = 0;

        boolean trocou = true;
        int inicio = 0;
        int fim = tamanho - 1;
        int temp;

        while (trocou) {
            trocou = false;

            for (int i = inicio; i < fim; i++) {
                iteracoes++;
                if (vetor[i] > vetor[i + 1]) {
                    temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    trocou = true;
                    trocas++;
                }
            }

            if (!trocou) break;
            trocou = false;
            fim--;

            for (int i = fim; i > inicio; i--) {
                iteracoes++;
                if (vetor[i] < vetor[i - 1]) {
                    temp = vetor[i];
                    vetor[i] = vetor[i - 1];
                    vetor[i - 1] = temp;
                    trocou = true;
                    trocas++;
                }
            }
            inicio++;
        }
    }
}
