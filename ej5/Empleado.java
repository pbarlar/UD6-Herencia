package ej5;

public abstract class Empleado {
    private String nombre;


    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public Empleado() {
        nombre="Null";
    }

    void setNombre(String nombre){
        this.nombre = nombre;
    }

    String getNombre(){
        return nombre;
    }

    @Override
    public abstract String toString();
}
