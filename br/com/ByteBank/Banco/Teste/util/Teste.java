package br.com.ByteBank.Banco.Teste.util;

import java.util.ArrayList;

import br.com.ByteBank.Banco.Modelo.Conta;
import br.com.ByteBank.Banco.Modelo.ContaCorrente;

public class Teste {
    public static void main(String[] args) {
       ArrayList lista = new ArrayList<>();

       Conta cc = new ContaCorrente(41, 89);
       lista.add(cc);

       Conta  cc2 = new ContaCorrente(45, 85);
       lista.add(cc2);

       System.out.println(lista.size());

       Conta ref = (Conta)lista.get(0);
       System.out.println(ref.getNumero());

       lista.remove(0);
        System.out.println("Tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(41, 89);
        lista.add(cc3);

        Conta  cc4 = new ContaCorrente(45, 85);
        lista.add(cc4);

       for(int i = 0; i < lista.size(); i++){
        Conta contas = (Conta) lista.get(i);
        System.out.println(contas);
       }

       System.out.println("------------------");

       for(Object oRef : lista){
        System.out.println(oRef);
       }
    }
}
