package dever1.Principal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String r;

        Funcionario e = new Funcionario();
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println();
            System.out.println("Folha de pagamento");
            System.out.println();

            System.out.print("Qual o nome do empregado: ");
            e.nome = sc.next();

            System.out.print("Matricula do empregado: ");
            e.matricula = sc.nextInt();

            System.out.print("Salario bruto do empregado: ");
            e.salario_bruto = sc.nextDouble();

            System.out.println();
            System.out.println("Exibindo os dados");
            System.out.println();
            System.out.println("Nome do empregado: " + e.nome);
            System.out.println("Mtricula: " + e.matricula);
            System.out.println("Salario bruto: " + e.salario_bruto);
            e.calculo_deducao();

            System.out.println();
            System.out.println("Para usar o progama denovo, digite 's'; Se não quiser executar, digite 'n': ");
            r = sc.next();

            if(r.equalsIgnoreCase("n")){

                System.out.println("Valeu (✿◠‿◠)");
                break;
            }
        } while(r.equalsIgnoreCase("s"));

























    }
}
