import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Ejercicio03 {
	/**
	 * @Univesidad Universidad Tecnológica del Norte de Guanajuato
	 * @Carrera    Sistemas Informáticos
	 * @author     Juan Luis Mendiola Gutiérrez
	 * @númeroControl 1215100890
	 * @Objetivo:  Se quieren obtener el sueldo promedio semanal, el total de sueldo a pagar y quien es el empleado (nombre del empleado) que gana más y quien es el que gana menos.
     * Nombre de los empleados que ganan más o igual al promedio y nombre de los empleados que ganan menos del promedio.
     * El número más grande de horas trabajadas y el empleado o empleados que trabajaron esas horas.
	 */

	static final String DATA_PATH = "empresa.txt";
	static String empleados[]; //Declaracion de arreglo
	static int sueldo[];
	static Scanner fileReader = null;
	int tam; //Para el tamaño del arreglo
	
	public void definirArreglo() {
		try{
			fileReader = new Scanner(new File("empresa.txt"));
			System.out.println("Archivo Abierto: lista.txt");
		}catch(FileNotFoundException e){
			System.out.println("El archivo no se encuentra");
			System.out.println("Programa Terminado");
			System.exit(0);
		} 
		int tam= fileReader.nextInt();
		empleados = new String[tam];
		sueldo = new int[tam];
	}
	
	private void recorreArreglo() {
		for(int i=0; i<empleados.length;i++){
			empleados[i]=fileReader.next();
			sueldo[i]=fileReader.nextInt();
		}
	}
		private void imprimeDatos() {
			System.out.println("Empleados "+ empleados.length);
			System.out.println();
			System.out.println("Empleados de clase A");
			int contador=1;
			Scanner scanner = new Scanner(System.in);
			int hora=0;
			int promedio=0;
			for(int i=0; i<empleados.length;i++){
				if(sueldo[i]== 150){
					System.out.println("Número de horas empleado");
					int horas = scanner.nextInt();
					System.out.print(empleados[i]+" ");
					System.out.println(sueldo[i] + " ");
					System.out.println("Sueldo a pagar "+(sueldo[i] * horas));
					if(horas >= hora){
						System.out.println("Empleado con mas horas: "+empleados[i]+" "+ horas);
						hora=horas;
					}					
					if((sueldo[i] * horas) >= promedio){
				       promedio=(sueldo[i] * horas)/ contador;
				       System.out.println("El salario del empleado "+empleados[i]+" supera el promedio");
						
					}
					if((sueldo[i] * horas) < promedio){
						promedio=(sueldo[i] * horas)/ contador;
						System.out.println("El salario del empleado "+empleados[i]+ " es menor al promedio");
					}
					contador++;
			     }
		       }
	        }
		
		private void imprimeDatos2() {
			System.out.println();
			System.out.println("Empleados de clase B");
			int contador=1;
			Scanner scanner = new Scanner(System.in);
			int hora=0;
			int promedio=0;
			for(int i=0; i<empleados.length;i++){
				if(sueldo[i]== 250){
					System.out.println("Número de horas empleado");
					int horas = scanner.nextInt();
					System.out.print(empleados[i]+" ");
					System.out.println(sueldo[i] + " ");
					System.out.println("Sueldo a pagar "+(sueldo[i] * horas));
					if(horas >= hora){
						System.out.println("Empleado con mas horas: "+empleados[i]+" "+ horas);
						hora=horas;
					}					
					if((sueldo[i] * horas) >= promedio){
				       promedio=(sueldo[i] * horas)/ contador;
				       System.out.println("El salario del empleado "+empleados[i]+" supera el promedio");
						
					}
					if((sueldo[i] * horas) < promedio){
						promedio=(sueldo[i] * horas)/ contador;
						System.out.println("El salario del empleado "+empleados[i]+" es menor al promedio");
					}
					contador++;
			     }
		       }
	        }
		
		private void imprimeDatos3() {
			System.out.println();
			System.out.println("Empleados de clase C");
			int contador=1;
			Scanner scanner = new Scanner(System.in);
			int hora=0;
			int promedio=0;
			for(int i=0; i<empleados.length;i++){
				if(sueldo[i]== 500){
					System.out.println("Número de horas empleado");
					int horas = scanner.nextInt();
					System.out.print(empleados[i]+" ");
					System.out.println(sueldo[i] + " ");
					System.out.println("Sueldo a pagar "+(sueldo[i] * horas));
					if(horas >= hora){
						System.out.println("Empleado con mas horas: "+empleados[i]+" "+ horas);
						hora=horas;
					}					
					if((sueldo[i] * horas) >= promedio){
				       promedio=(sueldo[i] * horas)/ contador;
				       System.out.println("El salario del empleado "+empleados[i]+ " supera el promedio");
						
					}
					if((sueldo[i] * horas) < promedio){
						promedio=(sueldo[i] * horas)/ contador;
						System.out.println("El salario del empleado "+empleados[i]+" es menor al promedio");
					}
					contador++;
			     }
		       }
	        }
		
		
		
		public static void main(String[] args) {
			Ejercicio03 obj = new Ejercicio03();
			obj.definirArreglo();
			obj.recorreArreglo();
			obj.imprimeDatos();
			obj.imprimeDatos2();
			obj.imprimeDatos3();
	}
	
}
