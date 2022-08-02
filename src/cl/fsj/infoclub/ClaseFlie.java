package cl.fsj.infoclub;
import java.io.*;

public class ClaseFlie {
	public static void main(String[] args) throws IOException {
	
		crearFichero("cl/fsj/infoclub/carpeta","archivo");
		
	}

	public static void crearFichero(String nombre, String fichero) throws IOException{
		
		File directorio = new File("src/"+nombre+"/");
		if(directorio.exists()==false) {
			directorio.mkdir();
			File archivo = new File(directorio+fichero+".txt");
			archivo.createNewFile();
		}
			
	
	}
}
