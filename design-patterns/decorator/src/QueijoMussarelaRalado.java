public class QueijoMussarelaRalado extends Adicionais {
    private Sanduiche sanduiche;

    public QueijoMussarelaRalado(Sanduiche sanduiche) {
        this.sanduiche = sanduiche;
    }

    @Override
    public String getNome() {
        return this.sanduiche.getNome() + ", Queijo mussarela ralado";
    }

    @Override
    public double preco() {
        return 2.00 + this.sanduiche.preco();
    }
}