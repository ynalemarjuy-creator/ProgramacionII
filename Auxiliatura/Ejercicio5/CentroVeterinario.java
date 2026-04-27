public class CentroVeterinario {
    private String nombre;
    private Perro[] perros;
    private Gato[] gatos;
    private int cantPerros;
    private int cantGatos;

    public CentroVeterinario(String nombre) {
        this.nombre = nombre;
        perros = new Perro[100];
        gatos = new Gato[100];
        cantPerros = 0;
        cantGatos = 0;
    }

    public void agregarPerro(Perro p) {
        perros[cantPerros++] = p;
    }

    public void agregarGato(Gato g) {
        gatos[cantGatos++] = g;
    }

    public void ordenarPerros() {
        for (int i = 0; i < cantPerros - 1; i++) {
            for (int j = 0; j < cantPerros - i - 1; j++) {
                Perro a = perros[j];
                Perro b = perros[j + 1];

                if (a.getEdad() > b.getEdad() ||
                   (a.getEdad() == b.getEdad() && a.getNombreDueno().compareTo(b.getNombreDueno()) > 0) ||
                   (a.getEdad() == b.getEdad() && a.getNombreDueno().equals(b.getNombreDueno())
                    && a.getNombre().compareTo(b.getNombre()) > 0)) {

                    perros[j] = b;
                    perros[j + 1] = a;
                }
            }
        }
    }

    public void ordenarGatos() {
        for (int i = 0; i < cantGatos - 1; i++) {
            for (int j = 0; j < cantGatos - i - 1; j++) {
                Gato a = gatos[j];
                Gato b = gatos[j + 1];

                if ((!a.isTomaLeche() && b.isTomaLeche()) ||
                   (a.isTomaLeche() == b.isTomaLeche() && a.getEdad() < b.getEdad()) ||
                   (a.getEdad() == b.getEdad() &&
                    a.getNombre().compareTo(b.getNombre()) > 0)) {

                    gatos[j] = b;
                    gatos[j + 1] = a;
                }
            }
        }
    }

    public void mostrarPerros() {
        System.out.println("\nPerros en " + nombre + ":");
        for (int i = 0; i < cantPerros; i++) {
            System.out.println(perros[i].getNombre() +
                    " | Edad: " + perros[i].getEdad() +
                    " | Dueño: " + perros[i].getNombreDueno());
        }
    }

    public void mostrarGatos() {
        System.out.println("\nGatos en " + nombre + ":");
        for (int i = 0; i < cantGatos; i++) {
            System.out.println(gatos[i].getNombre() +
                    " | Edad: " + gatos[i].getEdad() +
                    " | Dueño: " + gatos[i].getNombreDueno());
        }
    }

    public void verificarDueno() {
        System.out.println("\nDueños con más de un animal en " + nombre + ":");

        for (int i = 0; i < cantPerros; i++) {
            String dueno = perros[i].getNombreDueno();
            int contador = 0;

            for (int j = 0; j < cantPerros; j++) {
                if (perros[j].getNombreDueno().equals(dueno)) {
                    contador++;
                }
            }

            for (int j = 0; j < cantGatos; j++) {
                if (gatos[j].getNombreDueno().equals(dueno)) {
                    contador++;
                }
            }

            if (contador >= 2) {
                System.out.println("Dueño: " + dueno + " tiene " + contador + " animales");
            }
        }
    }
}