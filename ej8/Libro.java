package ej8;

public class Libro extends Publicacion implements Prestable {
    boolean estaPrestado;
    
    public Libro(int ISBN, int añoPublicacion,String titulo){
        super(ISBN,añoPublicacion,titulo);
    }

    public void presta(){
        if (this.estaPrestado) {
            System.out.println("El libro está prestado");
        } else {
            this.estaPrestado= true;
        }
    }

    public boolean estaPrestado(){
            return estaPrestado;
        }

    public void devuelve(){
            if (estaPrestado) {
                System.out.println("El libro se ha devuelto correctamente");
                estaPrestado=false;
            }else{
                System.out.println("El libro no lo tiene nadie, por lo que no se puede devolver");
            }
        }

    @Override
    public String toString(){
        return super.toString()+" "+(this.estaPrestado ? "Prestado" : "No prestado");
    }
}
