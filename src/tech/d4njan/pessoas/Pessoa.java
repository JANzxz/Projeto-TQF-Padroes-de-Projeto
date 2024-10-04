package tech.d4njan.pessoas;

import java.util.Scanner;

public class Pessoa {

    protected String nome;
	protected String dataNascimento;

    Scanner sc = new Scanner(System.in);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void cadastrar() {

        System.out.print("Informe o nome: ");
        this.nome = sc.nextLine();

        System.out.println("Informe a data de Nascimento: ");
        this.dataNascimento = sc.nextLine();

    }

    public String obterIdade() {

		return "";

	}

}
