import cap05.CarrinhoDeCompras;
import cap05.CarrinhoDeComprasService;
import cap05.Item;
import cap05.MaiorPreco;
import org.junit.Test;
import static org.junit.Assert.*;


public class CarrinhoDeComprasTest {

    @Test
    public void deveRetornarZeroSeCarrinhoVazio() {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        assertEquals(0.0, carrinho.maiorValor(), 0.0001);
    }

    @Test
    public void deveRetornarValorDoItemSeCarrinhoCom1Elemento() {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(new Item("Geladeira", 1, 900.0));

        assertEquals(900.0, carrinho.maiorValor(), 0.0001);
    }

    @Test
    public void deveRetornarMaiorValorSeCarrinhoContemMuitosElementos() {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(new Item("Geladeira", 1, 900.0));
        carrinho.adiciona(new Item("Fogão", 1, 1500.0));
        carrinho.adiciona(new Item("Maquina de Lavar", 1, 750.0));

        assertEquals(1500.0, carrinho.maiorValor(), 0.0001);
    }
}
