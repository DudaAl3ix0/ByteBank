package ByteBankEncapsulado;

public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1, 1500);
        System.out.println(conta.getAgencia());

        Conta conta2 = new Conta(12, 15004);
        System.out.println(conta2.getAgencia());
        
        System.out.println(Conta.getTotal());
        
    }
}
