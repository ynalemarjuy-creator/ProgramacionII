package auxiliatura3;

import java.util.ArrayList;

public class Minecraft {

    private String nombre;   
    private int dificultad;        
    ArrayList<String> jugadores;  = new ArrayList();

    public Minecraft(String nombreServidor, int maxJugadores) {
        this.nombreServidor = nombreServidor;
        this.maxJugadores = maxJugadores;
        jugadores = new ArrayList<>();
    }

    public void agregarJugador(String jugador) {
        if (jugadores.size() < maxJugadores) {
            jugadores.add(jugador);
            System.out.println("Jugador agregado: " + jugador);
        } else {
            System.out.println("El servidor está lleno.");
        }
    }
    public void mostrarJugadores() {
        System.out.println("Jugadores en el servidor:");
        for (String j : jugadores) {
            System.out.println(j);
        }
    }
}