package projeto_poo;

public class Operador extends Processo {
    String cargo;
    float salarioHora;

    public Operador() {
    }

    public Operador(String cargo, float salarioHora) {
        this.cargo = cargo;
        this.salarioHora = salarioHora;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(float salarioHora) {
        this.salarioHora = salarioHora;
    }
    
    
}
