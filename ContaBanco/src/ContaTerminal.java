import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner

        //TODO:Exibir as mensagens para o nosso usuário

        //TODO:Obter pela classe scanner os valores digitados no terminal

        //TODO:Exibir a mensagem final de conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o nome do titular da conta: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência ! ");
        String agencia = scanner.next();

        System.out.println("Digite o numero da conta: ");
        int numero = scanner.nextInt();
        
        System.out.println("Faça um depósito para ativar a sua conta, insira um valor: ");
        double saldo = scanner.nextDouble();

        System.out.println(" Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque!");
    }
}
