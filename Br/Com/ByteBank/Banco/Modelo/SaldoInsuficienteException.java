package br.com.ByteBank.Banco.Modelo;

public class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException(String msg){
       super(msg); 
    }
}
