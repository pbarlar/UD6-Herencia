package ej4;

public class Directivo extends Empleado {
    public Directivo(){
        super(); 
    }
 
    public Directivo(String n){
        super(n);
    }
     
     
 @Override
    public String toString() {
     return super.toString()+"-> Directivo";
    }
}
