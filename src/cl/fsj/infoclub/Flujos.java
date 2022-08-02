package cl.fsj.infoclub;

import java.util.Scanner;

public class Flujos {

	public static void main(String[] args) {
		int aforo=0, personas;
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("Cantidad de personas a ingresar");
		personas=sc.nextInt();
		
		aforo=personas+aforo;
		
		System.out.println("En este momento hay " 
		+ aforo 
		+ " personas en la sala");
		}
		while(aforo<=10);
		
		System.out.println("Lo sentimos pero no alcanzan!!!!");
	
	}
		
		

}
