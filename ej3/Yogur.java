package ej3;

public class Yogur {
    double calorias;
    public Yogur(){
        calorias=120.5;
    }

    public double getCalorias(){
        return calorias;
    }

    @Override
    public String toString(){
        return "calorias: "+calorias;
    }

}
