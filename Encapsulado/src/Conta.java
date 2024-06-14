public class Conta {

        //ATRIBUTOS

    private  int numero;
    private  int agencia;
    private  Cliente titular;
    private  double saldo;
    private static int total;

    //CONSTRUCTOR
    public Conta(int numero, int agencia){
        //COM REGRA de criação
        if(numero <= 0 && agencia <= 0){
            System.out.println("Erro, não é possível seguir adiante... valores inválidos");
            return;
        }
        Conta.total++;
        //System.out.println("Total de contas criadas: "+Conta.total);
        this.numero = numero;
        this.agencia = agencia;
    }

        //METODOS

        public void Depositar(double valor){
            this.saldo += valor;
        }

        public boolean Sacar(double valor){
            if(this.saldo >= valor){
                this.saldo -= valor;
                return true;
            }
            else{
                return false;
            }
        }

        public boolean Transfere(double valor, Conta destino){
            if(this.saldo >= valor){
                this.saldo -= valor;
                destino.Depositar(valor);
                return true;
            }
            else{
                return false;
            }
        }

        public double getSaldo(){
            return this.saldo;
        }

        public int getNumero(){
            return this.numero;
        }

        public void setNumero(int numero){
            if(numero<=0){
                System.out.println("Erro, não é possível seguir adiante... número da conta negativo ou zero");
                return;
            }
            this.numero = numero;

        }

        public int getAgencia(){
            return this.agencia;
        }

        public void setAgencia(int agencia){
            if(agencia <=0){
                System.out.println("Erro, não é possível seguir adiante... número da agência negativo ou zero");
                return;
            }
            this.agencia = agencia;
        }

        public void setTitular(Cliente titular){
            this.titular = titular;
        }

        public Cliente getTitular() {
        return titular;
    }

    public static int getTotal(){
        return Conta.total;
    }
}



