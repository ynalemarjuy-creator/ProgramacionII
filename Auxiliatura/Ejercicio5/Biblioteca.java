public class Biblioteca {
    private String nombre;
    private int cantLibros;
    private Libro[] libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.cantLibros = 0;
        this.libros = new Libro[100];
    }

    public void agregarLibro(Libro libro) {
        if (cantLibros < libros.length) {
            libros[cantLibros] = libro;
            cantLibros++;
        }
    }
    public void buscarLibro(String nombreLibro) {
        boolean encontrado = false;

        for (int i = 0; i < cantLibros; i++) {
            if (libros[i].getNombre().equalsIgnoreCase(nombreLibro)) {
                libros[i].mostrarDatos();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Libro no encontrado en " + nombre);
        }
    }

    public int getCantLibros() {
        return cantLibros;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarBiblioteca() {
        System.out.println("Biblioteca: " + nombre);
        for (int i = 0; i < cantLibros; i++) {
            libros[i].mostrarDatos();
        }
    }
}