import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero,N1,N2,i;
        N1=1;
        N2=2;        
        
            System.out.print("Numero: ");
            numero = sc.nextInt();
             
        for(i=1;i<=numero-2;i++){
             
             N2 = N1 + N2;
             N1 = N2 - N1;
        }
        System.out.println("el valor " + numero + " de fibonacci es:"); 
        System.out.println(N1 + " ");
        System.out.println("el valor que produce un overflow es 49");
    }
}
