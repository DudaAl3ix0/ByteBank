package br.com.ByteBank.Banco.Teste;

import br.com.ByteBank.Banco.Modelo.CalculaImposto;
import br.com.ByteBank.Banco.Modelo.ContaCorrente;
import br.com.ByteBank.Banco.Modelo.SeguroDeVida;

public class TesteTributavel {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(45, 7);
        cc.deposita(100);
        
        SeguroDeVida sv = new SeguroDeVida();
        
        CalculaImposto ci = new CalculaImposto();
        ci.registra(cc);
        ci.registra(sv);

        System.out.println(ci.getTotalImposto());
    }
}
