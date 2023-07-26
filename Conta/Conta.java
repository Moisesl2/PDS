package Conta;

public class Conta{
    private double saldoAtual;
    private String nome;
    private String cpf;

    
    public Conta(double saldoAtual, String nome, String cpf) {
        this.saldoAtual = saldoAtual;
        this.nome = nome;
        this.cpf = cpf;
    }


    public double getSaldo() {
        return saldoAtual;
    }


    public void setSaldo(double saldo) {
        this.saldoAtual = saldo;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double Saque( double valor ){
        
        if(saldoAtual > 0 ){
            System.out.println("Valor Sacado " + valor);
            saldoAtual = saldoAtual - valor;
            return saldoAtual;
             
        }else{
             System.out.println("saldo insuficiente " + saldoAtual);
             return saldoAtual;
        }
        

        
    }

    public double deposito( double valor){
        System.out.println("valor depositado " + valor);
        return saldoAtual = saldoAtual + valor;

    }


    @Override
    public String toString() {
        return "Conta [saldoAtual=" + saldoAtual + ", nome=" + nome + ", cpf=" + cpf + "]";
    }

    



}