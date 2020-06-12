package ordena;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
/*
@Author Daniel Almeida
*/
public class Ordena extends dados {
   
    public static void main(String[] args) throws IOException {
        //C:\\Users\\fabia\\Documents\\Documentos para ler\\file.txt
        String caminho;
        Scanner t = new Scanner(System.in);
        System.out.println("Aonde está o arquivo que deja ler?>>");
        caminho = t.nextLine();
        long[] arquivo = lerDados(caminho);
        System.out.println("Qual ordenação deseja usar? \n"
                + "[1] QuickSort \n"
                + "[2] InsertionSort \n"
                + "[3] BubbleSort ");
        int menu = t.nextInt();
        switch (menu) {
            case 1:
                long quickInicial = System.currentTimeMillis();
                System.out.println("Resultado da ordenação com QuickSort: "
                        + ""+Arrays.toString(quicksort.resultadoquicksort(arquivo)));
                long quickFinal = System.currentTimeMillis();
                System.out.println("Ordenado em "+(quickFinal - quickInicial)+" ms");
            break;
            
            case 2:
                long insertionInicial = System.currentTimeMillis();
                System.out.println("Resultado da ordenação com InsertionSort: "
                        + ""+Arrays.toString(insertionsort.resultadoinsertionsort(arquivo)));
                long insertionFinal = System.currentTimeMillis();
                System.out.println("Ordenado em "+(insertionFinal - insertionInicial)+" ms");
            break;
            
            case 3:
                long bubbleInicial = System.currentTimeMillis();
                System.out.println("Resultado da ordenação com BubbleSort: "
                        + ""+Arrays.toString(bubblesort.resultadobubblesort(arquivo)));
                long bubbleFinal = System.currentTimeMillis();
                System.out.println("Ordenado em "+(bubbleFinal - bubbleInicial)+" ms");
                break;
        
        }
        
        System.out.println(" ");
        System.out.println("Buscar no Algo no Vetor?");
        String busca = t.next();
        if (busca.equalsIgnoreCase("sim")) {
            System.out.println("[1] Linear \n"
                             + "[2] Binaria");
            int busca2 = t.nextInt();
            if (busca2 == 1) {
               System.out.println("Valor que deseja buscar>> ");
            int valor = t.nextInt();
            System.out.println("Valor está nesse parâmetro: "+pesquisalinear.linearbusca(arquivo, valor)); 
            } else {
                System.out.println("Valor que deseja buscar>> ");
             int valor = t.nextInt();
            System.out.println("Valor está no indice: "+pesquisabinaria.buscabinaria(arquivo, valor));    
            }
            
        } else {
            System.exit(0);
        }
    }
    
}
