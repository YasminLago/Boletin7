package boletin7_1;
//Yasmin

import javax.swing.JOptionPane;

public class Positivo {
    public int tecleaNumero(){
        int num;
        return(Integer.parseInt(JOptionPane.showInputDialog("Introduce un número ")));
    }
    public void comprobar(int num){
        if(num>=0){
            JOptionPane.showMessageDialog(null,"El número es positivo");
        }
       /* else{
            JOptionPane.showMessageDialog(null,"Introduce un número positivo");
        }*/
    }
}
