public class Pepperoni extends Adicionais{
    private Sanduiche sanduiche;

    public Pepperoni(Sanduiche sanduiche) {
        this.sanduiche = sanduiche;
    }

    @Override
    public String getNome() {
        return this.sanduiche.getNome() + ", Pepperoni";
    }

    @Override
    public double preco() {
        return 0.99 + this.sanduiche.preco();
    }
}
