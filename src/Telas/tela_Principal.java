/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Classes.Sessao;

/**
 *
 * @author bissm
 */
public class tela_Principal extends javax.swing.JFrame {

    
    
    public tela_Principal() {
        initComponents();
        iniciar();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_Gerenciar = new javax.swing.JPanel();
        bt_geren_ser = new javax.swing.JButton();
        bt_gerencLogin = new javax.swing.JButton();
        pn_Favorito = new javax.swing.JPanel();
        pn_Categorias = new javax.swing.JPanel();
        bt_Categoria = new javax.swing.JButton();
        pn_Principal = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        bt_Login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_geren_ser.setText("Gerenc. Serie");
        bt_geren_ser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_geren_serActionPerformed(evt);
            }
        });

        bt_gerencLogin.setText("Gerenc. Login");
        bt_gerencLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_gerencLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_GerenciarLayout = new javax.swing.GroupLayout(pn_Gerenciar);
        pn_Gerenciar.setLayout(pn_GerenciarLayout);
        pn_GerenciarLayout.setHorizontalGroup(
            pn_GerenciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_GerenciarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_GerenciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_geren_ser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_gerencLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pn_GerenciarLayout.setVerticalGroup(
            pn_GerenciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_GerenciarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_geren_ser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_gerencLogin))
        );

        javax.swing.GroupLayout pn_FavoritoLayout = new javax.swing.GroupLayout(pn_Favorito);
        pn_Favorito.setLayout(pn_FavoritoLayout);
        pn_FavoritoLayout.setHorizontalGroup(
            pn_FavoritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        pn_FavoritoLayout.setVerticalGroup(
            pn_FavoritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        bt_Categoria.setText("Categorias");
        bt_Categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_CategoriasLayout = new javax.swing.GroupLayout(pn_Categorias);
        pn_Categorias.setLayout(pn_CategoriasLayout);
        pn_CategoriasLayout.setHorizontalGroup(
            pn_CategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_CategoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_Categoria)
                .addContainerGap(450, Short.MAX_VALUE))
        );
        pn_CategoriasLayout.setVerticalGroup(
            pn_CategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_CategoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_Categoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_PrincipalLayout = new javax.swing.GroupLayout(pn_Principal);
        pn_Principal.setLayout(pn_PrincipalLayout);
        pn_PrincipalLayout.setHorizontalGroup(
            pn_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_PrincipalLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_PrincipalLayout.setVerticalGroup(
            pn_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_PrincipalLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jButton1)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        bt_Login.setText("Login");
        bt_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_LoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(bt_Login)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(bt_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pn_Categorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pn_Gerenciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pn_Favorito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pn_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn_Categorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_Gerenciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn_Favorito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(pn_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_geren_serActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_geren_serActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_geren_serActionPerformed

    private void bt_CategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CategoriaActionPerformed
    }//GEN-LAST:event_bt_CategoriaActionPerformed

    private void bt_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_LoginActionPerformed
        tela_Logar login = new tela_Logar();
        login.setVisible(true);
    }//GEN-LAST:event_bt_LoginActionPerformed

    private void bt_gerencLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_gerencLoginActionPerformed
        tela_GerencLogin gL = new tela_GerencLogin();
        gL.setVisible(true);
    }//GEN-LAST:event_bt_gerencLoginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tela_GerenciarSerie i = new tela_GerenciarSerie();
        i.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Categoria;
    private javax.swing.JButton bt_Login;
    private javax.swing.JButton bt_geren_ser;
    private javax.swing.JButton bt_gerencLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pn_Categorias;
    private javax.swing.JPanel pn_Favorito;
    private javax.swing.JPanel pn_Gerenciar;
    private javax.swing.JPanel pn_Principal;
    // End of variables declaration//GEN-END:variables

    private void iniciar() {
        Sessao.setId(0);
        Sessao.setPrin(this);
        atualizar_Tela();
    }
        
    public void atualizar_Tela()
    {
        if(Sessao.getId() == 0){
        //Deslogado
        bt_Categoria.setEnabled(false);
        bt_geren_ser.setEnabled(false);
        bt_gerencLogin.setEnabled(false);
            Sessao.setUse(null);
            Sessao.setLogin(null);
            
        }else{
        //logado
        bt_Categoria.setEnabled(true);
        bt_geren_ser.setEnabled(true);
        bt_gerencLogin.setEnabled(true);
        }

    }
}
