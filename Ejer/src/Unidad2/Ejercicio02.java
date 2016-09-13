package Unidad2;

/*
 * Realizar una  busqueda secuencial en un arreglo de enteros, 
 * buscar un numero entero dado
 * */

	public class Ejercicio02 {
		int arreglo[] ={10,9,8,5,1,0,-9,5}; // declarando y definiendo
		
		//Método
		
		public static int buscaDato(int arre[], int busca){
			int pos=-1;
			for(int i=0; i<arre.length;i++){
				if(busca==arre[i]){
					pos=i;
				}
			}
			return pos;
		}
	
	public static int[] ordenarArreglo(int arre[]){
		int aux;
		for(int i=0; i<arre.length;i++){
			if(arre[i]<arre[i+1]){
				//cambio
				
				aux=arre[i];
				arre[i] =arre[i+1];
				arre[i+1]=aux;
			}//end if
		}//end for
		return arre;
	}
	
	public static String imprimeArreglo(int arre[]){
		String cadena="";
		for(int i=0;i<arre.length;i++){
				cadena=cadena+arre[i]+",";
			}
		return cadena;
		}

	public static void main (String[] args){
		
		int arreglo[]={10,9,8,5,1,0,-9,5};
		int numeroBuscar=5;
		int pos=buscaDato(arreglo, numeroBuscar);
		Ejercicio02 ejer= new Ejercicio02();
		System.out.println("Arreglo original "+imprimeArreglo(arreglo));
		System.out.println("Arreglo ordenado ");
		System.out.println(imprimeArreglo(ordenarArreglo(arreglo)));
		
		if(buscaDato(arreglo, numeroBuscar)==-1){
			System.out.println("No se encontro el dato");
		}else {
			System.out.println("El dato se encontro en... "+pos);
		}
	}
}