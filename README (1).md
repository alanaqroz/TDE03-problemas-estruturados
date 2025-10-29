# Comparação de Algoritmos de Ordenação

## 📘 Contexto
Este projeto foi desenvolvido como parte da disciplina de **Estruturas de Dados**, com o objetivo de comparar diferentes algoritmos de ordenação em termos de **tempo de execução**, **número de trocas** e **iterações**.

Foram implementados seis algoritmos de ordenação e um programa principal para realizar a comparação entre eles.

---

## 🧩 Estrutura do Projeto

O projeto contém as seguintes classes:

1. `BubbleSort.java`
2. `SelectionSort.java`
3. `CocktailSort.java`
4. `CombSort.java`
5. `GnomeSort.java`
6. `BucketSort.java`
7. `Main.java` → Responsável por executar os testes e exibir os resultados.

---

## 📊 Resultados Obtidos

### Vetor 1
| Algoritmo      | Tempo (ns) | Trocas | Iterações |
|----------------|-------------|---------|------------|
| Bubble Sort    | 403041      | 78      | 180        |
| Selection Sort | 377583      | 18      | 190        |
| Cocktail Sort  | 288083      | 78      | 154        |
| Comb Sort      | 274375      | 22      | 129        |
| Gnome Sort     | 521834      | 78      | 176        |
| Bucket Sort    | 283625      | 20      | 39         |

---

### Vetor 2
| Algoritmo      | Tempo (ns) | Trocas | Iterações |
|----------------|-------------|---------|------------|
| Bubble Sort    | 1334        | 0       | 19         |
| Selection Sort | 5750        | 0       | 190        |
| Cocktail Sort  | 1292        | 0       | 19         |
| Comb Sort      | 3875        | 0       | 110        |
| Gnome Sort     | 1208        | 0       | 20         |
| Bucket Sort    | 7250        | 20      | 39         |

---

### Vetor 3
| Algoritmo      | Tempo (ns) | Trocas | Iterações |
|----------------|-------------|---------|------------|
| Bubble Sort    | 10208       | 190     | 190        |
| Selection Sort | 6084        | 10      | 190        |
| Cocktail Sort  | 10833       | 190     | 190        |
| Comb Sort      | 5166        | 18      | 129        |
| Gnome Sort     | 15166       | 190     | 400        |
| Bucket Sort    | 4083        | 20      | 39         |

---

## 🧠 Conclusão
A partir dos resultados, é possível observar que:

- **Comb Sort** e **Bucket Sort** apresentaram os menores tempos médios.
- **Bubble Sort**, **Cocktail Sort** e **Gnome Sort** são menos eficientes, especialmente em vetores desordenados.
- O **Selection Sort** teve um bom desempenho em termos de número de trocas, mas não em iterações.

Esses testes reforçam como a escolha do algoritmo de ordenação depende fortemente do tipo e tamanho do vetor a ser ordenado.

---

## 💻 Autor
Desenvolvido por *Aluna de Ciência da Computação - PUC*.
