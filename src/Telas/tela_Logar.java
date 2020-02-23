/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;
import BancoDeDados.Select_Banco;
import Classes.Sessao;
import Classes.Usuario;


/**
 *
 * @author bissm
 */
public class tela_Logar extends javax.swing.JFrame {
    
    
    public tela_Logar() {
        initComponents();
            lb_Dica.setVisible(false);
            lb_DicaTxt.setVisible(false);
            lb_Erro.setVisible(false);
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_Acessar = new javax.swing.JButton();
        tb_Senha = new javax.swing.JPasswordField();
        tb_Login = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bt_Cadastrar = new javax.swing.JButton();
        lb_Erro = new javax.swing.JLabel();
        lb_Dica = new javax.swing.JLabel();
        lb_DicaTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_Acessar.setText("Acessar");
        bt_Acessar.setToolTipText("");
        bt_Acessar.setName("bt_Login"); // NOI18N
        bt_Acessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AcessarActionPerformed(evt);
            }
        });

        tb_Senha.setName("tb_Senha"); // NOI18N

        tb_Login.setName("tb_Login"); // NOI18N
        tb_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_LoginActionPerformed(evt);
            }
        });

        jLabel1.setText("Login");

        jLabel2.setText("Senha");

        bt_Cadastrar.setText("Cadastrar");
        bt_Cadastrar.setToolTipText("");
        bt_Cadastrar.setActionCommand("");
        bt_Cadastrar.setName("bt_Cadastrar"); // NOI18N
        bt_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CadastrarActionPerformed(evt);
            }
        });

        lb_Erro.setText("Loguin e/ou senha Incorreto");
        lb_Erro.setName("lb_LogErro"); // NOI18N

        lb_Dica.setText("Lembrar senha:");

        lb_DicaTxt.setText("-----");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_Dica)
                    .addComponent(lb_DicaTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_Erro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tb_Login)
                            .addComponent(tb_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_Acessar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_Cadastrar)))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lb_Dica))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lb_Erro, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_DicaTxt)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tb_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tb_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_Acessar)
                            .addComponent(bt_Cadastrar))))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_AcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AcessarActionPerformed
        String senha = new String(tb_Senha.getPassword());
        String login = new String(tb_Login.getText());
        Select_Banco select = new Select_Banco();
            if(select.Select_Logar(login, senha))
            {
                Usuario use = new Usuario();
                use = select.Select_Usuario(login);
                    Sessao.setId(use.getId());
                    Sessao.setUse(use);
                    tela_Principal prin = Sessao.getPrin();
                    prin.atualizar_Tela();
                    this.setVisible(false);
                
            }else{
                lb_DicaTxt.setText(select.Select_Dica(login));
                lb_Dica.setVisible(true);
                lb_DicaTxt.setVisible(true);
                lb_Erro.setVisible(true);
            }
        
        
    }//GEN-LAST:event_bt_AcessarActionPerformed

    private void tb_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_LoginActionPerformed

    private void bt_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CadastrarActionPerformed
      cadastro_User cadastrar = new cadastro_User();
      cadastrar.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_bt_CadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(tela_Logar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_Logar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_Logar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_Logar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_Logar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Acessar;
    private javax.swing.JButton bt_Cadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lb_Dica;
    private javax.swing.JLabel lb_DicaTxt;
    private javax.swing.JLabel lb_Erro;
    private javax.swing.JTextField tb_Login;
    private javax.swing.JPasswordField tb_Senha;
    // End of variables declaration//GEN-END:variables


}
