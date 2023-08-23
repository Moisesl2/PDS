package Q1;

import java.util.ArrayList;

import javax.swing.event.SwingPropertyChangeSupport;

public class EspecialAposentado extends CEspecial{
    private ArrayList<CEspecial> Aposentado  = new ArrayList<CEspecial>();

    public EspecialAposentado(String cod, String usuario, double saldo, ArrayList<CEspecial> aposentado) {
        super(cod, usuario, saldo);
        Aposentado = aposentado;
    }

    public ArrayList<CEspecial> getAposentado() {
        return Aposentado;
    }

    public void setAposentado(ArrayList<CEspecial> aposentado) {
        Aposentado = aposentado;
    }
    

    

    
    
}