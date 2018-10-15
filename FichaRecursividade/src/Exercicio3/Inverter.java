package Exercicio3;
public class Inverter {
   static int qAlgarismos=10;
   static int Numero=1234567890;
    
   public static int[] inverte(int[] v,int i, int f){
        int aux;
        if(i>=f){
            return v;
        }else{
            aux=v[i];
            v[i]=v[f];
            v[f]=aux;
            return inverte(v,i+1,f-1);
        }
    }
    
    
    public static int inverta(int n){
        String string=Integer.toString(n); //converter o parametro em string
        int[] vector=new int[string.length()];
        
         for(int i=0;i<string.length();i++){
             
          vector[i]=Integer.parseInt(Character.toString(string.charAt(i)));   
            }
         
         string="";
         
         int[] aaa=inverte(vector, 0, vector.length-1);
         
          for(int i=0;i<vector.length;i++){
             string+=Integer.toString(aaa[i]);
         }
      return Integer.parseInt(string);
    }
    
    
    
     public static void main(String[] args) {
        
        
        System.out.println(inverta(1234));
        
    }
}
