package Exercicio7;
import java.util.Stack;

/**
 *
 * @author Helia
 */
public class VerificarVezes {
    static int cont=0;
    

    /**
     * @param args the command line arguments
     */
    
    static int numeroVezes(int digito, int numero,int quantdadeDigitos){
         String string=Integer.toString(numero);
        if(quantdadeDigitos==0){
            return cont;
            
        }else{
            Stack<Integer> stack=new Stack();
            for(int i=0;i<string.length();i++){
             Integer num=Integer.parseInt(Character.toString(string.charAt(i)));
                stack.push(num);
           }
            if(digito==stack.pop()){
                cont+=1;
            }
            string="";
            for(Integer o:stack)
                string+=Integer.toString(o);
            if(!string.equals("")){
            numero=Integer.parseInt(string);
            
           
         return numeroVezes(digito, numero, quantdadeDigitos-1);
            }
               
                
        } return cont;
    }
    
    
    
    static int numeroDeRepeticoes(int digito,int numero){
        String string=Integer.toString(numero); //converter o parametro em string
        return numeroVezes(digito,numero,string.length());
    }
            
     public static void main(String[] args) {
        System.out.println(numeroDeRepeticoes(2, 1231231562));
    }
}
