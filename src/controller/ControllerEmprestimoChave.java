/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.EmprestimoChavesView;
import view.MenuIncialView;

/**
 *
 * @author T-Gamer
 */
public class ControllerEmprestimoChave implements ActionListener{

    
    public MenuIncialView menu;
    
    private view.EmprestimoChavesView emprestimoView;
    
    
   public ControllerEmprestimoChave(EmprestimoChavesView view) {
       
       this.emprestimoView = view;
       
       
   }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
    
    
}

