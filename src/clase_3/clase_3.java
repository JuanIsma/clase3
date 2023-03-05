package clase_3;

public class clase_3 {

	public static void main(String[] args) {
		
		letraCantidadApariciones();
		tresNumerosOrdenados();
		System.out.println("LA Sumatoria es: "+vectorSumaNumerica());
    }

//a. Dado un String y una letra, que cuente la cantidad de apariciones de la letra en el String

 public static void letraCantidadApariciones() {
	
	String palabra = "Estoy aprendiendo a programar en java";
 
    int i=0,contar=0;
 
    for (i=0; i<palabra.length();i++) {
         if(palabra.charAt(i)=='a') {
        	 contar++;
         }
     }
    System.out.println("Cantidad de letras a:\n "+contar);
	  
      }
	 
 
// b. Dados 3 números y un orden (ascendente o decreciente) que ordene los mismos y los retorne en un vector de 3

 
 public static void tresNumerosOrdenados() {
	 
	int n1=456;
	int n2= 53;
	int n3=33;
	 int num[]=new int [3];
	 
	if(n1<n2 && n1<n3)
	{
    if( n2<n3)
    {
    	num[0]=n1;
    	num[1]=n2;
    	num[2]=n3;
    }else {
    	num[0]=n1;
    	num[1]=n3;
    	num[2]=n2;
    }}
	
    
    if(n2<n1 && n2<n3) {
    if(n1<n3){
    	num[0]=n2;
    	num[1]=n1;
    	num[2]=n3;
    }else {
    	num[0]=n2;
    	num[1]=n3;
    	num[2]=n1;
    }
    }
    if(n3<n1 && n3<n2) {
     if(n1<n2) {
    	num[0]=n3;
     	num[1]=n1;
     	num[2]=n2;
     }else {
    	num[0]=n3;
      	num[1]=n2;
      	num[2]=n1; 
     }
    }
        
    System.out.println(" Orden Numérico Ascendente:"); 
    for (int i=0; i<num.length; i++)
	 {
	System.out.println( num[i]); 
	 }
    
    
    }
    
   
	//c. dado un vector de números, y un número X, que sume todos los números > X y retorne el resultado */

 public static float vectorSumaNumerica() {
	 
  int vector[] = new int[]{5,15,25,30,40,45,50};
  int x =25; 
  float sumar=0;	 
	for (int i=0; i<vector.length; i++) {
		if( vector[i]>x) {
			sumar+=vector[i];
		}
	 
	}
	return sumar; 
 }
 
 }
     
 
 
 
 