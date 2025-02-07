package tech.d4njan.main;

import tech.d4njan.pessoas.Cliente;
import tech.d4njan.pessoas.Funcionario;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {

            // Exibe o menu principal
            System.out.println("\nMENU PRINCIPAL");
            System.out.println("1. Gerenciar Funcionários");
            System.out.println("2. Gerenciar Clientes");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {

                case 1:

                    //? Chama o Menu para funcionários
                    menuFuncionarios(scanner);
                    break;

                case 2:
                    //? Chama o Menu para clientes
                    menuClientes(scanner);
                    break;

                case 0:
                    //? Sair do Sistema
                    continuar = false;
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");

            }

        } scanner.close();

    }

    //* Menu para funcionários
    public static void menuFuncionarios(Scanner scanner) {

        boolean continuar = true;

        while (continuar) {

            System.out.println("\nMENU FUNCIONÁRIOS");
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Reajustar Salário");
            System.out.println("3. Promover Funcionário");
            System.out.println("4. Listar Funcionários");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    Funcionario.adicionarFuncionario(scanner);
                    break;

                case 2:
                    Funcionario.reajustarSalarioFuncionario(scanner);
                    break;

                case 3:
                    Funcionario.promoverFuncionario(scanner);
                    break;
                case 4:
                    Funcionario.listarFuncionarios();
                    break;

                case 0:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");

            }

        }

    }

    //* Menu para clientes
    public static void menuClientes(Scanner scanner) {

        boolean continuar = true;

        while (continuar) {

            System.out.println("\nMENU CLIENTES");
            System.out.println("1. Adicionar Cliente");
            System.out.println("2. Atualizar Cliente");
            System.out.println("3. Excluir Cliente");
            System.out.println("4. Listar Clientes");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    Cliente.adicionarCliente(scanner);
                    break;

                case 2:
                    Cliente.atualizarCliente(scanner);
                    break;

                case 3:
                    Cliente.excluirCliente(scanner);
                    break;

                case 4:
                    Cliente.listarClientes();
                    break;

                case 0:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");

            }

        }

    }

}
