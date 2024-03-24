import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lojas Tabajara");

        int numeroProduto = 1;
        double totalCompra = 0;

        while (true) {
            System.out.print("Produto " + numeroProduto + ": R$ ");
            double precoProduto = scanner.nextDouble();

            if (precoProduto == 0) {
                break; // Encerra o loop quando o valor do produto for zero
            }

            totalCompra += precoProduto;
            numeroProduto++;
        }

        System.out.println("Total: R$ " + totalCompra);

        System.out.print("Dinheiro: R$ ");
        double dinheiroRecebido = scanner.nextDouble();

        double troco = dinheiroRecebido - totalCompra;
        System.out.println("Troco: R$ " + troco);

        scanner.close();
    }
}
