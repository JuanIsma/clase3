package clase_3;
import java.util.Scanner;

public class clase_3_String {
	
	public static void main(String [] args) {
		
		/*COMENTARIO:
		 Para solicitar datos por teclado se puede crear un objeto de la clase Scanner.
		  Mediante ese objeto se puede llamar/invocar
		  a los métodos que permiten capturar datos tanto numéricos como textuales.  */ 
	    System.out.println("Ingresa número de desplazamiento entre 1 y 4:");
		Scanner teclado = new Scanner(System.in);
        int v = teclado.nextInt();
		System.out.println("********Codificación********");
		codificacion(v);
		
	    System.out.println("Ingresa número de desplazamiento entre 1 y 4:");
        int v2 = teclado.nextInt();
		System.out.println("********Decodificación********");
		decodificacion(v2);	
		teclado.close();
	}
	
	
//***********************************************************************************************************	
	
	
		
  public static void codificacion(int valor) {
	 
	String frase = "Aprendiendo java";  
	String cadena ="abcdefghijklmnopqrstuvwxyz"; 
  
	  
	  switch (valor){
	 case 1: 
		 System.out.println( "Desplazamiento 1:");
			for ( int i=0; i<frase.length();i++) {	 
		 System.out.println( "imprime letra "+frase.charAt(i) +"-> "+cadena.charAt(i));		
		/*COMENTARIO:( .charAt(i))  Este método devuelve el carácter situado en la posición index 
		 * pasada por parámetro. La primera posición de la cadena es la 0*/
		 } 
		 break;  
	 case 2:
		 System.out.println( "Desplazamiento 2:");
			for ( int i=0; i<frase.length();i++) {	 
		 System.out.println( "imprime letra "+frase.charAt(i) +"-> "+cadena.charAt(i+1));		
		 } 
		 break;
	 case 3:
		 System.out.println( "Desplazamiento 3:");
			for ( int i=0; i<frase.length();i++) {	 
		 System.out.println( "imprime letra "+frase.charAt(i) +"-> "+cadena.charAt(i+2));		
		 } 
		 break;
	 case 4:
		 System.out.println( "Desplazamiento 4:");
			for ( int i=0; i<frase.length();i++) {	 
		 System.out.println( "imprime letra "+frase.charAt(i) +"-> "+cadena.charAt(i+3));		
		 } 
		 break;
		 default: 
			 System.out.println( "Error Valor Incorrecto ");
	 
	  }
   }
  
  
  
//***********************************************************************************************************
  
  
  
  
  public static void decodificacion(int valor2) {
	
	String cadena ="abcdefghijklmnopqrstuvwxyz"; 
	String frase = "Aprendiendo java";  
	  
	  switch (valor2){
	 case 1: 
		 System.out.println( "Desplazamiento 1:");
			for ( int i=0; i<frase.length();i++) {	 
		 System.out.println( "imprime letra "+cadena.charAt(i) +"-> "+frase.charAt(i));		
		 } 
		 break;  
	 case 2:
		 System.out.println( "Desplazamiento 2:");
			for ( int i=0; i<frase.length();i++) {	 
		 System.out.println( "imprime letra "+cadena.charAt(i+1) +"-> "+frase.charAt(i));		
		 } 
		 break;
	 case 3:
		 System.out.println( "Desplazamiento 3:");
			for ( int i=0; i<frase.length();i++) {	 
		 System.out.println( "imprime letra "+cadena.charAt(i+2) +"-> "+frase.charAt(i));		
		 } 
		 break;
	 case 4:
		 System.out.println( "Desplazamiento 4:");
			for ( int i=0; i<frase.length();i++) {	 
		 System.out.println( "imprime letra "+cadena.charAt(i+3) +"-> "+frase.charAt(i));		
		 } 
		 break;
		 default: 
			 System.out.println( "Error Valor Incorrecto ");
	 
	  }	 
   }
}
