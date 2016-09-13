public class Ejercicio08 {
	/**
	 * @Univesidad Universidad Tecnológica del Norte de Guanajuato
	 * @Carrera    Sistemas Informáticos
	 * @author     Juan Luis Mendiola Gutiérrez
	 * @númeroControl 1215100890
	 * @Objetivo:  El elemento mayor de un array entero de n-elementos se puede calcular recursivamente.
	 */

	static int i = 0;
	public static int maxArray(int arr[], int i) {
		int m = arr.length-1;
		int mayor;
		int temp;
		
		if(i==m){
			return mayor=arr[i];
		}else{
			mayor = maxArray(arr, i+1);
			if(arr[i]>mayor){
				temp=arr[i];
			}else{
				temp=mayor;
			}
		}
		return temp;		
	}
	
	public static int numMayor(int arr[]) {
	return  maxArray(arr, i);	
	}
	
	public static void main(String[] args) {
		int arreglo[]={10,25,60,90,120};
		System.out.println("El dato mayor es: " + Ejercicio08.numMayor(arreglo));
	}
}