
package view;

//import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Pacientes;
import model.bean.Utils;
import model.dao.DAOPct;

/**
 *
 * @author vinic
 */
public class GerenciadorPct extends javax.swing.JFrame {

    /**
     * Creates new form GerenciadorPct
     */
    public GerenciadorPct() {
        initComponents();
        setLocationRelativeTo(null);
        configurarDataFila();
        configurarPrioridade();
        readTable();       

        grupoSN.add(jRadioButtonNao);
        grupoSN.add(jRadioButtonSim);
    }
    public void configurarPrioridade(){
        txtPrioPct.setText("0");
    } 
    public void configurarDataFila(){
        Date data = new Date();     
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            txtFDataPct.setText(Utils.converter(data));
        } catch (Exception ex) {
            Logger.getLogger(filaDeVacinacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
     public void readTable (){
        
        
        DefaultTableModel modelo = (DefaultTableModel) jTPct.getModel();
        modelo.setNumRows(0);
        DAOPct daopct = new DAOPct();
        
        for (Pacientes pct: daopct.listar()){
            
            try {
                modelo.addRow(new Object[]{
                    pct.getId(),
                    pct.getNome(),
                    pct.getIdade(),
                    pct.isProfissao(),
                    pct.getEndereco()
                    
                });
            } catch (Exception ex) {
                Logger.getLogger(GerenciadorPct.class.getName()).log(Level.SEVERE, null, ex);
            }
            
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

        grupoSN = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        adicionarPctButton = new javax.swing.JButton();
        atualizarPctButton = new javax.swing.JButton();
        removerPctButton = new javax.swing.JButton();
        cancelarPctButton = new javax.swing.JButton();
        txtIdadePct = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtIdPct = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNomePct = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButtonSim = new javax.swing.JRadioButton();
        jRadioButtonNao = new javax.swing.JRadioButton();
        txtEnderecoPct = new javax.swing.JTextField();
        txtFDataPct = new javax.swing.JFormattedTextField();
        txtPrioPct = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPct = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gerenciador de Pacientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Idade");

        adicionarPctButton.setBackground(new java.awt.Color(102, 51, 255));
        adicionarPctButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        adicionarPctButton.setIcon(new javax.swing.ImageIcon("F:\\dowloads\\icons projeto\\group_add.png")); // NOI18N
        adicionarPctButton.setText("Adicionar");
        adicionarPctButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarPctButtonActionPerformed(evt);
            }
        });

        atualizarPctButton.setBackground(new java.awt.Color(102, 51, 255));
        atualizarPctButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        atualizarPctButton.setIcon(new javax.swing.ImageIcon("F:\\dowloads\\icons projeto\\group_edit.png")); // NOI18N
        atualizarPctButton.setText("Atualizar");
        atualizarPctButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarPctButtonActionPerformed(evt);
            }
        });

        removerPctButton.setBackground(new java.awt.Color(102, 51, 255));
        removerPctButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        removerPctButton.setIcon(new javax.swing.ImageIcon("F:\\dowloads\\icons projeto\\group_delete.png")); // NOI18N
        removerPctButton.setText("Remover");
        removerPctButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerPctButtonActionPerformed(evt);
            }
        });

        cancelarPctButton.setBackground(new java.awt.Color(102, 51, 255));
        cancelarPctButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cancelarPctButton.setIcon(new javax.swing.ImageIcon("F:\\dowloads\\icons projeto\\arrow_undo.png")); // NOI18N
        cancelarPctButton.setText("Sair");
        cancelarPctButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarPctButtonActionPerformed(evt);
            }
        });

        txtIdadePct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdadePctActionPerformed(evt);
            }
        });
        txtIdadePct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdadePctKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("ID");

        txtIdPct.setEditable(false);
        txtIdPct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdPctKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Nome");

        txtNomePct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomePctKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Profissão relacionada a area de saúde?");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Endereço");

        jRadioButtonSim.setBackground(new java.awt.Color(153, 153, 153));
        jRadioButtonSim.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jRadioButtonSim.setText("Sim");
        jRadioButtonSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSimActionPerformed(evt);
            }
        });

        jRadioButtonNao.setBackground(new java.awt.Color(153, 153, 153));
        jRadioButtonNao.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jRadioButtonNao.setText("Não");
        jRadioButtonNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNaoActionPerformed(evt);
            }
        });

        try {
            txtFDataPct.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtPrioPct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrioPctActionPerformed(evt);
            }
        });
        txtPrioPct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrioPctKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtIdadePct, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(txtIdPct, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 264, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNomePct)
                                .addGap(55, 55, 55)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtEnderecoPct, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButtonSim)
                                .addGap(53, 53, 53)
                                .addComponent(jRadioButtonNao))
                            .addComponent(jLabel4))
                        .addGap(11, 11, 11))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(txtPrioPct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(txtFDataPct, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adicionarPctButton)
                .addGap(18, 18, 18)
                .addComponent(atualizarPctButton)
                .addGap(18, 18, 18)
                .addComponent(removerPctButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelarPctButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtFDataPct, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrioPct, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIdPct, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnderecoPct))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 20, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jRadioButtonNao)
                            .addComponent(jRadioButtonSim))
                        .addGap(22, 22, 22)
                        .addComponent(txtIdadePct, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adicionarPctButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(atualizarPctButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removerPctButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelarPctButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNomePct, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(110, 30, 650, 350);

        jTPct.setBackground(new java.awt.Color(153, 153, 153));
        jTPct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Idade", "Profissão", "Endereço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTPct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTPctMouseClicked(evt);
            }
        });
        jTPct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTPctKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTPct);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(110, 380, 650, 260);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\vinic\\Downloads\\3722529_1.jpg")); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(-110, 0, 1000, 680);

        setBounds(0, 0, 895, 708);
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarPctButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarPctButtonActionPerformed
        String nomePct = txtNomePct.getText();
        String idadePct = txtIdadePct.getText();
        String enderecoPct = txtEnderecoPct.getText();
        
            if (nomePct == null || idadePct.length() == 0 || idadePct.length() == 0 || enderecoPct == null){
                JOptionPane.showMessageDialog(null, "Por favor, preencha os campos corretamente");                 
            }
            else{
                Pacientes pct = new Pacientes();
                DAOPct daopct = new DAOPct();


                pct.setNome(txtNomePct.getText());
                pct.setIdade(Integer.parseInt(txtIdadePct.getText()));
                pct.setProfissao(jRadioButtonSim.isSelected());
                pct.setProfissao(jRadioButtonNao.isSelected());
                    if(jRadioButtonSim.isSelected()){
                        pct.profissao = true;
                    }

                    else if (jRadioButtonNao.isSelected()){
                        pct.profissao = false;
                    }               
                pct.setEndereco(txtEnderecoPct.getText());
                pct.setPrioridade(Integer.parseInt(txtPrioPct.getText()));
                    if (pct.idade >= 70){
                        pct.prioridade = 1;
                    }

                    else if (pct.profissao == true){
                        pct.prioridade = 2 ;
                    }
                    else {
                        pct.prioridade = 3;     
                    }              
                try {
                    pct.setDataa(Utils.converter(txtFDataPct.getText()));
                } 
                catch (Exception e) {
                    JOptionPane.showConfirmDialog(null, "Sistema indisponivel tente novamente mais tarde.");
                    e.printStackTrace();
                }
                daopct.inserirPacientes(pct);

                txtIdPct.setText("");
                txtNomePct.setText("");
                txtIdadePct.setText("");
                txtEnderecoPct.setText("");              

                readTable();
        }
    }//GEN-LAST:event_adicionarPctButtonActionPerformed

    private void atualizarPctButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarPctButtonActionPerformed
               
        if (jTPct.getSelectedRow() != -1 ){ 
            
            Pacientes pct = new Pacientes();
            DAOPct daopct = new DAOPct();
            
            pct.setId((int)jTPct.getValueAt(jTPct.getSelectedRow(), 0));
            pct.setNome(txtNomePct.getText());
            pct.setIdade(Integer.parseInt(txtIdadePct.getText()));
            pct.setEndereco(txtEnderecoPct.getText());
            pct.setProfissao(jRadioButtonSim.isSelected());
            pct.setProfissao(jRadioButtonNao.isSelected());            
            if(jRadioButtonSim.isSelected()){
            pct.profissao = true;
            }           
            else if (jRadioButtonNao.isSelected()){
            pct.profissao = false;
            }
            pct.setPrioridade(Integer.parseInt(txtPrioPct.getText()));
            if (pct.idade >= 70){
                pct.prioridade = 1;
            }
           
            else if (pct.profissao == true){
                pct.prioridade = 2 ;
            }
            else {
                pct.prioridade = 3;     
            }              
            daopct.atualizarPacientes(pct);

            txtIdPct.setText("");
            txtNomePct.setText("");
            txtIdadePct.setText("");
            txtEnderecoPct.setText("");
            
            readTable();
        }else {
            JOptionPane.showMessageDialog(null, "Selecione um Paciente para atualizar!");
            
            }
    }//GEN-LAST:event_atualizarPctButtonActionPerformed

    private void removerPctButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerPctButtonActionPerformed
        if (jTPct.getSelectedRow() != -1 ){ 
        
        int escolha = JOptionPane.showConfirmDialog(null, "Deseja Remover?", "Remover?", JOptionPane.YES_NO_OPTION);
        switch (escolha){
            default :
                JOptionPane.showMessageDialog(null, "O paciente nao sera excluido.");
                break;
            case JOptionPane.YES_OPTION :
                try{
                    Pacientes pct = new Pacientes();
                    DAOPct daopct = new DAOPct();
                    
                    pct.setId((int)jTPct.getValueAt(jTPct.getSelectedRow(), 0));

                    daopct.excluirPacientes(pct);

                    JOptionPane.showMessageDialog(null, "Paciente removido!");
                    txtIdPct.setText("");
                    txtNomePct.setText("");
                    txtIdadePct.setText("");
                    txtEnderecoPct.setText("");
                    readTable();
                } 
                catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Sistema indisponivel, tente novamente mais tarde.");
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Selecione um Paciente para remover!");
            }
    }//GEN-LAST:event_removerPctButtonActionPerformed

    private void cancelarPctButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarPctButtonActionPerformed
        int escolha = JOptionPane.showConfirmDialog(null, "Deseja Sair?", "Sair?", JOptionPane.YES_NO_OPTION);
        switch (escolha){
            default :
            JOptionPane.showMessageDialog(null, "Acao cancelada.");
            break;
            case JOptionPane.YES_OPTION :
        this.dispose();
        
        TelaPrincipalAdm tadm = new TelaPrincipalAdm();
        tadm.setVisible(true);
        }
    }//GEN-LAST:event_cancelarPctButtonActionPerformed

    private void txtIdadePctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdadePctActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdadePctActionPerformed

    private void jTPctMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTPctMouseClicked
        
        if (jTPct.getSelectedRow() != -1 ){

            txtIdPct.setText(jTPct.getValueAt(jTPct.getSelectedRow(), 0).toString());
            txtNomePct.setText(jTPct.getValueAt(jTPct.getSelectedRow(), 1).toString());
            txtIdadePct.setText(jTPct.getValueAt(jTPct.getSelectedRow(), 2).toString());
            txtEnderecoPct.setText(jTPct.getValueAt(jTPct.getSelectedRow(), 4).toString());
        }else {
            JOptionPane.showMessageDialog(null, "Selecione um Paciente!");
        }
    }//GEN-LAST:event_jTPctMouseClicked

    private void jTPctKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTPctKeyReleased
        
    }//GEN-LAST:event_jTPctKeyReleased

    private void jRadioButtonSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSimActionPerformed
       
    }//GEN-LAST:event_jRadioButtonSimActionPerformed

    private void txtIdadePctKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdadePctKeyTyped
        char TestChar = evt.getKeyChar();
        if(!(Character.isDigit(TestChar)))
            evt.consume();
    }//GEN-LAST:event_txtIdadePctKeyTyped

    private void txtNomePctKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomePctKeyTyped
       
    }//GEN-LAST:event_txtNomePctKeyTyped

    private void txtIdPctKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdPctKeyReleased
    }//GEN-LAST:event_txtIdPctKeyReleased

    private void txtPrioPctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrioPctActionPerformed
        
    }//GEN-LAST:event_txtPrioPctActionPerformed

    private void txtPrioPctKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrioPctKeyTyped

        
    }//GEN-LAST:event_txtPrioPctKeyTyped

    private void jRadioButtonNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonNaoActionPerformed

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
            java.util.logging.Logger.getLogger(GerenciadorPct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciadorPct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciadorPct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciadorPct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciadorPct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarPctButton;
    private javax.swing.JButton atualizarPctButton;
    private javax.swing.JButton cancelarPctButton;
    private javax.swing.ButtonGroup grupoSN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonNao;
    private javax.swing.JRadioButton jRadioButtonSim;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTPct;
    private javax.swing.JButton removerPctButton;
    private javax.swing.JTextField txtEnderecoPct;
    private javax.swing.JFormattedTextField txtFDataPct;
    private javax.swing.JTextField txtIdPct;
    private javax.swing.JTextField txtIdadePct;
    private javax.swing.JTextField txtNomePct;
    private javax.swing.JTextField txtPrioPct;
    // End of variables declaration//GEN-END:variables
}
