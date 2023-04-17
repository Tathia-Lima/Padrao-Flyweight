package flyweight;

public class Produto {

    private String nome;
    private Sku sku;

    public Produto(String nome, Sku sku) {
        this.nome = nome;
        this.sku = sku;
    }

    public String infoProduto() {
        return "Produto{" +
                "nome='" + this.nome + '\'' +
                ", sku='" + sku.getNome() + '\'' +
                ", marca='" + sku.getMarca() + '\'' +
                ", preco='" + sku.getPreco() + '\'' +
                ", quantidade='" + sku.getQuantidade() + '\'' +
                '}';
    }
}
