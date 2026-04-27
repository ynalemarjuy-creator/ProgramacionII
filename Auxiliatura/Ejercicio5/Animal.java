public class Animal {
    protected String nombre;
    protected int edad;
    protected String nombreDueno;

    public Animal(String nombre, int edad, String nombreDueno) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreDueno = nombreDueno;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getNombreDueno() { return nombreDueno; }
}