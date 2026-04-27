public class Main2 {

    public static void main(String[] args) {

        CuentaBancaria c1 = new CuentaBancaria("Juan Perez","12345",500);

        c1.mostrarDatos();

        c1.depositar(200);

        c1.retirar(100);

        c1.retirar(1000); // error

        c1.depositar(-50); // error
    }
}