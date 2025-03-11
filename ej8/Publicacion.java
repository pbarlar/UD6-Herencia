package ej8;

public abstract class Publicacion {
    int ISBN,añoPublicacion;
    String titulo;

    public Publicacion(int ISBN, int añoPublicacion, String titulo){
        this.ISBN=ISBN;
        this.titulo=titulo;
        this.añoPublicacion=añoPublicacion;
    }

    @Override
    public String toString(){
        return "ISBN: "+ISBN+" , titulo: "+titulo+", "+añoPublicacion;
    }
}
