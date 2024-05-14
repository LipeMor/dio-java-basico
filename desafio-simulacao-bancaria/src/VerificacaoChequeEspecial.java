import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        double saldo; 
        double saque; 
        double limiteChequeEspecial = 500; 

        System.out.println("Informe o saldo atual.");
        saldo = scanner.nextDouble();

        System.out.println("Infome o valor do saque");
        saque = scanner.nextDouble();
        
        double limiteDisponivel = limiteChequeEspecial + saldo;

        if (saque <= saldo){
            System.out.println("Transação realizada com sucesso.");
        }else if (saque > saldo && saque <  limiteDisponivel){
            System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
        }else if (saque > limiteDisponivel){
            System.out.println("Transação não realizada. Limite do cheque especial excedido.");
        }else
            scanner.close();             
        }

}
