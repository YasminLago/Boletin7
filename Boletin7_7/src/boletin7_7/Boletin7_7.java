package boletin7_7;
//Yasmin
import javax.swing.JOptionPane;
public class Boletin7_7 {
    public static void main(String[] args) {
        double lado,lado2,base,altura,radio;
        
        String res=JOptionPane.showInputDialog("Elija una opción");
        int opcion=Integer.parseInt(res);
        
        switch(opcion){
            case 1: String res1=JOptionPane.showInputDialog("Introduce el lado");
                    lado=Double.parseDouble(res1);
                    String res2=JOptionPane.showInputDialog("Introduce el lado2");
                    lado2=Double.parseDouble(res2);
                    Cuadrado c=new Cuadrado(lado,lado2);
                    JOptionPane.showMessageDialog(null,"El area del cuadrado es "+c.areaCuadrado()+" m²");
                break;
            case 2: String res3=JOptionPane.showInputDialog("Introduce el base");
                    base=Double.parseDouble(res3);
                    String res4=JOptionPane.showInputDialog("Introduce el altura");
                    altura=Double.parseDouble(res4);
                    Triangulo r=new Triangulo(base,altura);
                    JOptionPane.showMessageDialog(null,"El area del triangulo es "+r.areaTriangulo()+" m²");
                break;
            case 3: String res5=JOptionPane.showInputDialog("Introduce el radio");
                    radio=Double.parseDouble(res5);
                    Circulo e=new Circulo(radio);
                    JOptionPane.showMessageDialog(null,"El area del circulo es "+e.areaCirculo()+" m²");
                break;
            default:JOptionPane.showMessageDialog(null,"Opción incorrecta");
        }
    }
    
}
