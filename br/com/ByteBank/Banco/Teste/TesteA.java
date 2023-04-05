package br.com.ByteBank.Banco.Teste;

import br.com.ByteBank.Banco.Modelo.ContaCorrente;

public class TesteA {
    public static void main(String[] args) {
        Object[] referencias = new Object[4];

        ContaCorrente cc1 = new ContaCorrente(45, 78);
        referencias[0] = cc1;

        ContaCorrente ref = (ContaCorrente) referencias[0];
        System.out.println(ref.getAgencia());
    }
}
