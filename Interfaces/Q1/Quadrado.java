package Interfaces.Q1;

public class Quadrado implements AreaCalculavel{
    private double lado;
    protected double resultado;
    

    public Quadrado(double lado) {
        this.lado = lado;
    }



    @Override
    public double calculaArea() {
        return resultado = lado * lado;
        
    }
    
}
