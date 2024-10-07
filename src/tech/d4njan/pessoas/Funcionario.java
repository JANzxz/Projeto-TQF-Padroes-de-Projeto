package tech.d4njan.pessoas;

import java.util.Scanner;

public class Funcionario extends Pessoa {
    private String nome;
    private Cargo cargo;
    private float salario;
    private String dataAdmissao;
    private int matricula;

    enum Cargo {
        PADEIRO,
        CONFEITEIRO,
        ATENDENTE,
        GERENTE;
    }

    public Funcionario(String nome, Cargo cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cargo=" + cargo +
                '}';
    }

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o nome do funcionário: ");
            String nome = scanner.nextLine();

            System.out.println("Escolha o cargo do funcionário:");
            for (Cargo c : Cargo.values()) {
                System.out.println(c.ordinal() + 1 + ". " + c);
            }

            System.out.print("Digite o salário do funcionário: ");
            float salario = scanner.nextFloat();

            System.out.print("Digite a matrícula do funcionário: ");
            int matricula = scanner.nextInt();

            System.out.print("Digite a data de admissão do funcionário: ");
            String dataAdmissao = scanner.nextLine();

            int cargoEscolhido = scanner.nextInt() - 1;
            Cargo cargo = Cargo.values()[cargoEscolhido];

            Funcionario funcionario = new Funcionario(nome, cargo);
            System.out.println(funcionario);

            scanner.close();
        }


    }
}
