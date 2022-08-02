package cl.fsj.infoclub.colecttions;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.IllegalFormatPrecisionException;

public class Colecciones1 {
	
	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("#.000");
		
		ArrayList<Double> decimales = new ArrayList<Double>();

		decimales.add(32.4);
		decimales.add(Double.parseDouble(df.format(Math.random())));
		decimales.add(12.456);
		decimales.add(32.34);
		decimales.add(62.4);
		
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
	}
	

}