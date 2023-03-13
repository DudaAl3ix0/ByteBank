package Br.Com.ByteBank.Banco.Modelo;

import Br.Com.ByteBank.Banco.Teste.Tributavel;

public class CalculaImposto {
    private double totalImposto;
    
    public void registra(Tributavel t){
        double valorImposto = t.getValorImposto();
        this.totalImposto += valorImposto;
    }

    public double getTotalImposto() {
        return totalImposto;
    }


}
