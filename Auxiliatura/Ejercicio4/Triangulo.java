public class Triangulo extends Figura {
    private int lado1, lado2, lado3;

    public Triangulo(String color, int lado1, int lado2, int lado3) {
        super(color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double obtenerArea() {
        double s = (lado1 + lado2 + lado3) / 2.0;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
}