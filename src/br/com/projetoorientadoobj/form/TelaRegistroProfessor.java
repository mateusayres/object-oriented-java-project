/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoorientadoobj.form;

import br.com.projetoorientadoobj.modelo.Professor;
import br.com.projetoorientadoobj.util.Util;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Sr. Ayres
 */
public class TelaRegistroProfessor extends javax.swing.JFrame {

    /**
     * Creates new form TelaRegistroProfessor
     */
    public TelaRegistroProfessor() {
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

        cadastroProfessor = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        botaoVoltar = new javax.swing.JButton();
        campoID = new javax.swing.JTextField();
        campoSalarioLiquido = new javax.swing.JTextField();
        salarioLiquido = new javax.swing.JLabel();
        salarioBruto = new javax.swing.JLabel();
        campoSalarioBruto = new javax.swing.JTextField();
        botaoCadastrar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaResultado = new javax.swing.JTextArea();
        isPNE = new javax.swing.JLabel();
        botaoSair = new javax.swing.JButton();
        comboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        cadastroProfessor.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        cadastroProfessor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cadastroProfessor.setText("Cadastro de Professor");

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titulo.setText("Informe os dados do professor:");

        ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ID.setText("ID:");
        ID.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ID.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        botaoVoltar.setText("Voltar");
        botaoVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        campoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIDActionPerformed(evt);
            }
        });

        campoSalarioLiquido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSalarioLiquidoActionPerformed(evt);
            }
        });

        salarioLiquido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        salarioLiquido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        salarioLiquido.setText("Salário Líquido:");
        salarioLiquido.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        salarioLiquido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        salarioBruto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        salarioBruto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        salarioBruto.setText("Salário Bruto:");
        salarioBruto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        salarioBruto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        campoSalarioBruto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSalarioBrutoActionPerformed(evt);
            }
        });

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        areaResultado.setEditable(false);
        areaResultado.setColumns(20);
        areaResultado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        areaResultado.setRows(5);
        areaResultado.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        areaResultado.setEnabled(false);
        jScrollPane1.setViewportView(areaResultado);

        isPNE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        isPNE.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        isPNE.setText("É PNE:");
        isPNE.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        isPNE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        botaoSair.setText("Sair");
        botaoSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione sua opção", "Não", "Sim" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(salarioLiquido, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoSalarioLiquido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(salarioBruto, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoSalarioBruto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(isPNE, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 98, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoCadastrar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(229, 229, 229))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID)
                    .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salarioLiquido)
                    .addComponent(campoSalarioLiquido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salarioBruto)
                    .addComponent(campoSalarioBruto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isPNE)
                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoCadastrar)
                    .addComponent(botaoLimpar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cadastroProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separator)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(cadastroProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        dispose();
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void campoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIDActionPerformed

    private void campoSalarioLiquidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSalarioLiquidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSalarioLiquidoActionPerformed

    private void campoSalarioBrutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSalarioBrutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSalarioBrutoActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        Professor professor = new Professor();
        Date date = new Date();
        String dataAtual = Util.getDataPtBr(date);
        
        if (campoID.getText().equals("") || campoSalarioLiquido.getText().equals("") || 
            campoSalarioBruto.getText().equals("") || comboBox.getSelectedIndex() < 1) {
            
            JOptionPane.showMessageDialog(null, "Preencha os campos primeiro.");
        } else {
            try {
                int idFuncional = Integer.parseInt(campoID.getText());
                double salarioLiquido = Double.parseDouble(campoSalarioLiquido.getText());
                double salarioBruto = Double.parseDouble(campoSalarioBruto.getText());

                professor.setIdFuncional(String.valueOf(idFuncional));
                professor.setSalarioLiquido(salarioLiquido);
                professor.setSalarioBruto(salarioBruto);
                professor.setIsPne(comboBox.getSelectedIndex() > 1);
                
                String salarioLiquidoTexto = Double.toString(professor.getSalarioLiquido());
                String salarioBrutoTexto = Double.toString(professor.getSalarioBruto());
                
                areaResultado.setText("-- PROFESSOR REGISTRADO COM SUCESSO --" + "\n\n" + 
                                      "ID Funcional: " + professor.getIdFuncional() + "\n" + 
                                      "Salário Líquido: " + salarioLiquidoTexto + "\n" + 
                                      "Salário Bruto: " + salarioBrutoTexto + "\n" + 
                                      "É PNE: " + professor.getIsPne() + "\n" + 
                                      "Registro: " + dataAtual);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ID Funcional deve ser um número inteiro e Salários devem ser números válidos.");
            }
        }
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        campoID.setText("");
        campoSalarioLiquido.setText("");
        campoSalarioBruto.setText("");
        areaResultado.setText("");
        comboBox.setSelectedIndex(0);
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        dispose();
    }//GEN-LAST:event_botaoSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaRegistroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRegistroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRegistroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRegistroProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRegistroProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID;
    private javax.swing.JTextArea areaResultado;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JLabel cadastroProfessor;
    private javax.swing.JTextField campoID;
    private javax.swing.JTextField campoSalarioBruto;
    private javax.swing.JTextField campoSalarioLiquido;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JLabel isPNE;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel salarioBruto;
    private javax.swing.JLabel salarioLiquido;
    private javax.swing.JSeparator separator;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
