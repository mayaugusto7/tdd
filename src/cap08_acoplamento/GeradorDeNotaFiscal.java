package cap08_acoplamento;

import java.util.Calendar;

public class GeradorDeNotaFiscal {
    private NFDao dao;
    private SAP sap;

    public GeradorDeNotaFiscal() {}

    public GeradorDeNotaFiscal(NFDao dao) {
        this.dao = dao;
    }

    public GeradorDeNotaFiscal(NFDao dao, SAP sap) {
        this.dao = dao;
        this.sap = sap;
    }

    public NFDao getNfDao() {
        return dao;
    }

    public NotaFiscal gera(Pedido pedido) {
        NotaFiscal notaFiscal = new NotaFiscal(
                pedido.getCliente(),
                pedido.getValorTotal() * 0.94,
                Calendar.getInstance());

        dao.persiste(notaFiscal);
        sap.envia(notaFiscal);

        return notaFiscal;
    }
}
