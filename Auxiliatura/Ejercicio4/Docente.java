public class Docente extends Persona {
    private int antiguedad;
    private double sueldo;

    public Docente(String nombre, int carnet, int edad, int antiguedad, double sueldo) {
        super(nombre, carnet, edad);
        this.antiguedad = antiguedad;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nAntigüedad: " + antiguedad +
               "\nSueldo: " + sueldo +
               "\n----------------------";
    }
}