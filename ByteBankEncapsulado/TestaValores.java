package ByteBankEncapsulado;

public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(-1, 1500);

        //conta está inconsistente a regra que foi criada.
        System.out.println(conta.getAgencia());
        
    }
}
