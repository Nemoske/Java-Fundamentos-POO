public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 50;

        conta.depositar(1000);
        System.out.println(conta.saldo);


    }


}
