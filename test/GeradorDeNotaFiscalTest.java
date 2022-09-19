import cap08_acoplamento.*;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeradorDeNotaFiscalTest {

    @Test
    public void deveGerarNFComValorDeImpostoDescontado() {
        // criando o mock
        NFDao dao = Mockito.mock(NFDao.class);

        GeradorDeNotaFiscal gerador = new GeradorDeNotaFiscal(dao);
        Pedido pedido = new Pedido("Mauricio", 1000, 1);

        NotaFiscal notaFiscal = gerador.gera(pedido);

        assertEquals(1000 * 0.94, notaFiscal.getValor(), 0.0001);

        // verificando que o método foi invocado.
        Mockito.verify(dao).persiste(notaFiscal);
    }

    @Test
    public void deveEnviarNFGeradaParaSAP() {
        NFDao dao = Mockito.mock(NFDao.class);
        SAP sap = Mockito.mock(SAP.class);

        GeradorDeNotaFiscal gerador = new GeradorDeNotaFiscal(dao, sap);
        Pedido pedido = new Pedido("Mauricio", 1000, 1);

        NotaFiscal notaFiscal = gerador.gera(pedido);

        Mockito.verify(sap).envia(notaFiscal);
    }
}
