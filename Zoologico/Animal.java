public class Animal{
    private String nome;
    private int numPatas;

    public Animal(String nome, int numPatas){
        this.nome = nome;
        this.numPatas = numPatas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public void emitirSom(){
        
    }

    @Override
    public String toString() {
        return " nome: " + nome + ", Quantidade de patas: " + numPatas;
    }

    
    
}