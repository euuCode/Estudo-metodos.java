import java.util.Scanner;

public class Calculadora {

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a  b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println(Erro divisão por zero.);
            return Double.NaN;
        }
        return a  b;
    }

    public static char lerOperador(Scanner sc) {
        System.out.print(Operação (+ -  ) );
        return sc.next().charAt(0);
    }

    public static double lerNumero(Scanner sc, String mensagem) {
        System.out.print(mensagem);
        return sc.nextDouble();
    }

    public static double calcular(char operador, double a, double b) {
        switch (operador) {
            case '+' return somar(a, b);
            case '-' return subtrair(a, b);
            case '' return multiplicar(a, b);
            case '' return dividir(a, b);
            default
                System.out.println(Operador inválido.);
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1 = lerNumero(sc, Primeiro número );
        char operador = lerOperador(sc);
        double num2 = lerNumero(sc, Segundo número );

        double resultado = calcular(operador, num1, num2);
        System.out.println(Resultado  + resultado);

        sc.close();
    }
}
