
package Model.bo;


public class Ambiente {
    private int id;
    private int numeroSala;

    public Ambiente() {
    }

    public Ambiente(int id, int numeroSala) {
        this.id = id;
        this.numeroSala = numeroSala;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }
    
    
}
