package poo.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca(); 

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Cadastrar Usuário");
            System.out.println("3. Emprestar Livro");
            System.out.println("4. Listar Livros");
            System.out.println("5. Listar Usuários");
            // System.out.println("6. Cadastrar Administrador"); // ainda não implementado
            // System.out.println("7. Listar Administradores"); // ainda não implementado
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("ISBN: ");
                    String isbn = sc.nextLine();
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    System.out.print("Ano: ");
                    int ano = sc.nextInt();
                    sc.nextLine();
                    biblioteca.cadastrarLivro(new Livro(isbn, titulo, autor, ano));
                    break;
                case 2:
                    System.out.print("ID: ");
                    int idUser = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nome: ");
                    String nomeUser = sc.nextLine();
                    System.out.print("Email: ");
                    String emailUser = sc.nextLine();
                    biblioteca.cadastrarUsuario(new Usuario(idUser, nomeUser, emailUser));
                    break;
                case 3:
                    System.out.print("ISBN do livro: ");
                    String isbnEmprestimo = sc.nextLine();
                    biblioteca.emprestarLivro(isbnEmprestimo);
                    break;
                case 4:
                    biblioteca.listarLivros();
                    break;
                case 5:
                    biblioteca.listarUsuarios();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}

