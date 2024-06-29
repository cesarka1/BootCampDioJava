
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Kauan");

        Conta cc = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente1);

        /*  cc.depositar(100);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        cc.transferir(100, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();*/
        Scanner sc = new Scanner(System.in);

        getOptions(cc, poupanca, sc);

    }

    private static void getOptions(Conta cc, Conta poupanca, Scanner sc) {
        int options;
        do {

            System.out.println("0 - Sair");
            System.out.println("1 - Saque");
            System.out.println("2 - Depósito");
            System.out.println("3 - Transferência");
            System.out.println("4 - Extrato");
            System.out.println("Escolha uma das opções!:");
            System.out.println();

            options = sc.nextInt();
            switch (options) {
                case 1:
                    System.out.flush();
                    System.out.println("Qual o valor do saque?");
                    cc.sacar(sc.nextDouble());
                    break;
                case 2:
                    System.out.flush();
                    System.out.println("Qual o valor do depósito?");
                    cc.depositar(sc.nextDouble());
                    break;
                case 3:
                    System.out.flush();
                    System.out.println("Qual o valor da transferência?");
                    double valorTransferencia = sc.nextDouble();
                    cc.transferir(valorTransferencia, poupanca);
                    break;
                case 4:
                    System.out.flush();
                    cc.imprimirExtrato();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;

            }

        } while (options != 0);
    }
}
