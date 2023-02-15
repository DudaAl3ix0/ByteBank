package bytebankComposto;

public class TestaConta {
    public static void main(String[] args) {
        Cliente carlos = new Cliente();
        carlos.nome = "Carlos Cunha";
        carlos.cpf = "222.222.222-22";
        carlos.profissao = "Programador";

        Conta contaDoCarlos = new Conta();
        contaDoCarlos.deposita(450);
        System.out.println(contaDoCarlos.saldo);
        
        contaDoCarlos.saca(400);

        //associa o cliente carlos a contaDoCarlos
        contaDoCarlos.titular = carlos;
        System.out.println(contaDoCarlos.titular.nome);
    }
}
