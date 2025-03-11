package ej9;

import java.util.Scanner;

public class TestVehiculos {
    public static void main(String[] args) {
        int opcion;
        Bicicleta bicicleta1= new Bicicleta();
        Coche coche1= new Coche();
        
        do {
            System.out.println("VEHÍCULOS");
            System.out.println("-------------");
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta.");
            System.out.println("3. Anda con el coche.");
            System.out.println("4. Quema rueda con el coche.");
            System.out.println("5. Ver kilometraje de la bicileta.");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Arrancar coche");
            System.out.println("9. Detener coche.");
            System.out.println("10. El coche esta arrancado?");
            System.out.println("11. Salir.");
            System.out.println("Eliga una opción (1-11):");

            Scanner entrada=new Scanner(System.in);
            opcion=entrada.nextInt();

            switch (opcion) {
                case 1:
                    bicicleta1.andarBicicleta();
                    break;
                case 2:
                    bicicleta1.caballitoBicicleta();
                    break;
                case 3:
                    coche1.andarCoche();
                    break;
                case 4:
                    coche1.quemarRueda();
                    break;
                case 5:
                    System.out.println(bicicleta1.getKilometrosRecorridos());
                    break;
                case 6:
                    System.out.println(coche1.getKilometrosRecorridos());
                    break;
                case 7:
                    System.out.println(Vehiculo.kilometrosTotales);
                    break;
                case 8:
                    coche1.arrancar();
                    break;
                case 9:
                    coche1.detener();
                    break;
                case 10:
                    if (coche1.estaArrancado) {
                        System.out.println("Si. El coche esta arrancado");;
                    }else{
                        System.out.println("No. El coche no está arrancado.");
                    }
                    break;
            }
        } while (opcion!=11);
    }
}
