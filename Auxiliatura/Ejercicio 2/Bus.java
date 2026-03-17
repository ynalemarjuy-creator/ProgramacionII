public class Bus {

    private int capacidad;
    private int pasajeros;
    private double precio = 1.50;

    public Bus(int capacidad){
        this.capacidad = capacidad;
        this.pasajeros = 0;
    }

    public void subirPasajeros(int cantidad){
        if(pasajeros + cantidad <= capacidad){
            pasajeros += cantidad;
            System.out.println("Subieron " + cantidad + " pasajeros");
        }else{
            int disponibles = capacidad - pasajeros;
            pasajeros = capacidad;
            System.out.println("Solo subieron " + disponibles + ". El bus está lleno");
        }
    }

    public double cobrarPasaje(){
        return pasajeros * precio;
    }

    public int asientosDisponibles(){
        return capacidad - pasajeros;
    }
}