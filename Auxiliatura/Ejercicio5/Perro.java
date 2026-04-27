public class Perro extends Animal {
    private boolean requiereBosal;
    private boolean ladraFuerte;

    public Perro(String nombre, int edad, String dueno, boolean requiereBosal, boolean ladraFuerte) {
        super(nombre, edad, dueno);
        this.requiereBosal = requiereBosal;
        this.ladraFuerte = ladraFuerte;
    }

    public boolean isRequiereBosal() { return requiereBosal; }
    public boolean isLadraFuerte() { return ladraFuerte; }
}