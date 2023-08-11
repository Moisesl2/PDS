public class Zoo {

    public static void main(String[] args) {
        Animal animal = new Animal("Bicho ", 8);
        Vaca vaca = new Vaca("Mimosa ",4);
        Gato gato = new Gato("Garfield ",4);
        Ovelha ovelha = new Ovelha("Dolly ",4);
        Animal bichos[] = {animal, vaca, gato, ovelha};

        // Aqui, cada instancia eh de um tipo especializado
        if(vaca instanceof Animal){
            System.out.println(" vaca eh Animal  ");
        }

        if(gato instanceof Animal){
            System.out.println(" gato eh Animal ");
        }

        if(ovelha instanceof Animal){
            System.out.println(" ovelha eh Animal ");
            System.out.println("-----------\n");
        }
    
        for(int i=0 ; i < bichos.length ; i++) {
            System.out.print(bichos[i].getNome());
            if(bichos[i] instanceof Vaca){
                System.out.print("eh uma vaca ");
            }
            if (bichos[i] instanceof Gato) {
                System.out.print("eh um gato "); 
            }
            if (bichos[i] instanceof Ovelha) {
                System.out.print("eh uma ovelha ");
            }
            
            bichos[i].emitirSom();
           // System.out.println();

            if (bichos[i] instanceof Animal) {
                System.out.println(bichos[i].getNome() + "eh um Animal. "); //houve a necessidade de modificar "nome" para "getNome" ns linhas 25 e 40.
            }

            System.out.println();
        }
        
        System.out.println(vaca.toString());
        System.out.println(gato.toString());
        System.out.println(ovelha.toString());
        System.out.println(animal.toString());
     

    }
    
}
