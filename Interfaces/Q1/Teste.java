package Interfaces.Q1;

public class Teste {
    public static void main(String[] args) {
        Quadrado q = new Quadrado(2);
        Triangulo t = new Triangulo(2, 2);
        Circulo c = new Circulo(2);
        System.out.println(q.calculaArea());
        System.out.println(t.calculaArea());
       System.out.println(c.calculaArea());

    }
}
