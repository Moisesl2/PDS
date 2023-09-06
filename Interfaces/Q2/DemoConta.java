package Interfaces.Q2;

public class DemoConta {
    public static void main(String[] args) {
        CCorrente cc = new CCorrente("123", "Moisés", 1200);
        CPoupanca cp = new CPoupanca("456", "Moises", 1200);
        SeguroDeVida sv = new SeguroDeVida();
        cc.calculaTributos();
        cc.obterSaldo();
        cp.obterSaldo();
        cc.deposito(1200);
        cc.calculaTributos();
        cc.obterSaldo();
        cc.calculaTributos();
        sv.calculaTributos();
        
        
        

    }
}
