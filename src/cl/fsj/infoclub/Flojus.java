package cl.fsj.infoclub;

import java.util.Scanner;

public class Flojus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int edad, ci;
		
		System.out.println("Ingrese su edad, por favor");
		edad = sc.nextInt();
		
		System.out.println("Ingrese 1 si porta su CI o 2, si no la porta");
		ci=sc.nextInt();
		
		if(!(edad < 4)) {
			System.out.println("Usted sí está habilitado para comprar copete con su carnet");
		} else if(edad < 5 && edad > 4) {
			System.out.println("usted está tratando de incumplir la ley señorito, vayase pa' la casa");
		}else if ( edad> 5.5){
			
		}else {
			System.out.println("usted no puso bien las notas para el promedio");
		}
		sc.close();
	}

}
