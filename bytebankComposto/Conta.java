package bytebankComposto;

public class Conta {
    private double saldo;
    int agencia;
    int numero;
    Cliente titular;

    public void deposita(double valor){
        this.saldo += valor;
    }
    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("O dinheiro foi sacado com sucesso, o seu saldo atual é de " + this.saldo);
            return true;
        }else{
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }
    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            System.out.println("O valor foi transferido com sucesso!");
            return true;
        }else{
            System.out.println("Não foi possível realizar a transferência.");
            return false;}
    } 

    public double informaSaldo(){
        return this.saldo;
    }
}
