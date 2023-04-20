/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jframe.hemera.tech;

/**
 *
 * @author jgmat
 */
public class ObjetoUsuario {
    
//    private Integer idUsuario;
    private String emailUsuario;
    private String senhaUsuario;
    
    public ObjetoUsuario(String emailUsuario, String senhaUsuario){
        this.emailUsuario = emailUsuario;
        this.senhaUsuario = senhaUsuario;
    }

    

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

   

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }
    
   
}
