package flyweight;

public class Sku {

    private String nome;
    private String marca;
    private float preco;
    private int quantidade;

    public Sku(String nome, String marca, float preco, int quantidade) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public float getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
