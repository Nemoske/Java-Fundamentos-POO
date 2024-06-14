public class CriarConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        Conta segundaConta = new Conta();

        System.out.println("Agência da primeira conta: "+primeiraConta.agencia);
        System.out.println("Agência da segunda conta: "+segundaConta.agencia);


        primeiraConta.saldo = 200;
        System.out.println("Saldo R$: "+primeiraConta.saldo);



        segundaConta.saldo = 50;
        System.out.println("Saldo em conta: "+segundaConta.saldo);
    }
}
