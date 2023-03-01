package ejercicio5_13;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class Ejercicio5_13 {
    
    public void factorial() { // Abre metodo factorial
  for ( int i = 1; i <= 5; i++ ) { // Abre for
  
  int factor = 1;
  int numero = i;

  // Este ciclo while calcula el factorial
  while ( 0 < numero ) { // Abre while
  factor *= numero--;
  }        // Cierra while

  System.out.printf("\nEl factorial de %d es: %d\n", i, factor );


  }   // Cierra for
  }             // Cierra metodo factorial
    
}
