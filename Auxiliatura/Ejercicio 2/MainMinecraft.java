public class MainMinecraft {

    public static void main(String[] args) {

        ServidorMinecraft servidor = new ServidorMinecraft();

        servidor.agregarJugador("Melany", 130);
        servidor.agregarJugador("Paola", 65);
        servidor.agregarJugador("Bruss", 50);

        servidor.mostrarStacks();

        servidor.jugadorConMasDiamantes();

        servidor.totalDiamantes();

    }

}