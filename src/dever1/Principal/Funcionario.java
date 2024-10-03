package dever1.Principal;

import java.util.Date;
import dever1.Complementar.Endereco;

public class Funcionario {

    //Atributos
    private int matricula;
    private String nome;
    private Date data_nascimento;
    private double salario;
    private Endereco endereco;
    private Date data_admissao;

    //get e set de endereco de novo
    public Endereco getEndereco(){
        return endereco;
    }
    public void setEndereco (Endereco endereco){
        this.endereco = endereco;
    }

    //get set de matricula
    public int getMatricula (){
        return matricula;
    }
    public void setMatricula (int matricula){
        this.matricula = matricula;
    }

    //get set de nome
    public String getNome (){
        return nome;
    }
    public void setNome (String nome){
        this.nome = nome;
    }

    //get set de data_nascimento
    public Date getData_nascimento (){
        return data_nascimento;
    }
    public void setData_nascimento (Date data_nascimento){
        this.data_nascimento = data_nascimento;
    }

    //get set de salario
    public double getSalario (){
        return salario;
    }
    public void setSalario (double salario){
        this.salario = salario;
    }

    //get set de data_admissao
    public Date getData_admissao(){
        return data_admissao;
    }
    public void setData_admissao(Date data_admissao){
        this.data_admissao = data_admissao;
    }
}
