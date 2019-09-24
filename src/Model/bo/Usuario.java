
package Model.bo;


public class Usuario {
    private String email;
    private String senha;
    private int id;
    private String nome;

    public Usuario() {
    }

    public Usuario(String email, String senha, int id, String nome) {
        this.email = email;
        this.senha = senha;
        this.id = id;
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   
    
    
}
