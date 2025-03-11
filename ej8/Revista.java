package ej8;

public class Revista extends Publicacion {
    int numero;
    public Revista(int ISBN, int añoPublicacion, String titulo,int numero) {
        super(ISBN, añoPublicacion, titulo);
        this.numero=numero;
    }

    @Override
    public String toString() {
    return super.toString();
    }
    
}
