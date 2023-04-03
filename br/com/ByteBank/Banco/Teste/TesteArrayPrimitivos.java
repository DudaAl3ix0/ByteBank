package br.com.ByteBank.Banco.Teste;

public class TesteArrayPrimitivos {
    public static void main(String[] args) {

        int[] idades = new int[5]; //inicializa com zero, valores padrões
        
        for(int i = 0; i < idades.length; i++){
            idades[i] = i * 20;
            System.out.println(idades[i]);
        }
    }
}
