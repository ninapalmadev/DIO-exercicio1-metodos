public class Calculadora {

    public static void Soma(double numero1, double numero2){

        double resultado = numero1 + numero2;

        System.out.println("A soma de: " + numero1 + " + " + numero2 + " é igual a: " + resultado);
    }
    public static void Subtracao(double numero1, double numero2){

        double resultado = numero1 - numero2;

        System.out.println("A subtração de: " + numero1 + " - " + numero2 + " é igual a: " + resultado);
    }
    public static void Multiplicacao(double numero1, double numero2){

        double resultado = numero1 * numero2;

        System.out.println("A multiplicação de: " + numero1 + " X " + numero2 + " é igual a: " + resultado);
    }

    public static void Divisao(double numero1, double numero2){

        double resultado = numero1 / numero2;

        System.out.println("A divisão de: " + numero1 + " por " + numero2 + " é igual a: " + resultado);
    }

}
