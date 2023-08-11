public class Vaca extends Animal {
    
    
    public Vaca(String nome, int numPatas) {
        super(nome, numPatas);
    
    }

    public void emitirSom(){
        System.out.println(" Muuuuu");
        
    }

    @Override
    public String toString() {
        return  "nome: " + getNome() + "Quantidades de patas: " + getNumPatas() ;
    }
}
