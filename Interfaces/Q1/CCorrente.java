package Interfaces.Q1;



public class CCorrente extends Conta implements Tributavel{
    private String usuario;
    private double saldo;

    public CCorrente( String cod, String usuario, double saldo) {
        super(cod);
        this.usuario = usuario;
        this.saldo = saldo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double Saque(double valor){
        if (getSaldo() > 0 && valor < getSaldo()) {
            saldo -= valor;
            System.out.println("O valor sacado foi: " + valor);
            System.out.print("Saldo atual: ");
            return getSaldo();
            
        } else {
            System.out.println("Saldo insuficiente");
            return getSaldo();  
        }
    }

    @Override
    public double deposito(double valor) {
        saldo += valor;
        System.out.println("O valor depositado foi: " + valor);
        System.out.println("Saldo atual: " + getSaldo());
        return getSaldo();
    }

    @Override
    public double calculaTributos() {
        if(saldo > 0 ){
            saldo = saldo - (saldo * 0.01);
            return saldo;
        }else{
            System.out.println("Valor insuficiente, voce esta devendo tributos ao banco!");
            return saldo;
        }
    }

    @Override
    public String toString() {
        System.out.println("-----------");
        return "Conta Corrente: " + "\nCodigo: " + super.getCod() + "\nUsuario: " + getUsuario() + "\nSaldo: " + getSaldo() ;
    }

    
}
