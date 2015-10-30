package boletin7_2;
//Yasmin

import javax.swing.JOptionPane;

public class Numeros {
    public short teclearNum(){
        short num;
        String res=JOptionPane.showInputDialog("Teclea un número");
        num=Short.parseShort(res);
        return num;
    }
    
    public void comparaNum(short num1,short num2){
        if(num1>=num2){
            JOptionPane.showMessageDialog(null,(num1-num2));
        }
        else{
            JOptionPane.showMessageDialog(null,(num1+num2));
        }
    }
}
