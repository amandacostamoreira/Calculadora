public class Calculadora {

    // Cada método recebe dois double (números reais) e retorna double

    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        // Proteção extra: evita erro de divisão por zero
        if (b == 0) {
            System.out.println("Erro: não é possível dividir por zero!");
            return 0;
        }
        return a / b;
    }
}
