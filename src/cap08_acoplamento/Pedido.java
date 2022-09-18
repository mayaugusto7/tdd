package cap08_acoplamento;

public class Pedido {
    private final String cliente;
    private final double valorTotal;
    private final int quantidadeItens;

    public Pedido(String cliente, double valorTotal, int quantidadeItens) {
        this.cliente = cliente;
        this.valorTotal = valorTotal;
        this.quantidadeItens = quantidadeItens;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }
}
