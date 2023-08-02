package Automovel;

public class DemoAutomovel {
    public static void main(String[] args) {
        Carro c = new Carro("10000", true, "RODAS, MOTOR, BATERIA");
        Moto m = new Moto("11000", true, "RODAS, BATERIA, MOTOR");
        Caminhao C = new Caminhao("10000", true, "RODAS, MOTOR, BATERIA");
        Carro c1 = new Carro("13333333", true, "NADA");

        System.out.println(c1.toString());
        System.out.println(m.toString());
        System.out.println(C.toString());
        System.out.println(c.toString());

        
        C.ligar_desligar = false;
    }
}
