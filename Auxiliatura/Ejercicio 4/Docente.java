package Programa
public class Docente extends Persona {
    private int antiguedad;
    private double sueldo;

    public Docente(String nombre, int carnet, int edad, int antiguedad, double sueldo) {
        super(nombre, carnet, edad);
        this.antiguedad = antiguedad;
        this.sueldo = sueldo;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Antigüedad: " + antiguedad);
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Algún estudiante tiene la misma edad que el docente.");
    }

    public int getEdad() {
        return edad;
    }
}