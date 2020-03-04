/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import BancoDeDados.Insert_Banco;
import BancoDeDados.Select_Banco;
import Classes.Categoria;
import Classes.Classificacao_Etaria;
import Classes.Estudio;
import Classes.Nacionalidade;
import Classes.Series;
import Classes.Status;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 *
 * @author bissm
 */
public class tela_GerenciarSerie extends javax.swing.JFrame {

    List<Status> lista_Status = new ArrayList();
    List<Classificacao_Etaria> lista_Classificacao = new ArrayList();
    List<Estudio> lista_Estudio = new ArrayList();
    List<Nacionalidade> lista_Nacionalidade = new ArrayList();
    List<Categoria> lista_Categoria = new ArrayList();
    DefaultListModel lista = new DefaultListModel();

    // ArrayList<String> lista =  new ArrayList();
    public tela_GerenciarSerie() {
        initComponents();
        iniciar_Status();
        iniciar_Classificacao();
        iniciar_Estudio();
        iniciar_Nacionalidade();
        iniciar_Categoria();
        lista = new DefaultListModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        tb_Nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cb_Favorito = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        cb_Dublado = new javax.swing.JCheckBox();
        cb_Legendado = new javax.swing.JCheckBox();
        cb_Nota = new javax.swing.JComboBox<>();
        tb_Duracao = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        cb_Status = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cb_Classificacao = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cb_Estudio = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cb_Nacionalidade = new javax.swing.JComboBox<>();
        cb_Categoria = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lt_Categoria = new javax.swing.JList<>();
        bt_Add = new javax.swing.JButton();
        bt_Remov = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("dsdsd");

        jTabbedPane5.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );

        jLabel1.setText("Nome");

        jLabel2.setText("Duração");

        cb_Favorito.setText("Favorito");

        jLabel3.setText("Nota");

