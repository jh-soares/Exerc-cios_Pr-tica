package fatorial;

public class Fatorial {

    public static void main(String[] args) {
    
        int valor = 10;
        int resposta = calcularFatorial(valor);
        
        System.out.println("O fatorial de " + valor + " é igual a " + resposta);
            
    }
    
    static int calcularFatorial(int num){
        
        if(num == 0){
            
            return 1;
        }else{
            
            return num * calcularFatorial(num - 1);
        }
    }
}
