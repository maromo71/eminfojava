package net.maromo;

public class Main {

    public static void main(String[] args) {

	    //Criar um cliente e duas contas
        //Sacar e depositar delas
        Cliente cliente = new Cliente();
        cliente.setIdCliente(11);
        cliente.setNome("Rodrigo Henrique Martins");
        //Definir uma conta corrente para o mesmo
        Corrente conta1 = new Corrente();
        conta1.setIdConta(1);
        conta1.setCliente(cliente);
        conta1.depositar(2000);
        conta1.setLimite(1000);
        System.out.println("Saldo da conta 1: ");
        System.out.println("R$ " + conta1.getSaldo());
        boolean resultado = conta1.sacar(2500);
        if(resultado){
            System.out.println("Saque efetuado");
        }else{
            System.out.println("Nao tem Saldo");
        }
        System.out.println("Novo Saldo: " + conta1.getSaldo());
        Poupanca conta2 = new Poupanca();
        conta2.setIdConta(2);
        conta2.setCliente(cliente);
        conta2.depositar(1000);
        boolean r = conta2.sacar(1001);
        if(r){
            System.out.println("Saque efetuado com sucesso");
        }else{
            System.out.println("Poupe mais, por favor");
        }
        System.out.println("Saldo atual da conta 2: ");
        System.out.println(conta2.getSaldo());
    }
}
