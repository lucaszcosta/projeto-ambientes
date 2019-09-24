
package Model.bo;

public class Bolsista extends Usuario{
    private String matricula;

    public Bolsista() {
    }

    public Bolsista(String matricula) {
        this.matricula = matricula;
    }

    public Bolsista(String matricula, String email, String senha, int id, String nome) {
        super(email, senha, id, nome);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
        
}
