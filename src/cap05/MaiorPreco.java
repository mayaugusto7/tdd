package cap05;

public class MaiorPreco {

    public double encontra(CarrinhoDeCompras carrinho) {

        if ( carrinho.getItens().size() == 0) return 0;

        double maior = carrinho.getItens().get(0).getValorTotal();

        maior = econtrarMaiorValor(carrinho, maior);

        return maior;
    }

    private double econtrarMaiorValor(CarrinhoDeCompras carrinho, double maior) {

        for ( Item item : carrinho.getItens() ) {
            if ( maior < item.getValorTotal() ) {
                maior = item.getValorTotal();
            }
        }

        return maior;
    }
}
