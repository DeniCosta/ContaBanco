import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
 
        System.out.println("Digite o número da conta:");
        int conta = scanner.nextInt();

        System.out.println("Digite o número da conta com o dígito (Ex: 067-8):");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente:");
        String nome = scanner.next();

        System.out.println("Digite o sobrenome do cliente:");
        String sobrenome = scanner.next();

        System.out.println("Informe o saldo atual(Ex: 237.48):");
        double saldo = scanner.nextDouble();

        System.out.println("\"Olá " + nome.toUpperCase() + " " +  sobrenome.toUpperCase() 
        + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia 
        + ", conta " + conta 
        + " e seu saldo " + saldo 
        + " já está disponível para saque\".");









    }
}
