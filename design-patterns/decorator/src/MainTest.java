public class MainTest {
    public static void main(String[] args) {
        Sanduiche sanduichinho = new FrangoAssado();
        sanduichinho = new Pepperoni(sanduichinho);
        sanduichinho = new QueijoMussarelaRalado(sanduichinho);

        System.out.println(sanduichinho.getNome() + ". Total: R$ " + sanduichinho.preco());
    }
}
