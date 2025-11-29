/**
 * <h1>Projeto Calculadora</h1>
 *
 * <p>Esta classe fornece operações matemáticas básicas como soma, subtração,
 * multiplicação e divisão, além de um método principal que seleciona a operação 
 * desejada com base em um operador informado pelo usuário.</p>
 *
 * <p>Este projeto foi utilizado para demonstrar:</p>
 * <ul>
 *     <li>Técnicas de revisão estática (caixa branca);</li>
 *     <li>Identificação de erros (em branco, vermelho);</li>
 *     <li>Aplicação de refatoração com código Java;</li>
 *     <li>Documentação com Javadoc.</li>
 * </ul>
 *
 * <p>Após a refatoração, os métodos desta classe são
 * <strong>métodos puros</strong>, facilitando testes unitários, leitura e
 * confiabilidade.</p>
 *
 * @author Seu Nome
 * @version 1.0
 */

public class Calculadora {
    /**
     * Soma dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return resultado da soma entre {@code a} e {@code b}
     */

    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai o segundo número do primeiro.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return resultado de {@code a - b}
     */

    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return resultado de {@code a * b}
     */

    public int multiplicar(int a, int b) {
        return a * b;
    }

     /**
     * Divide o primeiro número pelo segundo.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return resultado de {@code a / b}
     *
     * @throws IllegalArgumentException se {@code b} for zero
     */

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida");
        }
        return a / b;
    }

     /**
     * Executa a operação matemática solicitada com base no operador informado.
     *
     * <p>Operadores aceitos:</p>
     *
     * <ul>
     *     <li>"+" → Soma</li>
     *     <li>"-" → Subtração</li>
     *     <li>"*" → Multiplicação</li>
     *     <li>"/" → Divisão</li>
     * </ul>
     *
     * <p>Qualquer operador inválido resultará em exceção.</p>
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @param operador símbolo da operação desejada
     * @return resultado da operação correspondente ao operador informado
     *
     * @throws IllegalArgumentException se o operador não for válido
     */
    
    public int calcular(int a, int b, String operador) {
        return switch (operador) {
            case "+" -> somar(a, b);
            case "-" -> subtrair(a, b);
            case "*" -> multiplicar(a, b);
            case "/" -> dividir(a, b);
            default -> throw new IllegalArgumentException("Operador inválido: " + operador);
        };
    }
}




