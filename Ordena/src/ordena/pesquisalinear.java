package ordena;

public class pesquisalinear extends Ordena {
    
   public static int linearbusca(long[]arquivo, int x) { 
    int n = arquivo.length; 
    for(int i = 0; i < n; i++) 
    { 
        if(arquivo[i] == x) 
            return i; 
    } 
    return -1; 
   
   } 
}
