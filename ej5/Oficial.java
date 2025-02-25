package ej5;

public class Oficial extends Operario {
    public Oficial(){
        super(); 
     }
 
     public Oficial(String n){
        super(n);
     }
     
     
     @Override
     public String toString() {
         return "Empleado "+getNombre()+" -> Operario"+" -> Oficial";
     }
}
