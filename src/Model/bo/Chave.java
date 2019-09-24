
package Model.bo;


public class Chave {
    private int id;
    private boolean status;
    private int chaveBolsista;
    private int numeroChave;
    private int chaveCodigoBarras;

    public Chave() {
    }

    public Chave(int id, boolean status, int chaveBolsista, int numeroChave, int chaveCodigoBarras) {
        this.id = id;
        this.status = status;
        this.chaveBolsista = chaveBolsista;
        this.numeroChave = numeroChave;
        this.chaveCodigoBarras = chaveCodigoBarras;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getChaveBolsista() {
        return chaveBolsista;
    }

    public void setChaveBolsista(int chaveBolsista) {
        this.chaveBolsista = chaveBolsista;
    }

    public int getNumeroChave() {
        return numeroChave;
    }

    public void setNumeroChave(int numeroChave) {
        this.numeroChave = numeroChave;
    }

    public int getChaveCodigoBarras() {
        return chaveCodigoBarras;
    }

    public void setChaveCodigoBarras(int chaveCodigoBarras) {
        this.chaveCodigoBarras = chaveCodigoBarras;
    }
    
    
    //metodos
    
    public void listarChaves() {
        
    }
    
    public void chaveEntrada() {
        
    }
    
    public void entradaBolsista() {
        
    }
    
    public void chaveSaida() {
        
    }
    
    public void saidaBolsista() {
        
    }
    
    
    
    
    
    
}
