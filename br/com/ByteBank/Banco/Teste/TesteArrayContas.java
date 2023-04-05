package br.com.ByteBank.Banco.Teste;

import br.com.ByteBank.Banco.Modelo.Conta;
import br.com.ByteBank.Banco.Modelo.ContaCorrente;
import br.com.ByteBank.Banco.Modelo.GuardaContas;

public class TesteArrayContas {
    public static void main(String[] args) {
        GuardaContas guarda = new GuardaContas();

        Conta cc = new ContaCorrente(41, 89);
        guarda.adiciona(cc);

        Conta  cc2 = new ContaCorrente(45, 85);
        guarda.adiciona(cc2);

        int tamanho = guarda.getQuantidadeCriada();
        System.out.println(tamanho);

        Conta ref = guarda.getReferencia(1);
        System.out.println(ref);
    }
}
