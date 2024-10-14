package tech.d4njan.pessoas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import tech.d4njan.composicao.Cargo;

public class Funcionario extends Pessoa {

    //? Cria uma lista dos funcionários
    private static List<Funcionario> listaFuncionarios = new ArrayList<>(); 

    private Cargo cargo;
    private float salario;

    public Funcionario(String nome, Cargo cargo) {

        this.nome = nome;
        this.cargo = cargo;

    }

    public static void listarFuncionarios() { //* Função para listar os funcionários cadastrados

        if (listaFuncionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        }

        else {
            System.out.println("Funcionários:");
            for (Funcionario funcionario : listaFuncionarios) {
                System.out.println(funcionario);
            }
        }

    }

    //* Função para adicionar funcionários ao sistema
    public static void adicionarFuncionario(Scanner scanner) { 

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.println("Escolha o cargo do funcionário:");
        for (Cargo c : Cargo.values()) {
            System.out.println(c.ordinal() + 1 + ". " + c);
        }
        int cargoEscolhido = scanner.nextInt() - 1;
        Cargo cargo = Cargo.values()[cargoEscolhido];

        System.out.print("Digite o salário do funcionário: ");
        float salario = scanner.nextFloat();
        scanner.nextLine();

        Funcionario funcionario = new Funcionario(nome, cargo);
        funcionario.setSalario(salario);
        listaFuncionarios.add(funcionario);

        System.out.println("Funcionário adicionado: " + funcionario);

    }

    //* Função para reajustar o salario dos funcionários
    public static void reajustarSalarioFuncionario(Scanner scanner) {

        listarFuncionarios();

        System.out.print("Digite o nome do funcionário que deseja reajustar: ");
        String nome = scanner.nextLine();

        for (Funcionario funcionario : listaFuncionarios) {

            if (funcionario.getNome().equalsIgnoreCase(nome)) {

                System.out.print("Digite o percentual de reajuste do salário: ");
                float percentual = scanner.nextFloat();
                funcionario.reajustarSalario(percentual);
                System.out.println("Salário reajustado: " + funcionario.getSalario());
                return;

            }

        }

        System.out.println("Funcionário não encontrado.");

    }

    //* Função para prover o cargo dos funcionários
    public static void promoverFuncionario(Scanner scanner) {

        listarFuncionarios();

        System.out.print("Digite o nome do funcionário que deseja promover: ");
        String nome = scanner.nextLine();

        for (Funcionario funcionario : listaFuncionarios) {

            if (funcionario.getNome().equalsIgnoreCase(nome)) {

                System.out.println("Escolha o novo cargo:");
                for (Cargo c : Cargo.values()) {
                    System.out.println(c.ordinal() + 1 + ". " + c);
                }
                int novoCargoEscolhido = scanner.nextInt() - 1;
                Cargo novoCargo = Cargo.values()[novoCargoEscolhido];
                funcionario.promover(novoCargo);
                System.out.println("Funcionário promovido para " + novoCargo);
                return;

            }

        }

        System.out.println("Funcionário não encontrado.");

    }

    //* Função para calcular o reajuste de salario
    public void reajustarSalario(float percentual) {
        this.salario += salario * (percentual / 100);
    }

    //* Função para promover para novo cargo
    public void promover(Cargo novoCargo) {
        this.cargo = novoCargo;
    }

    // Gets e Sets

        public float getSalario() {
            return salario;
        }

        public void setSalario(float salario) {
            this.salario = salario;
        }

    // Método To String
    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", cargo=" + cargo + ", salario=" + salario + "]";
    }

}
