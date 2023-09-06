package Interfaces.Q1;

public class Circulo implements AreaCalculavel {
    private double raio;
    protected double resultado;

    

    public Circulo(double raio) {
        this.raio = raio;
    }



    @Override
    public double calculaArea() {
        return resultado = Math.PI * Math.pow(raio, 2);
    }
    
}
