package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {

    private List<Produto> produtos = new ArrayList<>();

    public void cadastrar(String nomeProduto, String nomeSku, String marcaSku, float precoSku, int quantidadeSku) {
        Sku sku = SkuFactory.getSku(nomeSku, marcaSku, precoSku, quantidadeSku);
        Produto produto = new Produto(nomeProduto, sku);
        produtos.add(produto);
    }

    public List<String> infoProdutos() {
        List<String> saida = new ArrayList<>();
        for (Produto produto : produtos) {
            saida.add(produto.infoProduto());
        }
        return saida;
    }

}
