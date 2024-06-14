public class TesteStatic {
    public static void main(String[] args) {
        //PRIMEIRA
        Conta conta = new Conta(1222,1111);
        //SEGUNDA
        Conta conta2 = new Conta(1121,1124);
        //TERCEIRA
        Conta conta3 = new Conta(1151,1114);
        //QUARTA
        Conta conta4 = new Conta(1171,1104);

        
        System.out.println("Total:" +Conta.getTotal());
    }
}