        cb_Dublado.setText("Dublado");
        cb_Dublado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_DubladoActionPerformed(evt);
            }
        });

        cb_Legendado.setText("Legendado");

        cb_Nota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cb_Nota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_NotaActionPerformed(evt);
            }
        });

        try {
            tb_Duracao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tb_Duracao.setText("00:00");
        tb_Duracao.setToolTipText("");
        tb_Duracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_DuracaoActionPerformed(evt);
            }
        });

        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cb_Status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_StatusActionPerformed(evt);
            }
        });

        jLabel4.setText("Status");

        jLabel5.setText("Classificação");

        jLabel6.setText("Estudio");

        jLabel7.setText("Nacionalidade");

        cb_Nacionalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_NacionalidadeActionPerformed(evt);
            }
        });

        cb_Categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_CategoriaActionPerformed(evt);
            }
        });

        jLabel8.setText("Categoria");

        jScrollPane2.setViewportView(lt_Categoria);

        bt_Add.setText("+");
        bt_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AddActionPerformed(evt);
            }
        });

        bt_Remov.setText("-");
        bt_Remov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_RemovActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(tb_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(tb_Duracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(71, 71, 71)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cb_Classificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(cb_Status, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cb_Estudio, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(cb_Nota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(cb_Legendado)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cb_Favorito)
                                .addComponent(cb_Dublado))
                            .addGap(36, 36, 36)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cb_Nacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cb_Categoria, 0, 153, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(bt_Add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_Remov))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_Favorito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_Dublado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_Legendado)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(tb_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(tb_Duracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(cb_Classificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bt_Add)
                                    .addComponent(bt_Remov))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(cb_Nota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(cb_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6)
                                            .addComponent(cb_Estudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(cb_Nacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cb_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)))
                        .addGap(80, 80, 80))))
        );

        jTabbedPane5.addTab("Adicionar", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 726, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
        );

        jTabbedPane5.addTab("Editar", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 726, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
        );

        jTabbedPane5.addTab("Deletar", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_DubladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_DubladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_DubladoActionPerformed

    private void cb_NotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_NotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_NotaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        salvaSerie();
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cb_StatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_StatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_StatusActionPerformed

    private void cb_NacionalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_NacionalidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_NacionalidadeActionPerformed

    private void tb_DuracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_DuracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_DuracaoActionPerformed

    private void cb_CategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_CategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_CategoriaActionPerformed

    private void bt_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AddActionPerformed
        addIdCategoria();
    }//GEN-LAST:event_bt_AddActionPerformed

    private void bt_RemovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_RemovActionPerformed
        removCategorias();
    }//GEN-LAST:event_bt_RemovActionPerformed

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
            java.util.logging.Logger.getLogger(tela_GerenciarSerie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_GerenciarSerie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_GerenciarSerie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_GerenciarSerie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_GerenciarSerie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Add;
    private javax.swing.JButton bt_Remov;
    private javax.swing.JComboBox<String> cb_Categoria;
    private javax.swing.JComboBox<String> cb_Classificacao;
    private javax.swing.JCheckBox cb_Dublado;
    private javax.swing.JComboBox<String> cb_Estudio;
    private javax.swing.JCheckBox cb_Favorito;
    private javax.swing.JCheckBox cb_Legendado;
    private javax.swing.JComboBox<String> cb_Nacionalidade;
    private javax.swing.JComboBox<String> cb_Nota;
    private javax.swing.JComboBox<String> cb_Status;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JList<String> lt_Categoria;
    private java.awt.Panel panel1;
    private javax.swing.JFormattedTextField tb_Duracao;
    private javax.swing.JTextField tb_Nome;
    // End of variables declaration//GEN-END:variables
        //
    private void iniciar_Status() {
        Select_Banco select = new Select_Banco();

        lista_Status = select.Select_Status();
        for (int i = 0; i < lista_Status.size(); i++) {

            cb_Status.addItem(lista_Status.get(i).Status_Producao);

        }
    }

    private void iniciar_Classificacao() {
        Select_Banco select = new Select_Banco();
        lista_Classificacao = select.Select_Classificacao();

        for (int i = 0; i < lista_Classificacao.size(); i++) {
            cb_Classificacao.addItem(lista_Classificacao.get(i).Classificacao);

        }
    }

    private void iniciar_Estudio() {
        Select_Banco select = new Select_Banco();
        lista_Estudio = select.Select_Estudio();

        for (int i = 0; i < lista_Estudio.size(); i++) {
            cb_Estudio.addItem(lista_Estudio.get(i).Nome_Estudio);

        }

    }

    private void iniciar_Nacionalidade() {
        Select_Banco select = new Select_Banco();
        lista_Nacionalidade = select.Select_Nacionalidade();

        for (int i = 0; i < lista_Nacionalidade.size(); i++) {
            cb_Nacionalidade.addItem(lista_Nacionalidade.get(i).Pais);

        }

    }

    private void iniciar_Categoria() {
        Select_Banco select = new Select_Banco();
        lista_Categoria = select.Select_Categoria();

        for (int i = 0; i < lista_Categoria.size(); i++) {
            cb_Categoria.addItem(lista_Categoria.get(i).nome_Categoria);

        }
    }

    private void salvaSerie() {
        String duracao = tb_Duracao.getText();
        String nome = tb_Nome.getText();
        boolean favorito = cb_Favorito.isSelected();
        boolean dublado = cb_Dublado.isSelected();
        boolean legendado = cb_Legendado.isSelected();
        String nota = (String) cb_Nota.getSelectedItem();
        int iS = cb_Status.getSelectedIndex();//Pega nº posição
        int Status = lista_Status.get(iS).id; //ID Status
        int iC = cb_Classificacao.getSelectedIndex();
        int Classificacao = lista_Classificacao.get(iC).id;
        int iE = cb_Estudio.getSelectedIndex();
        int Estudio = lista_Estudio.get(iE).id;
        int iN = cb_Nacionalidade.getSelectedIndex();
        int Nacionalidade = lista_Nacionalidade.get(iN).id;
        //int iCT = cb_Categoria.getSelectedIndex();
        //int Categoria = lista_Categoria.get(iCT).id;

        Series Ser = new Series();
        Ser.setDublado(dublado);
        Ser.setDuracao(duracao);
        Ser.setFavorito(favorito);
        Ser.setLegendado(legendado);
        Ser.setNome(nome);
        //Ser.setNota(iCT);

        Insert_Banco insert = new Insert_Banco();
        insert.Insert_Series(Ser, iS, iC, iE, iN);

        getIdSerie(Ser);
        // getIdCategoria();

    }

    private void getIdSerie(Series Ser) {
        Select_Banco select = new Select_Banco();
        select.Select_Series(Ser);
        System.out.println(Ser.getId());
    }

    private void addIdCategoria() {
        int x=cb_Categoria.getSelectedIndex();
        if(x != 0){
        lista.addElement(cb_Categoria.getSelectedItem());
        lt_Categoria.setModel(lista);
        cb_Categoria.removeItem(cb_Categoria.getSelectedItem());  
        }
        
    }

    private void removCategorias() {

        ListModel<String> obj = lt_Categoria.getModel();
        List<String> r = new ArrayList<String>();
        for (int i = 0; i < obj.getSize(); i++) {

            String a = obj.getElementAt(i);
            String b = lt_Categoria.getSelectedValue();

            if (!a.equalsIgnoreCase(b)) {
                r.add(a);
            }

        }

        DefaultListModel resposta = new DefaultListModel();

        for (String x : r) {
            resposta.addElement(x);
        }

        if (resposta.size() > 0) {
            lt_Categoria.setModel(resposta);
        } else {
            DefaultListModel vazio = new DefaultListModel();
            lt_Categoria.setModel(vazio);

        }

        cb_Categoria.removeAllItems();
        

        for (int i = 0; i < lista_Categoria.size(); i++) {
            String v = lista_Categoria.get(i).nome_Categoria;

            if (resposta.size() > 0) {
                for (int l = 0; l < resposta.size(); l++) {
                    String y = resposta.get(l).toString();

                    if (!y.equalsIgnoreCase(v)) {
                        cb_Categoria.addItem(lista_Categoria.get(i).nome_Categoria);
                        break;
                    }
                }
            } else {
                cb_Categoria.addItem(lista_Categoria.get(i).nome_Categoria);
            }

        }

    }
}
