public class Testando {
    public static void main(String[] args) {
        Conta conta = new Conta(1234,2544);
        Cliente paulo = new Cliente();
        conta.setTitular(paulo);

        Cliente titularDaConta = conta.getTitular();
        paulo.setProfissao("Programador");
        System.out.println(conta.getTitular());
        System.out.println(paulo);
        System.out.println(titularDaConta);

        System.out.println(paulo.getProfissao());
        System.out.println(titularDaConta.getProfissao());


// OUTROS CASOS

        conta.getTitular().setNome("Paulo");
        conta.getTitular().setCpf("222.222.222.22");
        conta.getTitular().setProfissao("Programador");

        System.out.println(conta.getTitular().getNome());
        System.out.println(conta.getTitular().getCpf());
        System.out.println(conta.getTitular().getProfissao());

    }
}


