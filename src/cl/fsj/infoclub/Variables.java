package cl.fsj.infoclub;

public class Variables {
	public static void main(String[] args) {
		
		//Se crea la instancia de la clase Notas
		
		Notas n = new Notas(4,5);
		Notas n2 = new Notas(4,6);
		
		System.out.printf("%f\n",n.promedio(),n2.promedio());
	}

}
