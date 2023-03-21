package br.com.ByteBank.Banco.Teste;

public class TestaString {
    public static void main(String[] args) {
        String nome = "Alura"; 
        //object literal
        //String nome = new String("Alura");
    
        String outra = nome.replace("A" , "a");
    
        System.out.println(nome);  
        System.out.println(outra);
    }
    
}
