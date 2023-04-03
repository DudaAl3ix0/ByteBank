package br.com.ByteBank.Banco.Teste;


import br.com.ByteBank.Banco.Modelo.Cliente;
import br.com.ByteBank.Banco.Modelo.ContaCorrente;
import br.com.ByteBank.Banco.Modelo.ContaPoupanca;

public class TesteArrayReferencias {
    public static void main(String[] args) {
        // Nenhuma conta foi criada apenas guarda 5 contas.
        Object[] referencias = new Object[5];

        Cliente c1 = new Cliente();
        referencias[2] = c1;
        c1.setNome("Caludia"); 

        System.out.println(c1.getNome());
       
        ContaCorrente cc = new ContaCorrente(41, 52);
        referencias[0] = cc;

        ContaPoupanca cc2 = new ContaPoupanca(45, 78);
        referencias[1] = cc2;

        ContaPoupanca ref = (ContaPoupanca) referencias[1]; //type cast

        System.out.println(ref.getNumero());
    }
}
