import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a operação desejada:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int operacao = scanner.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        if (operacao == 1) {
            resultado = num1 + num2;
        } else if (operacao == 2) {
            resultado = num1 - num2;
        } else if (operacao == 3) {
            resultado = num1 * num2;
        } else if (operacao == 4) {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Erro! Não é possível dividir por zero.");
                return;
            }
        } else {
            System.out.println("Operação inválida.");
            return;
        }

        System.out.println("Resultado: " + resultado);
    }
}
