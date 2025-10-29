public class Main {
    public static void main(String[] args) {
        int[] vetor1 = {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

        testarTodos("Vetor 1", vetor1);
        testarTodos("Vetor 2", vetor2);
        testarTodos("Vetor 3", vetor3);
    }

    static void testarTodos(String nome, int[] original) {
        System.out.println("\n=== " + nome + " ===");

        testar("Bubble Sort", original);
        testar("Selection Sort", original);
        testar("Cocktail Sort", original);
        testar("Comb Sort", original);
        testar("Gnome Sort", original);
        testar("Bucket Sort", original);
    }

    static void testar(String nome, int[] original) {
        int tamanho = original.length;
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) vetor[i] = original[i];

        long inicio = System.nanoTime();

        if (nome.equals("Bubble Sort")) BubbleSort.sort(tamanho, vetor);
        else if (nome.equals("Selection Sort")) SelectionSort.sort(tamanho, vetor);
        else if (nome.equals("Cocktail Sort")) CocktailSort.sort(tamanho, vetor);
        else if (nome.equals("Comb Sort")) CombSort.sort(tamanho, vetor);
        else if (nome.equals("Gnome Sort")) GnomeSort.sort(tamanho, vetor);
        else if (nome.equals("Bucket Sort")) BucketSort.sort(tamanho, vetor);

        long fim = System.nanoTime();

        int trocas = 0, iteracoes = 0;
        switch (nome) {
            case "Bubble Sort": trocas = BubbleSort.trocas; iteracoes = BubbleSort.iteracoes; break;
            case "Selection Sort": trocas = SelectionSort.trocas; iteracoes = SelectionSort.iteracoes; break;
            case "Cocktail Sort": trocas = CocktailSort.trocas; iteracoes = CocktailSort.iteracoes; break;
            case "Comb Sort": trocas = CombSort.trocas; iteracoes = CombSort.iteracoes; break;
            case "Gnome Sort": trocas = GnomeSort.trocas; iteracoes = GnomeSort.iteracoes; break;
            case "Bucket Sort": trocas = BucketSort.trocas; iteracoes = BucketSort.iteracoes; break;
        }

        System.out.println(nome + " → Tempo(ns): " + (fim - inicio) +
                " | Trocas: " + trocas + " | Iterações: " + iteracoes);
    }
}
