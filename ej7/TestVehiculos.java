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
            System.out.println("8. Salir");
            System.out.println("Eliga una opción (1-8):");

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
                    break;
            }
        } while (opcion!=8);
    }
}
