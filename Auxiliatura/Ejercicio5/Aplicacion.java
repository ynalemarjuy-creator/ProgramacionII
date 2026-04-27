public class Aplicacion {
    public static void main(String[] args) {

        CentroVeterinario c1 = new CentroVeterinario("Vet 1");
        CentroVeterinario c2 = new CentroVeterinario("Vet 2");

        c1.agregarPerro(new Perro("Firulais", 5, "Juan", true, true));
        c1.agregarPerro(new Perro("Max", 3, "Ana", false, true));

        c1.agregarGato(new Gato("Michi", 2, "Juan", true, true));
        c1.agregarGato(new Gato("Luna", 4, "Ana", false, false));

        c2.agregarPerro(new Perro("Rocky", 6, "Luis", true, false));
        c2.agregarPerro(new Perro("Toby", 2, "Maria", false, true));

        c2.agregarGato(new Gato("Nina", 1, "Luis", true, true));
        c2.agregarGato(new Gato("Pelusa", 3, "Maria", false, false));

        c1.ordenarPerros();
        c1.ordenarGatos();
        c1.mostrarPerros();
        c1.mostrarGatos();
        c1.verificarDueno();

        c2.ordenarPerros();
        c2.ordenarGatos();
        c2.mostrarPerros();
        c2.mostrarGatos();
        c2.verificarDueno();
    }
}