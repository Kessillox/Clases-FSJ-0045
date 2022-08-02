package cl.fsj.infoclub.colecttions;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.IllegalFormatPrecisionException;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Colecciones1 {
	
	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#.000");
		
		ArrayList<Double> decimales = new ArrayList<Double>();

		decimales.add(32.4);
		decimales.add(Double.parseDouble(df.format(Math.random())));
		decimales.add(12.456);
		decimales.add(32.34);
		decimales.add(62.4);
		decimales.add(32.4);
		
		System.out.println("Estos son los decimales de la lista decimales: "+decimales);
		System.out.println("*************************");
		ArrayList<Double> deci = new ArrayList<>();
		
		deci.add((double) (Math.round((Math.random()*10)*1000.0)/10)); 
		
		deci.add(Math.random()*10);

		System.out.println(deci);
		System.out.println("**************************");		
		decimales.addAll(deci);
		System.out.println("**************************");
		System.out.println(decimales);
		
		System.out.println(decimales.size());
		
		System.out.println(decimales.indexOf(32.4)); //0
		System.out.println(decimales.lastIndexOf(32.4)); //0
		System.out.println(decimales.lastIndexOf(32.34));//3
		System.out.println(decimales.lastIndexOf(32.4456));//-1
		
		/*System.out.println("*********SET*********");
		Set<String> nicknames = new HashSet<>();
		
		nicknames.add("ducksito");
		nicknames.add("rolando90");
		nicknames.add("polypleti");
		nicknames.add("gonzalezlillo");
		nicknames.add("edgamer63");
		nicknames.add("silvia2015");
		nicknames.add("sebaoteiza");
		nicknames.add("callita");
		nicknames.add("giornobanana");
		nicknames.add("lucianocesc");
		nicknames.add("felicity");
		nicknames.add("kernelweb");
		nicknames.add("cr111");
		nicknames.add("kessillox");
		
		System.out.println(nicknames);*/
		
		/*System.out.println("*********LinkedHashSet*********");
		Set<String> nicknames = new LinkedHashSet<>();
		
		nicknames.add("ducksito");
		nicknames.add("rolando90");
		nicknames.add("polypleti");
		nicknames.add("gonzalezlillo");
		nicknames.add("edgamer63");
		nicknames.add("silvia2015");
		nicknames.add("sebaoteiza");
		nicknames.add("callita");
		nicknames.add("giornobanana");
		nicknames.add("lucianocesc");
		nicknames.add("felicity");
		nicknames.add("kernelweb");
		nicknames.add("cr111");
		nicknames.add("kessillox");
		
		System.out.println(nicknames);*/
		
		/*System.out.println("*********TreeSet*********");
		Set<String> nicknames = new TreeSet<>();
		
		nicknames.add("ducksito");
		nicknames.add("rolando90");
		nicknames.add("polypleti");
		nicknames.add("gonzalezlillo");
		nicknames.add("edgamer63");
		nicknames.add("silvia2015");
		nicknames.add("sebaoteiza");
		nicknames.add("callita");
		nicknames.add("giornobanana");
		nicknames.add("lucianocesc");
		nicknames.add("felicity");
		nicknames.add("kernelweb");
		nicknames.add("cr111");
		nicknames.add("kessillox");
		nicknames.add("kernelweb");
		nicknames.add("cr111");
		
		System.out.println(nicknames);*/
		
		System.out.println("*********QUEUE*********");
		Queue<String> nicknames = new LinkedList<>();
		
		nicknames.add("ducksito");
		nicknames.add("rolando90");
		nicknames.add("polypleti");
		nicknames.add("gonzalezlillo");
		nicknames.add("edgamer63");
		nicknames.add("silvia2015");
		nicknames.add("sebaoteiza");
		nicknames.add("callita");
		nicknames.add("giornobanana");
		nicknames.add("lucianocesc");
		nicknames.add("felicity");
		nicknames.add("kernelweb");
		nicknames.add("cr111");
		nicknames.add("kessillox");
		nicknames.add("kernelweb");
		nicknames.add("cr111");
		
		System.out.println(nicknames);


		
		












	}
	

}