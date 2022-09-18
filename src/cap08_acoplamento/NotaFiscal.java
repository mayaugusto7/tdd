package cap08_acoplamento;

import java.util.Calendar;

public class NotaFiscal {
    private final String cliente;
    private final double valor;
    private final Calendar data;

    public NotaFiscal(String cliente, double valor, Calendar data) {
        this.cliente = cliente;
        this.valor = valor;
        this.data = data;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public Calendar getData() {
        return data;
    }
}
