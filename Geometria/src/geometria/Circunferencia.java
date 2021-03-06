package geometria;

public class Circunferencia {
    
    double raio;
    double pi = 3.14;
    
    double calcularArea(){
        
        double area = pi * (raio * raio);
        return area;
    }
    
}
