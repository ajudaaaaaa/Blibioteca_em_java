package poo.principal;
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Administrador> administradores = new ArrayList<>();

    public void cadastrarLivro(Livro livro) {
        for (Livro l : livros) {
            if (l.getIsbn().equals(livro.getIsbn())) {
                System.out.println("Erro: ISBN já cadastrado.");
                return;
            }
        }
        livros.add(livro);
        System.out.println("Livro cadastrado com sucesso.");
    }

    public void cadastrarUsuario(Usuario usuario) {
        for (Usuario u : usuarios) {
            if (u.getId() == usuario.getId()) {
                System.out.println("Erro: ID de usuário já cadastrado.");
                return;
            }
        }
        usuarios.add(usuario);
        System.out.println("Usuário cadastrado com sucesso.");
    }

    public void cadastrarAdministrador(Administrador admin) {
        for (Administrador a : administradores) {
            if (a.getId() == admin.getId()) {
                System.out.println("Erro: ID de administrador já cadastrado.");
                return;
            }
        }
        administradores.add(admin);
        System.out.println("Administrador cadastrado com sucesso.");
    }

    public void emprestarLivro(String isbn) {
        for (Livro l : livros) {
            if (l.getIsbn().equals(isbn)) {
                if (l.isDisponivel()) {
                    l.setDisponivel(false);
                    System.out.println("Livro emprestado com sucesso.");
                } else {
                    System.out.println("Erro: Livro já está emprestado.");
                }
                return;
            }
        }
        System.out.println("Erro: Livro não encontrado.");
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }
        for (Livro l : livros) {
            System.out.println(l.toString());
        }
    }

    public void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
            return;
        }
        for (Usuario u : usuarios) {
            System.out.println(u.toString());
        }
    }

    public void listarAdministradores() {
        if (administradores.isEmpty()) {
            System.out.println("Nenhum administrador cadastrado.");
            return;
        }
        for (Administrador a : administradores) {
            System.out.println(a.toString());
        }
    }
}

