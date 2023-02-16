package bytebankComposto;

public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta();
        System.out.println(contaDaMarcela.getSaldo());
        System.out.println(contaDaMarcela.titular);

        contaDaMarcela.titular = new Cliente();
        System.out.println(contaDaMarcela.titular);

        contaDaMarcela.titular.nome = "Marcela";
        System.out.println(contaDaMarcela.titular.nome);     

        contaDaMarcela.titular.profissao = "médica";
        System.out.println(contaDaMarcela.titular.profissao);

    }
}
