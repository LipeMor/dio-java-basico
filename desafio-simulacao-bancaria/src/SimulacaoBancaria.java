import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
       
        boolean condicao = true;
        while (condicao) {

            System.out.println(
                    "Por favor escolha uma das opções abaixo: \n 1) - Depósito \n 2) - Saque \n 3) - Saldo \n 0) - Encerrar \n");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Por favor informe o valor que deseja depositar");
                    saldo += scanner.nextDouble();
                    System.out.println("Saldo Atual: " + saldo);
                    break;

                case 2:
                    System.out.println("Por favor informe o valor que deseja sacar");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque <= saldo) {
                        saldo -= valorSaque;
                        System.out.println("Saldo: " + saldo);
                    } else
                        System.out.println("Saldo insuficiente.");

                    break;

                case 3:

                    System.out.println("Saldo atual: " + saldo);
                    break;

                case 0:
                    System.out.println("Programa encerrado");
                    condicao = false;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    //break;
            }

        }

    }
}
