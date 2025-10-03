import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        scanner.close();

        if (num2 != 0) {
            System.out.printf(
                    """
                            %d + %d = %d
                            %d - %d = %d
                            %d * %d = %d
                            %d / %d = %d
                            %d ^ %d = %f
                            Resto de %d / %d: %d
                            """,
                    num1, num2, num1 + num2,
                    num1, num2, num1 - num2,
                    num1, num2, num1 * num2,
                    num1, num2, num1 / num2,
                    num1, num2, Math.pow(num1, num2),
                    num1, num2, (int) num1 % num2
            );
        }else{
            System.out.printf(
                    """
                            %d + %d = %d
                            %d - %d = %d
                            %d * %d = %d
                            %d / %d = %s
                            %d ^ %d = %f
                            Resto de %d / %d: %s
                            """,
                    num1, num2, num1 + num2,
                    num1, num2, num1 - num2,
                    num1, num2, 0,
                    num1, num2, "Não é possível dividir por zero.",
                    num1, num2, Math.pow(num1, num2),
                    num1, num2, "Não é possível dividir por zero."
            );
        }
    }
}
