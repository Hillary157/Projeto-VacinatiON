/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Atendentes;
import model.dao.DAOAtd;

/**
 *
 * @author vinic
 */
public class GerenciadorAtd extends javax.swing.JFrame {

    /**
     * Creates new form GerenciadoAtd
     */
    public GerenciadorAtd() {
        initComponents();
        setLocationRelativeTo(null);
        readTable();
    }
    public void readTable (){
        
        
        DefaultTableModel modelo = (DefaultTableModel) jTAtd.getModel();
        modelo.setNumRows(0);
        DAOAtd daoatd = new DAOAtd();
        
        for (Atendentes atd: daoatd.listar()){
            
            modelo.addRow(new Object[]{
                    atd.getId(),
                    atd.getNome(),
                    atd.getIdade(),
                    atd.getEndereco(),
                    atd.getCpf(),
                    atd.getSenha()
            });
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTAtd = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdAtd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNomeAtd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        adicionarAtdButton = new javax.swing.JButton();
        atualizarAtdButton = new javax.swing.JButton();
        removerAtdButton = new javax.swing.JButton();
        sairAtdButton = new javax.swing.JButton();
        txtSenhaAtd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIdadeAtd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEnderecoAtd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFCpfAtd = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTAtd.setBackground(new java.awt.Color(153, 153, 153));
        jTAtd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Idade", "Endereço", "CPF", "Senha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTAtd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTAtdMouseClicked(evt);
            }
        });
        jTAtd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTAtdKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTAtd);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(110, 390, 700, 200);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gerenciador de Atendentes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("ID");

        txtIdAtd.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Nome");

        txtNomeAtd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeAtdKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Senha");

        adicionarAtdButton.setBackground(new java.awt.Color(102, 51, 255));
        adicionarAtdButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        adicionarAtdButton.setIcon(new javax.swing.ImageIcon("F:\\dowloads\\icons projeto\\user_add.png")); // NOI18N
        adicionarAtdButton.setText("Adicionar");
        adicionarAtdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarAtdButtonActionPerformed(evt);
            }
        });

        atualizarAtdButton.setBackground(new java.awt.Color(102, 51, 255));
        atualizarAtdButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        atualizarAtdButton.setIcon(new javax.swing.ImageIcon("F:\\dowloads\\icons projeto\\user_edit.png")); // NOI18N
        atualizarAtdButton.setText("Atualizar");
        atualizarAtdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarAtdButtonActionPerformed(evt);
            }
        });

        removerAtdButton.setBackground(new java.awt.Color(102, 51, 255));
        removerAtdButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        removerAtdButton.setIcon(new javax.swing.ImageIcon("F:\\dowloads\\icons projeto\\user_delete.png")); // NOI18N
        removerAtdButton.setText("Remover");
        removerAtdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerAtdButtonActionPerformed(evt);
            }
        });

        sairAtdButton.setBackground(new java.awt.Color(102, 51, 255));
        sairAtdButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        sairAtdButton.setIcon(new javax.swing.ImageIcon("F:\\dowloads\\icons projeto\\arrow_undo.png")); // NOI18N
        sairAtdButton.setText("Sair");
        sairAtdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairAtdButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Idade");

        txtIdadeAtd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdadeAtdKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Endereço");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("CPF");

        try {
            txtFCpfAtd.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(txtIdAtd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeAtd, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGap(240, 240, 240))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtEnderecoAtd)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(101, 101, 101))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtFCpfAtd)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtIdadeAtd, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(82, 82, 82)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtSenhaAtd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(adicionarAtdButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(atualizarAtdButton)
                                .addGap(18, 18, 18)
                                .addComponent(removerAtdButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sairAtdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnderecoAtd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdAtd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFCpfAtd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeAtd))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdadeAtd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtSenhaAtd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionarAtdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atualizarAtdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removerAtdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sairAtdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(110, 30, 704, 355);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\vinic\\Downloads\\3722529_1.jpg")); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(-40, -10, 980, 680);

        setBounds(0, 0, 933, 664);
    }// </editor-fold>//GEN-END:initComponents

    private void jTAtdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTAtdMouseClicked
        if (jTAtd.getSelectedRow() != -1 ){

            txtIdAtd.setText(jTAtd.getValueAt(jTAtd.getSelectedRow(), 0).toString());
            txtNomeAtd.setText(jTAtd.getValueAt(jTAtd.getSelectedRow(), 1).toString());
            txtIdadeAtd.setText(jTAtd.getValueAt(jTAtd.getSelectedRow(), 2).toString());
            txtEnderecoAtd.setText(jTAtd.getValueAt(jTAtd.getSelectedRow(), 3).toString());
            txtFCpfAtd.setText(jTAtd.getValueAt(jTAtd.getSelectedRow(), 4).toString());
            txtSenhaAtd.setText(jTAtd.getValueAt(jTAtd.getSelectedRow(), 5).toString());
        }else {
            JOptionPane.showMessageDialog(null, "Selecione um Administrador para atualizar");
        }
    }//GEN-LAST:event_jTAtdMouseClicked

    private void jTAtdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTAtdKeyReleased

    }//GEN-LAST:event_jTAtdKeyReleased

    private void txtNomeAtdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeAtdKeyTyped

    }//GEN-LAST:event_txtNomeAtdKeyTyped

    private void adicionarAtdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarAtdButtonActionPerformed
        String nomeAdm = txtNomeAtd.getText();
        String idadeAdm = txtIdadeAtd.getText();
        String enderecoAdm = txtEnderecoAtd.getText();
        String cpfAdm = txtFCpfAtd.getText();
        String senhaAdm = txtSenhaAtd.getText();

        if (nomeAdm == null || nomeAdm.length() == 0
            || enderecoAdm.length() == 0 || enderecoAdm == null
            || idadeAdm.length() == 0 || idadeAdm == null
            || cpfAdm.length() == 0 || cpfAdm == null
            || senhaAdm.length() == 0 || senhaAdm == null){
            JOptionPane.showMessageDialog(null, "Por favor, preencha os campos corretamente");
        }
        else{
            Atendentes atd = new Atendentes();
            DAOAtd daoatd = new DAOAtd();
            
            atd.setNome(txtNomeAtd.getText());
            atd.setSenha(txtSenhaAtd.getText());
            atd.setIdade(Integer.parseInt(txtIdadeAtd.getText()));
            atd.setEndereco(txtEnderecoAtd.getText());
            atd.setCpf(txtFCpfAtd.getText());
            
            daoatd.inserirAtendentes(atd);

            txtIdAtd.setText("");
            txtNomeAtd.setText("");
            txtSenhaAtd.setText("");
            txtIdadeAtd.setText("");
            txtEnderecoAtd.setText("");
            txtFCpfAtd.setText("");

            readTable();

        }
    }//GEN-LAST:event_adicionarAtdButtonActionPerformed

    private void atualizarAtdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarAtdButtonActionPerformed
        if (jTAtd.getSelectedRow() != -1 ){

            Atendentes atd = new Atendentes();
            DAOAtd daoatd = new DAOAtd();

            atd.setNome(txtNomeAtd.getText());
            atd.setSenha(txtSenhaAtd.getText());
            atd.setIdade(Integer.parseInt(txtIdadeAtd.getText()));
            atd.setEndereco(txtEnderecoAtd.getText());
            atd.setCpf(txtFCpfAtd.getText());
            atd.setId((int)jTAtd.getValueAt(jTAtd.getSelectedRow(), 0));

            daoatd.atualizarAtendentes(atd);

            txtIdAtd.setText("");
            txtNomeAtd.setText("");
            txtSenhaAtd.setText("");
            txtIdadeAtd.setText("");
            txtEnderecoAtd.setText("");
            txtFCpfAtd.setText("");

            readTable();
        }else {
            JOptionPane.showMessageDialog(null, "Selecione um Administrador para atualizar");
        }
    }//GEN-LAST:event_atualizarAtdButtonActionPerformed

    private void removerAtdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerAtdButtonActionPerformed
        if (jTAtd.getSelectedRow() != -1 ){
        
        int escolha = JOptionPane.showConfirmDialog(null, "Deseja Remover?", "Remover?", JOptionPane.YES_NO_OPTION);
        switch (escolha){
            default :
                JOptionPane.showMessageDialog(null, "O Administrador nao sera excluido.");
                break;
                
            case JOptionPane.YES_OPTION :
                try{
                    Atendentes atd = new Atendentes();
                    DAOAtd daoatd = new DAOAtd();
                    
                    atd.setId((int)jTAtd.getValueAt(jTAtd.getSelectedRow(), 0));
                    
                    daoatd.excluirAtendentes(atd);
                    JOptionPane.showMessageDialog(null, "Administrador removido!");
                    
                    txtIdAtd.setText("");
                    txtNomeAtd.setText("");
                    txtSenhaAtd.setText("");
                    txtIdadeAtd.setText("");
                    txtEnderecoAtd.setText("");
                    txtFCpfAtd.setText("");

                    readTable();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Sistema indisponivel, tente novamente mais tarde.");
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Selecione um Administrador.");
        }
        
    }//GEN-LAST:event_removerAtdButtonActionPerformed

    private void sairAtdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairAtdButtonActionPerformed
        int escolha = JOptionPane.showConfirmDialog(null, "Deseja Sair?", "Sair?", JOptionPane.YES_NO_OPTION);
        switch (escolha){
            default :
            JOptionPane.showMessageDialog(null, "Acao cancelada.");
            break;
            
            case JOptionPane.YES_OPTION :
        this.dispose();

        TelaPrincipalAdm tpa = new TelaPrincipalAdm();
        tpa.setVisible(true);
        }
    }//GEN-LAST:event_sairAtdButtonActionPerformed

    private void txtIdadeAtdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdadeAtdKeyTyped
        char TestChar = evt.getKeyChar();
        if(!(Character.isDigit(TestChar)))
        evt.consume();
    }//GEN-LAST:event_txtIdadeAtdKeyTyped

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
            java.util.logging.Logger.getLogger(GerenciadorAtd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciadorAtd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciadorAtd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciadorAtd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciadorAtd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarAtdButton;
    private javax.swing.JButton atualizarAtdButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTAtd;
    private javax.swing.JButton removerAtdButton;
    private javax.swing.JButton sairAtdButton;
    private javax.swing.JTextField txtEnderecoAtd;
    private javax.swing.JFormattedTextField txtFCpfAtd;
    private javax.swing.JTextField txtIdAtd;
    private javax.swing.JTextField txtIdadeAtd;
    private javax.swing.JTextField txtNomeAtd;
    private javax.swing.JTextField txtSenhaAtd;
    // End of variables declaration//GEN-END:variables
}
