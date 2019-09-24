package Model.DAO;

import Model.bo.Administrador;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author T-Gamer
 */
public class AdministradorDAO implements InterfaceDAO<Model.bo.Administrador> {

    private static List<Administrador> listaAdministrador = new ArrayList<>();

    @Override
    public void Create(Administrador administrador) {
        listaAdministrador.add(administrador);
    }

    @Override
    public List<Administrador> Retrieve() {
        return listaAdministrador;
    }

    @Override
    public Administrador Retrieve(int id) {
        int indice = listaAdministrador.indexOf(id);
        if (indice != -1) {
            return listaAdministrador.get(indice);
        } else {
            return null;
        }
    }

    @Override
    public void Update(int id, Administrador administrador) {
        int indice = listaAdministrador.indexOf(id);
        listaAdministrador.set(id, administrador);
    }

    @Override
    public void Delete(int id) {
        int indice = -1;
        for (int i = 0; i < listaAdministrador.size(); i++) {
            if (listaAdministrador.get(i).getId() == id) {
                indice = i;
            }
            if (indice != -1) {
                listaAdministrador.remove(indice);
            }

        }
    }

}
