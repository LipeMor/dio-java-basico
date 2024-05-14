import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Informe o numero da conta: ");
            String conta = scanner.nextLine();
            verificarNumeroConta(conta);

        } catch (NumeroContaInvalidoException e) {
            System.out.println("Erro: Numero de conta invalido. " + e.getMessage());
        }

        finally {
            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() == 8) {
            System.out.println("O numero da conta é válido");
        } else
            throw new NumeroContaInvalidoException();
    }

    private static class NumeroContaInvalidoException extends IllegalArgumentException {
        public NumeroContaInvalidoException() {
            super("O número de conta deve ter exatamente 8 dígitos.");
        }
    }
}
