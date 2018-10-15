package Exercicio5;
import Exercicio5.*;
import java.util.ArrayList;

/**
 *
 * @author Helia
 */
public class Binarios {
    static ArrayList<Integer> inteiros=new ArrayList();
public static void main(String[] args) {
        System.out.println(binario(7));

    }
    
    static Integer inverter(ArrayList<Integer> arrayList){
        String numstr="";
         
          for (int i=(inteiros.size()-1);i>-1;i--) {
        numstr+=Integer.toString(inteiros.get(i));
        }
     return Integer.parseInt(numstr);
    }
   
  
    
      static int binario(int numero){
        if(numero==0){
            return inverter(inteiros); //chamar o metodo inverter
            
        }else{
            inteiros.add(numero%2);
            numero=numero/2;
            return binario(numero);
            
        }
    }
}
