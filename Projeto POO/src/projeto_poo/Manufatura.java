package projeto_poo;

public class Manufatura {
    Processo processo;
    float qtde;

    public Manufatura() {
    }

    public Manufatura(Processo processo, float qtde) {
        this.processo = processo;
        this.qtde = qtde;
    }

    public Processo getProcesso() {
        return processo;
    }

    public void setProcesso(Processo processo) {
        this.processo = processo;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }
    
    
}
