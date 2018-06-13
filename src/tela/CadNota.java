/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tela;

import dao.AlunoDAO;
import dao.MateriaDAO;
import dao.NotaDAO;
import entidade.Aluno;
import entidade.Materia;
import entidade.Nota;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KSL
 */
public class CadNota extends javax.swing.JFrame {

    /** Creates new form CadNota */
    public CadNota() 
    {
        initComponents();
        
        CarregarNotas();
        CarregarDisciplina();
    }

   public void CarregarNotas()
    {
        try
        {
            for(Aluno a : new AlunoDAO().todosAlunos())
            {
                cbAluno.addItem(a);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Erro: " + ex.getMessage());
        }
    }
   public void CarregarDisciplina()
    {
        try
        {
            for(Materia m : new MateriaDAO().todasMaterias())
            {
                cbMateria.addItem(m);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Erro: " + ex.getMessage());
        }
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNota1 = new javax.swing.JLabel();
        cbAluno = new javax.swing.JComboBox<>();
        lbNomeAluno = new javax.swing.JLabel();
        lbMateria = new javax.swing.JLabel();
        cbMateria = new javax.swing.JComboBox<>();
        txtNota1 = new javax.swing.JTextField();
        txtPeso1 = new javax.swing.JTextField();
        lbPeso1 = new javax.swing.JLabel();
        lbNota2 = new javax.swing.JLabel();
        txtNota2 = new javax.swing.JTextField();
        lbPeso2 = new javax.swing.JLabel();
        txtPeso2 = new javax.swing.JTextField();
        lbMedia = new javax.swing.JLabel();
        txtMedia = new javax.swing.JTextField();
        lbNotaF = new javax.swing.JLabel();
        txtNotaF = new javax.swing.JTextField();
        lbMediaF = new javax.swing.JLabel();
        txtMediaF = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btCalMedia = new javax.swing.JButton();
        btCalMedF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbNota1.setText("Nota 1:");

        cbAluno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlunoActionPerformed(evt);
            }
        });

        lbNomeAluno.setText("Aluno:");

        lbMateria.setText("Matéria:");

        txtNota1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNota1ActionPerformed(evt);
            }
        });

        txtPeso1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbPeso1.setText("Peso 1:");

        lbNota2.setText("Nota 2:");

        txtNota2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbPeso2.setText("Peso 2:");

        txtPeso2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbMedia.setText("Média:");

        txtMedia.setEditable(false);
        txtMedia.setBackground(new java.awt.Color(204, 204, 204));
        txtMedia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbNotaF.setText("Nota Final:");

        txtNotaF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbMediaF.setText("Média Final:");

        txtMediaF.setEditable(false);
        txtMediaF.setBackground(new java.awt.Color(204, 204, 204));
        txtMediaF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btCalMedia.setText("Calcular Média");
        btCalMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalMediaActionPerformed(evt);
            }
        });

        btCalMedF.setText("Calcular Média Final");
        btCalMedF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalMedFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbNomeAluno)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbMateria)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbMateria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbNota1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbPeso1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPeso1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbNota2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbPeso2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPeso2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(btCalMedia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbMedia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbNotaF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNotaF, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btCalMedF)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbMediaF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMediaF, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNomeAluno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMateria))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNota1)
                    .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPeso1)
                    .addComponent(txtPeso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNota2)
                    .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPeso2)
                    .addComponent(txtPeso2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMedia)
                    .addComponent(txtMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCalMedia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNotaF)
                    .addComponent(txtNotaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCalMedF))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMediaF)
                            .addComponent(txtMediaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        // TODO add your handling code here:
        
        try{
        Nota nota = new Nota();
        nota.setFk_aluno((Aluno)cbAluno.getSelectedItem());
        nota.setFk_materia((Materia)cbMateria.getSelectedItem());
        nota.setNota1(Float.parseFloat(txtNota1.getText()));
        nota.setPeso1(Float.parseFloat(txtPeso1.getText()));
        nota.setNota2(Float.parseFloat(txtNota2.getText()));
        nota.setPeso2(Float.parseFloat(txtPeso2.getText()));
        nota.setMedia(Float.parseFloat(txtMedia.getText()));
        nota.setNotaf(Float.parseFloat(txtNotaF.getText()));
        nota.setMediaf(Float.parseFloat(txtMediaF.getText()));
        
        if(new NotaDAO().salvarNota(nota)){
             JOptionPane.showMessageDialog(this, "Notas salvas com sucesso!");
                    
                    Limpar();
                }
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Erro ao salvar Notas: "+ex.getMessage());
        }
        
        
        
    }//GEN-LAST:event_btSalvarActionPerformed

    private void cbAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlunoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbAlunoActionPerformed

    private void txtNota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNota1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNota1ActionPerformed

    private void btCalMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalMediaActionPerformed
        // TODO add your handling code here:
        float media,num1,num2,p1,p2;
        num1=Float.parseFloat(txtNota1.getText());
        p1 = Float.parseFloat(txtPeso1.getText());
        num2 = Float.parseFloat(txtNota2.getText());
        p2 = Float.parseFloat(txtPeso2.getText());
       
        media = (((num1*p1)+(num2*p2))/(p1+p2));
        
        txtMedia.setText(""+media);
    }//GEN-LAST:event_btCalMediaActionPerformed

    private void btCalMedFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalMedFActionPerformed
        // TODO add your handling code here:
        float num1,num2,p1,p2,notaf,mediaf;
        num1=Float.parseFloat(txtNota1.getText());
        p1 = Float.parseFloat(txtPeso1.getText());
        num2 = Float.parseFloat(txtNota2.getText());
        p2 = Float.parseFloat(txtPeso2.getText());
        notaf = Float.parseFloat(txtNotaF.getText());
        
        if(num1<num2){
        mediaf = (((notaf*p1)+(num2*p2))/(p1+p2));
        txtMediaF.setText(""+mediaf);
        }
        if(num2<num1){
            mediaf = (((num1*p1)+(notaf*p2))/(p1+p2));
        txtMedia.setText(""+mediaf);
        }
    }//GEN-LAST:event_btCalMedFActionPerformed

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
            java.util.logging.Logger.getLogger(CadNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadNota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadNota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalMedF;
    private javax.swing.JButton btCalMedia;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<Object> cbAluno;
    private javax.swing.JComboBox<Object> cbMateria;
    private javax.swing.JLabel lbMateria;
    private javax.swing.JLabel lbMedia;
    private javax.swing.JLabel lbMediaF;
    private javax.swing.JLabel lbNomeAluno;
    private javax.swing.JLabel lbNota1;
    private javax.swing.JLabel lbNota2;
    private javax.swing.JLabel lbNotaF;
    private javax.swing.JLabel lbPeso1;
    private javax.swing.JLabel lbPeso2;
    private javax.swing.JTextField txtMedia;
    private javax.swing.JTextField txtMediaF;
    private javax.swing.JTextField txtNota1;
    private javax.swing.JTextField txtNota2;
    private javax.swing.JTextField txtNotaF;
    private javax.swing.JTextField txtPeso1;
    private javax.swing.JTextField txtPeso2;
    // End of variables declaration//GEN-END:variables

    private void Limpar() {
        txtNota1.setText(""); 
        txtPeso1.setText(""); 
        txtNota2.setText(""); 
        txtPeso2.setText(""); 
        txtMedia.setText(""); 
        txtNotaF.setText(""); 
        txtMediaF.setText(""); 
    }

}
