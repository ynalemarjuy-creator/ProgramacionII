public class Aplicacion {

    public static Figura mayorArea(Figura f1, Figura f2) {
        return (f1.obtenerArea() > f2.obtenerArea()) ? f1 : f2;
    }

    public static void aplicacion(String[] args) {

        Cuadrado c = new Cuadrado("Rojo", 4);
        Triangulo t = new Triangulo("Verde", 3, 4, 5);

        System.out.println(c);
        System.out.println(t);

        Figura mayor = mayorArea(c, t);

        System.out.println("La figura con mayor área es de color: " + mayor.getColor());
    }
}