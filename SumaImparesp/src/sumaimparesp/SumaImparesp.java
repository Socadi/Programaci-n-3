
package sumaimparesp;

public class SumaImparesp {

   
    public static void main(String[] args) {
 double acum = 0;
    int i = 1;
    while (i <= 100000000)
    {
        acum += i;
        i += 2;
    }
    System.out.println("El valor que hay es " + acum);
    System.out.println("Pero practicamente es 2.5*10^15");
    }
    
}
