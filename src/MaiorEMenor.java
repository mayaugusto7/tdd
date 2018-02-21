public class MaiorEMenor {

    private Produto menor;
    private Produto maior;

    public void encontra(CarrinhoDeCompras carrinho) {

        if (carrinho == null)
            return;

        for ( Produto produto : carrinho.getProdutos() ) {
            if ( this.menor == null || produto.getValor() < this.menor.getValor() ) {
                this.menor = produto;
            }

            if ( maior == null || produto.getValor() > this.maior.getValor()) {
                this.maior = produto;
            }
        }
    }


    public Produto getMaior() {
        return maior;
    }

    public Produto getMenor() {
        return menor;
    }
}
