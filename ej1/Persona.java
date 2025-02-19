package ej1;

public class Persona {
        String NIF;
        int altura, edad;

        public Persona(){
            NIF="111111111A";
            edad=25;
            altura=175;
        }

        public Persona(String vnif, int vedad,int valtura){
            NIF=vnif;
            edad=vedad;
            altura=valtura;
        }

        public String getNIF(){
            return NIF;
        }

        public int getaltura(){
            return altura;
        }

        public int getedad(){
            return edad;
        }

        public void setNIF(String N){
            NIF=N;
        }

        public void setaltura(int a){
            altura=a;
        }

        public void setedad(int e){
            edad=e;
        }

        public void comer(){
            System.out.println("como mucho");
        }

        public void hablar(){
            System.out.println("puedo hablar");
        }

        @Override
        public String toString(){
            return getNIF()+" "+getaltura()+" "+getedad();
        }
}