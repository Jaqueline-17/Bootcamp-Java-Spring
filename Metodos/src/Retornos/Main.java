package Retornos;

public class Main {
    public static void main(String[] args) {
        
        //Retornos
        System.out.println("Exercício retornos: ");

        double areaQuadrado = Quadrilatero2.area(3);
        System.out.println("Área do Quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero2.area(5, 5);
        System.out.println("Área do Retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero2.area(7, 8, 9);
    System.out.println("Área do Trapézio: " + areaTrapezio);
       
    }
}
