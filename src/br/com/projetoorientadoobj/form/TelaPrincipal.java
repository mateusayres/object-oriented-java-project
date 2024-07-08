/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoorientadoobj.form;

/**
 *
 * @author Sr. Ayres
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        cadastro = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        PainelPrincipal = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        botaoAluno = new javax.swing.JButton();
        botaoProfessor = new javax.swing.JButton();
        descAluno = new javax.swing.JLabel();
        DescProf = new javax.swing.JLabel();
        Vercao = new javax.swing.JLabel();
        BotaoSair = new javax.swing.JButton();
        botaoCalcularMedia = new javax.swing.JButton();
        descAluno1 = new javax.swing.JLabel();
        descAluno2 = new javax.swing.JLabel();
        DescProf1 = new javax.swing.JLabel();
        descAluno3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        cadastro.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        cadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cadastro.setText("Cadastro");

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Selecione:");

        botaoAluno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoAluno.setText("Aluno");
        botaoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlunoActionPerformed(evt);
            }
        });

        botaoProfessor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoProfessor.setText("Professor");
        botaoProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProfessorActionPerformed(evt);
            }
        });

        descAluno.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        descAluno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        descAluno.setText("Selecione este botão para inserir ");
        descAluno.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        descAluno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        descAluno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        DescProf.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        DescProf.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DescProf.setText("Selecione este botão para inserir ");
        DescProf.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        DescProf.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DescProf.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Vercao.setText("V1.0");

        BotaoSair.setText("Sair");
        BotaoSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });

        botaoCalcularMedia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoCalcularMedia.setText("Calcular Média");
        botaoCalcularMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCalcularMediaActionPerformed(evt);
            }
        });

        descAluno1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        descAluno1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        descAluno1.setText("Selecione este botão para calcular");
        descAluno1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        descAluno1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        descAluno1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        descAluno2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        descAluno2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        descAluno2.setText("dados de alunos.");
        descAluno2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        descAluno2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        descAluno2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        DescProf1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        DescProf1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DescProf1.setText("dados de professor.");
        DescProf1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        DescProf1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DescProf1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        descAluno3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        descAluno3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        descAluno3.setText("a média.");
        descAluno3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        descAluno3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        descAluno3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PainelPrincipalLayout = new javax.swing.GroupLayout(PainelPrincipal);
        PainelPrincipal.setLayout(PainelPrincipalLayout);
        PainelPrincipalLayout.setHorizontalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelPrincipalLayout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(BotaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Vercao)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelPrincipalLayout.createSequentialGroup()
                .addGap(0, 183, Short.MAX_VALUE)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCalcularMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(descAluno1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DescProf1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DescProf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(descAluno2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(descAluno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(descAluno3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(159, 159, 159))
        );
        PainelPrincipalLayout.setVerticalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGap(69, 69, 69)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(descAluno2))
                    .addComponent(descAluno))
                .addGap(18, 18, 18)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DescProf1))
                    .addComponent(DescProf))
                .addGap(18, 18, 18)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoCalcularMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(descAluno3))
                    .addComponent(descAluno1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(BotaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Vercao)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separator)
                    .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
        dispose();
    }//GEN-LAST:event_BotaoSairActionPerformed

    private void botaoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlunoActionPerformed
        dispose();
        TelaRegistroAluno myFrame = new TelaRegistroAluno();
        myFrame.setVisible(true);
    }//GEN-LAST:event_botaoAlunoActionPerformed

    private void botaoProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProfessorActionPerformed
        dispose();
        TelaRegistroProfessor myFrame2 = new TelaRegistroProfessor();
        myFrame2.setVisible(true);
    }//GEN-LAST:event_botaoProfessorActionPerformed

    private void botaoCalcularMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCalcularMediaActionPerformed
        dispose();
        TelaCalcularMedia myFrame3 = new TelaCalcularMedia();
        myFrame3.setVisible(true);
    }//GEN-LAST:event_botaoCalcularMediaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoSair;
    private javax.swing.JLabel DescProf;
    private javax.swing.JLabel DescProf1;
    private javax.swing.JPanel PainelPrincipal;
    private javax.swing.JLabel Vercao;
    private javax.swing.JButton botaoAluno;
    private javax.swing.JButton botaoCalcularMedia;
    private javax.swing.JButton botaoProfessor;
    private javax.swing.JLabel cadastro;
    private javax.swing.JLabel descAluno;
    private javax.swing.JLabel descAluno1;
    private javax.swing.JLabel descAluno2;
    private javax.swing.JLabel descAluno3;
    private javax.swing.JSeparator separator;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}