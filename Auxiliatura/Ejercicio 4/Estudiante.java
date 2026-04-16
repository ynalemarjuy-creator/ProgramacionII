package ProgramacionII.Auxiliatura.Ejercicio4;
public class Estudiante extends Persona {
    private int matricula;
    private String carrera;

    public Estudiante(String nombre, int carnet, int edad, int matricula, String carrera) {
        super(nombre, carnet, edad);
        this.matricula = matricula;
        this.carrera = carrera;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Matrícula: " + matricula);
        System.out.println("Carrera: " + carrera);
        System.out.println("----------------------");
    }

    public String getCarrera() {
        return carrera;
    }

    public int getEdad() {
        return edad;
    }
}