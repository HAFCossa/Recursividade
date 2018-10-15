package Exercicio1;

/**
 *
 * @author Helia
 */
public class Factorial {
    
    /**
     * <b>Fatorial</b>.<br><br> metodo recursivo que calcula o fatorial de um numero
     * @param N inteiro que identifica o numero que queremos achar/calcular o seu fatorial
     * @return N*fatorial(N-1)funcao que retorna o fatorial de um numero
     */
    public static int fatorial(int N){
        if (N==0 || N==1){
         return 1;
    }
        return N*fatorial(N-1);
    }
    
    
    public static void main(String[] args) {
        int fatorial = Factorial.fatorial(3);
        System.out.println(fatorial);
    }
}
