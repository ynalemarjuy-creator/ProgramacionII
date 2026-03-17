public class MainBus {

    public static void main(String[] args) {

        Bus bus1 = new Bus(40);

        bus1.subirPasajeros(25);

        System.out.println("Total a cobrar: " + bus1.cobrarPasaje());
        System.out.println("Asientos disponibles: " + bus1.asientosDisponibles());

        Bus bus2 = new Bus(30);

        bus2.subirPasajeros(30);

        System.out.println("Total a cobrar: " + bus2.cobrarPasaje());
        System.out.println("Asientos disponibles: " + bus2.asientosDisponibles());
       
    }
} 
