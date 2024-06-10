package com.gerenciamentoescolar.view;

import com.gerenciamentoescolar.controle.UsuarioControle;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class LoginUsuarioView extends javax.swing.JFrame {

    private UsuarioControle usuarioControle;
    
    public LoginUsuarioView() {
        initComponents();
        setLocationRelativeTo(null);
        usuarioControle = new UsuarioControle();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        lblCargo = new javax.swing.JLabel();
        cboCargo = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblUsuario.setText("Nome:");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txtNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 270, 30));

        lblSenha.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblSenha.setText("Senha:");
        jPanel1.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txtSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 270, 30));

        btnEntrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 110, 30));

        lblCargo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCargo.setText("Cargo:");
        jPanel1.add(lblCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        cboCargo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cboCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Aluno(a)", "Funcionário(a)", "Professor(a)", "Diretor(a)", " " }));
        cboCargo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(cboCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 127, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 13));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 500));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ramon\\Documents\\NetBeansProjects\\GerenciamentoEscolar\\src\\main\\java\\Icons\\icone login.png")); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, 400, 400));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 410, 410));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("LOGIN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        String nome = txtNome.getText();
        String senha = new String(txtSenha.getPassword());
        int cargo = cboCargo.getSelectedIndex();

        UsuarioControle usuarioControle = new UsuarioControle();

        try {
            boolean loginSuccessful = usuarioControle.autenticar(nome, senha, cargo);
            if (loginSuccessful) {
                JOptionPane.showMessageDialog(null, "Login bem-sucedido!");
                if (cargo == 0) { // Admin 
                    AdminPainelView adminPainelView = new AdminPainelView();
                    adminPainelView.setVisible(true);
                } else if (cargo == 1) { // Aluno
                    AlunoPainelView alunoPainelView = new AlunoPainelView();
                    alunoPainelView.setVisible (true);
                } else if (cargo == 2) { // Funcionário
                    FuncionarioPainelView funcionarioPainelView = new FuncionarioPainelView();
                    funcionarioPainelView.setVisible (true);
                } else if (cargo == 3) { // Professor
                    ProfessorPainelView professorPainelView = new ProfessorPainelView();
                    professorPainelView.setVisible (true);
                } else if (cargo == 4) { // Diretor
                    DiretorPainelView diretorPainelView = new DiretorPainelView();
                    diretorPainelView.setVisible (true);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao autenticar usuário!");
        }
        
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUsuarioView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JComboBox<String> cboCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
