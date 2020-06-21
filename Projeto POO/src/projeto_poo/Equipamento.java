package projeto_poo;

public class Equipamento extends Processo{
    String nome;
    String fabricante;
    Data dataFabricacao;
    float depreciacaoHora;

    public Equipamento() {
    }

    public Equipamento(String nome, String fabricante, Data dataFabricacao, float depreciacaoHora) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.dataFabricacao = dataFabricacao;
        this.depreciacaoHora = depreciacaoHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Data getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Data dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public float getDepreciacaoHora() {
        return depreciacaoHora;
    }

    public void setDepreciacaoHora(float depreciacaoHora) {
        this.depreciacaoHora = depreciacaoHora();
    }


    private float depreciacaoHora() {
        float valorEquip = 4000;
        float vidaUtil = 5;
        
        float custo_por_mes = valorEquip / vidaUtil;
        float custoDepreciacao = custo_por_mes / 8;
        
        return custoDepreciacao;
    }
    
    
    
}

