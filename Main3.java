import java.util.*;

public class Main3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        short numero,N1,N2,i;
        N1=1;
        N2=2;        
        
            System.out.print("Numero: ");
            numero = sc.nextShort();
             
        for(i=1;i<=numero-3;i++){
             
             N2 = (short) (N1 + N2);
             N1 = (short) (N2 - N1);
        }
        System.out.println("el valor " + numero + " de fibonacci es:"); 
        System.out.println(N1 + " ");
        System.out.println("el valor que produce un overflow es 26");
    }
}
