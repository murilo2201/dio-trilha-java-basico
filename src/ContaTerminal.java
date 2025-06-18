import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, por favor digite seu nome: ");
        String nomeCliente = scanner.nextLine();


        System.out.println("Perfeito! agora o número da sua agência:");
        String agencia = scanner.nextLine();


        System.out.println("Legal! Agora o número da conta, por favor:");
        int numeroConta = scanner.nextInt();


        System.out.println("Por último, informe seu saldo, por favor:");
        double saldo = scanner.nextDouble();


        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, " +
                "sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numeroConta, saldo);

        scanner.close();
    }
}