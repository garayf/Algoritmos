import java.util.*;

public class Main2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        byte numero,N1,N2,i;
        N1=1;
        N2=2;        
        
            System.out.print("Numero: ");
            numero = sc.nextByte();
             
        for(i=1;i<=numero-3;i++){
             
             N2 = (byte) (N1 + N2);
             N1 = (byte) (N2 - N1);
        }
        System.out.println("el valor " + numero + " de fibonacci es:"); 
        System.out.println(N1 + " ");
        System.out.println("el valor que produce un overflow es 12");
    }
}
