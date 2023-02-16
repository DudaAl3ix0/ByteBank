package ByteBankEncapsulado;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

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

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
        if(numero >= 1500){
            System.out.println("Voce está acessando a conta com o número " + numero);
        }else{
            System.out.println("Error! número da conta inválido");
        }
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
        if(agencia >= 455){
            System.out.println("Bem-vindo a agência " + agencia);
        }else{
            System.out.println("Acesso inválido!");
        }
    }
}
