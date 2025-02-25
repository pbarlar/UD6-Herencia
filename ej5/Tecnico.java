package ej5;

public class Tecnico extends Operario {
    public Tecnico(){
        super(); 
     }
 
     public Tecnico(String n){
         super(n);
     }
     
     
     @Override
     public String toString() {
        return "Empleado "+getNombre()+" -> Operario"+" -> Tecnico";
     }
}
