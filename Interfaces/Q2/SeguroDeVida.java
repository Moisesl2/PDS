package Interfaces.Q2;

public class SeguroDeVida implements Tributavel {

    @Override
    public double calculaTributos() {
       double valor = 42;
        System.out.println(" O valor do tributo Eh: " + valor);
        return valor;
    }
    
}
