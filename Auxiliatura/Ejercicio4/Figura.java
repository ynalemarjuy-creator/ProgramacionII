public abstract class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public abstract double obtenerArea();

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Color: " + color +
               "\nÁrea: " + obtenerArea() +
               "\n----------------------";
    }
}