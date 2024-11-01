package View;

import Model.Professor;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GerenciaProfessor extends javax.swing.JFrame {
    
    private Professor objProf;

    public GerenciaProfessor() {
        initComponents();
        this.objProf = new Professor();
        this.carregaTabela();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        c_nome = new javax.swing.JTextField();
        c_idade = new javax.swing.JTextField();
        c_titulo = new javax.swing.JTextField();
        c_formacao = new javax.swing.JTextField();
        b_cancelar = new javax.swing.JButton();
        b_alterar = new javax.swing.JButton();
        b_apagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Idade", "Título", "Formação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(30);
            jTable1.getColumnModel().getColumn(1).setMinWidth(200);
            jTable1.getColumnModel().getColumn(2).setMinWidth(30);
            jTable1.getColumnModel().getColumn(3).setMinWidth(100);
        }

        jLabel1.setText("Nome:");

        jLabel2.setText("Idade:");

        jLabel3.setText("Título:");

        jLabel4.setText("Formação:");

        c_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_nomeActionPerformed(evt);
            }
        });

        b_cancelar.setText("Cancelar");
        b_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cancelarActionPerformed(evt);
            }
        });

        b_alterar.setText("Alterar");
        b_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_alterarActionPerformed(evt);
            }
        });

        b_apagar.setText("Apagar");
        b_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_apagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(c_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(c_idade, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(c_formacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(b_cancelar)
                        .addGap(35, 35, 35)
                        .addComponent(b_alterar)
                        .addGap(27, 27, 27)
                        .addComponent(b_apagar)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(c_idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(c_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_formacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_cancelar)
                    .addComponent(b_alterar)
                    .addComponent(b_apagar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void c_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_nomeActionPerformed

    private void b_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_apagarActionPerformed
        try{
            int id = 0;
            if(this.jTable1.getSelectedRow() == -1){
                throw new Mensagens("Primeiro Selecione um PROFESSOR para APAGAR");
                
            }else{
                id = Integer.parseInt(this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 0).toString());
            }
            
            int resposta_usuario = JOptionPane.showConfirmDialog(null, "Tem certeza que dejesa APAGAR esse PROFESSOR?");
         
            if(resposta_usuario == 0){
             if(this.objProf.deleteProfessorBD(id)){
                 
                 this.c_nome.setText("");
                 this.c_idade.setText("");
                 this.c_formacao.setText("");
                 this.c_titulo.setText("");
                 JOptionPane.showMessageDialog(null, "Professor apagado com sucesso!");
             }   
            }
        }catch(Mensagens erro){
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }finally{
            carregaTabela();
        }
    }//GEN-LAST:event_b_apagarActionPerformed

    private void b_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_b_cancelarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if(this.jTable1.getSelectedRow() != -1){
            
            String nome = this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 1).toString();
            String idade = this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 2).toString();
            String formacao = this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 3).toString();
            String titulo = this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 4).toString();
            
            this.c_nome.setText(nome);
            this.c_idade.setText(idade);
            this.c_formacao.setText(formacao);
            this.c_titulo.setText(titulo);
            
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void b_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_alterarActionPerformed
        try{
            int id = 0;
            String nome = "";
            int idade = 0;
            String formacao = "";
            String titulo = "";
            
            if(this.c_nome.getText().length() < 2){
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
                
            }else{
                nome = this.c_nome.getText();
            }
            
            if(this.c_idade.getText().length() <= 0){
                throw new Mensagens("Idade deve ser número e maior que zero.");
                
            }else{
                idade = Integer.parseInt(this.c_idade.getText());
                
            }
            
            if(this.c_formacao.getText().length() < 4){
                throw new Mensagens("Formação deve conte no mínimo 4 caracteres.");
            
            }else{
                formacao = this.c_formacao.getText();
                
            }
            
            if(this.c_titulo.getText().length() < 3){
                throw new Mensagens("Título deve conter no minímo 3 caracteres.");
                
            }else{
                titulo = this.c_titulo.getText();
                
            }
            
            if(this.jTable1.getSelectedRow() == -1){
                throw new Mensagens("Primeiro Selecione um Professor para Alterar");
            
            }else{
                id = Integer.parseInt(this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 0).toString());
                
            }
            
            if(this.objProf.updateProfessorBD(titulo, formacao, id, nome, idade)){
                this.c_nome.setText("");
                this.c_idade.setText("");
                this.c_formacao.setText("");
                this.c_titulo.setText("");
                JOptionPane.showMessageDialog(null, "PROFESSOR alterado com sucesso!");
                
            }
            
        }catch(Mensagens erro){
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }catch(NumberFormatException error2){
            JOptionPane.showMessageDialog(null, "Informe um número");
        }finally{
            carregaTabela();
        }
    }//GEN-LAST:event_b_alterarActionPerformed
    
    public void carregaTabela(){
        
        DefaultTableModel modelo = (DefaultTableModel) this.jTable1.getModel();
        modelo.setNumRows(0);
        
        ArrayList<Professor>MinhaLista = new ArrayList<>();
        MinhaLista = objProf.getMinhaLista();
        
        for(Professor a : MinhaLista){
            modelo.addRow(new Object[]{
                    a.getId(),
                    a.getNome(),
                    a.getIdade(),
                    a.getFormacao(),
                    a.getTitulo()
            });
        }
    }
 
    public static void main(String args[]) {
  
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GerenciaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciaProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_alterar;
    private javax.swing.JButton b_apagar;
    private javax.swing.JButton b_cancelar;
    private javax.swing.JTextField c_formacao;
    private javax.swing.JTextField c_idade;
    private javax.swing.JTextField c_nome;
    private javax.swing.JTextField c_titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
