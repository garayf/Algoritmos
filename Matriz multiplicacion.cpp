#include <iostream>
#include <cstdlib>
#include <ctime>

using std::cout;
using std::cin;
using std::endl;


	int numeroAleatorio(void){
    
    return (1 + rand() % 10);
}
	


int main(){
	
	srand(time(NULL));
    
	clock_t init_time = clock() ;
		
	int i, j, k, d, valor; 
	d = 10;
	int a[d][d], b[d][d], c[d][d];
	
	

	
    for(i = 0 ; i < d ; i++){
        for(j = 0 ; j < d ; j++){
     	valor= numeroAleatorio();
    a[i][j]=valor;
 }
 
    }
    cout << endl;
    
    
    for(i = 0 ; i < d ; i++){ // Imprime los elementos de la matriz A 
        for(j = 0 ; j < d ; j++){
            cout << a[i][j] << " ";
            if(j == 2)
               cout << endl;
    }
    }
    
    
    cout << endl;
   
    for(i = 0 ; i < d ; i++){
        for(j = 0 ; j < d ; j++){
          valor= numeroAleatorio();
            b[i][j]=valor;
        }
    }
    
    cout << endl;
    for(i = 0 ; i < d ; i++){ // Imprime los elementos de la matriz B
        for(j = 0 ; j < d ; j++){
            cout << b[i][j] << " ";
            if(j == 2)
               cout << endl;
        }
    }
    
 
	
       
       
  for(i=0;i<d;i++){ /* Realiza el producto de matrices y guarda
                       el resultado en una tercera matriz*/
      for(j=0;j<d;j++){
          c[i][j]=0;
          for(k=0;k<d;k++){
              c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
          }
      }
  }
  
  clock_t end_time = clock() ;		
  
  
  	
  cout << endl << "MATRIZ C (Matriz A*B)." << endl;
  cout << endl;
  for(i=0;i<d;i++){ // Imprime la matriz resultado
      for(j=0;j<d;j++){
          cout << c[i][j] << " ";
          if(j==2)
             cout << endl;
      }
  }

  cout << endl;
  
  double  A= 1000l*(end_time-init_time)/CLK_TCK;

  
  cout <<"el tiempo de ejecucion es de "<<(A/1000)<<endl;
  
  
  system("PAUSE");
  return 0;
  }
