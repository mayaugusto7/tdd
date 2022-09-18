package cap08_acoplamento;

import java.util.Calendar;

public class GeradorDeNotaFiscal {
    public NotaFiscal gera(Pedido pedido) {
        return new NotaFiscal(pedido.getCliente(), pedido.getValorTotal() * 0.94, Calendar.getInstance());
    }
}
