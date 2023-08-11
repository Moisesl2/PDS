public class Gato extends Animal {
    
    
    public Gato(String nome, int numPatas) {
        super(nome, numPatas);
        
    }

    public void emitirSom(){
        System.out.println("MIAUU");

    }

    @Override
    public String toString() {
        return  "nome: " + getNome() + "Quantidades de patas: " + getNumPatas() ;
    }
}
