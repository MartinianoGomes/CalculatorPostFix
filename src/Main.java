import entities.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.calc_values(1);
        calculator.calc_values(2);

        calculator.calc_operador('+');
        calculator.calc_operador('-');
        calculator.calc_operador('/');
        calculator.calc_operador('*');
    }
}