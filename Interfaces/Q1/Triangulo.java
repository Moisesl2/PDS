package Interfaces.Q1;

public class Triangulo implements AreaCalculavel {
    private double base;
    private double altura;
    protected double resultado;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    @Override
    public double calculaArea() {
       return resultado = (base * altura)/2;
    }



    
}
