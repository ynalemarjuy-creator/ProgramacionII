public class CentroVeterinario {
    private String nombre;
    private Perro[] perros = new Perro[100];
    private Gato[] gatos = new Gato[100];
    private int cantPerros = 0;
    private int cantGatos = 0;

    public CentroVeterinario(String nombre) {
        this.nombre = nombre;
    }

    public void agregarPerro(Perro p) {
        perros[cantPerros++] = p;
    }

    public void agregarGato(Gato g) {
        gatos[cantGatos++] = g;
    }

    // b) Ordenar perros
    public void ordenarPerros() {
        for (int i = 0; i < cantPerros - 1; i++) {
            for (int j = 0; j < cantPerros - i - 1; j++) {
                Perro a = perros[j];
                Perro b = perros[j + 1];

                if (a.getEdad() > b.getEdad() ||
                   (a.getEdad() == b.getEdad() && a.getNombreDueno().compareTo(b.getNombreDueno()) > 0) ||
                   (a.getEdad() == b.getEdad() && a.getNombreDueno().equals(b.getNombreDueno()) &&
                    a.getNombre().compareTo(b.getNombre()) > 0)) {

                    perros[j] = b;
                    perros[j + 1] = a;
                }
            }
        }
    }

    // c) Ordenar gatos
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

    // d) Verificar dueños
    public void verificarDueno() {
        for (int i = 0; i < cantPerros; i++) {
            int contador = 1;

            for (int j = i + 1; j < cantPerros; j++) {
                if (perros[i].getNombreDueno().equals(perros[j].getNombreDueno())) {
                    contador++;
                }
            }

            for (int j = 0; j < cantGatos; j++) {
                if (perros[i].getNombreDueno().equals(gatos[j].getNombreDueno())) {
                    contador++;
                }
            }

            if (contador >= 2) {
                System.out.println("Dueño: " + perros[i].getNombreDueno() +
                                   " tiene " + contador + " animales");
            }
        }
    }
}