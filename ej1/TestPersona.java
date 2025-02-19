package ej1;

import ej2.Ingeniero;
import ej2.IngenieroInformatico;

public class TestPersona {
    public static void main(String[] args) {
        Persona p1= new Persona();
        Persona p2= new Persona();
        Ingeniero ing1=new Ingeniero();
        IngenieroInformatico inginf1=new IngenieroInformatico();

        System.out.println(p1);
        System.out.println(p2);
        ing1.setNIF("14256722L");
        System.out.println(ing1);
        ing1.razonar();
        ing1.trabajarEnGrupo();
        inginf1.crearPrograma();
        
    }
}