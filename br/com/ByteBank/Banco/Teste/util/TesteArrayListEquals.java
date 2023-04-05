package br.com.ByteBank.Banco.Teste.util;

import java.util.ArrayList;

import br.com.ByteBank.Banco.Modelo.Conta;
import br.com.ByteBank.Banco.Modelo.ContaCorrente;

public class TesteArrayListEquals {
    public static void main(String[] args) {
       /*Conta cc5 = new ContaCorrente(52, 12);
        Conta cc6 = new ContaCorrente(52, 12);
        boolean igualdade = cc5.eIgual(cc6);
        System.out.println(igualdade); */ 

        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(41, 89);
        lista.add(cc);

        Conta  cc2 = new ContaCorrente(45, 85);
        lista.add(cc2);

        Conta  cc3 = new ContaCorrente(45, 85);
        boolean contem = lista.contains(cc3);
        System.out.println("Ja existe "+ contem);

        for(Conta conta : lista){
            System.out.println(conta);
           }
    }
}
