import java.util.Scanner;

public class Questao26 {

    // Método que verifica se o triângulo é Equilátero
    public static boolean isEquilatero(int a, int b, int c) {
        return (a == b && b == c);
    }

    // Método que verifica se o triângulo é Isósceles
    public static boolean isIsosceles(int a, int b, int c) {
        return (a == b || b == c || a == c) && !isEquilatero(a, b, c);
    }

    // Método que verifica se o triângulo é Escaleno
    public static boolean isEscaleno(int a, int b, int c) {
        return (a != b && b != c && a != c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada dos lados do triângulo
        System.out.println("Digite os lados do triângulo:");
        System.out.print("Lado 1: ");
        int a = sc.nextInt();
        System.out.print("Lado 2: ");
        int b = sc.nextInt();
        System.out.print("Lado 3: ");
        int c = sc.nextInt();

        // Validação: verificar se forma um triângulo
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Os lados informados não formam um triângulo válido.");
        } else {
            // Classificação
            if (isEquilatero(a, b, c)) {
                System.out.println("Triângulo Equilátero");
            } else if (isIsosceles(a, b, c)) {
                System.out.println("Triângulo Isósceles");
            } else if (isEscaleno(a, b, c)) {
                System.out.println("Triângulo Escaleno");
            }
        }

        sc.close();
    }
}

