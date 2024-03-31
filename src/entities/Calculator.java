package entities;

public class Calculator {
    private Stack<Float> valuesStack;

    public Calculator() {
        valuesStack = new Stack<>();
    }

    public void calc_values(float v) {
        /* Empilha valor */
        valuesStack.push(v);

        /* Imprime o topo da pilha */
        System.out.println(valuesStack.peek());
    }

    public void calc_operador(char op) {
        float v1, v2, v = 0.0F;

        /* desempilha operandos */
        if (valuesStack.isEmpty())
            v2 = 0.0F;
        else
            v2 = valuesStack.pop();
        if (valuesStack.isEmpty())
            v1 = 0.0F;
        else
            v1 = valuesStack.pop();

        /* faz operação */
        switch (op) {
            case '+':
                v = v1 + v2;
                break;
            case '-':
                v = v1 - v2;
                break;
            case '*':
                v = v1 * v2;
                break;
            case '/':
                v = v1 / v2;
                break;
        }

        /* empilha resultado */
        valuesStack.push(v);

        /* imprime topo da pilha */
        System.out.println(v);
    }
}