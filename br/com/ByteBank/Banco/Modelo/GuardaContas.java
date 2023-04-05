package br.com.ByteBank.Banco.Modelo;

public class GuardaContas {
    private Conta[] refencias;
    private int posicaoLivre = 0; 

    public GuardaContas(){
       this.refencias = new Conta[10]; 
    }

    public void adiciona(Conta c){
       this.refencias[posicaoLivre] = c;
       posicaoLivre++;
       System.out.println("Exitem " + posicaoLivre + " contas criadas"); 
    }

    public int getQuantidadeCriada() {
        return this.posicaoLivre;
    }

    public Conta getReferencia(int posicao) {
        return this.refencias[posicao];
    }
}
