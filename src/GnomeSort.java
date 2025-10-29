public class GnomeSort {
    public static int trocas;
    public static int iteracoes;

    public static void sort(int tamanho, int[] vetor) {
        trocas = 0;
        iteracoes = 0;

        int i = 0;
        int temp;

        while (i < tamanho) {
            iteracoes++;
            if (i == 0 || vetor[i] >= vetor[i - 1]) {
                i++;
            } else {
                temp = vetor[i];
                vetor[i] = vetor[i - 1];
                vetor[i - 1] = temp;
                trocas++;
                i--;
            }
        }
    }
}
