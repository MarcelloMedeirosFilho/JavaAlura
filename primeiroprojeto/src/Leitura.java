import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        String filme = leitura.nextLine();
        System.out.println("Ano de lançamento?");
        int anodelancamento = leitura.nextInt();
        System.out.println("Informe sua nota para o filme");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println("Ano de Lançamento: " + anodelancamento);
        System.out.println(avaliacao);
    }
}
