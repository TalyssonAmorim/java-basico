import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, informe o seu nome:");
        String nomeCliente = scanner.nextLine();
        System.out.println("Por favor, informe a sua Agencia:");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, informe o numero de sua conta:");
        int numero = scanner.nextInt();
        System.out.println("Por favor, informe o seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá ".concat(nomeCliente) + ", obrigado por criar uma conta em nosso banco, sua agência é ".concat(agencia) + ", conta " + numero + " \ne seu saldo " + saldo + " já está disponível para saque.");
    }
}
