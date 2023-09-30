public class Main {
    public static void main(String[] args) {
        banco b = new banco();
        b.transaccion(5);
        System.out.println("Su saldo actual es: " +b.dineroCuenta());
    }
}