public class Estudiante extends Persona {
    private int matricula;
    private String carrera;

    public Estudiante(String nombre, int carnet, int edad, int matricula, String carrera) {
        super(nombre, carnet, edad);
        this.matricula = matricula;
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nMatrícula: " + matricula +
               "\nCarrera: " + carrera +
               "\n----------------------";
    }
}