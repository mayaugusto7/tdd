import cap08_acoplamento.GeradorDeNotaFiscal;
import cap08_acoplamento.NotaFiscal;
import cap08_acoplamento.Pedido;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeradorDeNotaFiscalTest {

    @Test
    public void deveGerarNFComValorDeImpostoDescontado() {
        GeradorDeNotaFiscal gerador = new GeradorDeNotaFiscal();
        Pedido pedido = new Pedido("Mauricio", 1000, 1);

        NotaFiscal notaFiscal = gerador.gera(pedido);

        assertEquals(1000 * 0.94, notaFiscal.getValor(), 0.0001);
    }
}
