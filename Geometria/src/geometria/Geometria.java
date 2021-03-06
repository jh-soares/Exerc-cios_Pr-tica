package geometria;

public class Geometria {

    
    public static void main(String[] args) {
        
        Triangulo t1 = new Triangulo();
        t1.base = 4.2;
        t1.altura = 2.1;
        double area = t1.calcularArea();
        
        System.out.println("Area do triangulo " + area);
        
        Quadrado q1 = new Quadrado();
        q1.lado = 6;
        area = q1.calcularArea();
        
        System.out.println("Area do Quadrado " + area);
        
        Trapezio tr1 = new Trapezio();
        tr1.B = 4.1;
        tr1.b = 3.8;
        tr1.altura = 8;
        
        area = tr1.calcularArea();
        
        System.out.println("Area do Trapézio " + area);
        
        Circunferencia c1 = new Circunferencia();
        c1.raio = 6.3;
        area = c1.calcularArea();
        
        System.out.println("Area da Circunferência " + area);
    }
    
}
