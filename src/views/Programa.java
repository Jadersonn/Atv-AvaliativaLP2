package views;

import atividadeLP2.Chefe;
import atividadeLP2.Funcionario;

import java.util.ArrayList;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        ArrayList<Chefe> chefes = new ArrayList<Chefe>();

        Scanner leia = new Scanner(System.in);
        int opcao;
        menu();
        opcao = Integer.parseInt(leia.nextLine());

        do {

            if (opcao == 1) {
                menuChefe();
                int opcaoChefe = Integer.parseInt(leia.nextLine());
                switch (opcaoChefe) {
                    case 1:
                        Funcionario funcionario = new Funcionario();
                        funcionarios.add(criaFuncionario(funcionario, leia));

                        break;
                    case 2:
                        Chefe chefe = new Chefe();
                        chefes.add(criaChefe(chefe, leia));

                        break;
                    case 3:
                        int busca = 0;
                        int contador = 0;
                        int id;
               
                                System.out.println("Informe o Id do funcionario: ");
                                id = Integer.parseInt(leia.nextLine());
                                for (Funcionario funcionarioEncontrado : funcionarios) {
                                    if (funcionarioEncontrado.getIdentificacao() == id) {
                                        mostrarFuncionario(funcionarioEncontrado);
                                        contador += 1;
                                    }
                                }

                                if (contador == 0) {
                                    System.out.println("Funcionario nao encontrado.");
                                }
                           
                            System.out.println("Nova busca?");
                            menu();
                            id = Integer.parseInt(leia.nextLine());
                            
                            if(busca == 3) {
                            	System.out.println("Saiu.");
                            }

                        break;

                    case 4:
                        for (Funcionario funcionarioEncontrado : funcionarios) {
                            if (funcionarioEncontrado == null) {
                                System.out.println("Funcionarios nao encontrados.");
                            } else {
                                mostrarFuncionario(funcionarioEncontrado);
                            }
                        }
                        break;
                    case 5:
                        for (Chefe chefeEncontrado : chefes) {
                            if (chefeEncontrado == null) {
                                System.out.println("Chefes nao encontrados.");
                            } else {
                                mostrarChefe(chefeEncontrado);
                            }
                        }
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Valor Inválido!");
                }

            } else if (opcao == 2) {
            	for (Funcionario funcionarioEncontrado : funcionarios) {
                    if (funcionarioEncontrado == null) {
                        System.out.println("Funcionarios nao encontrados.");
                    } else {
                        mostrarFuncionario(funcionarioEncontrado);
                    }
                }
            } else if (opcao == 3) {
                System.out.println("Ate mais!");
                return;
            } else {
                System.out.println("Valor Invalido");
            }

            menu();
            opcao = Integer.parseInt(leia.nextLine());
        } while (opcao != 3);
    }

    public static void menu() {
        System.out.print("Opcoes\n1 - Chefe\n2 - Consultar Funcionarios\n3 - Sair\nSelecionou: ");
    }

    public static void menuChefe() {
        System.out.println("1 -Cadastrar Funcionario");
        System.out.println("2 -Cadastrar Chefe");
        System.out.println("3 -Buscar Funcionario");
        System.out.println("4 -Mostrar Funcionario");
        System.out.println("5 -Mostrar Chefes");
        System.out.println("0 -Sair");
        System.out.print("Selecionou: ");

    }



    public static Funcionario criaFuncionario(Funcionario funcionario, Scanner leia) {
        Funcionario funcionario1 = new Funcionario();
        System.out.println("Informe o Id do funcionario:");
        funcionario1.setIdentificacao(Integer.parseInt(leia.nextLine()));
        System.out.println("Informe o numero do mes das ferias do funcionario:");
        funcionario1.setFerias(Integer.parseInt(leia.nextLine()));
        System.out.println("Informe o nome do funcionario: ");
        funcionario1.setNome(leia.nextLine());
        System.out.println("Informe a profissao do funcionario:");
        funcionario1.setProfissao(leia.nextLine());
        System.out.println("Informe o CPF do funcionario:");
        funcionario1.setCpf(leia.nextLine());
        System.out.println("Informe o Genero do funcionario: ");
        funcionario1.setGenero(leia.nextLine());
        System.out.println("Informe o setor desse funcionario:");
        funcionario1.setSetor(leia.nextLine());
        System.out.println("Informe somente o valor (em horas) da carga horaria do funcionario:");
        funcionario1.setHorasSemanais(Integer.parseInt(leia.nextLine()));
        return funcionario1;
    }

    public static void mostrarFuncionario(Funcionario funcionario) {
        System.out.println("Id do funcionario: " + funcionario.getIdentificacao());
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Profissao: " + funcionario.getProfissao());
        System.out.println("CPF: " + funcionario.getCpf());
        System.out.println("Genero: " + funcionario.getGenero());
        System.out.println("Setor: " + funcionario.getSetor());
        System.out.println("Carga horaria desse funcionario: " + funcionario.getHorasSemanais());
        System.out.println("Ferias do funcionario: " + funcionario.getFerias());
    }

    public static Chefe criaChefe(Chefe chefe, Scanner leia) {
        Chefe chefe1 = new Chefe();
        System.out.println("Informe o Id do Chefe:");
        chefe1.setIdentificacao(Integer.parseInt(leia.nextLine()));
        System.out.println("Informe o numero do mes das ferias do Chefe:");
        chefe1.setFerias(Integer.parseInt(leia.nextLine()));
        System.out.println("Informe o nome do Chefe: ");
        chefe1.setNome(leia.nextLine());
        System.out.println("Informe a profissao do Chefe:");
        chefe1.setProfissao(leia.nextLine());
        System.out.println("Informe o CPF do Chefe:");
        chefe1.setCpf(leia.nextLine());
        System.out.println("Informe o Genero do Chefe: ");
        chefe1.setGenero(leia.nextLine());
        System.out.println("Informe o setor responsavel desse Chefe:");
        chefe1.setSetorResponsavel(leia.nextLine());
        return chefe1;
    }

    public static void mostrarChefe(Chefe chefe) {
        System.out.println("Id do funcionario: " + chefe.getIdentificacao());
        System.out.println("Nome: " + chefe.getNome());
        System.out.println("Profissao: " + chefe.getProfissao());
        System.out.println("CPF: " + chefe.getCpf());
        System.out.println("Genero: " + chefe.getGenero());
        System.out.println("Setor Responsavel: " + chefe.getSetorResponsavel());
    }
}
