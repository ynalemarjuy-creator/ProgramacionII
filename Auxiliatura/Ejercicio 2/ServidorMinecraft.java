public class ServidorMinecraft {

    Jugador[] jugadores = new Jugador[10];
    int contador = 0;

    public void agregarJugador(String nombre, int diamantes) {

        if (contador < jugadores.length) {
            jugadores[contador] = new Jugador(nombre, diamantes);
            contador++;
        } else {
            System.out.println("Servidor lleno");
        }

    }

    public void mostrarStacks() {

        for (int i = 0; i < contador; i++) {

            int stacks = jugadores[i].diamantes / 64;

            System.out.println(jugadores[i].nombre + " tiene " + stacks + " stack(s) de diamantes");

        }

    }

    public void jugadorConMasDiamantes() {

        Jugador mayor = jugadores[0];

        for (int i = 1; i < contador; i++) {

            if (jugadores[i].diamantes > mayor.diamantes) {
                mayor = jugadores[i];
            }

        }

        System.out.println("Jugador con más diamantes: " + mayor.nombre);
    }

    public void totalDiamantes() {

        int total = 0;

        for (int i = 0; i < contador; i++) {
            total += jugadores[i].diamantes;
        }

        System.out.println("Total de diamantes en el servidor: " + total);

    }

}