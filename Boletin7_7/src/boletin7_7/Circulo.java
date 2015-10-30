package boletin7_7;
//Yasmin
public class Circulo {
      double radio;
      static final double PI=3.14;
      
   public Circulo(double radio){
       this.radio=radio;
   }    
    public double areaCirculo(){
        return (PI*(Math.pow(radio, 2)));  
    }
    
}


