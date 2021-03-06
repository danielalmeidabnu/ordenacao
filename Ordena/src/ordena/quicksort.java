package ordena;

public class quicksort extends ordenacao {
    
	public static long[] resultadoquicksort (long[]arquivo){
		
		  
        long[] retorno = quickSort(arquivo,0,arquivo.length-1);				
		return retorno;
	}
 private static long[] quickSort(long[] vetor, int inicio, int fim) {
        if (inicio < fim) {
               int posicaoPivo = separar(vetor, inicio, fim);
               quickSort(vetor, inicio, posicaoPivo - 1);
               quickSort(vetor, posicaoPivo + 1, fim);
        }
        return vetor;
  }
	
	private static int separar(long[] vetor, int inicio, int fim) {
        long pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
               if (vetor[i] <= pivo)
                      i++;
               else if (pivo < vetor[f])
                      f--;
               else {
                      long troca = vetor[i];
                      vetor[i] = vetor[f];
                      vetor[f] = troca;
                      i++;
                      f--;
               }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        
        return f;
  }
        
}
