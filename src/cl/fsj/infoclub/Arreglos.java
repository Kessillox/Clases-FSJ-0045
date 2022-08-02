package cl.fsj.infoclub;

import java.util.ArrayList;
import java.util.Collections;

public class Arreglos {
	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<>();
		nombres.add("Paulette");
		nombres.add("Guagua 1");
		nombres.add("Guagua 2");
		nombres.add("Claudia");
		nombres.add("Rolando");
		nombres.add("Mercedes");
		nombres.add("Sebastian - Christian");
		nombres.add("Cristian");
		nombres.add("Lisbeth");
		nombres.add("Paula");
		nombres.add("Samanta");
		nombres.add("Rodrigo");
		nombres.add("Cesar");
		nombres.add("Luciano");
		nombres.add("Silvia");
		nombres.add("Patricio");
		nombres.add("Constanza");
		nombres.add("Bossel");
		nombres.add("Cossio");
		nombres.add("Franco");
		nombres.add("Nicolas");
		nombres.add("Cristina");
		nombres.add("Luciano");
		nombres.add("Luciano");
		nombres.add("Luciano");
		nombres.add("Guagua 1");
		nombres.add("Guagua 1");
		
		//System.out.println("nombres: "+nombres);
		//System.out.println(nombres.size());
		ArrayList<String> borrar = new ArrayList<>();
		
		borrar.add("Luciano");
		borrar.add("Guagua 1");
		
	//	nombres.remove("Guagua 1");
		
	
		//nombres.removeAll(borrar);
		//System.out.println("nombres: "+nombres);
		//System.out.println(nombres.size());
		//nombres.set(5, "el amor por las guaguas");
		
		
		Collections.reverse(nombres);
		
		//System.out.println("nombres: "+nombres);
		//System.out.println(nombres.size());
		
		Collections.sort(nombres);
		
		//System.out.println("nombres: "+nombres);
		//System.out.println(nombres.size());
		
		Collections.reverse(nombres);
		
		//System.out.println("nombres: "+nombres);
		//System.out.println(nombres.size());
		
/* ****************** Nuevo Ejemplo ********************** */		
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(2);
		numeros.add(10);
		numeros.add(2);
		
		//System.out.println(Collections.min(numeros));
		//System.out.println(Collections.max(numeros));
		
		System.out.println(Collections.frequency(nombres,"Luciano"));
		System.out.println(Collections.frequency(numeros,2));
	}

}

/*
nombres.add("Paulette");
nombres.add("Guagua 1");
nombres.add("Guagua 2");
nombres.add("Claudia");
nombres.add("Rolando");
nombres.add("Mercedes");
nombres.add("Sebastian - Christian");
nombres.add("Cristian");
nombres.add("Lisbeth");
nombres.add("Paula");
nombres.add("Samanta");
nombres.add("Rodrigo");
nombres.add("Cesar");
nombres.add("Luciano");
nombres.add("Silvia");
nombres.add("Patricio");
nombres.add("Constanza");
nombres.add("Bossel");
nombres.add("Cossio");
nombres.add("Franco");
nombres.add("Nicolas");
nombres.add("Cristina");
*/
