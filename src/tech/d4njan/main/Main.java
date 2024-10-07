package tech.d4njan.main;
import tech.d4njan.pessoas.Funcionario;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Exibe o menu principal
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Gerenciar Funcionários");
            System.out.println("2. Gerenciar Clientes");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Menu para funcionários
                    menuFuncionarios(scanner);
                    break;
                case 2:
                    // Menu para clientes
                    menuClientes(scanner);
                    break;
                case 0:
                    // Finalizar o programa
                    continuar = false;
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        scanner.close();
    }

    // Método para menu de funcionários
    public static void menuFuncionarios(Scanner scanner) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("MENU FUNCIONÁRIOS");
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Reajustar Salário");
            System.out.println("3. Promover Funcionário");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer

            switch (opcao) {
                case 1:
                    // Adicionar funcionário (exemplo)
                    System.out.print("Digite o nome do funcionário: ");
                    String nome = scanner.nextLine();
                    System.out.println("Escolha o cargo:");
                    for (Funcionario.Cargo c : Funcionario.Cargo.values()) {
                        System.out.println(c.ordinal() + 1 + ". " + c);
                    }
                    int cargoEscolhido = scanner.nextInt() - 1;
                    Funcionario.Cargo cargo = Funcionario.Cargo.values()[cargoEscolhido];
                    System.out.print("Digite o salário do funcionário: ");
                    float salario = scanner.nextFloat();

                    Funcionario funcionario = new Funcionario(nome, cargo);
                    funcionario.setSalario(salario);

                    System.out.println("Funcionário adicionado: " + funcionario);
                    break;

                case 2:
                    // Reajustar salário (exemplo)
                    System.out.println("Reajustando salário...");
                    // Aqui seria possível buscar o funcionário para reajustar o salário
                    break;

                case 3:
                    // Promover funcionário (exemplo)
                    System.out.println("Promovendo funcionário...");
                    // Aqui seria possível buscar o funcionário para promover
                    break;

                case 0:
                    continuar = false; // Voltar ao menu principal
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    // Método para menu de clientes
    public static void menuClientes(Scanner scanner) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("MENU CLIENTES");
            System.out.println("1. Adicionar Cliente");
            System.out.println("2. Atualizar Cliente");
            System.out.println("3. Excluir Cliente");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer

            switch (opcao) {
                case 1:
                    // Adicionar cliente (exemplo)
                    System.out.print("Digite o nome do cliente: ");
                    String nomeCliente = scanner.nextLine();
                    System.out.print("Digite o CPF do cliente: ");
                    String cpfCliente = scanner.nextLine();

                    // Aqui você poderia criar um objeto Cliente e adicioná-lo em um banco de dados ou lista
                    System.out.println("Cliente adicionado: " + nomeCliente + ", CPF: " + cpfCliente);
                    break;

                case 2:
                    // Atualizar cliente (exemplo)
                    System.out.println("Atualizando cliente...");
                    // Aqui seria possível buscar o cliente para atualizar informações
                    break;

                case 3:
                    // Excluir cliente (exemplo)
                    System.out.println("Excluindo cliente...");
                    // Aqui seria possível buscar o cliente para excluir
                    break;

                case 0:
                    continuar = false; // Voltar ao menu principal
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
