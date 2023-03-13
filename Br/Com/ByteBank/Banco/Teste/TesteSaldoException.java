package Br.Com.ByteBank.Banco.Teste;

import Br.Com.ByteBank.Banco.Modelo.ContaCorrente;

public class TesteSaldoException {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(123, 20);

        conta.deposita(200);
        try{
            conta.saca(250);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(conta.getSaldo());
    
    }
   
}
