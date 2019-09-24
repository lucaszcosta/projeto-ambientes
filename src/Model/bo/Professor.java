package Model.bo;

public class Professor extends Usuario {

    private String codigoBarras;

    public Professor() {
    }

    public Professor(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Professor(String codigoBarras, String email, String senha, int id, String nome) {
        super(email, senha, id, nome);
        this.codigoBarras = codigoBarras;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public void cadastrarBolsista() {
    }

}
