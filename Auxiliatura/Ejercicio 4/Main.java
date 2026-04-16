package ProgramacionII.Auxiliatura.Ejercicio4;
public class Main {
    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("Ana", 123, 20, 1001, "Sistemas");
        Estudiante e2 = new Estudiante("Luis", 456, 25, 1002, "Sistemas");

        Docente d1 = new Docente("Carlos", 789, 25, 10, 5000);

        // b. Mostrar datos
        e1.mostrar();
        e2.mostrar();
        d1.mostrar();

        // c. Verificar misma edad
        if (e1.getEdad() == d1.getEdad() || e2.getEdad() == d1.getEdad()) {
            System.out.println("Algún estudiante tiene la misma edad que el docente.");
        } else {
            System.out.println("Ningún estudiante tiene la misma edad que el docente.");
        }

        // d. Verificar misma carrera
        if (e1.getCarrera().equals(e2.getCarrera())) {
            System.out.println("Los estudiantes están en la misma carrera.");
        } else {
            System.out.println("Los estudiantes NO están en la misma carrera.");
        }
    }
}