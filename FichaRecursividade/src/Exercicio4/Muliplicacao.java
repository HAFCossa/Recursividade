package Exercicio4;

/**
 *
 * @author Helia
 */
public class Muliplicacao {
public static void main(String[] args) {
        System.out.println(multiplicacao(4, 4));
    }
    
    static int multiplicacao(int a, int b){
        if(a==1){
            return b;
            
        }else{
            return b+multiplicacao(a-1, b);
            
        }
        
    }
    
}
