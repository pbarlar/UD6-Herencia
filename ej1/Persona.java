package ej1;

public class Persona {
        String NIF="111111111A";
        int altura=175, edad=25;

        public Persona(String N, int a, int e){
            NIF=N;
            altura=a;
            edad=e;

            if (N==null) {
                NIF="11111111A";
            }

            if (a==0) {
                altura=175;
            }

            if (e==0) {
                edad=25;
            }
        }

        String getNIF(){
            return NIF;
        }

        int getaltura(){
            return altura;
        }

        int getedad(){
            return edad;
        }

        void setNIF(String N){
            NIF=N;
        }

        void setaltura(int a){
            altura=a;
        }

        void setedad(int e){
            edad=e;
        }

        @Override
        public String toString(){
            return getNIF()+" "+getaltura()+" "+getedad();
        }
}