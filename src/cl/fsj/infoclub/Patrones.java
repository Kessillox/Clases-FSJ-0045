package cl.fsj.infoclub;
import java.util.Scanner;

public class Patrones {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int n;
	  n =sc.nextInt();


/***********Metodos implementados*********/
	  incrementar(15);
	  
	  System.out.println(multiplicar(12,12)+10); 

	  imprimirMenu();
	  
	  System.out.println("aqui van otras instrucciones");
	
	  imprimirMenu();
	
	  
//**********Triangulo 1**********/ 	  
//	  for(int i=0;i<n;i++) {
//		  
//		  System.out.print("*");
//		  for(int j=0;j<i;j++) {
//			  
//			 System.out.print("^"); 
//		  }
//		  System.out.printf("\n");
//	  }
	  
	  /**********Triangulo 2**********/
//	  String t="";
//	  for(int i=0;i<n;i++) {
//		  t=t+"*";
//		  System.out.println(t);
//	  }
////	  
///**********Triangulo 3**********/
//			
//	int i=0, n, j;
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Ingrese cantidad de filas: ");
//	n = sc.nextInt();
//	for(i=0;i<n;i++) {
//		for(j=1; j<= i; j++) {
//			System.out.printf("*");				
//		}
//					
//		System.out.println("*");	
//				
//	}
//	sc.close();
//	
	  /**********Triangulo 4**********/
//	  for(int i = 1; i < n; i++) {
//			
//			for(int blancos = 0; blancos<=n-i; blancos++){
//              System.out.printf(" ");
//			}
//			
//			for(int asteriscos = 0;asteriscos < (i*2)-1; asteriscos++){
//				System.out.printf("*");
//			}
//		System.out.printf("\n");
//		
//		}
	  
	    
	  
	  /**********Tablas de multiplicar***********/
//	  int i,j;
//	  
//	  for(j=0;j<11;j++) {
//		  for(i=0;i<11;i++) {
//			  System.out.println(i+" * "+j+" = "+i*j);
//		  }
//	  }
	  

  }
  
  /**********Metodos creados**********/
  static void imprimirMenu() {
	  System.out.println("Menú:");
	  System.out.println("1) Opción 1");
	  System.out.println("2) Opción 2:");
	  System.out.println("3) Opción 3:");
	  System.out.println("4) salir:");
  }
  static void incrementar(int numero) {
	  int total = numero + 10;
	  System.out.println(total);
  }
  static int multiplicar(int numero, int numero2) {
	  int total = numero * numero2;
	  //String x = Integer.toString(total);
	  return total;
  }
}
