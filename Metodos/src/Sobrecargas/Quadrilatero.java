package Sobrecargas;

public interface Quadrilatero {
    
    public static void area(double lado){
        System.out.println("Área do quadrado: " + lado *  lado);
    }

    public static void area(double lado, double lado2){
        System.out.println("Área do retângulo: " + lado * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura){
        System.out.println("Área do trapézio: " + ((baseMaior + baseMenor) * altura) / 2);
    }

    public static void area(float diagonal1, float diagonal2){
        System.out.println("Área do losango: " + (diagonal1 * diagonal2) / 2);
    }
}
