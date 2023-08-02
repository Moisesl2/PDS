package Automovel;

public class Moto {
    public String KmRodados;
    public boolean ligar_desligar;
    public String componentes;

    public Moto(String kmRodados, boolean ligar_desligar, String componentes) {
        KmRodados = kmRodados;
        this.ligar_desligar = ligar_desligar;
        this.componentes = componentes;
    }

    public boolean isLigar_desligar() {
        return ligar_desligar;
    }

    public void setLigar_desligar(boolean ligar_desligar) {
        this.ligar_desligar = ligar_desligar;
    }

    public String getComponentes() {
        return componentes;
    }

    public void setComponentes(String componentes) {
        this.componentes = componentes;
    }

    @Override
    public String toString() {
        return "Moto [KmRodados=" + KmRodados + ", ligar_desligar=" + ligar_desligar + ", componentes=" + componentes
                + "]";
    }

    
}
