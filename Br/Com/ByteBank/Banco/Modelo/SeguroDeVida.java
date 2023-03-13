package Br.Com.ByteBank.Banco.Modelo;

import Br.Com.ByteBank.Banco.Teste.Tributavel;

public class SeguroDeVida implements Tributavel{

    @Override
    public double getValorImposto() {
        return 42;
    }
    
}
