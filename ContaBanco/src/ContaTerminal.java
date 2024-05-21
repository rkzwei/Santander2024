import java.util.Locale;
import java.util.Scanner;
import static java.lang.System.out;

    public static class contaTerminal {
        public static void main() {
            Scanner sc = new Scanner(System.in).useLocale(Locale.US);
            out.print("Por favor, digite o número de conta: ");
            int numero = sc.nextInt();
            sc.nextLine(); // consume the newline character
            out.print("Por favor, digite o numero da agência: ");
            String agencia = sc.nextLine();
            out.print("Por favor, digite o nome do titular: ");
            String nomeTitular = sc.nextLine();
            out.print("Por favor, digite o saldo inicial: ");
            double saldo = sc.nextDouble();
            sc.nextLine(); // consume the newline character
            imprimirMensagem(nomeTitular, agencia, numero, saldo);
        }
    }

    public static void imprimirMensagem(String accountHolderName, String agency, int accountNumber, double initialBalance) {
        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo de R$ %.2f já está disponível para saque.%n",
                accountHolderName, agency, accountNumber, initialBalance);
    }

    public void main() {
        contaTerminal.main();
    }



