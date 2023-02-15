package ByteBankEncapsulado;

public class TesteGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1545,8545);
        conta.setNumero(1545);
        System.out.println(conta.getNumero());
        conta.setAgencia(8545);

        Cliente livia = new Cliente();
        livia.setNome("Livia Oliveira");

        conta.setTitular(livia);

        System.out.println(conta.getTitular().getNome());
        
        conta.getTitular().setProfissao("Cozinheira");
        //Código em duas linhas, com crição de uma var temporária 
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("cozinheiro");

        conta.getTitular().setNome("Maria Fernanda");
        System.out.println(conta.getTitular().getNome());

    }
}
