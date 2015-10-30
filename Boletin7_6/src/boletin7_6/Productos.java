package boletin7_6;
//Yasmin

import javax.swing.JOptionPane;

public class Productos {
    String consumo1="baixo";
    String consumo2="medio";
    String consumo3="alto";
    String consumo4="primeira necesidade";
   
public int numeroVentas(){
    int ventas;
    return(Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de ventas")));
}

public void tipoartigos(int nVentas){
    if(nVentas<=100){
        JOptionPane.showMessageDialog(null,"O Artigo 1 é de consumo "+this.consumo1);
    }
    if(nVentas>100 && nVentas<=500){
        JOptionPane.showMessageDialog(null,"O Artigo 2 é de consumo "+this.consumo2);
    }
    if(nVentas>500 && nVentas<=1000){
        JOptionPane.showMessageDialog(null,"O Artigo 3 é de consumo "+this.consumo3);
    }
    if(nVentas>1000){
        JOptionPane.showMessageDialog(null,"O Artigo 4 é de "+this.consumo4);
    }
}

}
