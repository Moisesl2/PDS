package Automovel;

public class Caminhao {
    protected String KmRodados;
    protected boolean ligar_desligar;
    protected String componentes;

    public Caminhao(String kmRodados, boolean ligar_desligar, String componentes) {
        KmRodados = kmRodados;
        this.ligar_desligar = ligar_desligar;
        this.componentes = componentes;
    }

    public String getKmRodados() {
        return KmRodados;
    }

    public void setKmRodados(String kmRodados) {
        KmRodados = kmRodados;
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
        return "Caminhao [KmRodados=" + KmRodados + ", ligar_desligar=" + ligar_desligar + ", componentes="
                + componentes + "]";
    }

    

    
}
