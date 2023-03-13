package br.com.ByteBank.Banco.Teste;

import br.com.ByteBank.Banco.Modelo.ContaCorrente;
import br.com.ByteBank.Banco.Modelo.ContaPoupanca;
import br.com.ByteBank.Banco.Modelo.SaldoInsuficienteException;

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
