/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.VIEW;

import br.com.DAO.AgendaDAO;
import br.com.DTO.AgendaDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author W10
 */
public class TelaAgenda extends javax.swing.JFrame {

    /**
     * Creates new form TelaAgenda
     */
    public TelaAgenda() {
        initComponents();
        AgendaDAO dao = new AgendaDAO();
        dao.AutoPesquisar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAgenda = new javax.swing.JTable();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNomeCli = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        txtDia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        txtMin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        btnCriar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Agenda De Clientes");

        tbAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "data", "hora", "descrição", "cliente"
            }
        ));
        jScrollPane1.setViewportView(tbAgenda);

        txtId.setBackground(new java.awt.Color(0, 0, 0));
        txtId.setForeground(new java.awt.Color(51, 255, 255));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel2.setText("Id");

        txtNomeCli.setBackground(new java.awt.Color(0, 0, 0));
        txtNomeCli.setForeground(new java.awt.Color(51, 255, 255));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel3.setText("Nome do cliente");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel4.setText("Data");

        txtAno.setBackground(new java.awt.Color(0, 0, 0));
        txtAno.setForeground(new java.awt.Color(51, 255, 255));

        txtMes.setBackground(new java.awt.Color(0, 0, 0));
        txtMes.setForeground(new java.awt.Color(51, 255, 255));

        txtDia.setBackground(new java.awt.Color(0, 0, 0));
        txtDia.setForeground(new java.awt.Color(51, 255, 255));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel5.setText("Horário");

        txtHora.setBackground(new java.awt.Color(0, 0, 0));
        txtHora.setForeground(new java.awt.Color(51, 255, 255));

        txtMin.setBackground(new java.awt.Color(0, 0, 0));
        txtMin.setForeground(new java.awt.Color(51, 255, 255));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel6.setText("Descrição");

        txtDesc.setBackground(new java.awt.Color(0, 0, 0));
        txtDesc.setForeground(new java.awt.Color(51, 255, 255));

        btnCriar.setBackground(new java.awt.Color(51, 255, 0));
        btnCriar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1564491_add_create_new_plus_icon.png"))); // NOI18N
        btnCriar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(0, 204, 204));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        btnEditar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnDeletar.setBackground(new java.awt.Color(255, 0, 51));
        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        btnDeletar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 153, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/voltar.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap(146, Short.MAX_VALUE)
                            .addComponent(btnCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addGap(18, 18, 18))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel2)
                                    .addGap(26, 26, 26)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtMin))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNomeCli, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCriar)
                    .addComponent(btnDeletar)
                    .addComponent(jButton1)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarActionPerformed
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Atribua um id a agenda");
        } else if (txtNomeCli.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Atribua um cliente a agenda");
        } else if (txtAno.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira um ano");
        } else if (txtMes.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira um mês");
        } else if (txtDia.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira um dia");
        } else if (txtHora.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira uma hora");
        } else if (txtMin.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira uma minutagem");
        } else {

            int id = Integer.parseInt(txtId.getText());
            String nomeCli = txtNomeCli.getText();
            String d, m, a, hor, min;
            d = txtDia.getText();
            m = txtMes.getText();
            a = txtAno.getText();
            hor = txtHora.getText();
            min = txtMin.getText();
            String data = a + "-" + m + "-" + d;
            String hora = hor + ":" + min + ":00";
            String desc = txtDesc.getText();

            AgendaDTO dto = new AgendaDTO();
            dto.setId(id);
            dto.setNome_cli(nomeCli);
            dto.setData(data);
            dto.setHora(hora);
            dto.setDescricao(desc);

            AgendaDAO dao = new AgendaDAO();
            dao.adicionar(dto);

            dao.AutoPesquisar();
        }
    }//GEN-LAST:event_btnCriarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Atribua um id a agenda");
        } else if (txtNomeCli.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Atribua um cliente a agenda");
        } else if (txtAno.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira um ano");
        } else if (txtMes.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira um mês");
        } else if (txtDia.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira um dia");
        } else if (txtHora.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira uma hora");
        } else if (txtMin.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira uma minutagem");
        } else {
            AgendaDAO dao = new AgendaDAO();
            AgendaDTO dto = new AgendaDTO();

            int id = Integer.parseInt(txtId.getText());
            String nomeCli = txtNomeCli.getText();
            String d, m, a, hor, min;
            d = txtDia.getText();
            m = txtMes.getText();
            a = txtAno.getText();
            hor = txtHora.getText();
            min = txtMin.getText();
            String data = a + "-" + m + "-" + d;
            String hora = hor + ":" + min + ":00";
            String desc = txtDesc.getText();

            dto.setId(id);
            dto.setNome_cli(nomeCli);
            dto.setData(data);
            dto.setHora(hora);
            dto.setDescricao(desc);

            dao.atualizar(dto);

            dao.AutoPesquisar();

        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira o id de um evento a ser deletado");
        } else {

            AgendaDAO dao = new AgendaDAO();
            AgendaDTO dto = new AgendaDTO();

            int id = Integer.parseInt(txtId.getText());
            dto.setId(id);
            dao.deletar(dto);

            dao.AutoPesquisar();
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int res = JOptionPane.showConfirmDialog(null, "tem certeza de que quer voltar para o menu?", null, JOptionPane.YES_NO_OPTION);

        if (res == JOptionPane.YES_OPTION) {
            Principal pri= new Principal();
            pri.setVisible(true);
            this.dispose();
        }
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
            java.util.logging.Logger.getLogger(TelaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAgenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tbAgenda;
    public static javax.swing.JTextField txtAno;
    public static javax.swing.JTextField txtDesc;
    public static javax.swing.JTextField txtDia;
    public static javax.swing.JTextField txtHora;
    public static javax.swing.JTextField txtId;
    public static javax.swing.JTextField txtMes;
    public static javax.swing.JTextField txtMin;
    public static javax.swing.JTextField txtNomeCli;
    // End of variables declaration//GEN-END:variables
}