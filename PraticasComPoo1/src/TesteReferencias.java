public class TesteReferencias {
    public static void main (String[] args){
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        Conta segundaConta = new Conta();
        segundaConta.saldo = 500;
        System.out.println("Endereço da primeira conta: "+primeiraConta);
        System.out.println(primeiraConta.saldo);
        System.out.println("Endereço da Segunda conta: "+segundaConta);
        System.out.println(segundaConta.saldo);


        }
    }




