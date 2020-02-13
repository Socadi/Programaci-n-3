/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;


 
 
public class Ejercicio {

  
   
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        inicializar(matriz);
        visualizarMatriz(matriz);
        int[] diagoPrincipal = new int[matriz.length];
        int[] diagoSecundaria = new int[matriz.length];
        int sdprincipal=0;
        int sdsecundaria=0;
        int sumat=0;
        
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if(i==j){
                    diagoPrincipal[i] = matriz[i][j];
                    sdprincipal=sdprincipal+matriz[i][j];
                }
                 
                if(i+j == matriz.length-1){
                    diagoSecundaria[i] = matriz[i][j];
                    sdsecundaria=sdsecundaria+matriz[i][j];
                }
            }
        }
        sumat=sdprincipal-sdsecundaria;
        
        if(sumat<0){
            sumat=sumat*-1;
        }
        
        System.out.println("\nDiagonal Principal");
        visualizarArray(diagoPrincipal);
        System.out.println("\nLa suma de la diagonal principal es: "+sdprincipal);
                 
        System.out.println("\n\nDiagonal Secundaria");
        visualizarArray(diagoSecundaria);
        System.out.println("\nLa suma de la diagonal Secundaria es: "+sdsecundaria);
    
        System.out.println("\n\nSumatoria de las diagonales principal y secundaria");
        System.out.println("\nEl valor absoluto de la resta de las diagonales es: "+sumat);
    
    }
     
    static void visualizarArray(int[] pArray){
        for(int i=0;i<pArray.length;i++){
            System.out.print("\t" + pArray[i]);
        }
    }
     
    static void inicializar(int[][] pMatriz){
        int aux = 10;
        for(int i=0;i<pMatriz.length;i++){
            for(int j=0;j<pMatriz[i].length;j++){
                pMatriz[i][j] = aux;
                aux++;
            }
        }
    }
     
    static void visualizarMatriz(int[][] pMatriz){
        for(int i=0;i<pMatriz.length;i++){
            for(int j=0;j<pMatriz[i].length;j++){
                System.out.print("\t" + pMatriz[i][j]);
            }
            System.out.println();
        }
    }
}
    
      