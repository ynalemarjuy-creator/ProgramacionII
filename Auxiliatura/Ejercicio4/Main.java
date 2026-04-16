public class Main {

    // 🔹 Método para verificar misma edad
    public static boolean mismaEdad(Estudiante e, Docente d) {
        return e.getEdad() == d.getEdad();
    }

    // 🔹 Método para verificar misma carrera
    public static boolean mismaCarrera(Estudiante e1, Estudiante e2) {
        return e1.getCarrera().equals(e2.getCarrera());
    }

    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("Ana", 123, 20, 1001, "Sistemas");
        Estudiante e2 = new Estudiante("Luis", 456, 25, 1002, "Sistemas");
        Docente d1 = new Docente("Carlos", 789, 25, 10, 5000);

        // Mostrar
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(d1);

        // Verificar edad
        if (mismaEdad(e1, d1) || mismaEdad(e2, d1)) {
            System.out.println("Algún estudiante tiene la misma edad que el docente.");
        } else {
            System.out.println("Ningún estudiante tiene la misma edad que el docente.");
        }

        // Verificar carrera
        if (mismaCarrera(e1, e2)) {
            System.out.println("Los estudiantes están en la misma carrera.");
        } else {
            System.out.println("Los estudiantes NO están en la misma carrera.");
        }
    }
}