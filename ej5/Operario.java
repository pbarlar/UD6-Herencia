package ej5;

public abstract class  Operario extends Empleado {
    
    public Operario(){
       super(); 
    }

    public Operario(String n){
        super(n);
    }
    
    
    @Override
    public abstract String toString();
}
