package br.com.ByteBank.Banco.Teste.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.ByteBank.Banco.Modelo.Conta;
import br.com.ByteBank.Banco.Modelo.ContaCorrente;

public class TesteArrayList {
    public static void main(String[] args) {
        //Generics 
       List<Conta> lista = new LinkedList<Conta>();
       
       Conta cc = new ContaCorrente(41, 89);
       lista.add(cc);

       Conta  cc2 = new ContaCorrente(45, 85);
       lista.add(cc2);

       System.out.println(lista.size());

       Conta ref = lista.get(0);
       System.out.println(ref.getNumero());

       lista.remove(0);
        System.out.println("Tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(41, 89);
        lista.add(cc3);

        Conta  cc4 = new ContaCorrente(45, 85);
        lista.add(cc4);

       for(int i = 0; i < lista.size(); i++){
        Object referencias =  lista.get(i);
        System.out.println(referencias);
       }

       System.out.println("------------------");

       for(Conta conta : lista){
        System.out.println(conta);
       }
    }
}
