import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando informações ao usuário
        System.out.print("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o número

        System.out.print("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem formatada
        System.out.println("\nOlá " + nomeCliente + 
                           ", obrigado por criar uma conta em nosso banco. Sua agência é " 
                           + agencia + ", conta " + numero + 
                           " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}