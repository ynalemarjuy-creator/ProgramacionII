public class Persona {
    protected String nombre;
    protected int carnet;
    protected int edad;

    public Persona(String nombre, int carnet, int edad) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
               "\nCarnet: " + carnet +
               "\nEdad: " + edad;
    }
}