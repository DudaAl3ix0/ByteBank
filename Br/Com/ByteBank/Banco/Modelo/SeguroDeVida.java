package br.com.ByteBank.Banco.Modelo;

import br.com.ByteBank.Banco.Teste.Tributavel;

public class SeguroDeVida implements Tributavel{

    @Override
    public double getValorImposto() {
        return 42;
    }
    
}
