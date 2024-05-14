import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o limite de saque diário.");
        double limiteDiario = scanner.nextDouble();

        for (int saque = 0; saque <= 10; saque++) {

            System.out.println("Informe o valor do " +(saque + 1)+ "º primeiro saque");
            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break;

            } else if (valorSaque <= limiteDiario) {
                limiteDiario = limiteDiario - valorSaque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);

            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }
        }
        scanner.close();

    }
}
