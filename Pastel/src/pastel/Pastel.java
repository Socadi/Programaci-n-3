/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastel;
import java.util.Scanner;
public class Pastel {

     
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        
        /* el usuario ingresa la edad*/
        int anios;
        
        System.out.println("Ingrese su edad ");
        anios=entrada.nextInt();
        
        /* se inicializa un array con el numero de años que digito el usuario*/
        int velas[] = new int [anios];
        
        for(int i=0;i<velas.length;i++){
        	System.out.println("Ingrese la altura de la vela: ");
                velas[i]= entrada.nextInt();
                }
        
        /*se establece cual el el tamaño mayor de las velas*/
        int altmayor=velas[0];
            
        for(int j=1;j<velas.length;j++){
        
                if (velas[j]>altmayor){
                 altmayor=  velas[j];
                }
            }
        System.out.println("\nla altura maxima en las velas es: "+altmayor);
        
        /*se establece el numero de veces que se repite la altura mayor*/
        int Veces=0;
            
        for(int s=0;s<velas.length;s++){
        
                if (velas[s]==altmayor){
                 Veces= Veces+1;
                }
            }
        System.out.println("\nel numero de velas que se apagaran son: "+Veces);
          
    }
    
}
