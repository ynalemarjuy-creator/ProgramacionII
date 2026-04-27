public class CuentaBancaria {

    private String titular;
    private String nroCuenta;
    private double saldo;

    public CuentaBancaria(String titular, String nroCuenta, double saldo) {
        this.titular = titular;
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: no se puede depositar 0 o un número negativo.");
        } else {
            saldo = saldo + monto;
            System.out.println("Depósito realizado. Nuevo saldo: " + saldo);
        }
    }

    public void retirar(double monto) {
        if (monto > saldo) {
            System.out.println("Error: saldo insuficiente.");
        } else {
            saldo = saldo - monto;
            System.out.println("Retiro realizado. Nuevo saldo: " + saldo);
        }
    }
        public void mostrarDatos(){

        System.out.println("Titular: " + titular);
        System.out.println("Numero de cuenta: " + nroCuenta);
        System.out.println("Saldo: " + saldo);

    }
}

