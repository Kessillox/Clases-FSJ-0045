package cl.fsj.infoclub;

public class Notas {
	
	static int nota1;
	static int nota2;
	
	/*A los métodos que se llaman igual que la clase, los llamamos
	 constructores de la clase*/
	public Notas(int n1, int n2) {
		
		this.nota1 = n1;
	 	this.nota2 = n2;
	 }
	 
	//Otro método de la clase
	 public float promedio() {
		 
		 return (float)(nota1+nota2)/2.0f;
	}
}
