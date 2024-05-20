import Conta.Conta;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.out;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        out.print("Enter account number: ");
        int numero = sc.nextInt();
        sc.nextLine(); // consume the newline character
        out.print("Enter agency name: ");
        String agencia = sc.nextLine();
        out.print("Enter account holder name: ");
        String nomeTitular = sc.nextLine();
        out.print("Enter current balance: ");
        double saldo = sc.nextDouble();
        sc.nextLine(); // consume the newline character
        Conta conta = new Conta(numero, agencia, saldo, nomeTitular);
        out.println(conta);
//        out.print("""
//                Olá [nomeTitular], obrigado por criar uma conta em nosso banco,
//                sua agência é [agencia], conta [numero] e seu saldo [saldo]
//                já está disponível para saque""");
//    }
}