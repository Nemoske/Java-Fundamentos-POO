public class TestandoRetorno {
    public static void main(String[] args) {
        Conta conta2 = new Conta();

        conta2.depositar(1000);
        System.out.println(conta2.sacar(100));
        System.out.println("Saldo atual: "+conta2.saldo);


    }
}
