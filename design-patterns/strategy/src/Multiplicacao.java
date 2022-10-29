public class Multiplicacao implements Operacao{
    private int valor1;
    private int valor2;

    public Multiplicacao(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    @Override
    public int execute() {
        return valor1 * valor2;
    }
}
