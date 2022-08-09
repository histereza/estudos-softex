import java.io.*;

public class Produto implements Serializable {
    private String nome;
    private double preco;
    private static final long serialVersionUID = 2906642554793891381L;

    Produto() {

    }

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //SERIALIZAÇÃO
    public static void main(String[] args) throws IOException {
        Produto produto = new Produto("celular", 1000.00);

        FileOutputStream produtoOutput = new FileOutputStream("produto.byte");
        ObjectOutputStream objProduto = new ObjectOutputStream(produtoOutput);
        objProduto.writeObject(produto);
        objProduto.close();

        System.out.println(produtoOutput);

        //DESSERIALIZAÇÃO
        FileInputStream produtoInput = new FileInputStream("produto.byte");
        ObjectInputStream objProdutoInput = new ObjectInputStream(produtoInput);
        objProdutoInput.close();

        System.out.println(produtoInput);

    }
}


