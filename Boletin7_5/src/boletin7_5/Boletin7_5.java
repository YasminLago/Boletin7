package boletin7_5;
//Yasmin

import javax.swing.JOptionPane;

public class Boletin7_5 {
    public static void main(String[] args) {
        int num1,num2,num3;
        String res1=JOptionPane.showInputDialog("Teclea el primer número");
        num1=Integer.parseInt(res1);
       
        String res2=JOptionPane.showInputDialog("Teclea el segundo número");
        num2=Integer.parseInt(res2);
        
        String res3=JOptionPane.showInputDialog("Teclea el tercer número");
        num3=Integer.parseInt(res3);
        
        NumeroMayor n=new NumeroMayor();
        n.numM(num1, num2, num3);
       
    }
    
}
