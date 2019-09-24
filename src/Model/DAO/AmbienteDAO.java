/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.bo.Administrador;
import Model.bo.Ambiente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author T-Gamer
 */
public class AmbienteDAO implements InterfaceDAO<Model.bo.Ambiente> {

    private static List<Ambiente> listaAmbiente = new ArrayList<>();

    @Override
    public void Create(Ambiente ambiente) {
        listaAmbiente.add(ambiente);
    }

    @Override
    public List<Ambiente> Retrieve() {
        return listaAmbiente;
    }

    @Override
    public Ambiente Retrieve(int id) {
        int indice = listaAmbiente.indexOf(id);
        if (indice != -1) {
            return listaAmbiente.get(indice);
        } else {
            return null;
        }
    }

    @Override
    public void Update(int id, Ambiente ambiente) {
        int indice = listaAmbiente.indexOf(id);
        listaAmbiente.set(id, ambiente);

    }

    @Override
    public void Delete(int id) {
        int indice = -1;
        for (int i = 0; i < listaAmbiente.size(); i++) {
            if (listaAmbiente.get(i).getId() == id) {
                indice = i;
            }
            if (indice != -1) {
                listaAmbiente.remove(indice);
            }
        }
    }
}
