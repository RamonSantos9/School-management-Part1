package com.gerenciamentoescolar.view;

import com.secundarios.view.DisciplinasView;
import javax.swing.JOptionPane;

public class AlunoPainelView extends javax.swing.JFrame {
    public AlunoPainelView() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        pDisciplinas = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pUsuario = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 13));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pDisciplinas.setBackground(new java.awt.Color(0, 0, 13));
        pDisciplinas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pDisciplinasMouseClicked(evt);
            }
        });
        pDisciplinas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("notas e avaliações");
        pDisciplinas.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 120, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\ramon\\Documents\\NetBeansProjects\\GerenciamentoEscolar\\src\\main\\java\\Icons\\disciplinas.png")); // NOI18N
        pDisciplinas.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.add(pDisciplinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 210, 50));

        pUsuario.setBackground(new java.awt.Color(0, 0, 13));
        pUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pUsuarioMouseClicked(evt);
            }
        });
        pUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(" informações pessoais");
        pUsuario.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 16, 160, 20));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\ramon\\Documents\\NetBeansProjects\\GerenciamentoEscolar\\src\\main\\java\\Icons\\usuario.png")); // NOI18N
        pUsuario.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jPanel2.add(pUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 210, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ramon\\Documents\\NetBeansProjects\\GerenciamentoEscolar\\src\\main\\java\\Icons\\icon.png")); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 47, 44));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 73, 210, 552));

        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 73, 790, 552));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\ramon\\Documents\\NetBeansProjects\\GerenciamentoEscolar\\src\\main\\java\\Icons\\education.png")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 625));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ramon\\Documents\\NetBeansProjects\\GerenciamentoEscolar\\src\\main\\java\\Icons\\icon b.png")); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 84, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pDisciplinasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pDisciplinasMouseClicked
        DisciplinasView disciplinasView = new DisciplinasView();
        disciplinasView.setVisible (true);
    }//GEN-LAST:event_pDisciplinasMouseClicked

    private void pUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pUsuarioMouseClicked
        RegistrarUsuarioView registrarUsuarioView = new RegistrarUsuarioView();
        registrarUsuarioView.setVisible (true);
    }//GEN-LAST:event_pUsuarioMouseClicked
    int x = 210;
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if (x == 210) {
            jPanel2.setSize(210, 552);
            Thread th = new Thread(){
                @Override
                public void run (){
                    try {
                        for (int i = 210; i >= 0; i--){
                            Thread.sleep(1);
                            jPanel2.setSize(i, 552);
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };th.start();
            x=0;
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if (x == 0) {
            jPanel2.show();
            jPanel2.setSize(x, 552);
            Thread th = new Thread(){
                @Override
                public void run (){
                    try {
                        for (int i = 0; i <= x; i++){
                            Thread.sleep(1);
                            jPanel2.setSize(i, 552);
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };th.start();
            x=210;
        }
    }//GEN-LAST:event_jLabel2MouseClicked


    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(AlunoPainelView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlunoPainelView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlunoPainelView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlunoPainelView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlunoPainelView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel pDisciplinas;
    private javax.swing.JPanel pUsuario;
    // End of variables declaration//GEN-END:variables
}
