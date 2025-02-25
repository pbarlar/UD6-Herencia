package ej5;

public class Directivo extends Empleado {
    public Directivo(){
        super(); 
    }
 
    public Directivo(String n){
        super(n);
    }
     
     
 @Override
    public String toString() {
     return "Empleado "+getNombre()+ " -> Directivo";
    }
}
