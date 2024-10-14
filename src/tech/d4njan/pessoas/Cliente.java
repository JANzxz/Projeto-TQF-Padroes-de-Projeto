package tech.d4njan.pessoas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import tech.d4njan.composicao.Profissao;

public class Cliente extends Pessoa {

    //? Cria uma lista dos clientes
    private static List<Cliente> clientes = new ArrayList<>();

    private String codigo;
    private Profissao profissao;

    public Cliente(String nome, Profissao profissao) {

        this.nome = nome;
        this.profissao = profissao;

    }

    public static void listarClientes() { //* Função para listar os clientes cadastrados

        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } 

        else {

            System.out.println("Clientes:");
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }

        }

    }

    //* Função para adicionar cliente ao sistema
    public static void adicionarCliente(Scanner scanner) {

        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.println("Escolha a profissão do cliente:");
        for (Profissao p : Profissao.values()) {
            System.out.println(p.ordinal() + 1 + ". " + p);
        }
        int profissaoEscolhida = scanner.nextInt() - 1;
        Profissao profissao = Profissao.values()[profissaoEscolhida];
        scanner.nextLine();

        Cliente cliente = new Cliente(nome, profissao);
        cliente.setCodigo("C" + (clientes.size() + 1));
        clientes.add(cliente);

        System.out.println("Cliente adicionado: " + cliente);

    }

    //* Função para atualizar o cadastro dos clientes
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
                scanner.nextLine();

                System.out.println("Cliente atualizado: " + cliente);
                return;

            }

        }

        System.out.println("Cliente com o código " + codigo + " não encontrado.");

    }

    //* Função para excluir clientes do sistema
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

        } 

        else {
            System.out.println("Cliente com o código " + codigo + " não encontrado.");
        }

    }

    // Gets e Sets

        public String getCodigo() {
            return codigo;
        }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }

        public Profissao getProfissao() {
            return profissao;
        }

        public void setProfissao(Profissao profissao) {
            this.profissao = profissao;
        }

    // Método To String
    @Override
    public String toString() {
        return "Cliente [codigo=" + codigo + ", profissao=" + profissao + ", nome=" + nome + "]";
    }

}
