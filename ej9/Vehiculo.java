package ej9;

public abstract class Vehiculo {
    int vehiculosCreados, kilometrosRecorridos;
    static int kilometrosTotales;

    public Vehiculo(){
        vehiculosCreados++;
        this.kilometrosRecorridos=0;
    }

    void recorrerKilometros(int km){
        this.kilometrosRecorridos=km;
        kilometrosTotales+=km;
    }

    public static int getKilometrosTotal(){
        return kilometrosTotales;
    }

    public int getKilometrosRecorridos(){
        return this.kilometrosRecorridos;
    }

}
