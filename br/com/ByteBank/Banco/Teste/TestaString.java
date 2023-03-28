package br.com.ByteBank.Banco.Teste;

public class TestaString {
    public static void main(String[] args) {
        String nome = "  Alura "; 
        String outroVazio = nome.trim();

        System.out.println(nome.contains("A"));
        System.out.println(outroVazio);
        //object literal
        //String nome = new String("Alura");
        //String outra = nome.replace('A' , 'a');

        //char c =nome.charAt(2);
        
        //int posicao = nome.indexOf("u");
        //String sub = nome.substring(1);

        for(int i = 0; i < nome.length(); i++){
            System.out.println(nome.charAt(i));
        }
        
        System.out.println(outroVazio.isEmpty());
        System.out.println(nome);  
        System.out.println(nome.length());
    }
    
}
