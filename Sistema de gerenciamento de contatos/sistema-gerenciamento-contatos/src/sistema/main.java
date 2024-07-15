package sistema;

import java.util.Scanner;

public class main {
    public static void main (String[] args){
        GerenciadorDeContatos gerenciador = new GerenciadorDeContatos();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("1.Adicionar Contato");
            System.out.println("2.Remover Contato");
            System.out.println("3.Buscar Contato");
            System.out.println("4.Listar Contato");
            System.out.println("0.Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); //Consumir uma nova linha

            switch (opcao){
                case 1:
                    System.out.println("nome");
                    String nome = scanner.nextLine();
                    System.out.println("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.println("Email: ");
                    String email = scanner.nextLine();
                    gerenciador.adicionarContato(new Contato(nome, telefone, email));
                    break;
                case 2: 
                    System.out.println("Nome do contato a remover: ");
                    String nomeRemover = scanner.nextLine();
                    gerenciador.removerContato(nomeRemover);
                    break;
                case 3:
                    System.out.println("Nome do contato a buscar: ");
                    String nomeBuscar = scanner.nextLine();
                    Contato contato = gerenciador.buscarContato(nomeBuscar);
                    if(contato != null){
                        System.out.println(contato);
                    }else{
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 4:
                    gerenciador.listarContatos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                 System.out.println("Opção invalida. ");
                 break;
            }
        }while(opcao != 0);

        scanner.close();
    }
}
