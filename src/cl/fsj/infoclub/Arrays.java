package cl.fsj.infoclub;

import java.util.ArrayList;
import java.util.Collections;

public class Arrays {
	
	public static void main(String[] args) {
		ArrayList<Float> notas = new ArrayList<>();
		notas.add(4.7f);
		notas.add(2.2f);
		notas.add(5.4f);
		notas.add(6.9f);
		notas.add(4.4f);
		notas.add(2.6f);
		
		System.out.println(notas);
		
		min(notas);
		
		
	}
	
	static void min(ArrayList<Float> a) {
		
		System.out.println("Este es el minimo del Arreglo "+a+": "+Collections.min(a));
		
	}

}
