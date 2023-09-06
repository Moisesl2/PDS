package Interfaces.Q2;

public abstract class Conta {
    private String cod;


    public Conta( String cod) {
        this.cod = cod;
    }


    public String getCod() {
        return cod;
    }


    public void setCod(String cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        return "Cod: " + cod ;
    }


    public abstract double Saque(double valor);
    public abstract double deposito(double valor);
    public abstract void obterSaldo();
}
