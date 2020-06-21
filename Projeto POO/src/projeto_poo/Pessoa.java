package projeto_poo;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private Data dataNasc;
    private String idade;
    private String cpf;
    private Endereço endereço;

    public Pessoa() {
    }

    public Pessoa(String nome, Data dataNasc, String idade, String cpf, Endereço endereço) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.idade = idade;
        this.cpf = cpf;
        this.endereço = endereço;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Data dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = calculaIdade();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereço getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }
    
    public String calculaIdade(){
     LocalDate data = LocalDate.now();
     
     int dia = data.getDayOfMonth();
     int mes = data.getMonthValue();
     int ano = data.getYear();
     
     int idadeAtual = ano - this.dataNasc.getAno();
      if (this.dataNasc.getMes() >= mes){
          idadeAtual--;
      }else if(this.dataNasc.getMes() == mes){
          if(dataNasc.getDia() >= dia){
              idadeAtual--;
          }
      }
     return idadeAtual + " anos";
    }
    
    
}
