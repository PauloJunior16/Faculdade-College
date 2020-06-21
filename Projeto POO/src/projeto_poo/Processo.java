package projeto_poo;

public class Processo extends Manufatura{
    String nome;
    float custoHora;
    Operador operador;
    Equipamento equipamento;

    public Processo() {
    }

    public Processo(String nome, float custoHora, Operador operador, Equipamento equipamento) {
        this.nome = nome;
        this.custoHora = custoHora;
        this.operador = operador;
        this.equipamento = equipamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getCustoHora() {
        return custoHora;
    }

    public void setCustoHora(float custoHora) {
        this.custoHora = custoHora;
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }
     private float custoProcesso(){
     
         setCustoHora(this.operador.getSalarioHora() + this.equipamento.getDepreciacaoHora());
         return getCustoHora();
     }
}
