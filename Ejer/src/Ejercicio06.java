
public class Ejercicio06 {
	
	/**
	 * @Univesidad Universidad Tecnológica del Norte de Guanajuato
	 * @Carrera    Sistemas Informáticos
	 * @author     Juan Luis Mendiola Gutiérrez
	 * @númeroControl 1215100890
	 * @Objetivo:  métodos de recursividad
	 */
	
	private static int movimientos = 0;

	public static int mover(int n, char a, char b, char c) {
		if (n > 0) {
			mover(n - 1, a, c, b);
			System.out.println("mover disco " + a + " a " + c);
			movimientos++;
			mover(n - 1, b, a, c);
		}
		return movimientos;
	}
	
	
	 
	    public static void main(String[]args)
	    {
	     java.util.Scanner leer = new java.util.Scanner(System.in);
	     int movimientos;
	     System.out.println("Numero de discos: ");
	     int n=leer.nextInt();
	     movimientos = Ejercicio06.mover(n, 'A', 'B', 'C');
	     System.out.println("\nMovimientos efectuados: "+movimientos);
	    }  
} 

/* 
 * Este es de forma recursiva porque tiene varias llamadas recursivas para el numero de discos, dependiendo la cantidad de discos el numero de 
 * llamadas al metodo aumentan al igual que los movimientos a realizar y asi resolver la torre, ejemplo si el numero de discos son 3, este sera resuelto 
 * con tansolo 7 movimientos   
 */