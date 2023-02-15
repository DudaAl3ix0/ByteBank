public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100;
        contaDoPaulo.deposita(50);

        System.out.println(contaDoPaulo.saldo);

        if(contaDoPaulo.saca(30)) {
            System.out.println("Retirada de dinheiro com sucesso agora seu saldo é " + contaDoPaulo.saldo);
        }else{
            System.out.println("Não a saldo suficiente, o saldo disponível é de " + contaDoPaulo.saldo);
        }

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);

        if(contaDaMarcela.transfere(300, contaDoPaulo)){
            System.out.println("Transferencia bem sucedida! Agora seu saldo é de " + contaDaMarcela.saldo);
        }else{
            System.out.println("Transferencia negada, por saldo insuficiente.");
        }
    }
}
