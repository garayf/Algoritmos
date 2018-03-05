import java.util.Random;
import java.util.Scanner;
 // codigo obtenido de https://www.lawebdelprogramador.com/foros/Java/908539-Multiplicar-dos-matrices.html
public class Matriz {
	public static void main (String args[]){
 
		  
            Random r=new Random();
	      Scanner in=new Scanner(System.in);
 
	        System.out.println("ingrese numero de la primera matriz"); // se pide el numero de la matriz pero en este caso no lo necesitamos
	       int x1=2;//tamaño    
	        
	        System.out.println("ingrese numero de la segunda matriz"); // se pide el numero de la matriz pero en este caso no lo necesitamos
	       int x2=2;//tamaño
	        
               //declaracion de las matrices a utilzar
	       int[][] m1=new int[x1][x1];               
	       int[][] m2=new int[x2][x2];
	       int[][] mR=new int[x1][x2];
               
               
	        System.out.println("La matriz 1");
 
                long startT = System.nanoTime();
	        for(int i=0;i<x1;i++){
	            System.out.print("[ ");
	            for(int j=0;j<x1;j++){
	                m1[i][j]=r.nextInt(9);
	                System.out.print(m1[i][j]+" ");
	            }// se imprime la primera matriz
	            System.out.print("]");
	            System.out.println("");
	        }
	        System.out.println("La matriz 2");
	        for(int i=0;i<x2;i++){
	            System.out.print("[ ");
	            for(int j=0;j<x2;j++){
	                m2[i][j]=r.nextInt(9);
	                System.out.print(m2[i][j]+" ");
	            } // se imprime la segunda matriz
                    
	            System.out.print("]");
	            System.out.println("");
	        }
 
	        if(x1==x2){ // se inicia la multiplicacion si los tamaños son correctos
	            System.out.println("La matriz resultante es: ");
 
	            for(int i=0;i<x1;i++){
 
	            	System.out.print("[ ");
 
	            for(int j=0;j<x2;j++){
 
 
	            for(int h=0;h<x1;h++){
 
	            	 mR[i][j]+=m1[i][h]*m2[h][j];                         
                          
                }
                    
                
                System.out.print(mR[i][j]+" ");
            }
                
            System.out.print("]");
            System.out.println("");
            
             
        }
    }

                
    else{
        System.out.println("Los rangos de las matrices son incorrectos");
    }
                long Time = System.nanoTime() - startT;   
                System.out.println("el tiempo de ejecucion en nanosegundos es de: "+ Time);
}                
 
	}
