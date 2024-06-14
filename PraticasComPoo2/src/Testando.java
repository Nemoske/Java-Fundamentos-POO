public class Testando {
    public static void main(String[] args) {
        Conta conta = new Conta();


        conta.depositar(200);
        System.out.println(conta.sacar(100));
        System.out.println(conta.getSaldo());

        //DESCARTANDO  O ERRADO:
        //System.out.println(conta.saldo);
        //conta.saldo = conta.saldo -101;
        //System.out.println(conta.saldo);
    }
}
