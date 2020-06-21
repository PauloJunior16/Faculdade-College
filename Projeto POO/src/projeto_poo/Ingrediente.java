package projeto_poo;

public class Ingrediente extends Produto{
    MateriaPrima materiaPrima;
    float qtde;

    public Ingrediente() {
    }

    public Ingrediente(MateriaPrima materiaPrima, float qtde) {
        this.materiaPrima = materiaPrima;
        this.qtde = qtde;
    }

    public MateriaPrima getMateriaPrima() {
        return materiaPrima;
    }

    public void setMateriaPrima(MateriaPrima materiaPrima) {
        this.materiaPrima = materiaPrima;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }
    
    
    
}
