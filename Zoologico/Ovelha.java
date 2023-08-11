public class Ovelha extends Animal {
    private String cor;
    

    public Ovelha(String nome, int numPatas, String cor) {
        super(nome, numPatas);
        this.cor = cor;
    }

    @Override
    public void emitirSom(){
        System.out.println("BÉÉÉÉ");

    }

    @Override
    public String toString() {
        return  "nome: " + getNome() + "Quantidades de patas: " + getNumPatas() + "cor: " + getCor() ;
    }



    public String getCor() {
        return cor;
    }



    public void setCor(String cor) {
        this.cor = cor;
    }

}
