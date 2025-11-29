/**
 * <h2>Classe de Testes: TesteCalculadora</h2>
 *
 * <p>Esta classe tem como objetivo validar o comportamento dos métodos
 * da classe {@link Calculadora}. Aqui são realizados testes simples,
 * incluindo:</p>
 *
 * <ul>
 *     <li>Testes de operações válidas (soma, subtração, multiplicação, divisão);</li>
 *     <li>Testes de divisão por zero;</li>
 *     <li>Testes de operador inválido;</li>
 *     <li>Tratamento de exceções esperadas.</li>
 * </ul>
 *
 * <p>Este conjunto de testes auxilia na verificação da correta utilização
 * dos métodos puros, garantindo confiabilidade e estabilidade da refatoração.</p>
 *
 * @author Seu Nome
 * @version 1.0
 */

public class TesteCalculadora {
    /**
     * Executa os testes unitários simples da classe Calculadora.
     *
     * @param args argumentos de linha de comando (não utilizado)
     */
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        // Testes normais
        System.out.println(calc.calcular(2, 3, "+"));
        System.out.println(calc.calcular(10, 4, "-"));
        System.out.println(calc.calcular(3, 5, "*"));
        System.out.println(calc.calcular(8, 2, "/"));

        // Teste de divisão por zero
        try {
            System.out.println(calc.calcular(8, 0, "/"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Teste de operador inválido
        try {
            System.out.println(calc.calcular(5, 5, "x"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}




