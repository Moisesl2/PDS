public class Ovelha extends Animal {
    
    
    public Ovelha(String nome, int numPatas) {
        super(nome, numPatas);
        
    }

    public void emitirSom(){
        System.out.println("Bééé");

    }

    @Override
    public String toString() {
        return  "nome: " + getNome() + "Quantidades de patas: " + getNumPatas() ;
    }

    

    

    

    

}
