import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite o seu nome!");
        String nome = scanner.nextLine(); //Preferi usar o nextLine() pois assim o usuário pode digitar o nome completo e será reconhecido pelo programa

        System.out.println("Por favor digite sua agência");
        String agencia = scanner.next();

        System.out.println("Agora informe o numero da conta");
        int numero = scanner.nextInt();

        System.out.println("Informe o seu saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque");
    }
}
