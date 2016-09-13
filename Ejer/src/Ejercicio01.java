import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Ejercicio01 {
	
	/**
	 * @Univesidad Universidad Tecnológica del Norte de Guanajuato
	 * @Carrera    Sistemas Informáticos
	 * @author     Juan Luis Mendiola Gutiérrez
	 * @númeroControl 1215100890
	 * @Objetivo:  es comprobar la eficiencia del algoritmo y ver Cuál de ellos es más eficiente?
	 */
	
	static final String DATA_PATH = "Datos.txt";
	
	public static void main (String[] args){
		Scanner fileReader = null;
		try{
			fileReader = new Scanner (new File(DATA_PATH));
			System.out.println("Achivo abierto: "+ DATA_PATH);
		}catch(FileNotFoundException e){
			System.out.println("El archivo "+DATA_PATH+" No se encuentra" ); 
			System.out.println("Programa Terminado");
			System.exit(0);
		}
		
		int contador=1;
		int datoLeido = fileReader.nextInt();
		System.out.println("Palas cargadoas 78345");
		while (datoLeido==78345){
			datoLeido=fileReader.nextInt();
			System.out.println(contador + ": serie: "+datoLeido);
			datoLeido = fileReader.nextInt();
			contador++;
		}
		System.out.println();
		System.out.println("Retroexcavadoras 33287");
		while (datoLeido==33287){
			datoLeido=fileReader.nextInt();
			System.out.println(contador + ": serie: "+datoLeido);
			datoLeido = fileReader.nextInt();
			contador++;
		}
		System.out.println();
		System.out.println("Dumpers 63287");
		while (datoLeido==63287){
			datoLeido=fileReader.nextInt();
			System.out.println(contador + ": serie: "+datoLeido);
			try{
			datoLeido = fileReader.nextInt();
			}catch(Exception e){
				System.out.println("Se ha terminado el archivo");
			}
			contador++;
		}
	}

}
