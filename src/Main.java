public class Main {
    public static void main(String[] args) {
        //Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(7,6);
        Calculadora.subtracao(14, 1.8);
        Calculadora.multiplicacao(3, 9);
        Calculadora.divisao(30, 8.5);

        // Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(16);
        Mensagem.obterMensagem(21);
        Mensagem.obterMensagem(2);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(2000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(2000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(2000, 2);
        Emprestimo.calcular(2000, 6);
    }
}
