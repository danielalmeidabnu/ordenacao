package ordena;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class dados { 
        long tempocompleto;

    public long getTempocompleto() {
        return tempocompleto;
    }

    public void setTempocompleto(long tempocompleto) {
        this.tempocompleto = tempocompleto;
    }
   
   public static long[] lerDados(String caminho) throws IOException {
		Path path = Paths.get(caminho);
		long[] arquivo = Files.lines(path).mapToLong(linha -> Long.parseLong(linha)).toArray();
		return arquivo;
	}
}
