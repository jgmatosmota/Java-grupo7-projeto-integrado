/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.jframe.hemera.tech;

import java.awt.GraphicsEnvironment;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author jgmat
 */
public class JframeHemera extends javax.swing.JFrame {

   

    /**
     * Creates new form JframeHemera
     */
     
   
    public JframeHemera() {
        initComponents();
        
        this.setExtendedState(JframeHemera.MAXIMIZED_BOTH);
        this.dispose();
        this.setResizable(false);
        this.setUndecorated(true);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        inputLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        inputSenha = new javax.swing.JPasswordField();
        botaoLogin = new javax.swing.JButton();
        login = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        comece = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(228, 203, 253));

        inputLogin.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        inputLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputLoginActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(107, 12, 197));
        jLabel2.setText("Usuário");

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(107, 12, 197));
        jLabel1.setText("Senha");

        inputSenha.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        inputSenha.setText("jPasswordField1");

        botaoLogin.setBackground(new java.awt.Color(107, 12, 197));
        botaoLogin.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        botaoLogin.setForeground(new java.awt.Color(255, 255, 255));
        botaoLogin.setText("Logar!");
        botaoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLoginActionPerformed(evt);
            }
        });

        login.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        login.setForeground(new java.awt.Color(107, 12, 197));
        login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login.setText("Login");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/HEMERA 2 (1).png"))); // NOI18N
        logo.setText("jLabel6");

        comece.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        comece.setForeground(new java.awt.Color(107, 12, 197));
        comece.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        comece.setText("Comece a monitorar seu computador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(inputLogin)
                                .addComponent(inputSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(comece, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(login)))
                .addContainerGap(177, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(353, 353, 353))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(comece)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(login)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(botaoLogin)
                .addContainerGap(30, Short.MAX_VALUE))
        );

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
     String emailUsuario = "";
    private void botaoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLoginActionPerformed
        String email = String.valueOf(inputLogin.getText());
        String senha = String.valueOf(inputSenha.getText());
        ComponentesMaquina componentesMacAddress = new ComponentesMaquina();

        try {
            List<ObjetoUsuario> listaObjetoUsuario = conexao.query("select *"
                            + " from Funcionario where email = ? and senha = ?",
                    new ObjetoUsuarioRowMapper(), email, senha);

            if (listaObjetoUsuario.size() > 0) {
                List<Componentes> listaComponentesMaquina = conexao.query("select * from Componentes where MacAddres = ?", new ComponentesRowMapper(), componentesMacAddress.getHostName());
                if(listaComponentesMaquina.size() > 0){
                    System.out.println("maquina ja cadastrada");
                }else{
                    try{
                        Consumer<ComponentesMaquina> insertComponentes = (ComponentesMaquina c) ->  {
                            String sql = "INSERT INTO Componentes (SistemaOperacional, ModeloProcessador, MacAddress, MemoriaTotal, MemoriaArmazenamento, EmailUsuario) VALUES (?, ?, ?, ?, ?, ?)";
                            conexao.update(sql , componentesMacAddress.getSistemaOperacional(), componentesMacAddress.getModeloProcessador(), componentesMacAddress.getHostName(), componentesMacAddress.getMemoriaTotal(), componentesMacAddress.getMemoriaArmazenamento(), email);
                        };
                        insertComponentes.accept(componentesMacAddress);
                    }catch (Exception e){
                        System.out.println("Validacao de computador ja cadastrado deu errado!");
                    }
                }
                JframeComponentes telaComponentes = new JframeComponentes();
                telaComponentes.setEmailUsuario(email);
                telaComponentes.setVisible(true);
                this.setVisible(false);
            } else {

            }
        }catch (Exception e){
            System.out.println("deu tudo errado");
        }

    }//GEN-LAST:event_botaoLoginActionPerformed
   
    private void inputLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputLoginActionPerformed
    // métodos de conexão com banco de dados SQLserver
    ConexaoBanco conexaoBanco = new ConexaoBanco();
    JdbcTemplate conexao = conexaoBanco.getConnection();


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
            java.util.logging.Logger.getLogger(JframeHemera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JframeHemera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JframeHemera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JframeHemera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JframeHemera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoLogin;
    private javax.swing.JLabel comece;
    private javax.swing.JTextField inputLogin;
    private javax.swing.JPasswordField inputSenha;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel login;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
