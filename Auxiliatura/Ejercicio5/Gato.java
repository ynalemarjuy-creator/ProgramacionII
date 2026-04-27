public class Gato extends Animal {
    private boolean cazaRatones;
    private boolean tomaLeche;

    public Gato(String nombre, int edad, String dueno, boolean cazaRatones, boolean tomaLeche) {
        super(nombre, edad, dueno);
        this.cazaRatones = cazaRatones;
        this.tomaLeche = tomaLeche;
    }

    public boolean isTomaLeche() { return tomaLeche; }
}