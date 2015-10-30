package boletin7_3;
//Yasmin

import javax.swing.JOptionPane;

public class Signos {
    public int tecleaNum(){
        int num;
        return(Integer.parseInt(JOptionPane.showInputDialog("Teclea número")));
    }
    
    public void compara(int num){
        if(num>0){
            JOptionPane.showMessageDialog(null,"+");
        }
        else if(num<0){
            JOptionPane.showMessageDialog(null,"-");
        }
        else{
            JOptionPane.showMessageDialog(null,"0");
    }
    }
}
