import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int parametroUm = terminal.nextInt();
        System.out.print("Digite o segundo numero: ");
        int parametroDois = terminal.nextInt();

        try {
            ParametrosIvalidosException.contar(parametroUm, parametroDois);
        }catch(Exception e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
}
