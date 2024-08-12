public class Main {

    public static void main(String[] args) {
        IO io = new IO();
        Calculadora calculadora = new Calculadora();
        boolean op = true;

        while (op) {
            io.apresentacao("-----------------------------------");
            io.apresentacao("MENU:");
            io.apresentacao("1. SOMA");
            io.apresentacao("2. SUBTRAÇÃO");
            io.apresentacao("3. MUTIPLICAÇÃO");
            io.apresentacao("4. DIVISÃO");
            io.apresentacao("0. SAIR");
            io.apresentacao("-----------------------------------");

            int opcao = (int) io.capturaDeValores("Digite o número da operação desejada: ");

            if (0 == opcao) {
                io.apresentacao("Fim do programa");
                break;
            }

            //recebe dois valores
            double num1 = io.capturaDeValores("valor um: ");
            double num2 = io.capturaDeValores("valor dois: ");

            double resultado = 0;
            String operacao ;

            switch (opcao) {
                case 1:
                    resultado = calculadora.soma(num1, num2);
                    operacao = "Soma";
                    break;
                case 2:
                    resultado = calculadora.subtracao(num1, num2);
                    operacao = "Subtração";
                    break;
                case 3:
                    resultado = calculadora.multiplicacao(num1, num2);
                    operacao = "Multiplicação";
                    break;
                case 4:
                    resultado = calculadora.divisao(num1, num2);
                    operacao = "Divisão";
                    break;
                default:
                    io.apresentacao("Opção inválida. Tente novamente.");
                    continue;
            }

            io.apresentacao(operacao + " = " + resultado);
        }
    }
}
