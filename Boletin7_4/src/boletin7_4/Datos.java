package boletin7_4;
//Yasmin

import javax.swing.JOptionPane;

public class Datos {
    String nome1="María";
    double peso1=60.3;
    String nome2="Javier";
    double peso2=50.2;
    
    public void comparaPeso(){
        if(this.peso1>this.peso2){
            JOptionPane.showMessageDialog(null,"Datos: "+this.nome1+this.peso1);
            JOptionPane.showMessageDialog(null,"Diferencia: "+(this.peso1-this.peso2));
        }
    }
}
