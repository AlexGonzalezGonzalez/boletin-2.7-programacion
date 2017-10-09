
package boletin.pkg2.pkg1;
import java.util.Scanner;
public class Boletin21 {

    public static void main(String[] args) {
        
       Scanner sc= new Scanner(System.in);
       float gradosC,gradosF,gradosK;
       System.out.println("teclea grados celsius:");
       gradosC=sc.nextFloat();
       gradosF=gradosC*9/5+32;
       gradosK=gradosC+273;
       System.out.println("grados Farenheih= "+ gradosF);
       System.out.println("grados Kelvin= "+ gradosK);
      
    
    }
}
