public class Gato extends Animal {
    private String cor;
    
    
    

    public Gato(String nome, int numPatas, String cor) {
        super(nome, numPatas);
        this.cor = cor;
    }

    @Override
    public void emitirSom(){
        System.out.println("MIAUU");

    }

    public String getCor() {
        return cor;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return  "nome: " + getNome() + "Quantidades de patas: " + getNumPatas() + "cor: " + getCor() ;
    }


    
}
