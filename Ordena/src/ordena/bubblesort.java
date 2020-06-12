package ordena;

public class bubblesort extends Ordena {
 
    
    public static long[] resultadobubblesort (long[]arquivo){
        
            long[] retorno = bubbleSort(arquivo);
                    return retorno;
                    
    }
    
       private static long[] bubbleSort(long[] vetor){
               boolean troca = true;
               int aux;
               while (troca) {
                   troca = false;
                   for (int i = 0; i < vetor.length - 1; i++) {
                       if (vetor[i] > vetor[i + 1]) {
                           aux = (int) vetor[i];
                           vetor[i] = vetor[i + 1];
                           vetor[i + 1] = aux;
                           troca = true;
                       }
                   }
               }
        return vetor;
       }
    
}
