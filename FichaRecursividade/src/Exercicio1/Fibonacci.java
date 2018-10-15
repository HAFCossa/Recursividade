package Exercicio1;

/**
 *
 * @author Helia
 */
public class Fibonacci {
    public  long fibonacci(long numero){
      if((numero==0)||(numero==1))
        return numero;
     else
        return fibonacci(numero-1)+fibonacci(numero-2);
        
    }
   
    
    
    
    public  void m() {
        for (int i = 0; i <=10; i++) 
            
            System .out.printf( "Fibonacci de %d é: %d\n", i, fibonacci(19));

    }
    public static void main(String[] args) {
        new Fibonacci();
    }
    
}
