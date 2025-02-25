package ej4;

public class Tecnico extends Operario {
    public Tecnico(){
        super(); 
     }
 
     public Tecnico(String n){
         super(n);
     }
     
     
     @Override
     public String toString() {
         return super.toString()+" -> Tecnico";
     }
}
