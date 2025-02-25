package ej4;

public class Operario extends Empleado {
    
    public Operario(){
       super(); 
    }

    public Operario(String n){
        super(n);
    }
    
    
    @Override
    public String toString() {
        return super.toString()+"-> Operario";
    }
}
