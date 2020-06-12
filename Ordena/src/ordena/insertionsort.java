package ordena;

public class insertionsort extends ordenacao {
    
        public static long[] resultadoinsertionsort (long[]arquivo){

        long[] retorno = insertionSort(arquivo);
		return retorno;  
}
    
public static long[] insertionSort(long[] vetor) {
    int j;
    int key;
    int i;
    
    for (j = 1; j < vetor.length; j++)
    {
      key = (int) vetor[j];
      for (i = j - 1; (i >= 0) && (vetor[i] > key); i--)
      {
         vetor[i + 1] = vetor[i];
       }
        vetor[i + 1] = key;
    }
        return vetor;
}
}
