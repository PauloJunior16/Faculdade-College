package projeto_poo;

import java.util.ArrayList;

public class Pedido {

    int numero;
    Pessoa cliente;
    Data data;
    ArrayList<Produto> produtos = new ArrayList();
    float totalPedido;

    public Pedido() {
    }

    public Pedido(int numero, Pessoa cliente, Data data, float totalPedido) {
        this.numero = numero;
        this.cliente = cliente;
        this.data = data;
        this.totalPedido = totalPedido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public float getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(float totalPedido) {
        this.totalPedido = calculaPedido();
    }

    private float calculaPedido() {

        float totalPedido = 0;
        for (int i = 0; i < produtos.size(); i++) {
            totalPedido += produtos.get(i).getCusto();
        }
        setTotalPedido(totalPedido);
        return getTotalPedido();
    }

}
