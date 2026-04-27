public class Maiin {
    public static void maiin(String[] args) {

        CentroVeterinario c1 = new CentroVeterinario("Vet 1");
        CentroVeterinario c2 = new CentroVeterinario("Vet 2");

        // Perros
        c1.agregarPerro(new Perro("Firulais", 5, "Juan", true, true));
        c1.agregarPerro(new Perro("Max", 3, "Ana", false, true));

        // Gatos
        c1.agregarGato(new Gato("Michi", 2, "Juan", true, true));
        c1.agregarGato(new Gato("Luna", 4, "Ana", false, false));

        c1.ordenarPerros();
        c1.ordenarGatos();
        c1.verificarDueno();
    }
}