
package Model.bo;

public class Administrador extends Usuario{
    private String codigoBarras;

    public Administrador() {
    }

    public Administrador(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Administrador(String codigoBarras, String email, String senha, int id, String nome) {
        super(email, senha, id, nome);
        this.codigoBarras = codigoBarras;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
    
    public void cadastrarProfessor() {
        
    }
    
    public void cadastrarBolsista() {
        
    }
    
       
}
