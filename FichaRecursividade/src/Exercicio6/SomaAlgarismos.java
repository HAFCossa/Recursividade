package Exercicio6;
import java.util.Stack;

/**
 *
 * @author Helia
 */
public class SomaAlgarismos {
    static int soma=0;
    
    
    static int somaAlgarismos(int numero ){
        String string=Integer.toString(numero); //converter o parametro em string
        
        if(string.equalsIgnoreCase("")){
            return soma;   //caso a string convertida for igual a "" retorna soma
        }
        else
             {
            
       /**
       *Converter em int cada caractere da String
       *e introduzir no vector Stack
       **/
           
           Stack<Integer> numeros=new Stack();
           for(int i=0;i<string.length();i++){
               Character numr= string.charAt(i);
               numeros.push(Integer.parseInt(Character.toString(numr)));
           }
           int ultimoNumero=numeros.pop(); //eliminar e buscar o ultimo elemento da stack
           soma+=ultimoNumero; //na soma adicionar o elemento que  foi eliminado da stack
                 System.out.println(soma);
           System.out.println(numeros);
           string=""; //zerar a string para que nao sobreponha os novos dados
           for(Integer integ:numeros){
               string+=Integer.toString(integ); //devolver os dados da string
           }
           if(!string.equalsIgnoreCase("")) //caso a string estiver vasia nao retorna alg0 algum
           numero=Integer.parseInt(string);
                 if(!string.equalsIgnoreCase("")){
                 return somaAlgarismos(numero);
           }
           else
           {}
        
        }
        
       
       return soma; 
    }

      public static void main(String[] args) {
        int numero=8888;
        System.out.println(somaAlgarismos(numero));

    }
    
}
