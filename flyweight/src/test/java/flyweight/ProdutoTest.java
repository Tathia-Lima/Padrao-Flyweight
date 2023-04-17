package flyweight;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void deveRetornarProdutos() {
        Catalogo catalogo = new Catalogo();
        catalogo.cadastrar("Celular S20 Azul", "Samsung", "Samsung linha S", 2000.0f, 100);
        catalogo.cadastrar("Celular S20 Vermelho", "Samsung", "Samsung linha S", 2000.0f, 100);
        catalogo.cadastrar("Celular S20 Dourado", "Samsung", "Samsung linha S", 2000.0f, 100);
        catalogo.cadastrar("Celular", "IPhone", "Apple", 10000.0f, 100);
        catalogo.cadastrar("Liquidificador", "Liquidificador Elétrico", "Oster", 900.0f, 200);
        catalogo.cadastrar("Notebook", "MacBook Air", "MacBook", 11000.0f, 1000);
        catalogo.cadastrar("Batedeira", "Batedeira Stand", "kitchenaid", 2500.0f, 950);


        List<String> saida = Arrays.asList(
                "Produto{nome='Celular S20 Azul', sku='Samsung', marca='Samsung linha S', preco='2000.0', quantidade='100'}",
                "Produto{nome='Celular S20 Vermelho', sku='Samsung', marca='Samsung linha S', preco='2000.0', quantidade='100'}",
                "Produto{nome='Celular S20 Dourado', sku='Samsung', marca='Samsung linha S', preco='2000.0', quantidade='100'}",
                "Produto{nome='Celular', sku='IPhone', marca='Apple', preco='10000.0', quantidade='100'}",
                "Produto{nome='Liquidificador', sku='Liquidificador Elétrico', marca='Oster', preco='900.0', quantidade='200'}",
                "Produto{nome='Notebook', sku='MacBook Air', marca='MacBook', preco='11000.0', quantidade='1000'}",
                "Produto{nome='Batedeira', sku='Batedeira Stand', marca='kitchenaid', preco='2500.0', quantidade='950'}");

        assertEquals(saida, catalogo.infoProdutos());
    }

    @Test
    void deveRetornarQntSku() {
        Catalogo catalogo = new Catalogo();
        catalogo.cadastrar("Celular S20 Azul", "Samsung", "Samsung linha S", 2000.0f, 100);
        catalogo.cadastrar("Celular S20 Vermelho", "Samsung", "Samsung linha S", 2000.0f, 100);
        catalogo.cadastrar("Celular S20 Dourado", "Samsung", "Samsung linha S", 2000.0f, 100);
        catalogo.cadastrar("Celular", "IPhone", "Apple", 10000.0f, 100);
        catalogo.cadastrar("Liquidificador", "Liquidificador Elétrico", "Oster", 900.0f, 200);
        catalogo.cadastrar("Notebook", "MacBook Air", "MacBook", 11000.0f, 1000);
        catalogo.cadastrar("Batedeira", "Batedeira Stand", "kitchenaid", 2500.0f, 950);

        assertEquals(5, SkuFactory.getQuantidadeSku());
    }

}