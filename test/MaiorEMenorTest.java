import cap03.CarrinhoDeCompras;
import cap03.MaiorEMenor;
import cap03.Produto;
import org.junit.Assert;
import org.junit.Test;

public class MaiorEMenorTest {

    @Test
    public void ordemDecrescente() {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(new Produto("Geladeira", 450.0));
        carrinho.adiciona(new Produto("Liquidificador", 250.0));
        carrinho.adiciona(new Produto("Jogo de Pratos", 70.0));

        MaiorEMenor algoritmo = new MaiorEMenor();

        algoritmo.encontra(carrinho);

        System.out.println("O menor produto: " + algoritmo.getMenor().getNome());
        System.out.println("O maior produto: " + algoritmo.getMaior().getNome());
    }

    @Test
    public void apenasUmProduto() {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(new Produto("Geladeira", 450.0));

        MaiorEMenor algoritmo = new MaiorEMenor();
        algoritmo.encontra(carrinho);

        Assert.assertEquals("Geladeira", algoritmo.getMenor().getNome());
        Assert.assertEquals("Geladeira", algoritmo.getMaior().getNome());
    }

}
