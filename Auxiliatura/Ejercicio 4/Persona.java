package ProgramacionII.Auxiliatura.Ejercicio4;
public class Persona {
    protected String nombre;
    protected int carnet;
    protected int edad;

    public Persona(String nombre, int carnet, int edad) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.edad = edad;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Carnet: " + carnet);
        System.out.println("Edad: " + edad);
    }
}