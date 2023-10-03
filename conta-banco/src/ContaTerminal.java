import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: ");
        int agencia = scanner.nextInt();

        System.out.print("Por favor, digite o número da Conta: ");
        String conta = scanner.next();

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.next();

        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$ " + saldo + " já está disponível para saque.");
    }
}
