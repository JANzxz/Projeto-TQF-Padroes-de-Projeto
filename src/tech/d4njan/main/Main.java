package tech.d4njan.main;

import tech.d4njan.pessoas.Cliente;
import tech.d4njan.pessoas.Funcionario;
import tech.d4njan.composicao.Profissao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Cliente> clientes = new ArrayList<>(); // Lista de clientes

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

    // Menu para clientes
    public static void menuClientes(Scanner scanner) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("MENU CLIENTES");
            System.out.println("1. Adicionar Cliente");
            System.out.println("2. Atualizar Cliente");
            System.out.println("3. Excluir Cliente");
            System.out.println("4. Listar Clientes");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer

            switch (opcao) {
                case 1:
                    adicionarCliente(scanner);
                    break;
                case 2:
                    atualizarCliente(scanner);
                    break;
                case 3:
                    excluirCliente(scanner);
                    break;
                case 4:
                    listarClientes();
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    // Métodos para gerenciar clientes

    public static void adicionarCliente(Scanner scanner) {
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.println("Escolha a profissão do cliente:");
        for (Profissao p : Profissao.values()) {
            System.out.println(p.ordinal() + 1 + ". " + p);
        }
        int profissaoEscolhida = scanner.nextInt() - 1;
        Profissao profissao = Profissao.values()[profissaoEscolhida];
        scanner.nextLine(); // Limpar o buffer do scanner

        Cliente cliente = new Cliente(nome, profissao);
        cliente.setCodigo("C" + (clientes.size() + 1)); // Código automático baseado no tamanho da lista
        clientes.add(cliente);

        System.out.println("Cliente adicionado: " + cliente);
    }

    public static void atualizarCliente(Scanner scanner) {
        listarClientes();

        System.out.print("Digite o código do cliente que deseja atualizar: ");
        String codigo = scanner.nextLine();

        for (Cliente cliente : clientes) {
            if (cliente.getCodigo().equalsIgnoreCase(codigo)) {
                System.out.print("Digite o novo nome do cliente: ");
                String novoNome = scanner.nextLine();
                cliente.setNome(novoNome);

                System.out.println("Escolha a nova profissão do cliente:");
                for (Profissao p : Profissao.values()) {
                    System.out.println(p.ordinal() + 1 + ". " + p);
                }
                int profissaoEscolhida = scanner.nextInt() - 1;
                Profissao novaProfissao = Profissao.values()[profissaoEscolhida];
                cliente.setProfissao(novaProfissao);
                scanner.nextLine(); // Limpar o buffer

                System.out.println("Cliente atualizado: " + cliente);
                return;
            }
        }
        System.out.println("Cliente com o código " + codigo + " não encontrado.");
    }

    public static void excluirCliente(Scanner scanner) {
        listarClientes();

        System.out.print("Digite o código do cliente que deseja excluir: ");
        String codigo = scanner.nextLine();

        Cliente clienteParaRemover = null;
        for (Cliente cliente : clientes) {
            if (cliente.getCodigo().equalsIgnoreCase(codigo)) {
                clienteParaRemover = cliente;
                break;
            }
        }

        if (clienteParaRemover != null) {
            clientes.remove(clienteParaRemover);
            System.out.println("Cliente removido: " + clienteParaRemover);
        } else {
            System.out.println("Cliente com o código " + codigo + " não encontrado.");
        }
    }

    public static void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            System.out.println("Clientes:");
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }
}
