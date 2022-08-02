package cl.fsj.infoclub;

import java.util.Scanner;

public class Ciclos {

	public static void main(String [] args) {
//		Scanner sc = new Scanner(System.in);
//		    
//        int op=0;
//        
//        
//		do  {
//			System.out.println("Menu");
//			System.out.println("Si desea la pastilla roja ingrese opcion 1 ");
//			System.out.println("Si desea la pastilla azul ingrese opcion 2 ");
//	        System.out.println("Si desea salir ingrese opcion 3 \n");
//			System.out.println("Ingrese la opcion:\n(Porfis ingresar entre 1 y 3).");
//			op = sc.nextInt(); 
//			
//		}while (op<1 || op>3);
//		
//		if(op == 1) {
//			System.out.println("Usted ha decidido ser isnorante");
//		}
//		else if(op == 2) {
//			System.out.println("Usted ha aceptado una verdad inquietante.");
//			
//		}
//		else if(op == 3) {
//			System.out.println("Adios");
//		}
//		sc.close();
		
		int i = 0;
		int suma = 0;
//		do {
//			System.out.println("esto se mostrará 10 veces "+i);
//			i+=1;
//		}while(i<10);
		
		while(i<100) {
			System.out.println(i);
			
			i+=1;
			
			System.out.println("suma + i: "+suma+" + "+i);
			
			suma+=i;
			
			System.out.println("Suma es: "+suma);
		}
		
 	}
}
