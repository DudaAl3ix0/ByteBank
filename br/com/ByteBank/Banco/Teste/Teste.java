package br.com.ByteBank.Banco.Teste;

import br.com.ByteBank.Banco.Modelo.ContaCorrente;
import br.com.ByteBank.Banco.Modelo.ContaPoupanca;

public class Teste {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(12, 045);
        Object cp = new ContaPoupanca(45, 230);
        
        System.out.println(cc);
        System.out.println(cp);

     
      
    }
}
