package ByteBankHerdadoConta;

public class TesteConta {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(15, 8);
        cc.deposita(150);
        

        ContaPoupanca cp = new ContaPoupanca(18, 12);
        cp.deposita(450);

        cc.transfere(100, cp);
        System.out.println("CP saldo é " + cp.getSaldo());
        System.out.println("CC saldo é " + cc.getSaldo());
    }
}
