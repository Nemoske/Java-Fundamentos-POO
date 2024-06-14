public class TestandoMetodoReferencia {
    public static void main(String[] args) {
        Conta ContaTransfere = new Conta();
        Conta contaQueRecebe = new Conta ();
        ContaTransfere.depositar(2000);
        System.out.println("Saldo conta2 atual: "+contaQueRecebe.saldo);
        System.out.println("saldo da conta1 atual: "+ContaTransfere.saldo);

        boolean resultado =
                ContaTransfere.transfere(500,contaQueRecebe);

        if(resultado){
            System.out.println(resultado);
            System.out.println("Transferência realizada!");
            System.out.println("saldo da conta1  que transfere após a transferência: "+ContaTransfere.saldo);
            System.out.println("Saldo novo da conta2 que recebeu: "+contaQueRecebe.saldo);
        }
        else{
            System.out.println(resultado);
            System.out.println("Transferência negada!");

        }

    }

}
