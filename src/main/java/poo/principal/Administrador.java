package poo.principal;
public class Administrador {
    private int id;
    private String nome;
    private String email;
    private String cargo;

    public Administrador(int id, String nome, String email, String cargo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCargo() {
        return cargo;
    }

    public String toString() {
        return "ID: " + id + " | Nome: " + nome + " | Email: " + email + " | Cargo: " + cargo;
    }
}
