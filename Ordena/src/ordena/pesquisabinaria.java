package ordena;

public class pesquisabinaria  {
    
    public static int buscabinaria(long[] arquivo, int x){
        int meio;
        int inicio, fim;
        inicio = 0;
        fim = arquivo.length -1;
        
        while (inicio <= fim){            
            meio = (inicio + fim)/ 2;
            if (arquivo[meio] == x) 
                return meio;
            else if (arquivo[meio] < x) inicio = meio + 1;
            else if (arquivo[meio] > x) fim = meio + 1;  
        }
        return -404;
    } 
}
