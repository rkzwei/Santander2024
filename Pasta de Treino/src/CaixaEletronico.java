public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 24.50;
        System.out.println("Seu saldo atual é de: " + saldo);
        double valorSolicitado = 22.00;

        if (valorSolicitado > saldo) {
            System.out.println("Seu saldo é insuficiente");
        } else {
            double novoSaldo = saldo - valorSolicitado;
            System.out.println("Seu novo saldo é de: " + novoSaldo);
        }
    }
}
