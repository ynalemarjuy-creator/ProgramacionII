public class Main {
    public static void main(String[] args) {
        Biblioteca b1 = new Biblioteca("Central");
        Biblioteca b2 = new Biblioteca("Escolar");

        Libro l1 = new Libro("Java Básico", "Lucas Perez", 2023);
        Libro l2 = new Libro("POO Avanzado", "Melany Yujra", 2021);
        Libro l3 = new Libro("Estructuras", "Benito Juarez", 2025);
        Libro l4 = new Libro("Algoritmos", "Ana Torres", 2022);

        b1.agregarLibro(l1);
        b1.agregarLibro(l2);

        b2.agregarLibro(l3);
        b2.agregarLibro(l4);

        System.out.println("Busqueda:");
        b1.buscarLibro("Java Básico");

        System.out.println("\nBiblioteca(s) con más libros:");

        if (b1.getCantLibros() > b2.getCantLibros()) {
            b1.mostrarBiblioteca();
        } else if (b2.getCantLibros() > b1.getCantLibros()) {
            b2.mostrarBiblioteca();
        } else {
            b1.mostrarBiblioteca();
            b2.mostrarBiblioteca();
        }
    }
}