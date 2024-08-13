import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private Loja loja;

    public Menu() {
        this.scanner = new Scanner(System.in);
        this.loja = new Loja();
    }

    public void exibeMenu() {
        Integer opcao = 0;

        do {
            System.out.println("Selecione uma opção abaixo:");

            System.out.println("-----------------------------------");
            System.out.println("" +
                    "1 - Cadastrar Assalariado\n" +
                    "2 - Cadastrar Horista\n" +
                    "3 - Cadastrar Comissionado\n" +
                    "4 - Listar todos funcionários\n" +
                    "5 - Listar Assalariados\n" +
                    "6 - Listar Horistas\n" +
                    "7 - Listar Comissionados\n" +
                    "8 - Calcular o valor total da folha de pagamento\n" +
                    "9 - Encerrar");
            System.out.println("-----------------------------------");

            opcao = scanner.nextInt();
            scanner.nextLine();

            String nome;
            String cpf;

            switch (opcao) {
                case 1:
                    System.out.println("------ADICIONANDO ASSALARIADO------");
                    System.out.print("Digite o nome do funcionário: ");
                    nome = scanner.nextLine();

                    System.out.print("Digite o cpf do funcionário (xxx.xxx.xxx-xx): ");
                    cpf = scanner.nextLine();

                    System.out.print("Digite o salário do funcionário: R$ ");
                    double salario = scanner.nextDouble();

                    Assalariado assalariado = new Assalariado(salario, nome.trim().toUpperCase(), cpf.replaceAll("\\D", ""));
                    loja.cadastrarAssalariado(assalariado);
                    break;
                case 2:
                    System.out.println("------ADICIONANDO HORISTA------");
                    System.out.print("Digite o nome do funcionário: ");
                    nome = scanner.nextLine();

                    System.out.print("Digite o cpf do funcionário (xxx.xxx.xxx-xx): ");
                    cpf = scanner.nextLine();

                    System.out.print("Digite as horas trabalhadas do funcionário: ");
                    double horasTrabalhadas = scanner.nextDouble();

                    System.out.print("Digite o valor por hora do funcionário: ");
                    System.out.print("R$ ");
                    double valorPorHora = scanner.nextDouble();

                    Horista horista = new Horista(nome.trim().toUpperCase(), cpf.replaceAll("\\D", ""), horasTrabalhadas, valorPorHora);
                    loja.cadastrarHorista(horista);
                    break;
                case 3:
                    System.out.println("------ADICIONANDO COMISSIONADO------");
                    System.out.print("Digite o nome do funcionário: ");
                    nome = scanner.nextLine();

                    System.out.print("Digite o cpf do funcionário (xxx.xxx.xxx-xx): ");
                    cpf = scanner.nextLine();

                    System.out.print("Digite o valor das vendas do funcionário: ");
                    double valorVendas = scanner.nextDouble();

                    System.out.print("Digite o percentual de comissão em número inteiro: ");
                    Integer percentualComissao = scanner.nextInt();

                    Commisionado commisionado = new Commisionado(valorVendas,percentualComissao, nome.trim().toUpperCase(), cpf.replaceAll("\\D", ""));
                    loja.cadastrarComissionado(commisionado);
                    break;
                case 4:
                    System.out.println("------LISTAR TODOS FUNCIONÁRIOS------");
                    System.out.println(loja.listarTodosFuncionarios());
                    break;
                case 5:
                    System.out.println("------LISTAR TODOS ASSALARIADOS------");
                    System.out.println(loja.listarAssalariados());
                    break;
                case 6:
                    System.out.println("------LISTAR TODOS HORISTAS------");
                    System.out.println(loja.listarHoristas());
                    break;
                case 7:
                    System.out.println("------LISTAR TODOS COMISSIONADOS------");
                    System.out.println(loja.listarComissionados());
                    break;
                case 8:
                    System.out.println("------CALCULAR FOLHA PAGAMENTO------");
                    System.out.println("calculando folha...");
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opcão não encontrada");
                    break;
            }
        } while (opcao != 9);

        scanner.close();
    }
}
