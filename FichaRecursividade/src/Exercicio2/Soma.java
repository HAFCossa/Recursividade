package Exercicio2;

/**
 *
 * @author Helia
 */
public class Soma { 
    static int somav=0;
     
    
    static int somaIntVector(int[] vector, int tamanhoVector){
        if(tamanhoVector==0){
            
              return somav+=vector[tamanhoVector];
         }else{
            somav+=vector[tamanhoVector];
            return somaIntVector(vector, tamanhoVector-1);
            
        }
    }
    
     public static void main(String[] args) {
      
        
    
     int[] vetor = {6,3,1,2,4,5}; // Vetor já com valores preenchidos.
        System.out.println(somaIntVector(vetor, vetor.length-1));
           
    }
}
