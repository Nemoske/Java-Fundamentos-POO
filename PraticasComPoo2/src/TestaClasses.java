public class TestaClasses {
    public static void main(String[] args) {

        Cliente paulo = new Cliente();
        paulo.nome = "Paulo Silveira";
        paulo.cpf = "223333221";
        paulo.profissao = "programador";

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.depositar(1010);
        contaDoPaulo.titular = paulo;

        System.out.println(contaDoPaulo.titular.profissao);
        System.out.println(contaDoPaulo.titular.nome);
        System.out.println(contaDoPaulo.titular.cpf);
        System.out.println(contaDoPaulo.getSaldo());





    }
}
