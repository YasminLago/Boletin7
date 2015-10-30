package boletin7_5;
//Yasmin

import javax.swing.JOptionPane;

public class NumeroMayor {
    public void numM(int n1,int n2,int n3){
       if(n1>n2)
           if(n1>n3)
           JOptionPane.showMessageDialog(null,"O maior é "+n1);
       
           else
               JOptionPane.showMessageDialog(null,"O maior é "+n3);
       
           else if (n2>n3)
           JOptionPane.showMessageDialog(null,"O maior é "+n2);
       
          else
           JOptionPane.showMessageDialog(null,"O maior é "+n3);
    
    }
}
