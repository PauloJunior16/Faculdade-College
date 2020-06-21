package projeto_poo;

import java.util.ArrayList;

public class Produto extends Pedido {
    String nome;
    ArrayList<Ingrediente> ingrediente = new ArrayList();
    ArrayList<Manufatura> manufatura = new ArrayList();
    float custo;

    public Produto() {
    }

    public Produto(String nome, float custo) {
        this.nome = nome;
        this.custo = custo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Ingrediente> getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(ArrayList<Ingrediente> ingrediente) {
        this.ingrediente = ingrediente;
    }

    public ArrayList<Manufatura> getManufatura() {
        return manufatura;
    }

    public void setManufatura(ArrayList<Manufatura> manufatura) {
        this.manufatura = manufatura;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = calculaCusto();
    }
    
    private float calculaCusto(){
    
        float custoIng = 0;
        float custoMan = 0;
        
        for (int i = 0; i < ingrediente.size(); i++){
            custoIng += ingrediente.get(i).getMateriaPrima().getPreco() * ingrediente.get(i).getQtde();
        }
        for (int i = 0; i < manufatura.size(); i++){
            custoIng += manufatura.get(i).getProcesso().getCustoHora()* manufatura.get(i).getQtde();
        
    }
        setCusto(custoIng + custoMan);
        return getCusto();
    }
    
}
