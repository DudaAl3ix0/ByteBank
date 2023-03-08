package ByteBankHerdadoConta;

public class TesteConta {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(15, 8);
        cc.deposita(150);
        

        ContaPoupanca cp = new ContaPoupanca(18, 12);
        cp.deposita(450);

        try {
            cc.transfere(100, cp);
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }
        System.out.println("CP saldo é " + cp.getSaldo());
        System.out.println("CC saldo é " + cc.getSaldo());
    }
}
