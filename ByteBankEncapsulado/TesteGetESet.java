package ByteBankEncapsulado;

public class TesteGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setNumero(1545);
        System.out.println(conta.getNumero());
        conta.setAgencia(8545);
    }
}
