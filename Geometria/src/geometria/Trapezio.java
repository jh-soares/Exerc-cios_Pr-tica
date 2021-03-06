package geometria;

public class Trapezio {
    
    double B, b, altura;
    
    double calcularArea(){
        
        double area = ((B + b)/2) * altura;
        return area;
    }
    
}
