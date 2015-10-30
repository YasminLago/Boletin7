package boletin7_7;
//Yasmin
public class Cuadrado {
   double lado,lado2;
   
   public Cuadrado(double lado,double lado2){
       this.lado=lado;
       this.lado2=lado2;
   }
        
    public double areaCuadrado(){
        return (Math.pow(lado, lado2));   
    }
    
}

