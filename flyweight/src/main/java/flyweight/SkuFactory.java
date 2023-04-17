package flyweight;
import java.util.HashMap;
import java.util.Map;
public class SkuFactory {

    private static Map<String, Sku> skus = new HashMap<>();

    public static Sku getSku(String nome, String marca, float preco, int quantidade) {
        Sku sku = skus.get(nome);
        if (sku == null) {
            sku = new Sku(nome, marca, preco, quantidade);
            skus.put(nome, sku);
        }
        return sku;
    }

    public static int getQuantidadeSku() {
        return skus.size();
    }

}