public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta ContaDaMarcela = new Conta();

        ContaDaMarcela.titular = new Cliente();
        System.out.println(ContaDaMarcela.titular);

        ContaDaMarcela.titular.nome = "marcela";
        ContaDaMarcela.titular.cpf = "222.222.222-22";
        ContaDaMarcela.titular.profissao = "barbeira";
        System.out.println(ContaDaMarcela.titular.nome);
        System.out.println(ContaDaMarcela.titular.cpf);
        System.out.println(ContaDaMarcela.titular.profissao);
    }
}
