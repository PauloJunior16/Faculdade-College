package projeto_poo;

public class MateriaPrima extends Ingrediente{
    String nome;
    String unidade;
    String fornecedor;
    float preco;

    public MateriaPrima() {
    }

    public MateriaPrima(String nome, String unidade, String fornecedor, float preco) {
        this.nome = nome;
        this.unidade = unidade;
        this.fornecedor = fornecedor;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
}
