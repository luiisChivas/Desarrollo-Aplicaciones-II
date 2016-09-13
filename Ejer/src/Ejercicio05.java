
public class Ejercicio05 {	
	
	/**
	 * @Univesidad Universidad Tecnológica del Norte de Guanajuato
	 * @Carrera    Sistemas Informáticos
	 * @author     Juan Luis Mendiola Gutiérrez
	 * @númeroControl 1215100890
	 * @Objetivo:  métodos de recursividad
	 */
	
	static int mcd(int m, int n) { //Se inicializan las variables del metodo 
		if (n <= m && m % n == 0) //Se aplica una condición en donde se realizan comparaciones menores de 0
			return n; //En caso verdadero devuelve el valor n
		else if (m < n) //Si no se cumple la condicion anterior, el metodo continua con su proceso y se va a la la siguiente condicion
			return mcd(n, m); //en caso de que se cumplan estos valores, se devuelven estos valores.
		else
			return mcd(n, m % n); //Si no se cumple la condicion anterior, el el metodo realiza una operacion y obtiene el MCD
	}

	public static void main(String[] args) {
		System.out.println(mcd(124,6)); //En los parametros de entrada se ingresan algunos datos, para probar el mcd
	}
}

//Este es un metodo recursivo porque manda llamar a otro metodo llamado main
// En el metodo main se ingresan los valores que tomara el metodo MCD