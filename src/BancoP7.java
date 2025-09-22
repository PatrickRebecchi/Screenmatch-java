import java.util.Scanner;

public class BancoP7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        String tipoDeConta = "Corrente";
        double saldo = 2500.00;
        int opcao = 0;
        double valorAReceber = 0;
        double valorATranferir= 0;

        System.out.println("***********************\n" +
                "Dados iniciais do cliente:\n" +
                "\n" +
                "Nome: " + nome +"\n" +
                "Tipo conta: " +tipoDeConta +"\n" +
                "Saldo inicial: " +saldo +"\n" +
                "Tipo conta: Corrente\n" +
                "Saldo inicial: R$ 2500,00\n" +
                "***********************");

        while (opcao != 4) {
            System.out.println("                  ");
            System.out.println("----------------------------");
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Tranferir valor");
            System.out.println("4- Sair");
            System.out.println("----------------------------");
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha

            if (opcao == 1){
                System.out.println("Saldo atual: "+ saldo);
            } else if (opcao == 2) {
                System.out.println("Informe o valor a receber: ");
                valorAReceber = sc.nextDouble();
                saldo += valorAReceber;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao == 3) {
                System.out.println("Informe o valor que deseja transferir: ");
                valorATranferir = sc.nextDouble();
                if(valorATranferir > saldo){
                    System.out.println("Não há saldo para realizar a transferência.");
                }else {
                    saldo -= valorATranferir;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Informe o valor que deseja transferir: ");
                valorATranferir = sc.nextDouble();
                saldo -= valorATranferir;
            } else if (opcao == 4) {
            System.out.println("Saindo...");
            } else {
            System.out.println("Opção inválida!");
            }

        }

    }
}

