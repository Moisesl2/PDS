package Conta;

public class DemoConta {
    public static void main(String[] args) {
        Conta c1 = new Conta(200.00, "Moises", "12344556");


    
        c1.Saque(200);
        System.out.println(c1.getSaldo());
        c1.Saque(10);
        c1.deposito(200);
        System.out.println(c1.getSaldo());
        System.out.println(c1.toString());
        //c1.Saque(180);
      //  c1.Saque(20);
    }
}
