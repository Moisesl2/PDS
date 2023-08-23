package Q1;

public class DemoConta {
    public static void main(String[] args) {
        CCorrente cc = new CCorrente("123", "moises", 200);
        cc.deposito(400);
       System.out.print(cc.toString());
       
        
    }
}
