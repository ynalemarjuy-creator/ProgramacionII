public class Libro {
    private String nombre;
    private String autor;
    private int anio;

    public Libro(String nombre, String autor, int anio) {
        this.nombre = nombre;
        this.autor = autor;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + ", Autor: " + autor + ", Año: " + anio);
    }
}