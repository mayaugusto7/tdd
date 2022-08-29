package cap06;

import cap05.CarrinhoDeCompras;
import cap05.Item;

public class CarrinhoDeComprasBuilder {

    public CarrinhoDeCompras carrinho;

    public CarrinhoDeComprasBuilder() {
        this.carrinho = new CarrinhoDeCompras();
    }

    public CarrinhoDeComprasBuilder comItens(double...valores) {
        for (double valor : valores) {
            carrinho.adiciona(new Item("Item", 1, valor));
        }

        return this;
    }

    public CarrinhoDeCompras cria() {
        return this.carrinho;
    }
}
