
public class Ejercicio04 {
	/**
	 * @Univesidad Universidad Tecnol�gica del Norte de Guanajuato
	 * @Carrera    Sistemas Inform�ticos
	 * @author     Juan Luis Mendiola Guti�rrez
	 * @n�meroControl 1215100890
	 * @Objetivo:  m�todos de recursividad
	 */
     static int factorial(int numero){ 
          if ( numero <= 1 ) { //la condicion es para evitar numeros menores a 1
              return 1;  //Si la condicional anterior es verdadera, se imprimira 1
          } else {  //Sino se cumple la condicion se devuelve el numero por el factorial (el cual el valor se ingresa en el metodo main)
        	  // a su vez se le resta 1 al numero para ir haciendolo m�s peque�o
              return numero*factorial(numero-1);
          }
     }
     public static void main(String args[]){
         System.out.println(factorial(5));  //Se el factorial, del numero ingresado 
     }
 }

/*
 * Este programa es recursivo, ya que se mandan llamar al propio m�todo con valores de numero 
 * mas peque�os. Cada vez que se produce llamada al m�todo, se crean de nuevo las variables
 * y comienza la ejecuci�n del nuevo m�todo.
 * Cada llamada supone hacerlo a un m�todo diferente, que es copia del original, 
 * que se ejecuta y devuelve el resultado a quien lo llam�, es decir al mismo programa.
 * 
 */
