/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import java.util.List;



/**
 *
 * @author T-Gamer
 */
public interface InterfaceDAO<T> {
    
    public abstract void Create(T objeto);
    
    public abstract List<T> Retrieve();
    
    public abstract T Retrieve(int id);
    
    public abstract void Update(int id, T objeto);
    
    public abstract void Delete(int id);
    
}
