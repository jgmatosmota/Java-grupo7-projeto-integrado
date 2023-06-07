/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.jframe.hemera.tech.jswing;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.mycompany.jframe.hemera.tech.entidades.Componentes;
import com.mycompany.jframe.hemera.tech.entidades.ComponentesRowMapper;
import com.mycompany.jframe.hemera.tech.entidades.ObjetoUsuario;
import com.mycompany.jframe.hemera.tech.entidades.ObjetoUsuarioRowMapper;
import com.mycompany.jframe.hemera.tech.componentes.ComponentesMaquina;
import com.mycompany.jframe.hemera.tech.conexao.ConexaoBanco;
import com.mycompany.jframe.hemera.tech.entidades.LogAcesso;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.swing.*;

/**
 *
 * @author jgmat
 */
public class JframeHemera extends javax.swing.JFrame {

    /**
     * Creates new form JframeHemera
     */
    public JframeHemera() {
        this.setUndecorated(true);
        this.setResizable(false);

        initComponents();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice device = env.getDefaultScreenDevice();

        device.setFullScreenWindow(this);
        this.setVisible(true);


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
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
        comece1 = new javax.swing.JLabel();

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
        inputSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSenhaActionPerformed(evt);
            }
        });

        botaoLogin.setBackground(new java.awt.Color(107, 12, 197));
        botaoLogin.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        botaoLogin.setForeground(new java.awt.Color(255, 255, 255));
        botaoLogin.setText("Logar");
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

        comece1.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        comece1.setForeground(new java.awt.Color(107, 12, 197));
        comece1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        comece1.setText("Bem-vindo");

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
                        .addGap(309, 309, 309)
                        .addComponent(login))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comece1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comece, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(180, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(389, 389, 389))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(comece1)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(comece)
                        .addGap(47, 47, 47)
                        .addComponent(login)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
    private void botaoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLoginActionPerformed
        String email = String.valueOf(inputLogin.getText());
        String senha = String.valueOf(inputSenha.getText());
        ComponentesMaquina componentesMacAddress = new ComponentesMaquina();
        LogAcesso log = new LogAcesso();

        List<ObjetoUsuario> listaObjetoUsuario = conexao.query("select idFuncionario,email, senha, idEmpresa"
                + " from Funcionario where email = ? and senha = ?",
                new ObjetoUsuarioRowMapper(), email, senha);

        System.out.println("certo 1");
        if (listaObjetoUsuario.size() > 0) {
            //login deu certo
            log.salvar(email, true);

            List<Componentes> listaComponentesMaquina = conexao.query("select * from Computador where MacAddress = ?", new ComponentesRowMapper(), componentesMacAddress.getHostName());
            List<Componentes> listaComponentesEspelho = new ArrayList<>();
            System.out.println("certo2");

            if (listaComponentesMaquina.size() > 0) {
                System.out.println("certo3");
                System.out.println("maquina ja cadastrada");

                //INSERIR NA TABELA LogAcesso qual maquina está sendo usada -- TABELA VAI SER RECRIADA NA AZURE
               try{
                   log.inserirLoginBanco(listaObjetoUsuario.get(0), listaComponentesMaquina.get(0));
               }catch (Exception e){
                   System.out.println("deu ruim insert log");
               }
            } else {
                try {
                    System.out.println("Maquina nao cadastrada");
                    Consumer<ComponentesMaquina> insertComponentes = (ComponentesMaquina c) -> {
                        String sql = "INSERT INTO Computador (sistema_operacional, modelo, MacAddress, total_memoria, total_armazenamento, idEmpresa) VALUES (?, ?, ?, ?, ?, ?)";
                        conexao.update(sql, componentesMacAddress.getSistemaOperacional(), componentesMacAddress.getModeloProcessador(), componentesMacAddress.getHostName(), componentesMacAddress.getMemoriaTotal(), componentesMacAddress.getMemoriaArmazenamento(), listaObjetoUsuario.get(0).getIdEmpresa());
                    };
                    insertComponentes.accept(componentesMacAddress);
                } catch (Exception e) {
                    System.out.println("Validacao de computador ja cadastrado deu errado!");
                } finally {
                    System.out.println("certo");
                    List<Componentes> listaComponentesMaquinaB = conexao.query("select * from Computador where MacAddress = ?", new ComponentesRowMapper(), componentesMacAddress.getHostName());
                    listaComponentesEspelho = listaComponentesMaquinaB;
                    
                    //inserir no logAcesso a maquina que está sendo usada -- TABELA VAI SER RECRIADA NA AZURE
                  log.inserirLoginBanco(listaObjetoUsuario.get(0), listaComponentesEspelho.get(0));
                }
            }
            JframeComponentes telaComponentes = new JframeComponentes();

            if (listaComponentesEspelho.size() > 0) {
                telaComponentes.setIdEmpresa(listaComponentesEspelho.get(0).getIdEmpresa());
                telaComponentes.setIdComputador(listaComponentesEspelho.get(0).getId());
            } else {
                telaComponentes.setIdEmpresa(listaComponentesMaquina.get(0).getIdEmpresa());
                telaComponentes.setIdComputador(listaComponentesMaquina.get(0).getId());
            }
            telaComponentes.setEmailUsuario(email);
            telaComponentes.setVisible(true);
            this.setVisible(false);
            System.out.println("certp6");
        } else {
            //login deu errado
            log.salvar(email, false);

        }


    }//GEN-LAST:event_botaoLoginActionPerformed

    private void inputLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputLoginActionPerformed

    private void inputSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSenhaActionPerformed
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
    private javax.swing.JLabel comece1;
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
