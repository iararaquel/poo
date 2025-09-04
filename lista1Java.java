import java.util.Arrays;
import java.util.Scanner;

public class lista1Java {

    public static void main(String[] args) {
        // Chame as questões que deseja testar descomentando:
        // questao1();
        // questao2();
        // questao3();
        // questao4();
        // questao5();
        // questao6();
        // questao7();
        // questao8();
        // questao9();
        // questao10();
        // questao11();
        // questao12();
        // questao13();
        // questao14();
        // questao15();
        // questao16();
        // questao17();
        // questao18();
        // questao19();
        // questao20();
        // questao21();
    }

    // ========================
    // QUESTÃO 1 - Estoque médio
    // ========================
    public static void questao1() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantidade mínima: ");
        int min = entrada.nextInt();
        System.out.print("Quantidade máxima: ");
        int max = entrada.nextInt();
        double estoqueMedio = (min + max) / 2.0;
        System.out.println("Estoque médio: " + estoqueMedio);
    }

    // ========================
    // QUESTÃO 2 - Conversão dólar para real
    // ========================
    public static void questao2() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Cotação do dólar: ");
        double cotacao = entrada.nextDouble();
        System.out.print("Valor em dólares: ");
        double dolar = entrada.nextDouble();
        double real = dolar * cotacao;
        System.out.println("Valor em reais: " + real);
    }

    // ========================
    // QUESTÃO 3 - Comissão de vendedor
    // ========================
    public static void questao3() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Identificação do vendedor: ");
        String vendedor = entrada.next();
        System.out.print("Código da peça: ");
        String codigo = entrada.next();
        System.out.print("Preço unitário: ");
        double preco = entrada.nextDouble();
        System.out.print("Quantidade vendida: ");
        int qtd = entrada.nextInt();
        double total = preco * qtd;
        double comissao = total * 0.05;
        System.out.println("Total da venda: " + total + ", Comissão: " + comissao);
    }

    // ========================
    // QUESTÃO 4 - Operações entre 4 números
    // ========================
    public static void questao4() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("A: "); int A = entrada.nextInt();
        System.out.print("B: "); int B = entrada.nextInt();
        System.out.print("C: "); int C = entrada.nextInt();
        System.out.print("D: "); int D = entrada.nextInt();
        // Somar todos pares
        System.out.println("Somas:");
        System.out.println("A+B=" + (A+B) + ", A+C=" + (A+C) + ", A+D=" + (A+D));
        System.out.println("B+C=" + (B+C) + ", B+D=" + (B+D) + ", C+D=" + (C+D));
        // Multiplicar todos pares
        System.out.println("Multiplicações:");
        System.out.println("A*B=" + (A*B) + ", A*C=" + (A*C) + ", A*D=" + (A*D));
        System.out.println("B*C=" + (B*C) + ", B*D=" + (B*D) + ", C*D=" + (C*D));
    }

    // ========================
    // QUESTÃO 5 - Consumo de combustível
    // ========================
    public static void questao5() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Tempo da viagem (h): "); double tempo = entrada.nextDouble();
        System.out.print("Velocidade média (km/h): "); double vel = entrada.nextDouble();
        double distancia = tempo * vel;
        double litros = distancia / 12.0;
        System.out.println("Velocidade média: " + vel + " km/h");
        System.out.println("Tempo gasto: " + tempo + " h");
        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.println("Litros utilizados: " + litros);
    }

    // ========================
    // QUESTÃO 6 - Celsius para Fahrenheit
    // ========================
    public static void questao6() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Temperatura em Celsius: "); double C = entrada.nextDouble();
        double F = (9*C + 160)/5;
        System.out.println("Temperatura em Fahrenheit: " + F);
    }

    // ========================
    // QUESTÃO 7 - Fahrenheit para Celsius
    // ========================
    public static void questao7() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Temperatura em Fahrenheit: "); double F = entrada.nextDouble();
        double C = (F - 32) * 5 / 9.0;
        System.out.println("Temperatura em Celsius: " + C);
    }

    // ========================
    // QUESTÃO 8 - Volume de uma lata
    // ========================
    public static void questao8() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Raio da lata: "); double R = entrada.nextDouble();
        System.out.print("Altura da lata: "); double A = entrada.nextDouble();
        double V = 3.14159 * R * R * A;
        System.out.println("Volume da lata: " + V);
    }

    // ========================
    // QUESTÃO 9 - Idade em dias
    // ========================
    public static void questao9() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Idade anos: "); int anos = entrada.nextInt();
        System.out.print("Meses: "); int meses = entrada.nextInt();
        System.out.print("Dias: "); int dias = entrada.nextInt();
        int totalDias = anos*365 + meses*30 + dias;
        System.out.println("Idade em dias: " + totalDias);
    }

    // ========================
    // QUESTÃO 10 - Relacionamentos entre dois números
    // ========================
    public static void questao10() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número 1: "); int n1 = entrada.nextInt();
        System.out.print("Número 2: "); int n2 = entrada.nextInt();
        System.out.println("Igual: " + (n1==n2));
        System.out.println("Não igual: " + (n1!=n2));
        System.out.println("Maior: " + (n1>n2));
        System.out.println("Menor: " + (n1<n2));
        System.out.println("Maior ou igual: " + (n1>=n2));
        System.out.println("Menor ou igual: " + (n1<=n2));
    }

    // ========================
    // QUESTÃO 11 - Troca valores A e B
    // ========================
    public static void questao11() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("A: "); int A = entrada.nextInt();
        System.out.print("B: "); int B = entrada.nextInt();
        System.out.println("Antes da troca: A=" + A + ", B=" + B);
        int temp = A; A=B; B=temp;
        System.out.println("Depois da troca: A=" + A + ", B=" + B);
    }

    // ========================
    // QUESTÃO 12 - Módulo de um número
    // ========================
    public static void questao12() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número: "); int x = entrada.nextInt();
        int modulo = (x>=0)? x : x*(-1);
        System.out.println("Módulo: " + modulo);
    }

    // ========================
    // QUESTÃO 13 - Ordenação de 5 números
    // ========================
    public static void questao13() {
        Scanner entrada = new Scanner(System.in);
        int[] nums = new int[5];
        for(int i=0; i<5; i++) {
            System.out.print("Número "+(i+1)+": ");
            nums[i] = entrada.nextInt();
        }
        Arrays.sort(nums);
        System.out.println("Ordem crescente: " + Arrays.toString(nums));
        System.out.print("Ordem decrescente: [");
        for(int i=nums.length-1;i>=0;i--) {
            System.out.print(nums[i]);
            if(i>0) System.out.print(", ");
        }
        System.out.println("]");
    }

    // ========================
    // QUESTÃO 14 - Diferença maior para menor
    // ========================
    public static void questao14() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número 1: "); int n1 = entrada.nextInt();
        System.out.print("Número 2: "); int n2 = entrada.nextInt();
        int diff = Math.abs(n1-n2);
        System.out.println("Diferença maior-menor: " + diff);
    }

    // ========================
    // QUESTÃO 15 - Média escolar com recuperação
    // ========================
    public static void questao15() {
        Scanner entrada = new Scanner(System.in);
        double soma=0;
        for(int i=1;i<=4;i++){
            System.out.print("Nota "+i+": "); soma += entrada.nextDouble();
        }
        double media = soma/4;
        System.out.println("Média: " + media);
        if(media>=7) System.out.println("Aluno aprovado");
        else{
            System.out.print("Nota recuperação: "); double rec = entrada.nextDouble();
            double novaMedia = (media + rec)/2;
            System.out.println("Nova média: " + novaMedia);
            if(novaMedia>=7) System.out.println("Aluno aprovado na recuperação");
            else System.out.println("Aluno reprovado");
        }
    }

    // ========================
    // QUESTÃO 16 - Maior e menor número
    // ========================
    public static void questao16() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número 1: "); int n1=entrada.nextInt();
        System.out.print("Número 2: "); int n2=entrada.nextInt();
        if(n1>n2) System.out.println("Maior: " + n1 + ", Menor: " + n2);
        else if(n2>n1) System.out.println("Maior: " + n2 + ", Menor: " + n1);
        else System.out.println("Os números são iguais");
    }

    // ========================
    // QUESTÃO 17 - Valor entre 0 e 9
    // ========================
    public static void questao17() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número: "); int n = entrada.nextInt();
        if(n>=0 && n<=9) System.out.println("Valor válido");
        else System.out.println("Valor inválido");
    }

    // ========================
    // QUESTÃO 18 - Código 1,2,3
    // ========================
    public static void questao18() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Código: "); int c = entrada.nextInt();
        if(c==1) System.out.println("um");
        else if(c==2) System.out.println("dois");
        else if(c==3) System.out.println("três");
        else System.out.println("Código inválido");
    }

    // ========================
    // QUESTÃO 19 - Triângulo equilátero, isósceles, escaleno
    // ========================
    public static void questao19() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Lado A: "); int A = entrada.nextInt();
        System.out.print("Lado B: "); int B = entrada.nextInt();
        System.out.print("Lado C: "); int C = entrada.nextInt();
        if(A<B+C && B<A+C && C<A+B){
            if(A==B && B==C) System.out.println("Triângulo Equilátero");
            else if(A==B || A==C || B==C) System.out.println("Triângulo Isósceles");
            else System.out.println("Triângulo Escaleno");
        } else System.out.println("Não forma triângulo");
    }

    // ========================
    // QUESTÃO 20 - Menor*Maior e Maior/Menor
    // ========================
    public static void questao20() {
        Scanner entrada = new Scanner(System.in);
        int a,b,c;
        do { System.out.print("A>0: "); a=entrada.nextInt(); } while(a<=0);
        do { System.out.print("B>0: "); b=entrada.nextInt(); } while(b<=0);
        do { System.out.print("C>0: "); c=entrada.nextInt(); } while(c<=0);
        int maior=Math.max(a, Math.max(b,c));
        int menor=Math.min(a, Math.min(b,c));
        System.out.println("Menor*Maior=" + (menor*maior));
        System.out.println("Maior/Menor=" + ((double)maior/menor));
    }

    // ========================
    // QUESTÃO 21 - Positivo ou Negativo
    // ========================
    public static void questao21() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número: "); int n=entrada.nextInt();
        if(n>0) System.out.println("Positivo");
        else if(n<0) System.out.println("Negativo");
        else System.out.println("Zero");
    }

}