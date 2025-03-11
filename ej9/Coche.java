package ej9;

public class Coche extends Vehiculo implements Arrancable{
    boolean estaArrancado=false;


    public void andarCoche(){
        if (estaArrancado) {
            System.out.println("El coche está andando");
        }else{
            System.out.println("El coche no puede andar si no está arracado.");
        }
        
    }

    public void quemarRueda(){
        System.out.println("El coche esta quemando rueda.");
    }

    public void arrancar(){
        if (this.estaArrancado) {
            System.out.println("El coche ya esta arrancado.");
        }else{
            estaArrancado=true;
            System.out.println("Coche arrancado correctamente.");
        }
    }

    public void detener(){
        if (this.estaArrancado==false) {
            System.out.println("El coche ya esta detenido.");
        }else{
            System.out.println("Coche detenido correctamente");
        }
    }

    public boolean estaArrancado(){
        return this.estaArrancado();
    }
}
