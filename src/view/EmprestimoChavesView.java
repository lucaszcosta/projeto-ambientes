/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author T-Gamer
 */
public class EmprestimoChavesView extends javax.swing.JFrame {

    
    
    

    /**
     * Creates new form EmprestimoChavesView
     */
    public EmprestimoChavesView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTTabelaEmprestimo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBNomeUsuario = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSala110 = new javax.swing.JButton();
        btnSala111 = new javax.swing.JButton();
        btnSala112 = new javax.swing.JButton();
        btnSala113 = new javax.swing.JButton();
        btnSala114 = new javax.swing.JButton();
        btnSala115 = new javax.swing.JButton();
        btnSala116 = new javax.swing.JButton();
        btnSala117 = new javax.swing.JButton();
        btnSala118 = new javax.swing.JButton();
        btnSala119 = new javax.swing.JButton();
        btnSala120 = new javax.swing.JButton();
        btnSala121 = new javax.swing.JButton();
        btnSala122 = new javax.swing.JButton();
        btnSala123 = new javax.swing.JButton();
        btnSala124 = new javax.swing.JButton();
        btnSala210 = new javax.swing.JButton();
        btnSala211 = new javax.swing.JButton();
        btnSala212 = new javax.swing.JButton();
        btnSala213 = new javax.swing.JButton();
        btnSala214 = new javax.swing.JButton();
        btnSala215 = new javax.swing.JButton();
        btnSala216 = new javax.swing.JButton();
        btnSala217 = new javax.swing.JButton();
        btnSala218 = new javax.swing.JButton();
        btnSala219 = new javax.swing.JButton();
        btnSala220 = new javax.swing.JButton();
        btnSala221 = new javax.swing.JButton();
        btnSala222 = new javax.swing.JButton();
        btnSala223 = new javax.swing.JButton();
        btnSala224 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnAjuda = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTTabelaEmprestimo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Laboratório 116", "Disponível", "1234", null},
                {"Laboratório 114", "Indisponível", "4321", "Roberval"},
                {"Sala 122", "Disponível", "1243", ""},
                {"", null, "", null}
            },
            new String [] {
                "Sala/Laboratório", "Disponibilidade", "Código Chave", "Responsável"
            }
        ));
        jScrollPane1.setViewportView(jTTabelaEmprestimo);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel1.setText("Empréstimo de Chaves");

        jLabel2.setText("Logado como:");

        jBNomeUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBNomeUsuario.setText("[Usuário]");

        jLabel5.setText("* Passe o código de barras no leitor que automaticamente a chave será liberada para você.");

        btnSala110.setText("Sala 110");

        btnSala111.setText("Sala 111");
        btnSala111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSala111ActionPerformed(evt);
            }
        });

        btnSala112.setText("Sala 112");

        btnSala113.setText("Sala 113");

        btnSala114.setText("Sala 114");

        btnSala115.setText("Sala 115");

        btnSala116.setText("Sala 116");

        btnSala117.setText("Sala 117");

        btnSala118.setText("Sala 118");

        btnSala119.setText("Sala 119");

        btnSala120.setText("Sala 120");

        btnSala121.setText("Sala 121");

        btnSala122.setText("Sala 122");

        btnSala123.setText("Sala 123");

        btnSala124.setText("Sala 124");

        btnSala210.setText("Sala 210");

        btnSala211.setText("Sala 211");

        btnSala212.setText("Sala 212");

        btnSala213.setText("Sala 213");

        btnSala214.setText("Sala 214");

        btnSala215.setText("Sala 215");

        btnSala216.setText("Sala 216");

        btnSala217.setText("Sala 217");

        btnSala218.setText("Sala 218");

        btnSala219.setText("Sala 219");

        btnSala220.setText("Sala 220");

        btnSala221.setText("Sala 221");

        btnSala222.setText("Sala 222");

        btnSala223.setText("Sala 223");

        btnSala224.setText("Sala 224");

        btnAjuda.setText("Ajuda");

        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(911, Short.MAX_VALUE)
                .addComponent(btnAjuda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnAjuda)
                .addComponent(btnCancelar))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(150, 150, 150)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBNomeUsuario)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(351, 351, 351))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jScrollPane1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSala110)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSala210))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSala111)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSala211))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSala112)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSala212))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSala113)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSala213))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSala114)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSala214))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSala115)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSala215))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSala116)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSala216))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSala117)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSala217))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSala118)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSala218))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSala119)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSala219))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSala120)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSala220))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSala121)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSala221))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSala122)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSala222))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSala123)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSala223))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSala124)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSala224)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jBNomeUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSala110)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSala111)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSala112)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSala113)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSala114)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSala115)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSala116)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSala117)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSala118)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSala119)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSala120)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSala121)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSala122)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSala123)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSala124))
                    .addComponent(btnSala210)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnSala211))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnSala212))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btnSala213))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(btnSala214))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btnSala215))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(btnSala216))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(btnSala217))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(btnSala218))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(btnSala219))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(btnSala220))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(btnSala221))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(btnSala222))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(btnSala223))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(406, 406, 406)
                        .addComponent(btnSala224))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSala111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSala111ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSala111ActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjuda;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSala110;
    private javax.swing.JButton btnSala111;
    private javax.swing.JButton btnSala112;
    private javax.swing.JButton btnSala113;
    private javax.swing.JButton btnSala114;
    private javax.swing.JButton btnSala115;
    private javax.swing.JButton btnSala116;
    private javax.swing.JButton btnSala117;
    private javax.swing.JButton btnSala118;
    private javax.swing.JButton btnSala119;
    private javax.swing.JButton btnSala120;
    private javax.swing.JButton btnSala121;
    private javax.swing.JButton btnSala122;
    private javax.swing.JButton btnSala123;
    private javax.swing.JButton btnSala124;
    private javax.swing.JButton btnSala210;
    private javax.swing.JButton btnSala211;
    private javax.swing.JButton btnSala212;
    private javax.swing.JButton btnSala213;
    private javax.swing.JButton btnSala214;
    private javax.swing.JButton btnSala215;
    private javax.swing.JButton btnSala216;
    private javax.swing.JButton btnSala217;
    private javax.swing.JButton btnSala218;
    private javax.swing.JButton btnSala219;
    private javax.swing.JButton btnSala220;
    private javax.swing.JButton btnSala221;
    private javax.swing.JButton btnSala222;
    private javax.swing.JButton btnSala223;
    private javax.swing.JButton btnSala224;
    private javax.swing.JLabel jBNomeUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTTabelaEmprestimo;
    // End of variables declaration//GEN-END:variables
}
