public class Conta {

    //ATRIBUTOS

    int numero;
    int agencia;
     Cliente titular;
   private double saldo;



    //METODOS

    public void depositar(double valor){
        this.saldo += valor;
    }

    public boolean sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.depositar(valor);
            return true;
        }
        else{
            return false;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

}

