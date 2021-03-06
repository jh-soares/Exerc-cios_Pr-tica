package notaaluno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {
    
    /*
        Lê uma String do console
        return String lida
    */
    
    public static String readString(){
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            return reader.readLine();
        }catch(IOException e){
            throw new RuntimeException("Erro ao ler o dado do teclado");
        }
    }
    
    /*
        Lê um valor do tipo int do console
        return valor int lido
    */
    
    public static int readInt(){
        
        String str = readString();
        
        try{
            return Integer.parseInt(str);
        }catch(NumberFormatException e){
            throw new RuntimeException(str + "não é um int válido!");
        }
        
    }
    
    /*
        Lê um valor do tipo double do console
        return valor double lido
    */
    
    public static double readDouble(){
        String str = readString();
        
        try{
            return Double.parseDouble(str);
        }catch(NumberFormatException e){
            
            throw new RuntimeException(str + "nao é um double válido");
        }
    }
    
    
}
