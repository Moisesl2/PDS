public class Vaca extends Animal {
    private String cor;
    

    public Vaca(String nome, int numPatas, String cor) {
        super(nome, numPatas);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void emitirSom(){
        System.out.println(" MUUUUU");
        
    }

    @Override
    public String toString() {
        return  "nome: " + getNome() + "Quantidades de patas: " + getNumPatas() + "cor: " + getCor() ;
    }
}
